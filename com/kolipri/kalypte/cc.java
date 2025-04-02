package com.kolipri.kalypte;

public final class cc implements Runnable {
   public com.kolipri.kt.r a = null;
   public com.kolipri.kpr.f b = new com.kolipri.kpr.f();
   protected boolean c = true;
   protected bv d = null;
   protected com.kolipri.kt.a e = null;
   protected dl f = null;

   public cc(com.kolipri.kt.r var1) {
      this.a = var1;
   }

   public final void a() {
      (new Thread(this)).start();
   }

   public final void a(dl var1) {
      if (var1 != null) {
         this.f = var1;
      }

   }

   public final void run() {
      com.kolipri.kimp.z var1 = new com.kolipri.kimp.z();
      new com.kolipri.kpr.b();
      com.kolipri.kpr.b var2 = null;
      new com.kolipri.kimp.p();
      com.kolipri.kimp.p var3 = null;
      if (var1.a()) {
         this.e = new com.kolipri.kt.a(this, this.a, this) {
            protected cc e = null;

            public {
               super.b = "";
               super.c = "Cancel";
               this.e = var3;
            }

            public final void b(String var1) {
               this.f();
               this.e.e = null;
            }
         };
         this.e.a();
         this.e.a("Dependent on the number of phonebook contacts you have, loading this process may take a minute or two, please wait.");
         this.e.a(this.a.c());

         try {
            Thread.sleep(2000L);
         } catch (Exception var5) {
         }

         while(this.c && (var2 = var1.c()) != null) {
            var3 = new com.kolipri.kimp.p(var2);
            this.b.a(var3);
            if (this.b.b() > 500) {
               break;
            }
         }
      } else {
         com.kolipri.kt.a var4;
         (var4 = new com.kolipri.kt.a(this.a)).a();
         var4.a("Failed to read address book");
         var4.a(this.a.c());
      }

      var1.b();
      this.c = false;
      if (!this.c && this.e != null) {
         this.e.f();
         this.e = null;
         this.b();
      }

   }

   private void b() {
      if (this.b.b() != 0) {
         this.d = new bv(this.a);
         this.d.a(this.b);
         this.d.b(true);
         this.d.a(this.f);
         this.d.b(2);
         this.d.a(this.a.c());
      } else {
         com.kolipri.kt.a var1;
         (var1 = new com.kolipri.kt.a(this.a)).a();
         var1.a("No contacts on your phonebook");
         var1.a(this.a.c());
      }
   }
}
