package com.kolipri.kimp;

public final class n {
   protected static int a = 0;

   private static String b(String var0) {
      return new String(var0 + "_" + System.currentTimeMillis() / 1000L + "_" + a++);
   }

   public static String a(String var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + b("passwd") + "'");
      var1.append(" to='accounts'");
      var1.append(" amaz-protocol='accounts'");
      var1.append(">");
      var1.append("<action name='password-reset'/><vcard>");
      var1.append("<username><![CDATA[" + var0 + "]]></username>");
      var1.append("</vcard></iq>");
      return var1.toString();
   }
}
