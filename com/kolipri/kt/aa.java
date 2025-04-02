package com.kolipri.kt;

public final class aa extends l {
   public com.kolipri.kpr.f a = new com.kolipri.kpr.f();
   protected j b = null;
   protected String c = "";
   protected String e = null;
   protected int f = 0;
   protected com.kolipri.kpr.b g = null;
   protected int h;
   protected int i;
   protected int j;
   protected int k = 0;
   protected boolean l = false;
   protected com.kolipri.kalypte.as E = null;

   public final void a(com.kolipri.kalypte.as var1) {
      this.E = var1;
   }

   public aa(r var1) {
      super(var1);
   }

   public final void a(com.kolipri.kpr.f var1) {
      this.a = var1;
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   public final void a() {
      super.a();
   }

   public final void a(String var1) {
      this.c = var1;
   }

   public final void c(String var1) {
      this.e = var1;
   }

   public final void a(e var1) {
      super.a(var1);
      this.b = this.e("kt.textview.font");
      int var3 = 2;
      int var5 = this.b.b;
      boolean var6 = false;
      this.s();
      this.s();
      this.i = 0;
      this.a(1, "kt.editor.font");
      this.f = 0;
      ag var10001;
      j var10002;
      ao var10003;
      String var10004;
      if (this.e != null) {
         var10001 = new ag(5, 2);
         var10002 = this.b;
         var10003 = this.f("kt.textview.special.color");
         var10004 = this.e;
         var1.getClass();
         var1.getClass();
         var1.a(var10001, var10002, var10003, var10004, 0);
         var3 = 2 + this.b.b + 2;
         this.f += this.b.b + 2;
      }

      int var13;
      if (this.c != null) {
         var13 = -1;

         for(String var14 = this.c.substring(2); var13 != 0; var3 += this.b.b) {
            var13 = a(var14, this.s().a - 20, this.b);
            var10001 = new ag(5, var3);
            var10002 = this.b;
            var10003 = this.f("kt.textview.font.color");
            var10004 = var14.substring(0, var13);
            var1.getClass();
            var1.getClass();
            var1.a(var10001, var10002, var10003, var10004, 0);
            var14 = var14.substring(var13);
         }
      }

      var3 += 2;
      this.f = var3;
      if (this.a != null && this.a.b() > 0) {
         this.l = true;
         this.g = (com.kolipri.kpr.b)this.a.b(0);
         var13 = 5;
         var1.a(new ag(2, var3 - 2), new d(this.s().a - 8, var5 + 4), this.f("kt.menu.selected.color"));

         int var17;
         for(var17 = this.k; this.g != null && var17 < this.g.b() && var13 + 20 < this.s().a - 6 - 10 - 8; ++var17) {
            if (this.g.a(var17) != null) {
               var10001 = new ag(var13, var3);
               var10002 = this.b;
               var10003 = this.f("kt.textview.other.special.color");
               var10004 = this.g.a(var17);
               var1.getClass();
               var1.getClass();
               var1.a(var10001, var10002, var10003, var10004, 0);
               var13 += this.c(var17, this.b.a(this.g.a(var17) + 4)) + 10;
            }
         }

         var3 += var5 + 6;

         for(var17 = this.h; var17 < this.a.b() && var3 + var5 <= this.s().b - 4; ++var17) {
            com.kolipri.kpr.b var18 = (com.kolipri.kpr.b)this.a.b(var17);
            int var15 = 5;
            if (var17 % 2 == 0) {
               var1.a(new ag(2, var3 - 2), new d(this.s().a - 8, var5 + 4), this.f("kt.editor.background.color"));
            }

            this.j = 0;

            for(int var16 = this.k; var16 < var18.b() && var15 + 20 < this.s().a - 6 - 10 - 8; ++var16) {
               if (var18.b(var16) != null) {
                  var10001 = new ag(var15, var3);
                  var10002 = this.b;
                  var10003 = this.f("kt.textview.font.color");
                  var10004 = var18.b(var16);
                  var1.getClass();
                  var1.getClass();
                  var1.a(var10001, var10002, var10003, var10004, 0);
               }

               var15 += this.c(var16, this.b.a(this.g.a(var16) + 4)) + 10;
               ++this.j;
            }

            var3 += var5 + 4;
            ++this.i;
         }

         this.a(var1, this.h, this.i, this.a.b());
         if (this.g.b() > 0) {
            this.b(var1, this.k, this.j, this.g.b());
         }
      }

   }

   private int c(int var1, int var2) {
      int var3 = var2;
      boolean var5 = false;

      for(int var6 = 0; var6 < this.a.b(); ++var6) {
         com.kolipri.kpr.b var7 = (com.kolipri.kpr.b)this.a.b(var6);

         for(int var8 = 0; var8 < var7.b(); ++var8) {
            int var9;
            if (var8 == var1 && (var9 = this.b.a(var7.b(var8))) > var3) {
               var3 = var9 + 4;
            }
         }
      }

      return var3;
   }

   public final boolean a(al var1) {
      if (var1.b == 2) {
         if (this.h + this.i < this.a.b()) {
            ++this.h;
            this.w();
         }

         return true;
      } else if (var1.b == 1) {
         if (this.h > 0) {
            --this.h;
            this.w();
         } else {
            this.h = 0;
            this.w();
         }

         return true;
      } else {
         return super.a(var1);
      }
   }

   public final void b() {
      if (this.g != null && this.g.b() > 0 && this.j + this.k < this.g.b()) {
         ++this.k;
      } else {
         this.k = 0;
      }

      this.w();
   }

   public final boolean a(int var1, int var2) {
      boolean var3 = false;
      if (var2 >= this.s().b - 4 && var2 <= this.s().b - 2) {
         if (var1 >= super.C + 5 + super.B && var1 <= this.s().a - 4) {
            ++this.k;
            this.w();
         } else if (var1 >= 0 && var1 <= super.C) {
            --this.k;
            this.w();
         }
      } else if (var1 >= this.s().a - 10) {
         if (var2 >= super.z - this.f + super.A && var1 <= this.s().b) {
            ++this.h;
            this.w();
         } else if (var2 >= 0 && var2 <= super.z + this.f - 8) {
            --this.h;
            this.w();
         }
      }

      return super.a(var1, var2);
   }

   public final void a(e var1, int var2, int var3, int var4) {
      int var5 = this.f;
      if (var3 < var4) {
         var1.a(new ag(this.s().a - 6, var5), new d(10, this.s().b - 8 - var5), this.f("kt.scrollbar.color.fill"));
         var1.a(new ag(this.s().a - 6 + 1, 1 + var5), new d(8, this.s().b - 10 - var5), this.f("kt.scrollbar.color.bg"));
         super.z = (this.s().b - 8 - var5) * var2 / var4;
         super.A = (this.s().b - 8 - var5) * var3 / var4;
         var1.a(new ag(this.s().a - 6 + 1, super.z + var5), new d(8, super.A), this.f("kt.scrollbar.color.fill"));
      } else {
         super.z = 0;
         super.A = 0;
      }
   }

   public final void b(e var1, int var2, int var3, int var4) {
      if (var3 < var4) {
         var1.a(new ag(4, this.s().b - 4), new d(this.s().a - 8, 10), this.f("kt.scrollbar.color.fill"));
         var1.a(new ag(5, this.s().b - 3), new d(this.s().a - 10, 8), this.f("kt.scrollbar.color.bg"));
         super.C = (this.s().a - 8) * var2 / var4;
         super.B = (this.s().a - 8) * var3 / var4;
         var1.a(new ag(super.C + 5, this.s().b - 3), new d(super.B, 8), this.f("kt.scrollbar.color.fill"));
         this.l = true;
         if (this.E != null) {
            this.E.b();
            return;
         }
      } else {
         super.C = 0;
         super.B = 0;
         this.l = false;
         if (this.E != null) {
            this.E.b();
         }
      }

   }

   private static int a(String var0, int var1, j var2) {
      int var3 = 0;
      int var4 = 0;

      for(String var5 = null; var3 < var0.length(); var4 = var2.a(var0.substring(0, var3))) {
         if (var0.charAt(var3) == '\n' || var1 < var4) {
            var5 = var0.substring(0, var3);
            return var0.charAt(var3) == '\n' ? var3 : var5.lastIndexOf(32);
         }

         ++var3;
      }

      return -1;
   }

   public final boolean d() {
      return this.l;
   }

   public final void c(boolean var1) {
      this.l = var1;
   }
}
