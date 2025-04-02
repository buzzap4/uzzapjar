package com.kolipri.kimp;

public final class u {
   protected static int a = 0;

   private static String a() {
      return new String("CHAT_" + System.currentTimeMillis() / 1000L + "_" + a++);
   }

   public static String a(int var0, int var1, String var2) {
      StringBuffer var3;
      (var3 = new StringBuffer()).append("<iq");
      var3.append(" type=\"get\"");
      var3.append(" id=\"" + a() + "\"");
      var3.append(" to=\"conference@node1.kolipri.com\"");
      var3.append(" amaz-protocol=\"chat\"");
      var3.append(">");
      var3.append("<query-ug name=\"" + var2 + "\" start = \"" + var0 + "\" end = \"" + var1 + "\"/>");
      var3.append("</iq>");
      return var3.toString();
   }

   public static String a(int var0, int var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("<iq");
      var2.append(" type=\"get\"");
      var2.append(" id=\"" + a() + "\"");
      var2.append(" to=\"conference@node1.kolipri.com\"");
      var2.append(" amaz-protocol=\"chat\"");
      var2.append(">");
      var2.append("<query-groups start = \"" + var0 + "\" end = \"" + var1 + "\"/>");
      var2.append("</iq>");
      return var2.toString();
   }

   public static String a(String var0, int var1, int var2) {
      StringBuffer var3;
      (var3 = new StringBuffer()).append("<iq");
      var3.append(" type=\"get\"");
      var3.append(" id=\"" + a() + "\"");
      var3.append(" to=\"conference@node1.kolipri.com\"");
      var3.append(" amaz-protocol=\"chat\"");
      var3.append(">");
      var3.append("<query-group group='" + var0 + "' start = \"" + var1 + "\" end = \"" + var2 + "\"/>");
      var3.append("</iq>");
      return var3.toString();
   }

   public static String a(String var0, String var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("<iq");
      var2.append(" type=\"get\"");
      var2.append(" id=\"" + a() + "\"");
      var2.append(" to=\"conference\"");
      var2.append(" amaz-protocol=\"chat\"");
      var2.append(">");
      var2.append("<chatuser room=\"" + var0 + "\" nick=\"" + var1 + "\" />");
      var2.append("</iq>");
      return var2.toString();
   }

   public static String a(String var0, String var1, String var2) {
      StringBuffer var3;
      (var3 = new StringBuffer()).append("<iq");
      var3.append(" type=\"get\"");
      var3.append(" id=\"" + a() + "\"");
      var3.append(" to=\"conference\"");
      var3.append(" amaz-protocol=\"chat\"");
      var3.append(">");
      var3.append("<create-room");
      var3.append(" type=\"private\"");
      var3.append(" name=\"" + var0 + "\"");
      var3.append(" password=\"" + var1 + "\"");
      var3.append(" nick=\"" + var2 + "\"");
      var3.append(" max-users=\"20\"");
      var3.append(" />");
      var3.append("</iq>");
      return var3.toString();
   }

   public static String b(String var0, String var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("<iq");
      var2.append(" type=\"get\"");
      var2.append(" id=\"" + a() + "\"");
      var2.append(" to=\"conference\"");
      var2.append(" amaz-protocol=\"chat\"");
      var2.append(">");
      var2.append("<create-room");
      var2.append(" type=\"generated\"");
      var2.append(" name=\"" + var0 + "\"");
      var2.append(" nick=\"" + var1 + "\"");
      var2.append(" max-users=\"20\"");
      var2.append(" />");
      var2.append("</iq>");
      return var2.toString();
   }

   public static String b(String var0, String var1, String var2) {
      StringBuffer var3;
      (var3 = new StringBuffer()).append("<iq");
      var3.append(" type='set'");
      var3.append(" id='" + a() + "'");
      var3.append(" to='" + var1 + "'");
      var3.append(" amaz-protocol='chat'");
      var3.append(">");
      var3.append("<invite room='" + var0 + "'><![CDATA[" + b(var2) + "]]></invite>");
      var3.append("</iq>");
      return var3.toString();
   }

   public static String a(String var0) {
      StringBuffer var1;
      (var1 = new StringBuffer()).append("<iq");
      var1.append(" type=\"get\"");
      var1.append(" id=\"" + a() + "\"");
      var1.append(" to=\"conference\"");
      var1.append(" amaz-protocol=\"chat\"");
      var1.append(">");
      var1.append("<chatuser room=\"" + var0 + "\" type=\"unavailable\" />");
      var1.append("</iq>");
      return var1.toString();
   }

   public static String a(String var0, String var1, String var2, String var3, String var4) {
      new com.kolipri.kpr.i();
      var4 = com.kolipri.kpr.i.b(var4);
      var2 = com.kolipri.kpr.i.b(var2);
      var3 = com.kolipri.kpr.i.b(var3);
      StringBuffer var6;
      (var6 = new StringBuffer()).append("<message to=\"conference\"");
      var6.append(" amaz-protocol=\"chat\"");
      var6.append(">");
      var6.append("<chat room=\"" + var0 + "\" type=\"privatechat\" to=\"" + var2 + "\" from=\"" + var4 + "\" recipient=\"" + var3 + "\"/><body><![CDATA[" + b(var1) + "]]></body></message>");
      return var6.toString();
   }

   public static String c(String var0, String var1) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append("<iq");
      var2.append(" type=\"get\"");
      var2.append(" id=\"" + a() + "\"");
      var2.append(" to=\"conference\"");
      var2.append(" amaz-protocol=\"chat\"");
      var2.append(">");
      var2.append("<msg room=\"" + var0 + "\" type=\"groupchat\"><![CDATA[" + b(var1) + "]]></msg>");
      var2.append("</iq>");
      return var2.toString();
   }

   private static String b(String var0) {
      new com.kolipri.kpr.i();
      String var2;
      if ((var2 = com.kolipri.kpr.i.a("]]>", "]]]]><![CDATA[>", var0)) == null) {
         var2 = var0;
      }

      return var2;
   }
}
