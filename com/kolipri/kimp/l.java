package com.kolipri.kimp;

public final class l {
   protected static int a = 0;

   private static String b(String var0) {
      return new String(var0 + "_" + System.currentTimeMillis() / 1000L + "_" + a++);
   }

   public static String a(String var0, String var1, String var2) {
      StringBuffer var3;
      (var3 = new StringBuffer()).append("<iq");
      var3.append(" type='set'");
      var3.append(" id='" + b(var0) + "'");
      var3.append(" to='" + var0 + "'");
      var3.append(" amaz-protocol='" + var0 + "'");
      var3.append(">");
      var3.append("<action name='login' /><vcard>");
      var3.append("<username><![CDATA[" + var1 + "]]></username>");
      var3.append("<password><![CDATA[" + var2 + "]]></password>");
      var3.append("<status>online</status>");
      var3.append("</vcard></iq>");
      return var3.toString();
   }

   public static String a(String var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + b(var0) + "'");
      var1.append(" to='" + var0 + "'");
      var1.append(" amaz-protocol='" + var0 + "'");
      var1.append(">");
      var1.append("<action name='logout' />");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String b(String var0, String var1, String var2) {
      StringBuffer var3;
      (var3 = new StringBuffer()).append("<iq");
      var3.append(" type='set'");
      var3.append(" id='" + b(var0) + "'");
      var3.append(" to='" + var0 + "'");
      var3.append(" amaz-protocol='" + var0 + "'");
      var3.append(">");
      var3.append("<action name='status-update' /><vcard>");
      var3.append("<status><![CDATA[" + c(var1) + "]]></status>");
      var3.append("<message><![CDATA[" + var2 + "]]></message>");
      var3.append("</vcard></iq>");
      return var3.toString();
   }

   private static String c(String var0) {
      if (var0.equals("notavailable")) {
         return "busy";
      } else {
         return var0.equals("offline") ? "invisible" : "available";
      }
   }
}
