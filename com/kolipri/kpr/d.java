package com.kolipri.kpr;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class d {
   public static void a(int var0) {
      try {
         Thread.sleep((long)var0);
      } catch (Exception var2) {
      }
   }

   public static String a(long var0) {
      return a(var0, false);
   }

   private static String a(long var0, boolean var2) {
      Calendar var3 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
      if (var0 >= 0L) {
         var3.setTime(new Date(var0 * 1000L));
      }

      StringBuffer var4 = new StringBuffer();
      int var5;
      if ((var5 = var2 ? var3.get(11) : var3.get(10)) == 0 && !var2) {
         var5 = 12;
      } else if (var5 < 10 && var2) {
         var4.append("0");
      }

      var4.append(Integer.toString(var5));
      var4.append(":");
      if (var3.get(12) < 10) {
         var4.append("0");
      }

      var4.append(Integer.toString(var3.get(12)));
      var4.append(" ");
      var4.append(var3.get(9) == 0 ? "AM" : "PM");
      return var4.toString();
   }

   public static String b(long var0) {
      Calendar var2 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
      if (var0 >= 0L) {
         var2.setTime(new Date(var0 * 1000L));
      }

      StringBuffer var3 = new StringBuffer();
      int var4;
      if ((var4 = var2.get(11)) < 10) {
         var3.append("0");
      }

      var3.append(Integer.toString(var4));
      var3.append(":");
      if (var2.get(12) < 10) {
         var3.append("0");
      }

      var3.append(Integer.toString(var2.get(12)));
      var3.append(" ");
      if (var2.get(5) < 10) {
         var3.append("0");
      }

      var3.append(Integer.toString(var2.get(5)));
      var3.append("/");
      if (var2.get(2) < 10) {
         var3.append("0");
      }

      var3.append(Integer.toString(var2.get(2) + 1));
      var3.append("/");
      var3.append(Integer.toString(var2.get(1)).substring(2));
      return var3.toString();
   }

   public static long a() {
      return (new Date()).getTime() / 1000L;
   }
}
