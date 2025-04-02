package com.kolipri.kimp;

public final class x extends ac {
   public aa a = null;

   public x(aa var1) {
      super(var1);
      this.a = var1;
   }

   public final boolean a(p var1) {
      boolean var2 = false;
      String var3 = var1.a("username");
      String var4 = var1.a("authorized");
      String var5 = var1.a("status");
      String var6 = var1.a("groups");
      String var7 = this.a();
      if (var6 != null && var6.indexOf(var7) > -1) {
         this.b(var1);
      } else if (var3 == null && var1.a("custom-displayname") != null && this.a(var1.a("custom-displayname"))) {
         this.b(var1);
      } else if (var3 != null && this.a(var3) && var4 != null && var5 != null && !var5.equals("unknown")) {
         this.b(var1);
      } else {
         if (var3 != null || !var1.g()) {
            return var2;
         }

         if (var1.h() && var1.a("yahoo-id") != null) {
            if (this.a(var1.a("yahoo-id"))) {
               this.b(var1);
            }

            var2 = true;
            return var2;
         }

         if (!var1.i() || var1.a("msn-id") == null) {
            return var2;
         }

         if (this.a(var1.a("msn-id"))) {
            this.b(var1);
         }
      }

      var2 = true;
      return var2;
   }

   private boolean a(String var1) {
      boolean var2 = false;
      String var3 = ",";
      com.kolipri.kpr.f var4 = new com.kolipri.kpr.f();
      String var5 = new String("");
      if (this.a != null && this.a.f != null) {
         var5 = this.a.f;
      }

      int var7;
      while((var7 = var5.indexOf(var3)) >= 0) {
         var4.a(var5.substring(0, var7));
         var5 = var5.substring(var7 + var3.length());
      }

      var4.a(var5);

      for(int var8 = 0; var8 < var4.b() && var4.b() > 0; ++var8) {
         if (var1.equals(var4.b(var8))) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public final String a() {
      return "most_frequent";
   }

   public final String b() {
      new String();
      String var1 = null;
      if (this.a.h == null) {
         var1 = "Most Frequent";
         this.a.l.b(this.a.l.a("amazilia.username") + "groups.most_frequent", "Most Frequent");
         this.a.l.c();
      } else {
         var1 = this.a.h;
      }

      return var1;
   }
}
