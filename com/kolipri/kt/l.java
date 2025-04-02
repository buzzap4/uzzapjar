package com.kolipri.kt;

import java.util.Vector;

public class l {
   protected r b_ = null;
   protected l m = null;
   protected com.kolipri.kpr.c n = new com.kolipri.kpr.c();
   protected d o = new d(0, 0);
   protected ag p;
   protected am q;
   protected ao r;
   protected ai s;
   protected Vector t;
   protected int u;
   protected int v;
   protected int w;
   protected boolean x;
   protected boolean y;
   protected int z;
   protected int A;
   protected int B;
   protected int C;
   protected int D;

   public l(r var1) {
      new d(0, 0);
      this.p = new ag(0, 0);
      this.q = null;
      this.r = null;
      this.s = null;
      this.t = new Vector();
      this.u = 1;
      this.v = 0;
      this.w = 0;
      this.x = false;
      this.y = false;
      this.z = 0;
      this.A = 0;
      this.B = 0;
      this.C = 0;
      this.D = 0;
      this.b_ = var1;
   }

   public void a() {
   }

   public void f() {
      this.a(false);
      if (this.q != null) {
         this.q.b(this);
      } else if (this.m != null) {
         this.m.e(this);
      }

      l var2 = null;

      com.kolipri.kpr.e var1;
      while((var1 = this.n.a()) != null) {
         var2 = (l)var1.c;
         this.n.a((Object)var2);
         var2.f();
      }

      this.h();
   }

   public final void h() {
      for(int var1 = 0; var1 < this.t.size(); ++var1) {
         l var2;
         if ((var2 = (l)this.t.elementAt(var1)) != null) {
            var2.f();
         }
      }

      this.t.removeAllElements();
   }

   public final void i() {
      if (this.t != null) {
         this.t.removeAllElements();
      }

   }

   public final Vector j() {
      return this.t;
   }

   public final l k() {
      l var1 = null;
      if (this.t.size() > 0) {
         var1 = (l)this.t.elementAt(0);
      }

      return var1;
   }

   public final void a(l var1) {
      this.n.b((Object)var1);
   }

   public final void b(l var1) {
      this.n.a((Object)var1);
   }

   public final void l() {
      l var1 = null;

      while((var1 = this.m()) != null) {
         this.b(var1);
         var1.f();
      }

   }

   protected final l m() {
      l var1 = null;

      for(com.kolipri.kpr.e var2 = this.n.b(); var2 != null && var1 == null; var2 = com.kolipri.kpr.c.c(var2)) {
         var1 = (l)var2.c;
      }

      return var1;
   }

   public final boolean n() {
      return this.y;
   }

   public final void a(boolean var1) {
      boolean var2 = false;
      if (var1 != this.y) {
         var2 = true;
      }

      this.y = var1;

      for(int var3 = 0; var3 < this.t.size(); ++var3) {
         l var4;
         if ((var4 = (l)this.t.elementAt(var3)) != null) {
            var4.a(var1);
         }
      }

      if (this.m != null) {
         this.m.x();
      } else {
         this.x();
      }

      if (var2 && this.y) {
         this.z();
      }

      if (var2 && !this.y) {
         this.A();
      }

   }

   public final void a(ag var1) {
      this.p = var1;
   }

   public final ag o() {
      return this.p;
   }

   public final void b(int var1) {
      this.u = var1;
   }

   public final int p() {
      return this.u;
   }

   public final void b(boolean var1) {
      this.x = var1;
   }

   public final boolean q() {
      return this.x;
   }

   public final void c(int var1) {
      this.v = var1;
   }

   public final void d(int var1) {
      this.w = var1;
   }

   public final void b(am var1) {
      this.q = var1;
   }

   public final am r() {
      return this.q;
   }

   public d s() {
      return this.o;
   }

   public final r t() {
      return this.b_;
   }

   public final l u() {
      return this.m;
   }

   public void c(l var1) {
      this.m = var1;
   }

   public void a(d var1) {
      this.o = var1;
      this.x();
   }

   public final void a(ao var1) {
      this.r = var1;
   }

   public final void a(ai var1) {
      this.s = var1;
   }

   protected final void b(e var1) {
      if (this.s == null) {
         if (this.r != null) {
            var1.a(new ag(0, 0), this.o, this.r);
         }

      } else {
         for(int var3 = 0; var3 < this.s().b; var3 += this.s.a().b) {
            for(int var2 = 0; var2 < this.s().a; var2 += this.s.a().a) {
               var1.a(new ag(var2, var3), this.s);
            }
         }

      }
   }

   protected final void c(e var1) {
      for(int var2 = 0; var2 < this.t.size(); ++var2) {
         l var3;
         if ((var3 = (l)this.t.elementAt(var2)) != null && var3.n()) {
            var3.a(new e(var1, var3.p));
         }
      }

   }

   public final void d(l var1) {
      this.t.addElement(var1);
      var1.c(this);
      if (this.r != null) {
         var1.a(this.r);
      }

      this.x();
   }

   public final void e(l var1) {
      this.t.removeElement(var1);
      this.x();
   }

   public void a(e var1) {
      this.b(var1);
      this.c(var1);
   }

   public final am v() {
      am var1 = null;

      for(l var2 = this; var2 != null && var1 == null; var2 = var2.u()) {
         var1 = var2.r();
      }

      return var1;
   }

   public final void w() {
      am var1;
      if ((var1 = this.v()) != null) {
         var1.repaint();
      }

   }

   public final void x() {
      if (this.n()) {
         int var1 = 0;
         boolean var2 = false;
         int var8;
         if (this.D == 0) {
            var8 = this.s().b;
         } else {
            var8 = this.s().a;
         }

         var8 -= this.w * 2;

         int var5;
         l var6;
         for(var5 = 0; var5 < this.t.size() - 1; ++var5) {
            if ((var6 = (l)this.t.elementAt(var5)) != null && var6.n()) {
               var8 -= this.v;
            }
         }

         for(var5 = 0; var5 < this.t.size(); ++var5) {
            if ((var6 = (l)this.t.elementAt(var5)) != null && var6.n()) {
               var1 += var6.p();
               if (var6.p() == 0) {
                  d var7;
                  if (this.D == 0) {
                     if ((var7 = var6.c()).a > this.s().a) {
                        var7.a = this.s().a;
                     }

                     if (var7.b > var8) {
                        var7.b = var8;
                     }

                     var6.a(var7);
                     var8 -= var6.s().b;
                  } else {
                     if ((var7 = var6.c()).b > this.s().b) {
                        var7.b = this.s().b;
                     }

                     if (var7.a > var8) {
                        var7.a = var8;
                     }

                     var6.a(var7);
                     var8 -= var6.s().a;
                  }
               }
            }
         }

         int var3 = this.w;

         for(var5 = 0; var5 < this.t.size(); ++var5) {
            if ((var6 = (l)this.t.elementAt(var5)) != null && var6.n()) {
               if (this.D == 0) {
                  var6.a(new ag(this.w, var3));
               } else {
                  var6.a(new ag(var3, this.w));
               }

               if (var6.p() != 0) {
                  int var4 = var8 * var6.p() / var1;
                  if (this.D == 0) {
                     var6.a(new d(this.s().a - this.w * 2, var4));
                  } else {
                     var6.a(new d(var4, this.s().b - this.w * 2));
                  }
               } else if (var6.q()) {
                  if (this.D == 0) {
                     var6.a(new d(this.s().a - this.w * 2, var6.s().b));
                  }

                  if (this.D == 1) {
                     var6.a(new d(var6.s().a, this.s().b - this.w * 2));
                  }
               }

               if (this.D == 0) {
                  var3 += var6.s().b;
               } else {
                  var3 += var6.s().a;
               }

               var3 += this.v;
            }
         }

         for(var5 = 0; var5 < this.t.size(); ++var5) {
            if ((var6 = (l)this.t.elementAt(var5)) != null && var6.n()) {
               var6.x();
            }
         }

         this.w();
      }
   }

   public final j e(String var1) {
      j var2 = null;
      if (this.b_ != null) {
         var2 = this.b_.a.d(var1);
      }

      return var2;
   }

   public final j a(int var1, String var2) {
      j var3 = null;
      if (this.b_ != null) {
         var3 = this.b_.a.a(var1, var2);
      }

      return var3;
   }

   public final ao f(String var1) {
      ao var2 = null;
      if (this.b_ != null) {
         var2 = this.b_.a.c(var1);
      }

      return var2;
   }

   public boolean a(al var1) {
      boolean var2 = false;

      for(int var3 = 0; var3 < this.t.size(); ++var3) {
         l var4;
         if ((var4 = (l)this.t.elementAt(var3)) != null && var4.a(var1)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public void b(String var1) {
      for(int var2 = 0; var2 < this.t.size(); ++var2) {
         l var3;
         if ((var3 = (l)this.t.elementAt(var2)) != null) {
            var3.b(var1);
         }
      }

   }

   public boolean a(int var1, int var2) {
      boolean var3 = false;

      for(int var4 = 0; var4 < this.t.size(); ++var4) {
         l var5;
         if ((var5 = (l)this.t.elementAt(var4)) != null) {
            ag var6 = var5.o();
            d var7 = var5.s();
            if (var1 >= var6.a && var1 < var6.a + var7.a && var2 >= var6.b && var2 < var6.b + var7.b) {
               var3 = var5.a(var1 - var6.a, var2 - var6.b);
            }
         }
      }

      if (!var3 && this.A > 0 && var1 >= this.s().a - 6) {
         if (var2 < this.z) {
            this.a(new al(1));
         } else if (var2 > this.z + this.A) {
            this.a(new al(2));
         }

         var3 = true;
      }

      return var3;
   }

   public boolean b(int var1, int var2) {
      boolean var3 = false;

      for(int var4 = 0; var4 < this.t.size(); ++var4) {
         l var5;
         if ((var5 = (l)this.t.elementAt(var4)) != null) {
            ag var6 = var5.o();
            d var7 = var5.s();
            if (var1 >= var6.a && var1 < var6.a + var7.a && var2 >= var6.b && var2 < var6.b + var7.b) {
               var3 = var5.b(var1 - var6.a, var2 - var6.b);
            }
         }
      }

      return var3;
   }

   public final void y() {
      am var1;
      if ((var1 = this.v()) != null) {
         var1.c();
      }

   }

   public void a(x var1) {
      l var2;
      if (this.t.size() > 0 && (var2 = (l)this.t.elementAt(0)) != null) {
         var2.a(var1);
      }

   }

   public void z() {
      for(int var1 = 0; var1 < this.t.size(); ++var1) {
         l var2;
         if ((var2 = (l)this.t.elementAt(var1)) != null) {
            var2.z();
         }
      }

   }

   public void A() {
      for(int var1 = 0; var1 < this.t.size(); ++var1) {
         l var2;
         if ((var2 = (l)this.t.elementAt(var1)) != null) {
            var2.A();
         }
      }

   }

   public final void B() {
      for(int var1 = 0; var1 < this.t.size(); ++var1) {
         l var2;
         if ((var2 = (l)this.t.elementAt(var1)) != null) {
            var2.B();
         }
      }

   }

   public final void C() {
      for(int var1 = 0; var1 < this.t.size(); ++var1) {
         l var2;
         if ((var2 = (l)this.t.elementAt(var1)) != null) {
            var2.C();
         }
      }

   }

   public d c() {
      int var1 = 0;
      int var2 = 0;

      for(int var3 = 0; var3 < this.t.size(); ++var3) {
         l var4;
         if ((var4 = (l)this.t.elementAt(var3)) != null && var4.n() == this.n()) {
            d var5;
            if ((var5 = var4.c()) == null || var5.a < 1 || var5.b < 1) {
               var1 = 0;
               var2 = 0;
               break;
            }

            var2 += var5.b;
            if (var5.a > var1) {
               var1 = var5.a;
            }

            var2 += this.v;
         }
      }

      if (var2 > 0) {
         var2 -= this.v;
      }

      if (var2 > 0) {
         var2 += this.w * 2;
      }

      if (var1 > 0) {
         var1 += this.w * 2;
      }

      return var1 > 0 && var2 > 0 ? new d(var1, var2) : new d(0, 0);
   }

   public void a(e var1, int var2, int var3, int var4) {
      if (var3 < var4) {
         var1.a(new ag(this.s().a - 6, 0), new d(10, this.s().b), this.f("kt.scrollbar.color.fill"));
         var1.a(new ag(this.s().a - 6 + 1, 1), new d(8, this.s().b - 2), this.f("kt.scrollbar.color.bg"));
         this.z = this.s().b * var2 / var4;
         this.A = this.s().b * var3 / var4;
         var1.a(new ag(this.s().a - 6 + 1, this.z), new d(8, this.A), this.f("kt.scrollbar.color.fill"));
      } else {
         this.z = 0;
         this.A = 0;
      }
   }

   public void b(e var1, int var2, int var3, int var4) {
      if (var3 < var4) {
         var1.a(new ag(0, this.s().b - 6), new d(this.s().a, 8), this.f("kt.scrollbar.color.fill"));
         var1.a(new ag(1, this.s().b - 6 + 1), new d(this.s().a - 2, 4), this.f("kt.scrollbar.color.bg"));
         this.C = this.s().a * var2 / var4;
         this.B = this.s().a * var3 / var4;
         var1.a(new ag(this.C, this.s().b - 6 + 1), new d(this.B, 6), this.f("kt.scrollbar.color.fill"));
      } else {
         this.C = 0;
         this.B = 0;
      }
   }

   public final void D() {
      y var1 = null;

      for(l var2 = this; var1 == null && var2 != null; var2 = var2.u()) {
         if (var2 instanceof y) {
            var1 = (y)var2;
         }
      }

      if (var1 != null) {
         var1.g();
      }

   }

   public String E() {
      String var1 = null;

      for(int var2 = 0; var1 == null && var2 < this.t.size(); ++var2) {
         l var3;
         if ((var3 = (l)this.t.elementAt(var2)) != null) {
            var1 = var3.E();
         }
      }

      return var1;
   }

   public final ag F() {
      ag var1 = new ag(this.o());
      if (this.m != null) {
         ag var2 = this.m.F();
         var1.a += var2.a;
         var1.b += var2.b;
      }

      return var1;
   }
}
