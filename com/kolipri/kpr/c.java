package com.kolipri.kpr;

public final class c {
   protected e a = null;
   protected e b = null;
   protected int c = 0;

   public final synchronized void a(e var1) {
      if (var1 != null) {
         if (var1.a == null && var1.b == null) {
            if (var1 == this.a) {
               this.a = null;
            }

            if (var1 == this.b) {
               this.b = null;
            }

            --this.c;
         } else if (var1.a == null) {
            if (var1 == this.a) {
               this.a = var1.b;
            }

            var1.b.a = null;
            --this.c;
         } else if (var1.b == null) {
            if (this.b == var1) {
               this.b = var1.a;
            }

            var1.a.b = null;
            --this.c;
         } else {
            var1.b.a = var1.a;
            var1.a.b = var1.b;
            --this.c;
         }
      }
   }

   public final synchronized void a(Object var1) {
      e var2;
      if ((var2 = this.c(var1)) != null) {
         this.a(var2);
      }

   }

   private synchronized void d(e var1) {
      if (this.a != null) {
         this.a.a = var1;
         var1.b = this.a;
      } else {
         var1.b = null;
         this.b = var1;
      }

      var1.a = null;
      this.a = var1;
      ++this.c;
   }

   private synchronized void e(e var1) {
      if (this.b != null) {
         this.b.b = var1;
         var1.a = this.b;
         this.b = var1;
         var1.b = null;
         ++this.c;
      } else {
         this.d(var1);
      }
   }

   public final synchronized void b(Object var1) {
      e var2;
      (var2 = new e()).c = var1;
      this.e(var2);
   }

   public final synchronized e a() {
      return this.a;
   }

   public final synchronized e b() {
      return this.b;
   }

   public static synchronized e b(e var0) {
      e var1 = null;
      if (var0 != null) {
         var1 = var0.b;
      }

      return var1;
   }

   public static synchronized e c(e var0) {
      e var1 = null;
      if (var0 != null) {
         var1 = var0.a;
      }

      return var1;
   }

   public final synchronized int c() {
      return this.c;
   }

   private synchronized e c(Object var1) {
      e var2 = null;

      for(e var3 = this.a(); var3 != null; var3 = b(var3)) {
         if (var3.c == var1) {
            var2 = var3;
            break;
         }
      }

      return var2;
   }
}
