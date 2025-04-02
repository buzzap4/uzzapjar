package com.kolipri.kt;

public class g extends k {
   protected q b = null;
   protected l c = null;
   protected String d = null;
   public static boolean e = false;

   public g(r var1) {
      super(var1);
   }

   public void a(x var1) {
      var1.a("Select", "Cancel");
   }

   public void b(String var1) {
      if (var1.equals("Select") && this.b != null && this.b.b()) {
         this.f();
      }

      if (var1.equals("Cancel")) {
         this.f();
      }

   }

   public boolean a(al var1) {
      boolean var2 = false;
      if (var1.b == 5) {
         if (this.b != null && this.b.b()) {
            this.f();
         }

         var2 = true;
      }

      if (!var2) {
         var2 = super.a(var1);
      }

      return var2;
   }

   public String b() {
      return this.d;
   }

   public final void a(String var1) {
      this.d = var1;
   }

   public static ab b_() {
      return null;
   }

   public final l d() {
      String var1;
      if (((var1 = this.b()) == null || var1.length() < 1) && b_() == null) {
         return null;
      } else {
         ab var2;
         (var2 = new ab(super.b_, b_())).a();
         var2.b(0);
         var2.b(true);
         if (var1 != null) {
            var2.c(var1);
         }

         if (!e) {
            var2.b();
         }

         return var2;
      }
   }

   public final void a(af var1, boolean var2) {
      super.a();
      this.c(4);
      this.c = this.d();
      if (this.c != null) {
         this.d(this.c);
      }

      if (var2) {
         this.b = new h(super.b_);
         ((h)this.b).a(var1);
         ((h)this.b).a();
         this.d((h)this.b);
      } else {
         this.b = new v(super.b_, var1);
         ((v)this.b).a();
         this.d((v)this.b);
      }
   }

   public final void a(af var1) {
      this.a(var1, false);
   }

   public final boolean a(int var1, int var2) {
      boolean var3;
      if (var3 = super.a(var1, var2)) {
         this.f();
      }

      return var3;
   }
}
