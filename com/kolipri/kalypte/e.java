package com.kolipri.kalypte;

public final class e extends com.kolipri.kt.ad {
   public com.kolipri.kimp.p a = null;
   private String l = "";

   public e(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a() {
      super.a();
      this.a(3);
      this.b(50);
      this.b("Enter new number");
   }

   public final void a(String var1) {
      super.a(var1);
      String var2 = ((Kalypte)super.b).h.a("amazilia.username");
      String var3 = ((Kalypte)super.b).i.a().e();
      if (!var1.equals(var3) && !var1.equals("+" + var3)) {
         if (var2 != null && var1 != null) {
            this.a = new com.kolipri.kimp.p();
            this.a.b("username", var2);
            this.a.b("mobile", var1);
            ((Kalypte)super.b).i.a(com.kolipri.kimp.ae.b(var1, var2));
            com.kolipri.kimp.j var5;
            (var5 = new com.kolipri.kimp.j(this, super.b, (String)null) {
               private final e e;

               public {
                  this.e = var1;
                  ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
               }

               public final void f() {
                  super.f();
                  ((Kalypte)super.b_).j.b(this);
               }

               public final void a() {
                  super.a();
                  this.a("* Change mobile number\n\nPlease wait while updating your mobile number..");
               }

               public final void a(com.kolipri.kt.x var1) {
                  var1.a("", "Close");
               }

               public final void b(String var1) {
                  this.f();
               }

               public final void a(com.kolipri.kimp.m var1) {
                  com.kolipri.kimp.q var2;
                  if (var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null && (var2 = ((com.kolipri.kimp.d)var1).a).a("iq.amaz-protocol") != null && var2.a("iq.amaz-protocol").equals("registry") && var2.a("iq/action.name") != null && var2.a("iq/action.name").equals("validation")) {
                     ((Kalypte)super.b_).h.b(((Kalypte)super.b_).h.a("amazilia.username") + ".amazilia-registered-number", com.kolipri.kalypte.e.a(this.e));
                     this.f();
                  }

               }
            }).a();
            var5.a(super.b.c());
            this.l = var1;
         }

      } else {
         com.kolipri.kt.a var4;
         (var4 = new com.kolipri.kt.a(super.b)).a();
         var4.a("The number you entered is your current mobile number. No change was made.");
         var4.a(super.b.c());
      }
   }

   static String a(e var0) {
      return var0.l;
   }
}
