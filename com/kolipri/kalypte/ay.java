package com.kolipri.kalypte;

import java.util.Timer;
import java.util.TimerTask;

public final class ay extends com.kolipri.kt.l {
   protected boolean a = true;
   protected com.kolipri.kt.ag b = null;
   protected com.kolipri.kt.ai c = null;
   protected com.kolipri.kt.ai e = null;
   protected Timer f = null;

   public ay(com.kolipri.kt.r var1, com.kolipri.kt.l var2, String var3, String var4) {
      super(var1);
      this.c = super.b_.a.b(var3);
      this.e = super.b_.a.b(var4);
      this.c(var2);
   }

   public final void b(com.kolipri.kt.ag var1) {
      this.b = var1;
   }

   public final com.kolipri.kt.d s() {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = this.c.a().a > this.e.a().a ? this.c.a().a : this.e.a().a;
      int var4 = this.c.a().b > this.e.a().b ? this.c.a().b : this.e.a().b;
      return new com.kolipri.kt.d(var3, var4);
   }

   public final void a(com.kolipri.kt.e var1) {
      super.a(var1);
      var1.a(this.b, this.a ? this.c : this.e);
   }

   public final boolean b() {
      return this.f != null;
   }

   protected final void d() {
      if (this.f != null) {
         this.f.cancel();
         this.f = null;
      }

      this.a = true;
      this.w();
   }

   protected final void e() {
      if (this.f == null) {
         this.a = true;
         this.f = new Timer();
         this.f.schedule(new TimerTask(this, this) {
            protected ay a = null;

            public {
               this.a = var2;
            }

            public final void run() {
               if (this.a != null) {
                  this.a.w();
               }

               this.a.a = !this.a.a;
            }
         }, 0L, 300L);
         this.f.schedule(new TimerTask(this, null) {
            private final ay a;

            private {
               this.a = var1;
            }

            public final void run() {
               this.a.d();
            }
         }, 120000L);
      }

   }

   protected final void c(boolean var1) {
      if (this.f != null) {
         this.f.cancel();
         this.f = null;
      }

      this.a = var1;
      this.w();
   }
}
