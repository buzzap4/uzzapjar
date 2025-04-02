package com.kolipri.kt;

import java.util.Vector;

public final class m extends l {
   private Vector f = new Vector();
   private Vector g = new Vector();
   private int h = 10000;
   private int i = 0;
   private int j;
   private int k;
   private int l = 0;
   public static int a = 10;
   public static int b = 10;
   public boolean c = false;
   public boolean e = false;
   private com.kolipri.kalypte.an E = null;
   private d F = new d(0, 0);

   public m(r var1) {
      super(var1);
   }

   public final void a(com.kolipri.kalypte.an var1) {
      this.E = var1;
   }

   public final void a() {
      super.a();
      this.b(1);
      this.b(true);
   }

   public final void a(e var1) {
      ai var2 = super.b_.a.b("menu-bottombar");
      int var3 = 0;
      if (var2 != null) {
         var3 = 0 + var2.a().b + 2;
      }

      j var4 = this.e("kt.fancymenubar.font");
      var3 += var4.b + 8;
      int var6 = this.s().a / this.F.a;
      int var10001 = this.F.a * var6;
      int var8;
      int var9 = var8 = (this.s().a - var10001) / (var6 + 1);
      int var10 = var8;
      boolean var11 = false;
      boolean var12 = false;
      int var13 = this.f.size() / var6;
      int var14 = 0;
      this.c = var8 + (this.F.b + var8) * var13 + var8 >= this.s().b - var3;
      if (this.c) {
         var6 = this.s().a / this.F.a;
         var10001 = this.F.a * var6;
         var10 = var9 = var8 = (this.s().a - var10001) / (var6 + 1);
         var14 = b;
      } else {
         this.i = 0;
      }

      for(this.j = 0; var9 >= -2 && var9 * 3 + this.F.b * 2 + var2.a().b + 2 + 8 + var4.b >= this.s().b; --var9) {
      }

      int var20 = var9;
      if (this.h < 10000 && this.h >= this.f.size()) {
         this.h = this.f.size() - 1;
      }

      ai var15;
      <undefinedtype> var16;
      int var21;
      for(var21 = 0; var21 < this.f.size(); ++var21) {
         if (var21 + this.i * var6 >= 0 && var21 + this.i * var6 < this.f.size()) {
            var16 = (<undefinedtype>)this.f.elementAt(var21 + this.i * var6);
         } else {
            var16 = null;
         }

         if (this.h == var21 + this.i * var6) {
            var15 = var16 != null ? var16.d : null;
         } else {
            var15 = var16 != null ? var16.c : null;
         }

         if (var15 != null) {
            var1.a(new ag(var10 + (this.F.a - var15.a().a) / 2, var20 + (this.F.b - var15.a().b) / 2), var15);
            var10 += this.F.a + var8;
         }

         if ((var21 + 1) % var6 == 0) {
            if (var20 + this.F.b >= this.s().b - var3) {
               break;
            }

            var10 = var8;
            var20 += this.F.b + var8;
            ++this.j;
         }
      }

      if (this.c) {
         if (this.j == var13) {
            --this.j;
         }

         this.a(var1, this.i, this.j, var13);
      }

      this.e = this.g.size() * this.F.a + var8 >= this.s().a;
      var16 = null;
      if (this.h >= 10000) {
         if (this.h - 10000 >= 0 && this.h - 10000 < this.g.size()) {
            var16 = (<undefinedtype>)this.g.elementAt(this.h - 10000);
         }
      } else if (this.h >= 0 && this.h < this.f.size()) {
         var16 = (<undefinedtype>)this.f.elementAt(this.h);
      }

      ao var17 = this.f("kalypte.mainmenu.textbar.color");
      ao var18 = this.f("kalypte.mainmenu.textbar.font.color");
      int var19 = this.s().b;
      if (var2 != null) {
         var19 -= var2.a().b - 2;
      }

      var19 = var19 - var4.b - 8;
      var1.a(new ag(0, var19), new d(this.s().a, var4.b + 8), var17);
      ag var23 = new ag(this.s().a / 2, var19 + 4);
      String var10004 = var16 != null ? var16.b : "";
      var1.getClass();
      var1.a(var23, var4, var18, var10004, 4);
      if (var2 != null) {
         int var24 = this.s().b - var2.a().b;

         for(var10 = 0; var10 < this.s().a; var10 += var2.a().a) {
            var1.a(new ag(var10, var24), var2);
         }

         var10 = var8;
         var24 = this.s().b - var2.a().b + (var2.a().b - this.F.b) / 2;
         if (this.k < 0) {
            this.k = 0;
         }

         this.l = 0;

         for(var21 = 0; var21 < this.g.size() && var10 < this.s().a; ++var21) {
            <undefinedtype> var22;
            if (var21 + this.k >= 0 && var21 + this.k < this.g.size()) {
               var22 = (<undefinedtype>)this.g.elementAt(var21 + this.k);
            } else {
               var22 = null;
            }

            if (this.h - 10000 == var21 + this.k) {
               var15 = var22 != null ? var22.d : null;
            } else {
               var15 = var22 != null ? var22.c : null;
            }

            if (var15 != null) {
               var1.a(new ag(var10 + (this.F.a - var15.a().a) / 2, var24 + (this.F.b - var15.a().b) / 2), var15);
               if (var10 + this.F.a >= this.s().a - var14) {
                  break;
               }

               var10 += this.F.a + var8;
               ++this.l;
            }
         }

         if (this.e) {
            this.b(var1, this.k, this.l, this.g.size());
         }
      }

   }

   private int c(int var1, int var2) {
      int var3 = -1;
      int var5 = this.s().a / this.F.a;
      int var10001 = this.F.a * var5;
      int var7 = (this.s().a - var10001) / (var5 + 1);
      ai var11;
      if ((var11 = super.b_.a.b("menu-bottombar")) != null && var2 >= this.s().b - var11.a().b && var2 < this.s().b) {
         if ((var3 = var1 / (this.s().a / var5)) >= this.g.size() + this.k) {
            var3 = -1;
         }

         if (var3 >= 0) {
            var3 += 10000 + this.k;
         }
      } else if (var1 < this.s().a) {
         int var8 = var2 / (this.F.b + var7) + this.i;
         int var9 = var1 / (this.s().a / var5);
         if ((var3 = var8 * var5 + var9) >= this.f.size()) {
            var3 = -1;
         }
      }

      return var3;
   }

   private void a(int var1) {
      boolean var2 = false;
      if (this.h != var1) {
         var2 = true;
      }

      if (var1 < 10000) {
         if (var1 < this.f.size()) {
            this.h = var1;
            if (var2) {
               this.w();
               return;
            }
         }
      } else if (var1 - 10000 < this.g.size()) {
         this.h = var1;
         if (var2) {
            this.w();
         }
      }

   }

   private void b() {
      if (this.E != null) {
         <undefinedtype> var1 = null;
         if (this.h < 10000) {
            if (this.h >= 0 && this.h < this.f.size()) {
               var1 = (<undefinedtype>)this.f.elementAt(this.h);
            }
         } else if (this.h - 10000 >= 0 && this.h - 10000 < this.g.size()) {
            var1 = (<undefinedtype>)this.g.elementAt(this.h - 10000);
         }

         if (var1 != null) {
            this.E.a(var1.a);
         }
      }

   }

   public final boolean a(al var1) {
      boolean var2 = false;
      if (var1.b == 5) {
         this.b();
         var2 = true;
      } else {
         int var3 = this.h;
         int var4 = this.s().a / this.F.a;
         int var5;
         if (var1.b == 4) {
            var3 = this.h + 1;
            if (this.c) {
               if (var3 < 10000 && var3 >= this.f.size()) {
                  if (var3 % var4 == 0) {
                     var3 -= var4;
                  } else {
                     var3 = this.f.size() + 1;
                  }
               }

               if (this.h < this.f.size() && var3 % var4 == 0) {
                  var3 -= var4;
               }

               if (var3 < 10000 && var3 >= this.f.size()) {
                  var3 = this.f.size() + 1;
               } else if (this.h >= 10000 && var3 - 10000 >= this.g.size()) {
                  var3 = 10000;
               }
            } else {
               if (var3 % var4 == 0 && var3 < 10000) {
                  var3 -= var4;
               }

               if (this.h >= 10000 && var3 - 10000 >= this.g.size()) {
                  var3 = 10000;
               }
            }

            var2 = true;
         } else if (var1.b == 3) {
            var3 = this.h - 1;
            if (this.e) {
               if (this.h < 10000 && this.h % var4 == 0) {
                  var3 += var4;
               }
            } else if (this.h % var4 == 0) {
               var3 += var4;
            }

            if (var3 < 10000 && var3 >= this.f.size()) {
               var3 = this.f.size() - 1;
            }

            if (var3 >= 10000 && var3 - 10000 >= this.g.size()) {
               var3 = this.g.size() - 1;
            }

            if (this.h == 10000) {
               var3 = 10000 + this.g.size() - 1;
            }

            var2 = true;
         } else if (var1.b != 2) {
            if (var1.b == 1) {
               if (this.h >= 10000) {
                  var3 = this.h - this.k - var4;
               } else {
                  var3 = this.h - var4;
               }

               if (var3 < 0) {
                  if ((var3 = 10000 + this.h) - 10000 >= this.g.size()) {
                     var3 = 10000 + this.g.size() - 1;
                  }
               } else if (this.h >= 10000 && var3 < 10000) {
                  if ((var5 = this.f.size() % var4) == 0) {
                     var5 = var4;
                  }

                  if ((var3 = this.f.size() - var5 + (this.h - 10000 - this.k)) > this.f.size()) {
                     var3 = this.f.size() - 1;
                  }
               }

               var2 = true;
            }
         } else {
            var3 = this.h + var4;
            if (this.h < this.f.size() && var3 >= this.f.size()) {
               if ((var3 = 10000 + this.h % var4) - 10000 >= this.g.size()) {
                  var3 = 10000 + this.g.size() - 1;
               }
            } else if (this.h >= 10000 && (var3 = this.h - 10000) >= this.f.size()) {
               var3 = this.f.size() - 1;
            }

            var2 = true;
         }

         if (var3 != this.h) {
            this.h = var3;
            if (var3 < this.f.size()) {
               if (this.c) {
                  if ((var5 = var3 / var4) < this.i) {
                     this.i = var5;
                  }

                  if (var5 >= this.i + this.j && this.j != 0) {
                     this.i = var5 - this.j + 1;
                  }
               }
            } else if (this.l < this.g.size() && this.e) {
               if ((var5 = var3 - 10000) < this.k) {
                  this.k = var5;
               }

               if (var5 >= this.k + this.l && this.l != 0) {
                  this.k = var5 - this.l + 1;
               }

               if (this.g.size() >= this.l + this.k) {
                  --this.k;
               }
            }

            this.w();
         }
      }

      return var2;
   }

   public final boolean a(int var1, int var2) {
      boolean var3 = false;
      if (this.e) {
         if (var2 >= this.s().b - 4) {
            if (var1 >= super.C + super.B && var1 <= this.s().a - this.F.a) {
               ++this.k;
               this.w();
            } else if (var1 >= 0 && var1 <= super.C) {
               --this.k;
               this.w();
            }

            var3 = true;
         } else if (var2 >= this.s().b - a) {
            var3 = true;
         }
      }

      if (this.c && !var3) {
         if (var1 >= this.s().a - 4) {
            ai var4;
            if ((var4 = super.b_.a.b("menu-bottombar")) != null) {
               var4.a();
            }

            this.e("kt.fancymenubar.font");
            if (var2 >= super.z + super.A && var1 <= this.s().b) {
               ++this.i;
               this.w();
            } else if (var2 >= 0 && var2 <= super.z) {
               --this.i;
               this.w();
            }

            var3 = true;
         } else if (var1 >= this.s().b - b) {
            var3 = true;
         }
      }

      if (!var3) {
         this.b();
      }

      return true;
   }

   public final boolean b(int var1, int var2) {
      int var3;
      if ((var3 = this.c(var1, var2)) >= 0) {
         this.a(var3);
      }

      return true;
   }

   public final void a(int var1, String var2, ai var3, ai var4) {
      this.f.addElement(new Object(this, var1, var2, var3, var4) {
         public int a;
         public String b = null;
         public ai c = null;
         public ai d = null;

         public {
            this.a = var2;
            this.b = var3;
            this.c = var4;
            this.d = var5;
         }
      });
      if (var4 != null) {
         if (var4.a().a > this.F.a) {
            this.F.a = var4.a().a;
         }

         if (var4.a().b > this.F.b) {
            this.F.b = var4.a().b;
         }
      }

   }

   public final void b(int var1, String var2, ai var3, ai var4) {
      this.g.addElement(new Object(this, var1, var2, var3, var4) {
         public int a;
         public String b = null;
         public ai c = null;
         public ai d = null;

         public {
            this.a = var2;
            this.b = var3;
            this.c = var4;
            this.d = var5;
         }
      });
   }

   public final void a(e var1, int var2, int var3, int var4) {
      if (var3 < var4) {
         ai var5 = super.b_.a.b("menu-bottombar");
         int var6 = 0;
         if (var5 != null) {
            var6 = 0 + var5.a().b;
         }

         j var7 = this.e("kt.fancymenubar.font");
         var6 += var7.b;
         var1.a(new ag(this.s().a - 6, 0), new d(8, this.s().b - var6), this.f("kt.scrollbar.color.fill"));
         var1.a(new ag(this.s().a - 6 + 1, 1), new d(6, this.s().b - var6), this.f("kt.scrollbar.color.bg"));
         super.z = (this.s().b - var6) * var2 / var4;
         super.A = (this.s().b - var6) * var3 / var4;
         var1.a(new ag(this.s().a - 6 + 1, super.z), new d(6, super.A), this.f("kt.scrollbar.color.fill"));
      } else {
         super.z = 0;
         super.A = 0;
      }
   }
}
