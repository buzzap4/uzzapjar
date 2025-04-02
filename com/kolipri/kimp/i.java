package com.kolipri.kimp;

public final class i {
   protected static int a = 0;

   private static String a(String var0) {
      return new String(var0 + "_" + System.currentTimeMillis() / 1000L + "_" + a++);
   }

   public static String a() {
      StringBuffer var0;
      (var0 = new StringBuffer()).append("<iq");
      var0.append(" type='get'");
      var0.append(" id='" + a("billing_") + "'");
      var0.append(" to='subscription'");
      var0.append(" amaz-protocol='subscription'>");
      var0.append("<action name='list'/>");
      var0.append("</iq>");
      return var0.toString();
   }

   public static String a(String var0, String var1, String var2) {
      StringBuffer var3;
      (var3 = new StringBuffer()).append("<iq");
      var3.append(" type='get'");
      var3.append(" to='subscription'");
      var3.append(" id='" + a("billing_") + "'");
      var3.append(" amaz-protocol='subscription'>");
      var3.append("<action name='subscribe'/>");
      var3.append("<vcard>");
      var3.append("<name>" + var0 + "</name>");
      var3.append("<auto_renew>" + var1 + "</auto_renew>");
      if (var2 != null) {
         var3.append("<confirmed>" + var2 + "</confirmed>");
      }

      var3.append("</vcard></iq>");
      return var3.toString();
   }

   public static String b() {
      StringBuffer var0;
      (var0 = new StringBuffer()).append("<iq");
      var0.append(" type='get'");
      var0.append(" to='subscription'");
      var0.append(" amaz-protocol='subscription'");
      var0.append(" id='" + a("billing_") + "'");
      var0.append(">");
      var0.append("<action name='inquire-history'/>");
      var0.append("</iq>");
      return var0.toString();
   }

   public static String a(boolean var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='get'");
      var1.append(" to='subscription'");
      var1.append(" amaz-protocol='subscription'");
      if (var0) {
         var1.append(" id='" + a("billing_") + "'");
      } else {
         var1.append(" id='auto-renew'");
      }

      var1.append(">");
      var1.append("<action name='inquire-status'/>");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String c() {
      return b("cancel-auto-renew");
   }

   public static String d() {
      return b("set-auto-renew");
   }

   private static String b(String var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='get'");
      var1.append(" to='subscription'");
      var1.append(" amaz-protocol='subscription'");
      var1.append(" id='" + a("billing_") + "'");
      var1.append(">");
      var1.append("<action name='" + var0 + "'/>");
      var1.append("</iq>");
      return var1.toString();
   }
}
