package com.kolipri.kalypte;

import java.util.Timer;
import java.util.TimerTask;

public final class bp extends com.kolipri.kt.a {
   protected com.kolipri.kt.r b_ = null;
   protected Timer e = null;

   public bp(com.kolipri.kt.r var1) {
      super(var1);
      this.b_ = var1;
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("No", "Yes");
   }

   public final void b() {
      if (this.e != null) {
         this.e.cancel();
         this.e = null;
      }

      this.b_.g = false;
      this.f();
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Yes")) {
         this.b_.a(false);
      } else if (var1 != null) {
         var1.equals("No");
      }

      this.b();
   }

   public final void a() {
      super.a();
      this.a("* Unlock?\n\nSelect 'Yes' to unlock");
      this.e = new Timer();
      this.e.schedule(new TimerTask(this, this) {
         protected bp a = null;

         public {
            this.a = var2;
         }

         public final void run() {
            if (this.a != null) {
               this.a.b();
            }

         }
      }, 3000L);
   }
}
