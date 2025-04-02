package com.kolipri.kt;

import java.util.Vector;

public class y extends l {
   private ai f;
   private ai g;
   private ai h;
   private ai i;
   protected Vector a;
   protected int b;
   protected <undefinedtype> c;
   protected i e;

   public y(r var1) {
      super(var1);
      this.f = super.b_.a.b("unread-icon");
      this.g = super.b_.a.b("chat-icon");
      this.h = super.b_.a.b("unread-sending-icon");
      this.i = super.b_.a.b("sending-message-icon");
      this.a = new Vector();
      this.b = -1;
      this.c = null;
      this.e = null;
   }

   public void f() {
      this.G();
      super.f();
   }

   public final void a(x var1) {
      if (this.e != null) {
         this.e.a(var1);
      }

   }

   public final int b() {
      return this.b;
   }

   public final Vector d() {
      return this.a;
   }

   public final int e() {
      return this.a.size();
   }

   public final l a(int var1) {
      l var2 = null;
      t var3;
      if (var1 >= 0 && var1 < this.a.size() && (var3 = (t)this.a.elementAt(var1)) != null) {
         var2 = var3.c;
      }

      return var2;
   }

   public void a() {
      this.c = new l(this, super.b_, this) {
         protected int a = 0;
         protected y b = null;

         public {
            this.b = var3;
         }

         public final d c() {
            d var1 = new d(0, 0);
            ai var2;
            if ((var2 = super.b_.a.b("tab-not-selected")) != null) {
               var1.a = var2.a().a;
               var1.b = var2.a().b;
            }

            return var1;
         }

         public final void a() {
            this.b(0);
            this.b(true);
            this.a(this.c());
            this.x();
         }

         public final void a(e var1) {
            Vector var2 = this.b.d();
            int var3 = this.a;
            int var5 = 2;
            int var7 = 0;
            ai var8 = super.b_.a.b("tab-selected");
            ai var9 = super.b_.a.b("tab-not-selected");
            if (var8 != null) {
               var5 = this.s().a / var8.a().a;
            }

            if (this.b.b() < var3) {
               var3 = this.b.b();
            }

            if (this.b.b() >= var3 + var5) {
               var3 = this.b.b() - var5 + 1;
            }

            for(int var4 = var3; var4 < var2.size() && var4 - var3 < var5; ++var4) {
               ai var10 = ((t)var2.elementAt(var4)).b;
               int var6 = var7;
               if (var4 == this.b.b()) {
                  if (var8 != null) {
                     var1.a(new ag(var7, 0), var8);
                     var7 += var8.a().a;
                  }
               } else if (var9 != null) {
                  var1.a(new ag(var7, 0), var9);
                  var7 += var9.a().a;
               }

               if (var10 != null) {
                  int var11 = var7 - var6;
                  int var12 = this.s().b;
                  int var13 = var10.a().a;
                  int var14 = var10.a().b;
                  int var15 = (var11 - var13) / 2;
                  int var16 = (var12 - var14) / 2;
                  var1.a(new ag(var6 + var15, var16), var10);
               }
            }

            this.a = var3;
         }

         public final boolean a(int var1, int var2) {
            int var4 = 1;
            ai var5;
            if ((var5 = super.b_.a.b("tab-not-selected")) != null) {
               var4 = var5.a().a;
            }

            int var3 = var1 / var4;
            if (this.b != null) {
               this.b.f(var3);
            }

            return true;
         }
      };
      this.c.a();
      this.d(this.c);
      this.e = new i(super.b_, "frame", "kt.tabbedpanel.background.color");
      this.e.a();
      this.d(this.e);
   }

   public final int a(t var1) {
      this.a.addElement(var1);
      if (var1.c != null) {
         var1.c.c((l)this);
      }

      this.y();
      this.w();
      return this.a.size() - 1;
   }

   public final void g() {
      this.e(this.b);
   }

   public final void e(int var1) {
      if (var1 >= 0 && var1 < this.a.size()) {
         l var3 = ((t)this.a.elementAt(var1)).c;
         this.a.removeElementAt(var1);
         if (var3 != null) {
            var3.f();
         }

         this.y();
         this.b = -1;
         this.f(var1);
         this.w();
      }

   }

   public final void G() {
      while(this.a.size() > 0) {
         this.e(0);
      }

   }

   public void f(int var1) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var1 >= this.a.size()) {
         var1 = this.a.size() - 1;
      }

      if (var1 != this.b) {
         this.c(var1, 0);
         this.b = var1;
         l var2;
         if (this.e.j().size() > 0 && (var2 = (l)this.e.j().elementAt(0)) != null) {
            var2.a(false);
            this.e.e(var2);
         }

         t var3;
         if ((var3 = (t)this.a.elementAt(var1)) != null && var3.c != null) {
            this.e.d(var3.c);
            var3.c.a(this.e.n());
         }

         this.e.x();
         this.y();
         this.w();
      }

   }

   public final void c(int var1, int var2) {
      if (var1 >= 0 && var1 < this.a.size()) {
         t var3;
         if (((var3 = (t)this.a.elementAt(var1)).d & 1) == 1) {
            switch(var2) {
            case 0:
               var3.d &= -3;
               if ((var3.d & 4) == 4) {
                  var3.b = this.i;
                  return;
               }

               var3.b = this.g;
               return;
            case 1:
               var3.d = (byte)(var3.d | 2);
               if ((var3.d & 4) == 4) {
                  var3.b = this.h;
                  return;
               }

               var3.b = this.f;
               return;
            case 2:
               var3.d = (byte)(var3.d | 4);
               if ((var3.d & 2) == 2) {
                  var3.b = this.h;
                  return;
               }

               var3.b = this.i;
               return;
            case 3:
               var3.d &= -5;
               if ((var3.d & 2) == 2) {
                  var3.b = this.f;
                  return;
               } else {
                  var3.b = this.g;
               }
            default:
            }
         }
      }
   }

   public final void a(e var1) {
      if (this.e != null && this.e.n()) {
         this.e.a(new e(var1, this.e.p));
      }

      if (this.c != null && this.c.n()) {
         this.c.a(new e(var1, this.c.p));
      }

   }

   public final boolean a(al var1) {
      if (var1.b == 3 && this.b > 0) {
         this.f(this.b - 1);
         return true;
      } else if (var1.b == 4) {
         this.f(this.b + 1);
         return true;
      } else {
         return super.a(var1);
      }
   }
}
