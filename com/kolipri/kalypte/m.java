package com.kolipri.kalypte;

public final class m implements dl, cl, com.kolipri.kimp.j {
   protected com.kolipri.kt.r a;
   protected int b;
   protected int c;
   protected com.kolipri.kt.a d;

   public m(com.kolipri.kt.r var1) {
      new com.kolipri.kimp.p();
      this.a = null;
      new com.kolipri.kpr.f();
      this.b = 0;
      this.c = 0;
      this.d = null;
      this.a = var1;
      ((Kalypte)this.a).j.a((com.kolipri.kimp.j)this);
   }

   public final void a(com.kolipri.kt.r var1) {
      if (!Kalypte.v()) {
         com.kolipri.kt.a var3;
         (var3 = new com.kolipri.kt.a(var1)).a();
         var3.a("* Phonebook not supported on this device.");
         var3.a(var1.c());
         this.a();
      } else {
         cc var2;
         (var2 = new cc(var1)).a();
         var2.a(this);
      }
   }

   public final void a() {
      ((Kalypte)this.a).j.b(this);
   }

   public final void a(com.kolipri.kimp.m var1) {
      com.kolipri.kimp.q var4 = null;
      if (var1 instanceof com.kolipri.kimp.d) {
         var4 = ((com.kolipri.kimp.d)var1).a;
      }

      String var2;
      String var3;
      if (var4 != null && (var2 = var4.a("iq.type")) != null && (var3 = var4.a("iq/action.name")) != null && var2.equals("response") && var3.equals("save-contact") && this.d != null) {
         this.d.a("Your new buddies have been added to your buddy list.");
         this.d.c = "Close";
         this.d.y();
      }

      ++this.c;
      if (this.b == this.c) {
         this.a();
      }

   }

   public final void a(com.kolipri.kpr.f var1) {
      com.kolipri.kpr.f var2 = var1;
      com.kolipri.kpr.f var3 = new com.kolipri.kpr.f();
      com.kolipri.kpr.f var4 = new com.kolipri.kpr.f();
      if (var1 != null || var1.b() != 0) {
         for(int var5 = 0; var5 < var2.b(); ++var5) {
            com.kolipri.kimp.p var6 = (com.kolipri.kimp.p)var2.b(var5);
            com.kolipri.kpr.f var7 = new com.kolipri.kpr.f();
            if (var6 != null) {
               new cb(this.a);
               if (var6.a("phone") != null) {
                  var7 = cb.c(var6.a("phone").toString());
               }

               if (var7.b() > 1) {
                  var4.a(var6);
               } else {
                  var3.a(var6);
               }
            }
         }

         if (var4.b() > 0) {
            bf var9;
            (var9 = new bf(this.a, "mobile")).a(var4);
            var9.G = var3;
            var9.a((cl)this);
            var9.b(true);
            var9.a(this.a.c());
            return;
         }

         this.b(var3);
      }

   }

   public final void b(com.kolipri.kpr.f var1) {
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      new com.kolipri.kpr.f();
      com.kolipri.kpr.f var5 = new com.kolipri.kpr.f();
      com.kolipri.kpr.f var6 = new com.kolipri.kpr.f();

      int var7;
      for(var7 = 0; var1 != null && var7 < var1.b(); ++var7) {
         com.kolipri.kpr.f var8 = new com.kolipri.kpr.f();
         com.kolipri.kimp.p var9;
         if ((var9 = (com.kolipri.kimp.p)var1.b(var7)) != null) {
            if (var9.a("email") != null && (var9.a("custom-email") == null || var9.a("custom-email").equals(""))) {
               new cb(this.a);
               com.kolipri.kpr.f var11 = cb.c(var9.a("email").toString());

               for(int var12 = 0; var11 != null && var12 < var11.b(); ++var12) {
                  var8.a(var11.b(var12));
               }
            }

            if (var8.b() > 1) {
               var6.a(var9);
            } else {
               var5.a(var9);
            }
         }
      }

      if (var6.b() > 0) {
         bf var13;
         (var13 = new bf(this.a, "email")).a(var6);
         var13.G = var5;
         var13.a((cl)this);
         var13.b(true);
         var13.a(this.a.c());
      } else {
         for(var7 = 0; var1 != null && var7 < var1.b(); ++var7) {
            com.kolipri.kimp.p var14 = (com.kolipri.kimp.p)var1.b(var7);
            String var15 = "";
            if (var14 != null) {
               com.kolipri.kimp.p var10 = new com.kolipri.kimp.p();
               if (var14.a("lastname") != null) {
                  var15 = var14.a("lastname");
               }

               if (var14.a("firstname") != null) {
                  var15 = var15 + " ";
                  var15 = var15 + var14.a("firstname");
               }

               if (var15.length() == 0) {
                  var15 = var14.a("displayname");
               }

               if (var14.a("mobile") != null) {
                  var10.b("custom-mobile", var14.a("mobile"));
               }

               if (var14.a("phone") != null) {
                  var10.b("custom-mobile", var14.a("phone"));
               }

               if (var14.c() != null) {
                  var10.b("custom-email", var14.c());
               }

               var10.b("custom-displayname", var15);
               if (var14.a("phone") != null || var14.a("custom-mobile") != null || var14.a("mobile") != null || var14.a("email") != null) {
                  ++this.b;
                  ((Kalypte)this.a).i.a(com.kolipri.kimp.ae.d(var10));
                  var2.a(var10);
               }
            }
         }

         if (var2.b() == 0) {
            if (this.d != null) {
               this.d.a("No contact was selected. Adding of SMS buddy was Cancelled.");
               this.d.y();
               this.a();
               return;
            }
         } else {
            this.d = new com.kolipri.kt.a(this, this.a, this) {
               protected m e = null;

               public {
                  super.b = "";
                  super.c = "Cancel";
                  this.e = var3;
               }

               public final void b(String var1) {
                  if (var1.equals("OK")) {
                     cc var2;
                     (var2 = new cc(this.t())).a();
                     var2.a(this.e);
                  } else {
                     this.e.a();
                  }

                  this.f();
               }
            };
            this.d.a();
            this.d.b = "";
            this.d.a("Please wait while your buddy database is being updated.");
            this.d.a(this.a.c());
         }

      }
   }

   public final void e_() {
   }
}
