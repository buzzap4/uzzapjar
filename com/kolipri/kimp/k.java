package com.kolipri.kimp;

public final class k {
   protected static int a = 0;

   private static String a(String var0) {
      return new String(var0 + "_" + System.currentTimeMillis() / 1000L + "_" + a++);
   }

   public static String a(p var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='set'");
      var1.append(" id='" + a("VALIDATE") + "'");
      var1.append(" to='validation'");
      var1.append(" amaz-protocol='validation'");
      var1.append(">");
      var1.append("<action name='confirmation'/><vcard>");

      for(int var2 = 0; var2 < var0.b(); ++var2) {
         String var3;
         if ((var3 = var0.a(var2)) != null && var3.length() >= 1) {
            var1.append("<" + var3 + "><![CDATA[" + var0.b(var2) + "]]></" + var3 + ">");
         }
      }

      var1.append("</vcard></iq>");
      return var1.toString();
   }

   public static String b(p var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type='get'");
      var1.append(" id='" + a("VALIDATE") + "'");
      var1.append(" to='validation'");
      var1.append(" amaz-protocol='validation'");
      var1.append(">");
      var1.append("<action name='pin-request'/><vcard>");

      for(int var2 = 0; var2 < var0.b(); ++var2) {
         String var3;
         if ((var3 = var0.a(var2)) != null && var3.length() >= 1) {
            var1.append("<" + var3 + "><![CDATA[" + var0.b(var2) + "]]></" + var3 + ">");
         }
      }

      var1.append("</vcard></iq>");
      return var1.toString();
   }
}
