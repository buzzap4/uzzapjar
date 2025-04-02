package com.kolipri.kimp;

import java.util.Vector;

public final class ae {
   protected static int a = 0;

   private static String d() {
      return new String("REG_" + System.currentTimeMillis() / 1000L + "_" + a++);
   }

   public static String a(String var0, String var1) {
      com.kolipri.kpr.b var2 = new com.kolipri.kpr.b();
      if (var0 != null) {
         var2.b("status", var0);
      }

      if (var1 != null) {
         var2.b("message", var1);
      }

      return b(var2);
   }

   public static String a(boolean var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + d() + "'");
      var1.append(" to='registry'");
      var1.append(" amaz-protocol='registry'");
      var1.append(">");
      var1.append("<action name='update-idle-state'>");
      var1.append("<state>" + new String(var0 ? "idle" : "not-idle") + "</state>");
      var1.append("</action>");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String a(com.kolipri.kpr.b var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + d() + "'");
      var1.append(" to='registry'");
      var1.append(" amaz-protocol='registry'");
      var1.append(">");
      var1.append("<action name='save-private' />");
      var1.append("<vcard>");

      for(int var2 = 0; var2 < var0.b(); ++var2) {
         String var3;
         if ((var3 = var0.a(var2)) != null && var3.length() >= 1) {
            var1.append("<" + var3 + "><![CDATA[" + var0.b(var2) + "]]></" + var3 + ">");
         }
      }

      var1.append("</vcard>");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String a() {
      StringBuffer var0;
      (var0 = new StringBuffer()).append("<iq");
      var0.append(" type='get'");
      var0.append(" id='" + d() + "'");
      var0.append(" to='registry'");
      var0.append(" amaz-protocol='registry'");
      var0.append(">");
      var0.append("<action name='query-private' />");
      var0.append("</iq>");
      return var0.toString();
   }

   public static String b(com.kolipri.kpr.b var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + d() + "'");
      var1.append(" to='registry'");
      var1.append(" amaz-protocol='registry'");
      var1.append(">");
      var1.append("<action name='save-profile' />");
      var1.append("<vcard>");

      for(int var2 = 0; var2 < var0.b(); ++var2) {
         String var3;
         if ((var3 = var0.a(var2)) != null && var3.length() >= 1) {
            var1.append("<" + var3 + "><![CDATA[" + var0.b(var2) + "]]></" + var3 + ">");
         }
      }

      var1.append("</vcard>");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String c(com.kolipri.kpr.b var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='get'");
      var1.append(" id='" + d() + "'");
      var1.append(" to='registry'");
      var1.append(" amaz-protocol='registry'");
      var1.append(">");
      var1.append("<action name='query-profile' />");
      var1.append("<vcard>");

      for(int var2 = 0; var2 < var0.b(); ++var2) {
         String var3;
         if ((var3 = var0.a(var2)) != null && var3.length() >= 1) {
            var1.append("<" + var3 + "><![CDATA[" + var0.b(var2) + "]]></" + var3 + ">");
         }
      }

      var1.append("</vcard>");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String d(com.kolipri.kpr.b var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + d() + "'");
      var1.append(" to='registry'");
      var1.append(" amaz-protocol='registry'");
      var1.append(">");
      var1.append("<action name='save-contact' />");
      var1.append("<vcard>");

      for(int var2 = 0; var2 < var0.b(); ++var2) {
         String var3;
         if ((var3 = var0.a(var2)) != null && var3.length() >= 1 && (var3.startsWith("custom-") || var3.equals("authorized") || var3.equals("blocked") || var3.equals("username") || var3.equals("frequent") || var3.equals("chatter") || var3.equals("abm") || var3.equals("groups") || var3.equals("amaz-cid"))) {
            var1.append("<" + var3 + "><![CDATA[" + var0.b(var2) + "]]></" + var3 + ">");
         }
      }

      var1.append("</vcard>");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String a(String var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + d() + "'");
      var1.append(" to='registry'");
      var1.append(" amaz-protocol='registry'");
      var1.append(">");
      var1.append("<action name='delete-contact' />");
      var1.append("<vcard>");
      var1.append("<amaz-cid>" + var0 + "</amaz-cid>");
      var1.append("</vcard>");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String b() {
      StringBuffer var0;
      (var0 = new StringBuffer()).append("<iq");
      var0.append(" type='get'");
      var0.append(" id='" + d() + "'");
      var0.append(" to='registry'");
      var0.append(" amaz-protocol='registry'");
      var0.append(">");
      var0.append("<action name='query-roster' />");
      var0.append("</iq>");
      return var0.toString();
   }

   public static String c() {
      StringBuffer var0;
      (var0 = new StringBuffer()).append("<iq");
      var0.append(" type='set'");
      var0.append(" id='" + d() + "'");
      var0.append(" to='registry'");
      var0.append(" amaz-protocol='registry'");
      var0.append(">");
      var0.append("<action name='init-store-contact' />");
      var0.append("</iq>");
      return var0.toString();
   }

   public static String b(String var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + d() + "'");
      var1.append(" to='registry'");
      var1.append(" amaz-protocol='registry'");
      var1.append(">");
      var1.append("<action name='change-password' />");
      var1.append("<vcard>");
      var1.append("<password>" + var0 + "</password>");
      var1.append("</vcard>");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String e(com.kolipri.kpr.b var0) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("<iq");
      var2.append(" type='set'");
      var2.append(" id='" + d() + "'");
      var2.append(" to='registry'");
      var2.append(" method='pin'");
      var2.append(" amaz-protocol='registry'");
      var2.append(">");
      var2.append("<action name='register' /><vcard>");

      for(int var1 = 0; var1 < var0.b(); ++var1) {
         String var3;
         if ((var3 = var0.a(var1)) != null && var3.length() >= 1) {
            var2.append("<" + var3 + "><![CDATA[" + var0.b(var1) + "]]></" + var3 + ">");
         }
      }

      var2.append("<model><![CDATA[" + com.kolipri.kpr.i.b(System.getProperty("microedition.platform")) + "]]></model>");
      var2.append("</vcard></iq>");
      return var2.toString();
   }

   public static String f(com.kolipri.kpr.b var0) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("<iq");
      var2.append(" type='set'");
      var2.append(" id='" + d() + "'");
      var2.append(" to='registry'");
      var2.append(" method='pin'");
      var2.append(" amaz-protocol='registry'");
      var2.append(">");
      var2.append("<action name='pre-register' /><vcard>");

      for(int var1 = 0; var1 < var0.b(); ++var1) {
         String var3;
         if ((var3 = var0.a(var1)) != null && var3.length() >= 1) {
            var2.append("<" + var3 + "><![CDATA[" + var0.b(var1) + "]]></" + var3 + ">");
         }
      }

      var2.append("</vcard></iq>");
      return var2.toString();
   }

   public static String b(String var0, String var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("<iq");
      var2.append(" type='set'");
      var2.append(" to='___registry___'");
      var2.append(" id='" + d() + "'");
      var2.append(" method='pin'");
      var2.append(" amaz-protocol='registry'");
      var2.append(">");
      var2.append("<action name='validation' />");
      var2.append("<vcard><mobile><![CDATA[" + var0 + "]]></mobile><username><![CDATA[" + var1 + "]]></username></vcard>");
      var2.append("</iq>");
      return var2.toString();
   }

   public static String c(String var0, String var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("<iq");
      var2.append(" type='set'");
      var2.append(" to='___registry___'");
      var2.append(" id='" + d() + "'");
      var2.append(" amaz-protocol='registry'");
      var2.append(">");
      var2.append("<action name='rename-group'/>");
      var2.append("<vcard><old-name>" + var0 + "</old-name><new-name>" + var1 + "</new-name></vcard>");
      var2.append("</iq>");
      return var2.toString();
   }

   public static String c(String var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" to='___registry___'");
      var1.append(" id='" + d() + "'");
      var1.append(" amaz-protocol='registry'");
      var1.append(">");
      var1.append("<action name='rename-group'/>");
      var1.append("<vcard><old-name>" + var0 + "</old-name><new-name></new-name></vcard>");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String a(Vector var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + d() + "'");
      var1.append(" to='registry'");
      var1.append(" amaz-protocol='registry'");
      var1.append(">");
      var1.append("<action name='store-contact' />");

      for(int var3 = 0; var3 < var0.size(); ++var3) {
         com.kolipri.kpr.b var4 = (com.kolipri.kpr.b)var0.elementAt(var3);
         var1.append("<vcard>");

         for(int var2 = 0; var2 < var4.b(); ++var2) {
            String var5;
            if ((var5 = var4.a(var2)) != null && var5.length() >= 1) {
               var1.append("<" + var5 + "><![CDATA[" + var4.b(var2) + "]]></" + var5 + ">");
            }
         }

         var1.append("</vcard>");
      }

      var1.append("</iq>");
      return var1.toString();
   }
}
