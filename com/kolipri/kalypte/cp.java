package com.kolipri.kalypte;

public final class cp extends com.kolipri.kt.af {
   private com.kolipri.kpr.f l = new com.kolipri.kpr.f();
   private com.kolipri.kpr.f m = new com.kolipri.kpr.f();
   public String a = null;
   public boolean b = false;
   protected bm c = null;
   private int n = 60000;
   private long o = 0L;
   public int d = 0;
   private String p = null;
   private String q = null;
   protected boolean e = false;
   protected boolean f = false;
   protected boolean g = true;
   private int r = 0;
   private int s = 0;
   private int t = 0;
   private int u = 0;
   private int v = 0;
   private int w = 0;
   private byte x = -1;

   public cp(com.kolipri.kt.r var1, bm var2) {
      super(var1);
      this.c = var2;
      com.kolipri.kimp.g var3;
      if ((var3 = ((Kalypte)super.i).i.a()) != null) {
         this.n = var3.q * 1000;
      }

   }

   public final com.kolipri.kpr.f h() {
      return this.a == null ? this.l : this.m;
   }

   public final void a(com.kolipri.kimp.q var1) {
      Object var2 = new Object(this, "", 0, 0, 0) {
         protected String a;
         protected int b;
         protected int c;
         protected int d;
         boolean e = false;

         {
            this.a = var2;
            this.b = var3;
            this.c = var4;
            this.d = var5;
         }
      };
      String var6;
      if (var1.a("iq/query-ug") != null) {
         var6 = "room";
         this.a = "Room Search";
         this.e = true;
         this.f = false;
      } else {
         var6 = var1.a("iq/query-group.group") != null ? "room" : "group";
         this.e = false;
      }

      this.x = (byte)(var6.equals("room") ? 2 : 1);

      for(int var3 = 0; var3 < var1.b(); ++var3) {
         String var4 = var1.a(var3);
         String var5 = var1.b(var3);
         if (var4 != null && var5 != null) {
            if (var4.equals("iq/" + var6 + ".max-occupants")) {
               try {
                  ((<undefinedtype>)var2).c = Integer.parseInt(var5);
               } catch (Exception var8) {
               }
            } else if (var4.equals("iq/" + var6 + ".occupants")) {
               try {
                  ((<undefinedtype>)var2).b = Integer.parseInt(var5);
               } catch (Exception var9) {
               }
            } else if (var4.equals("iq/" + var6 + ".name")) {
               ((<undefinedtype>)var2).a = var5;
            } else if (var4.equals("iq/" + var6 + ".num")) {
               ((<undefinedtype>)var2).d = Integer.parseInt(var5);
            } else if (var4.equals("iq/query-groups.num")) {
               this.u = Integer.parseInt(var5);
            } else if (var4.equals("iq/query-ug.num")) {
               this.t = Integer.parseInt(var5);
            } else if (var4.equals("iq/group")) {
               ((<undefinedtype>)var2).e = true;
               if (((<undefinedtype>)var2).a != null && ((<undefinedtype>)var2).a.length() > 0) {
                  ((<undefinedtype>)var2).e = true;
                  this.l.a(var2);
               }

               var2 = new Object(this, "", 0, 0, 0) {
                  protected String a;
                  protected int b;
                  protected int c;
                  protected int d;
                  boolean e = false;

                  {
                     this.a = var2;
                     this.b = var3;
                     this.c = var4;
                     this.d = var5;
                  }
               };
            } else if (var4.equals("iq/room")) {
               if (((<undefinedtype>)var2).a != null && ((<undefinedtype>)var2).a.length() > 0) {
                  ((<undefinedtype>)var2).e = false;
                  this.m.a(var2);
               }

               var2 = new Object(this, "", 0, 0, 0) {
                  protected String a;
                  protected int b;
                  protected int c;
                  protected int d;
                  boolean e = false;

                  {
                     this.a = var2;
                     this.b = var3;
                     this.c = var4;
                     this.d = var5;
                  }
               };
            } else if (var4.equals("iq/query-ug")) {
               var2 = new Object(this, "", 0, 0, 0) {
                  protected String a;
                  protected int b;
                  protected int c;
                  protected int d;
                  boolean e = false;

                  {
                     this.a = var2;
                     this.b = var3;
                     this.c = var4;
                     this.d = var5;
                  }
               };
            }
         }
      }

      this.b = false;
      this.m();
   }

   protected final void a(String var1) {
      if (this.x == -1) {
         this.x = 1;
         this.s = 29;
      }

      if (this.e) {
         this.g = false;
         this.i();
         this.g = true;
      } else if (var1 != null) {
         if (var1.equals(this.p) && System.currentTimeMillis() - this.o < (long)this.n) {
            this.p = this.a;
            this.a = var1;
            if (this.c != null && this.c.b != null) {
               this.m();
               this.c.a(0);
            }

            return;
         }

         if (System.currentTimeMillis() - this.o > (long)this.n || !var1.equals(this.a)) {
            this.b = true;
            if (this.c != null && this.c.b != null) {
               this.c.b.c("");
            }

            this.m.a();
            if (((Kalypte)super.i).i != null) {
               ((Kalypte)super.i).i.a(com.kolipri.kimp.u.a(var1, this.r, this.s));
            }

            this.c.a(0);
         }
      } else if (System.currentTimeMillis() - this.o <= (long)this.n && this.h().b() > 0) {
         this.m();
      } else {
         this.b = true;
         if (this.c != null && this.c.b != null) {
            this.c.b.c("");
         }

         this.l.a();
         if (((Kalypte)super.i).i != null) {
            ((Kalypte)super.i).i.a(com.kolipri.kimp.u.a(this.r, this.s));
         }
      }

      this.o = System.currentTimeMillis();
      this.p = this.a;
      this.a = var1;
   }

   private void l() {
      if (this.x == 2) {
         ++this.v;
         this.m.a();
      } else if (this.x == 1) {
         ++this.w;
         this.l.a();
      }

      int var1 = this.x == 2 ? this.t : this.u;
      int var2 = this.x == 2 ? this.v : this.w;
      this.r = var2 * 30;
      if (this.r + 29 <= var1) {
         this.s = this.r + 29;
      } else {
         this.s = var1;
      }

      if (this.r >= var1) {
         this.r = 0;
         this.s = 29;
         if (this.x == 2) {
            this.v = 0;
         } else if (this.x == 1) {
            this.w = 0;
         }

         this.o = 0L;
      }

      if (this.e) {
         this.g = false;
         this.i();
         this.g = true;
      } else {
         this.a(this.a);
      }
   }

   public final void i() {
      if (this.g) {
         this.j();
      }

      this.m.a();
      if (this.c != null && this.c.b != null) {
         this.c.b.c("");
      }

      this.f = true;
      if (((Kalypte)super.i).i != null) {
         ((Kalypte)super.i).i.a(com.kolipri.kimp.u.a(this.r, this.s, this.q));
      }

      if (this.c != null) {
         this.c.a(0);
         this.c.d();
      }

   }

   private void m() {
      String var1 = "- ";
      if (this.x == 1) {
         var1 = var1 + "Categories";
      } else if (this.a != null) {
         var1 = var1 + this.a;
      }

      int var2 = this.x == 2 ? this.v + 1 : this.w + 1;
      int var3 = this.x == 2 ? this.n() : this.o();
      if (this.c != null && this.c.b != null) {
         this.c.b.c(var1 + " (" + var2 + "/" + var3 + ")");
      }

   }

   public final String a() {
      return "chat-room-list";
   }

   public final com.kolipri.kt.d b() {
      com.kolipri.kt.ai var1;
      return (var1 = super.i.a.b("chatrooms")) != null ? var1.a() : new com.kolipri.kt.d(0, 0);
   }

   public final String a(int var1) {
      String var2 = "";
      int var3;
      if ((var3 = this.x == 2 ? this.n() : this.o()) > 1) {
         --var1;
      }

      if (var3 > 1 && var1 == -1) {
         var2 = "More...";
      }

      <undefinedtype> var4;
      if (var1 < this.h().b() && (var4 = (<undefinedtype>)this.h().b(var1)) != null) {
         var2 = "" + var4.a + " (" + var4.b + "/" + var4.c + ")";
      }

      return var2;
   }

   public final void b(String var1) {
      this.q = var1;
   }

   private int n() {
      int var1 = this.t / 30;
      if (Float.parseFloat("" + this.t) % 30.0F > 0.0F || var1 == 0) {
         ++var1;
      }

      return var1;
   }

   private int o() {
      int var1 = this.u / 30;
      if (Float.parseFloat("" + this.u) % 30.0F > 0.0F || var1 == 0) {
         ++var1;
      }

      return var1;
   }

   public final com.kolipri.kt.ai b(int var1) {
      return this.a != null ? super.i.a.b("chatrooms") : super.i.a.b("chatroom-category");
   }

   public final com.kolipri.kt.ao i(int var1) {
      int var2;
      if ((var2 = this.x == 2 ? this.n() : this.o()) > 1) {
         --var1;
      }

      return var2 > 1 && var1 == -1 ? super.i.a.c("kt.textview.special.color") : super.i.a.c("kt.menuentries.font.color");
   }

   public final int c() {
      int var1 = this.h().b();
      return (this.x == 2 ? this.t : this.u) > 30 ? var1 + 1 : var1;
   }

   public final boolean e(int var1) {
      <undefinedtype> var2 = null;
      boolean var3 = false;
      if (this.x == 1) {
         if (this.o() > 1) {
            --var1;
         }

         if (var1 == -1) {
            this.l();
            var3 = true;
         }
      } else if (this.x == 2) {
         if (this.n() > 1) {
            --var1;
         }

         if (var1 == -1) {
            this.l();
            var3 = true;
         }
      }

      if (!var3) {
         this.j();
         if (var1 >= 0 && var1 < this.h().b()) {
            var2 = (<undefinedtype>)this.h().b(var1);
         }

         if (var2 != null) {
            if (!var2.e) {
               bu var4;
               if ((var4 = bu.f(this.c)) != null) {
                  var4.a((String)var2.a, (String)null);
               }
            } else {
               this.t = var2.d;
               this.x = 2;
               this.d = this.c.f;
               this.a(var2.a);
               this.c.d();
            }
         }
      }

      return false;
   }

   public final void j() {
      this.r = 0;
      this.s = 29;
      this.v = 0;
      this.w = 0;
   }

   public final void k() {
      this.m.a();
      this.l.a();
   }
}
