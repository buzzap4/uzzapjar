package com.kolipri.kalypte;

public final class de extends com.kolipri.kt.af {
   protected com.kolipri.kpr.f a = new com.kolipri.kpr.f();
   protected com.kolipri.kpr.f b = new com.kolipri.kpr.f();
   public com.kolipri.kpr.f c = new com.kolipri.kpr.f();
   private static com.kolipri.kimp.aa m = null;
   public String d = null;
   public com.kolipri.kt.l e = null;
   public boolean f = false;
   public boolean g = true;
   public boolean l = false;

   public de(com.kolipri.kt.r var1) {
      super(var1);
   }

   public de(com.kolipri.kt.r var1, com.kolipri.kpr.f var2) {
      super(var1);
      this.c = var2;
      this.a(this.c);
      this.a(var2);
   }

   public final String a() {
      return "contact-list-menu-entries";
   }

   public final void a(com.kolipri.kimp.aa var1) {
      this.a.a();

      for(int var2 = 0; var2 < var1.c(); ++var2) {
         com.kolipri.kimp.p var3;
         if ((var3 = var1.a(var2)) != null) {
            this.a.a(var3);
         }
      }

   }

   public final void a(com.kolipri.kpr.f var1) {
      this.a.a();

      for(int var2 = 0; var2 < var1.b(); ++var2) {
         com.kolipri.kimp.p var5;
         if ((var5 = (com.kolipri.kimp.p)var1.b(var2)) != null) {
            int var4;
            if ((var4 = this.a.b()) == 0) {
               this.a.a(var5);
            }

            for(int var3 = 0; var3 < var4; ++var3) {
               if (((com.kolipri.kimp.p)this.a.b(var3)).d().toLowerCase().compareTo(var5.d().toLowerCase()) > 0) {
                  this.a.a(var3, var5);
                  break;
               }

               if (var3 + 1 == var4) {
                  this.a.a(var5);
                  break;
               }
            }
         }
      }

   }

   public final com.kolipri.kt.d b() {
      com.kolipri.kt.ai var1;
      return (var1 = super.i.a.b("freeforchat")) != null ? var1.a() : new com.kolipri.kt.d(0, 0);
   }

   public final String a(int var1) {
      String var2 = null;
      com.kolipri.kimp.p var3;
      if ((var3 = (com.kolipri.kimp.p)this.a.b(var1)) != null) {
         var2 = var3.d();
      }

      return var2;
   }

   public final String b_(int var1) {
      String var2 = null;
      com.kolipri.kimp.p var3;
      if (this.d != null && this.d.length() > 0 && (var3 = (com.kolipri.kimp.p)this.a.b(var1)) != null) {
         var2 = var3.a(this.d);
         if (this.d != null && this.d.equals("phone") && var2 != null && var2.length() > 12) {
            var2 = var2.substring(0, 11) + "..";
         }
      }

      return var2;
   }

   public final boolean d_() {
      return this.d != null && this.d.length() > 0;
   }

   public final com.kolipri.kt.ai b(int var1) {
      com.kolipri.kt.ai var2 = null;
      if (this.g) {
         com.kolipri.kimp.p var3;
         if ((var3 = (com.kolipri.kimp.p)this.a.b(var1)) != null && var3.a("status") != null) {
            if (var3.a("status").equals("freeforchat")) {
               var2 = super.i.a.b("online");
            } else if (var3.a("status").equals("unknown")) {
               var2 = super.i.a.b(var3.a("offline"));
            } else {
               var2 = super.i.a.b(var3.a("status"));
            }
         }

         if (var2 == null) {
            var2 = super.i.a.b("offline");
         }
      }

      return var2;
   }

   public final com.kolipri.kt.ai c(int var1) {
      if (this.f) {
         return null;
      } else {
         return this.j(var1) ? super.i.a.b("tickbox-selected") : super.i.a.b("tickbox-not-selected");
      }
   }

   public final int d(int var1) {
      int var2 = 0;
      com.kolipri.kt.ai var3;
      if (!this.f && (var3 = super.i.a.b("tickbox-selected")) != null) {
         var2 = var3.a().a + 2;
      }

      return var2;
   }

   public final int c() {
      return this.a.b();
   }

   private boolean j(int var1) {
      boolean var2 = false;
      com.kolipri.kimp.p var3;
      if ((var3 = (com.kolipri.kimp.p)this.a.b(var1)) != null) {
         for(int var4 = 0; var4 < this.b.b(); ++var4) {
            if (this.b.b(var4) == var3) {
               var2 = true;
               break;
            }
         }
      }

      return var2;
   }

   private void k(int var1) {
      com.kolipri.kimp.p var2 = (com.kolipri.kimp.p)this.a.b(var1);
      if (this.l) {
         this.b.a();
      }

      if (var2 != null) {
         this.b.a(var2);
      }

   }

   private void l(int var1) {
      com.kolipri.kimp.p var2;
      if ((var2 = (com.kolipri.kimp.p)this.a.b(var1)) != null) {
         this.b.c(var2);
      }

   }

   private void m(int var1) {
      if (this.j(var1)) {
         this.l(var1);
      } else {
         this.k(var1);
      }
   }

   public final boolean e(int var1) {
      this.m(var1);
      if (this.e != null) {
         this.e.w();
         if (this.f) {
            this.e.b("OK");
         }
      }

      return false;
   }

   public final void a(String var1) {
      com.kolipri.kimp.p var6;
      int var7;
      if (m == null && this.c.b() <= 0) {
         for(var7 = 0; var7 < this.a.b(); ++var7) {
            var6 = (com.kolipri.kimp.p)this.a.b(var7);
            this.c.a(var6);
         }

      } else if (m != null && this.c != null && this.c.b() <= 0) {
         this.c.a();

         for(var7 = 0; var7 < m.c(); ++var7) {
            var6 = m.a(var7);
            this.c.a(var6);
         }

      } else {
         var1 = var1.toLowerCase();
         com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
         boolean var3 = false;

         for(int var4 = 0; var4 < this.c.b(); ++var4) {
            com.kolipri.kimp.p var5;
            if ((var5 = (com.kolipri.kimp.p)this.c.b(var4)).d().toLowerCase().indexOf(var1) > -1) {
               var2.a(var5);
            }
         }

         this.a.a();

         for(int var9 = 0; var9 < var2.b(); ++var9) {
            com.kolipri.kimp.p var8 = (com.kolipri.kimp.p)var2.b(var9);
            this.a.a(var8);
         }

      }
   }

   public final void h() {
      this.b.a();

      for(int var1 = 0; var1 < this.a.b(); ++var1) {
         this.k(var1);
      }

   }

   public final void i() {
      this.b.a();
   }
}
