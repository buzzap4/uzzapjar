package com.kolipri.kalypte;

public final class cb {
   protected String a = new String("");
   protected String b = new String("");
   protected com.kolipri.kt.r c;

   public cb(com.kolipri.kt.r var1) {
      this.c = var1;
   }

   protected final void a() {
      this.a = ((Kalypte)this.c).h.a("amazilia.username");
      this.a = this.a + ".groups.list";
      this.b = ((Kalypte)this.c).h.a("amazilia.username");
      this.b = this.b + ".groups.sort";
   }

   public final void a(String var1) {
      boolean var2 = false;
      String var3 = this.c();
      String var4 = this.d();
      com.kolipri.kpr.f var5 = c(var3);
      com.kolipri.kpr.f var6 = c(var4);

      for(int var7 = 0; var5 != null && var7 < var5.b(); ++var7) {
         if (var5.b(var7).equals(var1)) {
            var2 = true;
         }
      }

      if (!var2) {
         var5.a(var1);
         var6.a("1");
      }

      var3 = a(var5);
      var4 = a(var6);
      ((Kalypte)this.c).h.b(this.a, var3);
      ((Kalypte)this.c).h.b(this.b, var4);
      ((Kalypte)this.c).h.c();
      ((Kalypte)this.c).k.f(var1);
   }

   private static int a(com.kolipri.kpr.f var0, String var1) {
      int var2 = -1;

      for(int var3 = 0; var0 != null && var3 < var0.b(); ++var3) {
         if (var1.equals(var0.b(var3))) {
            var2 = var3;
            break;
         }
      }

      return var2;
   }

   public static String a(com.kolipri.kpr.f var0) {
      String var1 = "";

      for(int var2 = 0; var0 != null && var2 < var0.b(); ++var2) {
         if (var1.length() > 0) {
            var1 = var1 + ",";
         }

         var1 = var1 + var0.b(var2);
      }

      return var1;
   }

   public final boolean b(String var1) {
      com.kolipri.kpr.f var4 = c(this.c());
      com.kolipri.kpr.f var5 = this.e();
      String var6 = null;
      String var7 = null;
      String var8 = null;
      int var9;
      if ((var9 = a(var4, var1)) != -1) {
         var8 = var5.b(var9).toString();
         var4.c(var1);
         var5.c(var8);
      }

      var6 = a(var4);
      var7 = a(var5);
      if (var6 != null || var6 != "") {
         ((Kalypte)this.c).h.b(this.a, var6.toString());
         ((Kalypte)this.c).h.b(this.b, var7.toString());
         ((Kalypte)this.c).h.c();
      }

      return false;
   }

   private String c() {
      return ((Kalypte)this.c).h.a(this.a.toString());
   }

   private String d() {
      return ((Kalypte)this.c).h.a(this.b);
   }

   protected static com.kolipri.kpr.f c(String var0) {
      String var1 = ",";
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      if (var0 != null) {
         for(int var3 = var0.indexOf(var1); var3 >= 0; var3 = (var0 = var0.substring(var3 + var1.length())).indexOf(var1)) {
            if (var0 != "") {
               var2.a(var0.substring(0, var3));
            }
         }

         if (var0 != "") {
            var2.a(var0);
         }
      }

      return var2;
   }

   private com.kolipri.kpr.f e() {
      String var1 = this.d();
      String var2 = ",";
      com.kolipri.kpr.f var3 = new com.kolipri.kpr.f();
      if (var1 != null) {
         for(int var4 = var1.indexOf(var2); var4 >= 0; var4 = (var1 = var1.substring(var4 + var2.length())).indexOf(var2)) {
            if (var1 != "") {
               var3.a(var1.substring(0, var4));
            }
         }

         if (var1 != "") {
            var3.a(var1);
         }
      }

      return var3;
   }

   public final void a(String var1, String var2) {
      if (var2 != null && var1 != null) {
         String var3 = "";
         com.kolipri.kpr.f var5 = c(this.c());

         for(int var6 = 0; var5 != null && var6 < var5.b(); ++var6) {
            if (var3.length() > 0) {
               var3 = var3 + ",";
            }

            if (var5.b(var6).equals(var1)) {
               var3 = var3 + var2;
            } else {
               var3 = var3 + var5.b(var6);
            }
         }

         ((Kalypte)this.c).h.b(this.a, var3);
         ((Kalypte)this.c).h.c();
      }

   }

   public final void b(String var1, String var2) {
      String var3 = this.c();
      if (var2 != null && var1 != null && (var2.equals("buddies") || var2.equals("chatterbox") || var2.equals("action_required") || var2.equals("other_contacts") || var2.equals("most_frequent"))) {
         String var10 = ((Kalypte)this.c).h.a("amazilia.username");
         var10 = var10 + ".groups.sort." + var2;
         ((Kalypte)this.c).h.b(var10.toString(), var1);
         ((Kalypte)this.c).h.c();
         ((Kalypte)this.c).k.d();
      } else {
         this.a(var2);
         com.kolipri.kpr.f var4 = c(var3);
         com.kolipri.kpr.f var5 = this.e();
         int var6 = a(var4, var2);
         String var8 = "";
         if (var6 != -1) {
            var5.b(var6).toString();
         }

         for(int var9 = 0; var5 != null && var9 < var5.b(); ++var9) {
            if (var8.length() > 0) {
               var8 = var8 + ",";
            }

            if (var9 == var6) {
               var8 = var8 + var1;
            } else {
               var8 = var8 + var5.b(var9);
            }
         }

         ((Kalypte)this.c).h.b(this.b, var8);
         ((Kalypte)this.c).h.c();
         ((Kalypte)this.c).k.d();
      }
   }

   public final String d(String var1) {
      String var2 = "";
      if (!var1.equals("chatterbox") && !var1.equals("most_frequent")) {
         com.kolipri.kpr.f var4 = c(this.c());
         com.kolipri.kpr.f var5 = this.e();
         int var6;
         if ((var6 = a(var4, var1)) != -1) {
            var2 = var5.b(var6).toString();
         }
      } else {
         String var3 = ((Kalypte)this.c).h.a("amazilia.username");
         var3 = var3 + ".groups.sort." + var1;
         var2 = ((Kalypte)this.c).h.a(var3.toString());
      }

      return var2;
   }

   public final void b() {
      this.a();
      String var1 = ((Kalypte)this.c).h.a("amazilia.username");
      String var2 = null;
      String var3 = var1 + ".groups.sort.buddies";
      ((Kalypte)this.c).h.b(var3.toString(), "1");
      var2 = var1 + ".groups.buddies";
      ((Kalypte)this.c).h.b(var2.toString(), "All Buddies");
      var3 = var1 + ".groups.sort.other_contacts";
      ((Kalypte)this.c).h.b(var3.toString(), "1");
      var2 = var1 + ".groups.other_contacts";
      ((Kalypte)this.c).h.b(var2.toString(), "Other Contacts");
      var3 = var1 + ".groups.sort.chatterbox";
      ((Kalypte)this.c).h.b(var3.toString(), "1");
      var2 = var1 + ".groups.chatterbox";
      ((Kalypte)this.c).h.b(var2.toString(), "My Friends");
      var3 = var1 + ".groups.sort.most_frequent";
      ((Kalypte)this.c).h.b(var3.toString(), "1");
      var2 = var1 + ".groups.most_frequent";
      ((Kalypte)this.c).h.b(var2.toString(), "Most Frequent");
      var3 = var1 + ".groups.sort.action_required";
      ((Kalypte)this.c).h.b(var3.toString(), "0");
      var2 = var1 + ".groups.action_required";
      ((Kalypte)this.c).h.b(var2.toString(), "Pending Buddies");
      ((Kalypte)this.c).h.c();
      ((Kalypte)this.c).k.d();
   }
}
