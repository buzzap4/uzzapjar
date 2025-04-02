package com.kolipri.kt;

public class v extends l implements q {
   protected af e = null;
   public int f = 0;
   public int g = 0;
   public int h = 0;
   protected j i = null;
   protected int j = 0;
   protected int k = 0;
   private aq a;
   private boolean b = false;
   private boolean c = true;
   private int l = -1;

   public v(r var1, af var2) {
      super(var1);
      this.e = var2;
      this.i = this.e("kt.menu.font");
   }

   protected final String a(String var1, int var2) {
      String var3 = var1;
      if (this.i.a(var1) + var2 > this.s().a - 8) {
         for(int var4 = this.i.a(".."); var4 + this.i.a(var3) + var2 > this.s().a - 8 && var3.length() > 0; var3 = var3.substring(0, var3.length() - 2)) {
         }

         var3 = var3 + "..";
      }

      return var3;
   }

   protected final void e() {
      if (this.e == null) {
         this.f = 0;
      } else if (this.e.c() < 1) {
         this.f = 0;
         this.j = 0;
      } else {
         if (this.e != null && this.f >= this.e.c()) {
            this.f = this.e.c() - 1;
         }

         if (this.h == 0) {
            while(this.f >= 0 && !af.g() && this.f < this.e.c() - 1) {
               ++this.f;
            }

            while(this.f > 0 && !af.g()) {
               --this.f;
            }
         } else {
            while(this.f > 0 && !af.g()) {
               --this.f;
            }

            while(this.f >= 0 && !af.g() && this.f < this.e.c() - 1) {
               ++this.f;
            }
         }

         if (!af.g() && this.f == 0) {
            --this.f;
            this.j = 0;
         } else {
            if (this.f < this.j) {
               this.j = this.f;
            }

            if (this.f >= this.j + this.g && this.g > 0) {
               this.j = this.f - this.g + 1;
            }

            if (this.f == 1 && !af.g()) {
               this.j = 0;
            }

         }
      }
   }

   public final void a(af var1) {
      this.e = var1;
   }

   public final void a(int var1) {
      this.f = var1;
      this.e();
   }

   public final boolean b() {
      boolean var1 = false;
      if (this.e != null) {
         var1 = this.e.e(this.f);
      }

      this.w();
      this.w();
      return var1;
   }

   public final int g() {
      int var1 = this.i.b;
      if (this.e != null) {
         if (this.e.d_()) {
            var1 *= 2;
            var1 += 4;
         }

         if (this.e.b().b > var1) {
            var1 = this.e.b().b;
         }
      }

      if (this.a != null) {
         var1 += this.a.c().b;
      }

      return var1 + 4;
   }

   public final int e(int var1) {
      return var1 > 0 ? var1 * this.g() : 1;
   }

   public final d c() {
      return this.e != null ? new d(this.s().a, this.e(this.e.c())) : new d(0, 0);
   }

   public boolean a(al var1) {
      boolean var2 = false;
      if (this.b) {
         return false;
      } else {
         if (var1.b == 2) {
            if (this.e != null) {
               if (this.f < this.e.c() - 1) {
                  ++this.f;
               } else {
                  this.f = 0;
               }
            }

            this.h = 0;
            this.w();
            var2 = true;
         } else if (var1.b == 1) {
            if (this.f > 0) {
               --this.f;
            } else if (this.e != null) {
               this.f = this.e.c() - 1;
            }

            this.h = 1;
            this.w();
            var2 = true;
         } else if (var1.b == 5) {
            this.b();
            var2 = true;
         }

         return var2;
      }
   }

   public final boolean a(int var1, int var2) {
      boolean var3;
      if (!(var3 = super.a(var1, var2))) {
         this.f = this.j + var2 / this.g();
         var3 = this.b();
         this.w();
      }

      return var3;
   }

   public final boolean b(int var1, int var2) {
      if (this.e != null) {
         int var3;
         if ((var3 = this.j + var2 / this.g()) < 0 || var3 >= this.e.c()) {
            var3 = -1;
         }

         if (this.a != null) {
            var3 -= this.a.c().b;
         }

         if (var3 >= 0 && var3 != this.f) {
            this.f = var3;
            this.w();
         }
      }

      return true;
   }

   public final void d(String var1) {
      this.a = new aq(super.b_);
      this.a.a(var1);
      this.a.a();
      this.d(this.a);
   }

   public void a() {
      super.a();
   }

   public void a(e var1) {
      super.a(var1);
      int var3 = 2;
      int var4 = this.i.b;
      int var5 = 0;
      boolean var6 = false;
      if (this.a != null) {
         this.k = this.a.c().b;
      }

      int var12 = 0 + this.k;
      this.e();
      this.g = 0;
      if (this.e != null) {
         ao var9 = this.f("kt.menu.selected.color");
         ai var10 = null;
         if (this.e.d_()) {
            var4 *= 2;
            var4 += 4;
         }

         if (this.e.b().a > 0) {
            var3 = 2 + this.e.b().a + 4;
         }

         if (this.e.b().b > var4) {
            var4 = this.e.b().b;
         }

         if (this.e.d_()) {
            var5 = 0;
         } else if (var4 > this.i.b) {
            var5 = (var4 - this.i.b) / 2;
         }

         int var2;
         int var11;
         if (this.l > -1) {
            var11 = var12;

            for(var2 = this.j; var2 < this.e.c() && var11 + var4 <= this.s().b; ++var2) {
               var11 += var4;
               ++this.g;
            }

            if (this.j > this.l) {
               this.j = this.l;
            } else if (this.j + this.g <= this.l) {
               this.j = this.l - this.g + 1;
            }

            if (!this.c) {
               this.f = this.l;
               this.e();
            }

            this.l = -1;
            this.g = 0;
         }

         for(var2 = this.j; var2 < this.e.c() && var12 + var4 <= this.s().b; ++var2) {
            if (this.e.f(var2) > 0) {
               var12 += this.e.f(var2);
            }

            if (var2 == this.f && !this.b) {
               var1.a(new ag(0, var12), new d(this.s().a - 8, var4 + 4), var9);
            } else {
               ao var8;
               if ((var8 = af.f()) != null) {
                  var1.a(new ag(0, var12), new d(this.s().a - 8, var4 + 4), var8);
               }
            }

            int var10000;
            if ((var10 = this.e.b(var2)) != null) {
               var10000 = this.e.k;
               var1.getClass();
               if (var10000 == 0) {
                  var1.a(new ag(2 + this.e.d(var2), var12 + 2), var10);
               } else {
                  var1.a(new ag(this.e.d(var2) + var10.a().a + 6 + this.i.a(this.e.a(var2)), var12 + 2), var10);
               }
            }

            if ((var10 = this.e.c(var2)) != null) {
               var10000 = this.e.e();
               var1.getClass();
               if (var10000 == 0) {
                  var1.a(new ag(2, var12 + 2), var10);
               } else {
                  var1.a(new ag(this.s().a - 10 - var10.a().a, var12 + 2), var10);
               }
            }

            String var7;
            ag var10001;
            j var10002;
            ao var10003;
            String var10004;
            if ((var7 = this.e.a(var2)) != null) {
               var11 = var3 + this.e.d(var2);
               var10000 = this.e.k;
               var1.getClass();
               if (var10000 == 1 && var10 != null) {
                  var11 -= var10.a().a;
               }

               var10001 = new ag(var11, var12 + 2 + var5);
               var10002 = this.i;
               var10003 = this.e.i(var2);
               var10004 = this.a(var7, var11);
               var1.getClass();
               var1.a(var10001, var10002, var10003, var10004, 0);
            }

            if (this.e.d_() && (var7 = this.e.b_(var2)) != null) {
               var11 = var3 + this.e.d(var2);
               var10001 = new ag(var11, var12 + 2 + var5 + this.i.b + 4);
               var10002 = this.i;
               var10003 = this.e.i(var2);
               var10004 = this.a(var7, var11);
               var1.getClass();
               var1.a(var10001, var10002, var10003, var10004, 0);
            }

            var12 += var4 + 4;
            ++this.g;
         }

         this.a(var1, this.j, this.g, this.e.c());
      }

   }

   public final void a(int var1, boolean var2) {
      this.c = var2;
      this.l = var1;
      this.w();
   }
}
