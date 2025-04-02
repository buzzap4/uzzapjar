package com.kolipri.kt;

public final class x extends u {
   protected String f = new String("");
   protected String g = new String("");

   public x(r var1) {
      super(var1, "functionbar");
   }

   public final void a() {
      super.a();
   }

   public final void a(String var1, String var2) {
      if (var1 != null) {
         this.f = var1;
      }

      if (var2 != null) {
         this.g = var2;
      }

      this.w();
   }

   public final void a(e var1) {
      super.a(var1);
      int var2 = this.s().b / 4;
      ag var10001 = new ag(6, var2);
      j var10002 = this.e("kt.functionbar.font");
      ao var10003 = this.f("kt.functionbar.font.color");
      String var10004 = this.f;
      var1.getClass();
      var1.a(var10001, var10002, var10003, var10004, 0);
      var10001 = new ag(super.o.a - 6, var2);
      var10002 = this.e("kt.functionbar.font");
      var10003 = this.f("kt.functionbar.font.color");
      var10004 = this.g;
      var1.getClass();
      var1.a(var10001, var10002, var10003, var10004, 1);
   }

   public final boolean a(al var1) {
      boolean var2 = false;
      String var3 = null;
      if (var1.b == 6) {
         var3 = this.f;
         var2 = true;
      } else if (var1.b == 7) {
         var3 = this.g;
         var2 = true;
      }

      am var4;
      if (var3 != null && (var4 = this.v()) != null) {
         var4.a(var3);
      }

      return var2;
   }

   public final void c(l var1) {
      super.c(var1);
      am var2;
      if ((var2 = this.v()) != null) {
         var2.a(this);
      }

   }

   public final boolean a(int var1, int var2) {
      boolean var3 = false;
      String var4 = null;
      if (var1 < this.s().a / 2) {
         var4 = this.f;
      } else {
         var4 = this.g;
      }

      if (var4 != null) {
         am var5;
         if ((var5 = this.v()) != null) {
            var5.a(var4);
         }

         var3 = true;
      }

      if (!var3) {
         var3 = super.a(var1, var2);
      }

      return var3;
   }
}
