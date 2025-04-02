package com.kolipri.kalypte;

public final class dh extends com.kolipri.kt.af {
   protected com.kolipri.kpr.b a = new com.kolipri.kpr.b();
   protected com.kolipri.kt.l b = null;

   public dh(com.kolipri.kt.r var1, com.kolipri.kt.l var2) {
      super(var1);
      this.b = var2;
   }

   private com.kolipri.kimp.ac j(int var1) {
      return (com.kolipri.kimp.ac)((Kalypte)super.i).k.c.b(var1 > 1 ? var1 + 3 : var1 + 1);
   }

   private boolean k(int var1) {
      boolean var2 = false;
      com.kolipri.kimp.ac var3;
      if ((var3 = this.j(var1)) != null) {
         String var4 = var3.a();
         if (this.a.a(var4) != null && this.a.a(var4).equals("yes")) {
            var2 = true;
         }
      }

      return var2;
   }

   public final boolean e(int var1) {
      com.kolipri.kimp.ac var2;
      if ((var2 = this.j(var1)) != null) {
         String var3 = var2.a();
         if (this.a.a(var3) != null && this.a.a(var3).equals("yes")) {
            this.a.b(var3, "no");
         } else {
            this.a.b(var3, "yes");
         }

         if (this.b != null) {
            this.b.w();
         }
      }

      return false;
   }

   public final String a() {
      return "groups";
   }

   public final com.kolipri.kt.d b() {
      return super.i.a.b("tickbox-not-selected").a();
   }

   public final String a(int var1) {
      String var2 = null;
      com.kolipri.kimp.ac var3;
      if ((var3 = this.j(var1)) != null) {
         var2 = var3.h();
      }

      return var2;
   }

   public final com.kolipri.kt.ai b(int var1) {
      return null;
   }

   public final com.kolipri.kt.ai c(int var1) {
      return this.k(var1) ? super.i.a.b("tickbox-selected") : super.i.a.b("tickbox-not-selected");
   }

   public final int c() {
      return ((Kalypte)super.i).k.c.b() - 3;
   }

   public final int d(int var1) {
      int var2 = 0;
      com.kolipri.kt.ai var3;
      if ((var3 = super.i.a.b("tickbox-selected")) != null) {
         var2 = var3.a().a + 2;
      }

      return var2;
   }

   public final void a(String var1) {
      if (var1 != null) {
         StringBuffer var2 = new StringBuffer();

         for(int var4 = 0; var4 < var1.length(); ++var4) {
            char var3;
            if ((var3 = var1.charAt(var4)) == ',') {
               if (var2.length() > 0) {
                  this.a.b(var2.toString(), "yes");
               }

               var2 = new StringBuffer();
            } else {
               var2.append(var3);
            }
         }

         if (var2.length() > 0) {
            this.a.b(var2.toString(), "yes");
         }

      }
   }

   public final String h() {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < this.a.b(); ++var2) {
         if (this.a.b(var2) != null && this.a.b(var2).equals("yes")) {
            if (var1.length() > 0) {
               var1.append(",");
            }

            var1.append(this.a.a(var2));
         }
      }

      return var1.toString();
   }
}
