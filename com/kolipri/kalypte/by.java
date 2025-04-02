package com.kolipri.kalypte;

public final class by implements dl {
   protected com.kolipri.kt.r a = null;
   protected com.kolipri.kpr.f b = null;
   protected String c = null;
   protected String d = null;

   public by(com.kolipri.kt.r var1, com.kolipri.kpr.f var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void a(String var1) {
      this.d = var1;
   }

   public final void b(com.kolipri.kpr.f var1) {
      new String();
      cf var3;
      (var3 = new cf(this.a)).a("Save", "Cancel");
      var3.a("* Add Buddies to " + (this.d == null ? "" : this.d) + " Group:");
      var3.a((com.kolipri.kpr.f)var1, (String)null);
      var3.a(this.a.c());
      var3.c(this.b);
      var3.a((dl)this);
      var3.w();
   }

   public final void a(com.kolipri.kpr.f var1) {
      new com.kolipri.kpr.f();
      Object var2 = null;
      if (var1 != null) {
         this.c(var1);
      }

   }

   private void c(com.kolipri.kpr.f var1) {
      new cb(this.a);
      new com.kolipri.kpr.f();
      com.kolipri.kpr.f var3 = null;
      com.kolipri.kpr.f var4 = var1;
      com.kolipri.kpr.f var5 = ((Kalypte)this.a).k.d(this.c);

      int var6;
      com.kolipri.kimp.p var8;
      for(var6 = 0; var6 < var5.b(); ++var6) {
         com.kolipri.kimp.p var7 = (com.kolipri.kimp.p)var5.b(var6);
         (var8 = new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var7);
         String var9 = "";
         if (var8.a("groups") != null) {
            var9 = var8.a("groups");
         }

         var3 = cb.c(var9);

         int var11;
         for(var11 = 0; var3 != null && var11 < var3.b(); ++var11) {
            if (!var3.b(var11).equals(this.c) && this.c.equals("most_frequent")) {
               ((Kalypte)this.a).h(var8.a("username"));
               ((Kalypte)this.a).h(var8.a("custom-displayname"));
            }
         }

         for(var11 = 0; var3 != null && var11 < var3.b(); ++var11) {
            String var12;
            if ((var12 = var3.b(var11).toString()).equals(this.c)) {
               var3.c(var12);
            }
         }

         String var10 = cb.a(var3);
         var8.b("groups", var10);
         ((Kalypte)this.a).i.a(com.kolipri.kimp.ae.d(var8));
      }

      for(var6 = 0; var4 != null && var6 < var4.b(); ++var6) {
         new String("");
         if ((var8 = (com.kolipri.kimp.p)var4.b(var6)) != null) {
            com.kolipri.kimp.p var15;
            (var15 = new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var8);
            var15.b = var8.b;
            var3 = cb.c(var15.a("groups") == null ? "" : var15.a("groups"));
            boolean var16 = false;

            for(int var17 = 0; var3 != null && var17 < var3.b(); ++var17) {
               if ((var3.b(var17).toString() == null ? "" : var3.b(var17).toString()).equals(this.c)) {
                  var16 = true;
               }
            }

            if (!var16) {
               var3.a(this.c);
            }

            String var14 = cb.a(var3);
            var15.b("groups", var14);
            ((Kalypte)this.a).i.a(com.kolipri.kimp.ae.d(var15));
         }
      }

      ((Kalypte)this.a).k.d();
   }

   public final void e_() {
   }
}
