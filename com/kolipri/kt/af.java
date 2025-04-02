package com.kolipri.kt;

public abstract class af {
   protected b h = null;
   protected r i = null;
   public int j = 0;
   public int k = 0;

   public af(r var1) {
      this.i = var1;
   }

   public final void a(b var1) {
      this.h = var1;
   }

   public boolean e(int var1) {
      boolean var2 = true;
      if (this.h != null) {
         var2 = this.h.a(this, this.g(var1));
      }

      return var2;
   }

   public int g(int var1) {
      return var1;
   }

   public abstract String a();

   public abstract int c();

   public abstract String a(int var1);

   public d b() {
      return new d(0, 0);
   }

   public boolean d_() {
      return false;
   }

   public String b_(int var1) {
      return null;
   }

   public ai b(int var1) {
      return null;
   }

   public ai c(int var1) {
      return null;
   }

   public int d(int var1) {
      return 0;
   }

   public ao i(int var1) {
      return this.i.a.c("kt.menuentries.font.color");
   }

   public static ao f() {
      return null;
   }

   public static boolean g() {
      return true;
   }

   public int e() {
      return this.j;
   }

   public int f(int var1) {
      return 0;
   }
}
