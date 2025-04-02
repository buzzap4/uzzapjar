package com.kolipri.kt;

public class k extends i {
   public k(r var1) {
      super(var1, "frame", "kt.popup.background.color");
   }

   public final void a(am var1) {
      if (var1 != null) {
         this.b(var1);
         var1.a((l)this);
         this.a(true);
         this.g();
      }

   }

   public void a() {
      super.a();
      this.a((l)this);
   }

   public void f() {
      super.f();
      this.b((l)this);
   }

   public final void g() {
      if (super.q == null) {
         this.a(new d(0, 0));
         this.x();
      } else {
         x var1 = super.q.d();
         boolean var2 = false;
         int var3 = 0;
         int var8;
         if (var1 != null) {
            var8 = var1.s().a;
         } else {
            var8 = super.q.b().a;
         }

         this.a(new d(var8, this.s().b));

         for(int var4 = 0; var4 < super.t.size(); ++var4) {
            l var6;
            if ((var6 = (l)super.t.elementAt(var4)) != null && var6.n() == this.n()) {
               d var7;
               if ((var7 = var6.c()) == null || var7.b == 0) {
                  var3 = 0;
                  break;
               }

               var3 = var3 + var7.b + super.v;
            }
         }

         if (var3 > 0) {
            var3 -= super.v;
         }

         if (var3 > 0) {
            var3 += super.w * 2;
         }

         int var5;
         if (var1 != null) {
            var5 = super.q.b().b - var1.s().b - 48;
         } else {
            var5 = super.q.b().b - 48;
         }

         if (var5 < 0) {
            var5 = 0;
         }

         if (var3 < 1) {
            var3 = var5;
         }

         if (var3 > var5) {
            var3 = var5;
         }

         this.a(new d(var8, var3));
         int var9 = super.q.b().b - var3;
         if (var1 != null) {
            var9 -= var1.s().b;
         }

         this.a(new ag((super.q.b().a - var8) / 2, var9));
      }
   }
}
