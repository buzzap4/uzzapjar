package com.kolipri.kt;

import com.kolipri.kalypte.bg;
import com.kolipri.kalypte.cm;

public final class aq extends l {
   protected boolean a = true;
   private int i;
   private <undefinedtype> j = new Object(this) {
      public <undefinedtype>[] a = new <undefinedtype>[30];
      private int b = 0;
      private boolean c = false;

      public {
         for(int var2 = 0; var2 < this.a.length - 1; ++var2) {
            this.a[var2] = null;
         }

      }

      public final <undefinedtype> a(int var1) {
         if (var1 >= 0 && var1 <= this.a.length - 1) {
            int var2 = var1 + this.b();
            return this.a[var2 >= this.a.length ? var2 - this.a.length : var2];
         } else {
            throw new IndexOutOfBoundsException("DisplayLine should be within the limits of head cursor: " + var1);
         }
      }

      public final void a(Object var1) {
         this.a[this.b] = var1;
         if (this.b >= this.a.length - 1) {
            this.c = true;
         }

         this.b = this.b >= this.a.length - 1 ? 0 : this.b + 1;
      }

      public final int b(int var1) {
         int var2 = 0;

         for(int var3 = this.a() - 1; var3 >= 0; --var3) {
            <undefinedtype> var4 = this.a(var3);
            if ((var2 += var4.a) > var1) {
               return var3 + 1;
            }
         }

         return 0;
      }

      public final int a(int var1, int var2) {
         int var3 = 0;

         for(int var4 = var1; var4 < this.a(); ++var4) {
            <undefinedtype> var5 = this.a(var4);
            if ((var3 += var5.a) > var2) {
               return var4;
            }
         }

         return this.a();
      }

      public final int a() {
         return this.c ? this.a.length : this.b;
      }

      private int b() {
         return !this.c ? 0 : this.b;
      }
   };
   private String k;
   j b = this.e("kt.textview.font");
   ao c = this.f("kt.textview.font.color");
   ao e = this.f("kt.textview.special.color");
   ao f = this.f("kt.textview.other.special.color");
   ao g;
   ao h;

   public aq(r var1) {
      super(var1);
      this.g = this.c;
      this.h = new ao();
   }

   public final void a(String var1) {
      if (this.s().a <= 0) {
         if (this.k == null) {
            this.k = var1;
         } else {
            this.k = this.k.concat(var1);
         }
      } else {
         this.d();
         this.c(var1);
      }
   }

   private void d() {
      if (this.k != null) {
         this.c(this.k);
         this.k = null;
      }

   }

   private void c(String var1) {
      if (var1 != null && this.s().a > 0) {
         int var2 = 0;
         int var3 = 0;
         int var4 = 2;
         int var5 = this.b.b;
         int var7 = -1;
         new String("");
         String var8 = null;
         String var9 = null;
         String var10 = null;

         while(true) {
            while(var2 < var1.length()) {
               cm var6 = bg.a().a(var1.substring(var2));
               var4 += var6 != null ? super.b_.a.b(var6.b).a().a + 2 : this.e("kt.textview.font").a(var1.charAt(var2));
               var5 = var6 != null ? (super.b_.a.b(var6.b).a().b > var5 ? super.b_.a.b(var6.b).a().b : var5) : var5;
               if (var1.charAt(var2) == ' ') {
                  var7 = var2;
               }

               if (var2 + 5 < var1.length() && var1.charAt(var2) == '[' && var1.charAt(var2 + 4) == ' ') {
                  var10 = var1.substring(var2, var2 + 5);
                  if (!this.h.a(new String(var10.substring(1, 2) + "0" + var10.substring(2, 3) + "0" + var10.substring(3, 4) + "0"))) {
                     var10 = null;
                  }

                  ai var11;
                  if ((var11 = this.a(var1, var2)) != null) {
                     var4 += var11.a().a;
                     var5 = var11.a().b > var5 ? var11.a().b : var5;
                  }

                  var2 += 4;
               }

               if (var1.charAt(var2) != '\n' && this.s().a - 16 >= var4) {
                  var2 += var6 != null ? var6.a.length() : 1;
               } else {
                  var8 = var1.substring(var3, var2);
                  if (var7 > var3 && var1.charAt(var2) != '\n' && var1.charAt(var2) != ' ') {
                     if (var1.substring(var7, var2).length() < 10) {
                        var2 = var7++;
                        var8 = var1.substring(var3, var7);
                     } else {
                        var8 = var1.substring(var3, var2).concat("-");
                     }
                  }

                  if (var9 != null) {
                     var8 = var9.concat(var8);
                     var9 = null;
                  }

                  if (var10 != null) {
                     var9 = var10;
                  }

                  if (var1.charAt(var2) == '\n') {
                     var10 = null;
                     var9 = null;
                  }

                  if (var1.charAt(var2) != '\n' && (var8.startsWith("* ") || var8.startsWith("- "))) {
                     var9 = var8.substring(0, 2);
                  }

                  Object var12 = new Object(this, var5, var4, var8) {
                     public int a = 0;
                     public String b;

                     public {
                        this.a = var2;
                        this.b = var4;
                     }
                  };
                  this.j.a((<undefinedtype>)var12);
                  var4 = 0;
                  var5 = this.b.b;
                  var3 = var2;
                  var7 = -1;
                  if (var1.charAt(var2) == '\n') {
                     ++var2;
                     var3 = var2;
                  }
               }
            }

            return;
         }
      } else {
         throw new IllegalStateException("size: " + this.s().a + " text: " + var1);
      }
   }

   public final d c() {
      j var1 = this.e("kt.textview.font");
      return new d(this.s().a, this.j.a() * (var1.b + 3));
   }

   private ai a(String var1, int var2) {
      ai var3 = null;

      try {
         if (var1.substring(var2, var2 + 2).toLowerCase().equals("[g")) {
            switch(Integer.parseInt(var1.substring(var2 + 2, var2 + 4))) {
            case 1:
               var3 = super.b_.a.b("billing");
               break;
            case 2:
               var3 = super.b_.a.b("search");
               break;
            case 3:
               var3 = super.b_.a.b("help");
               break;
            case 4:
               var3 = super.b_.a.b("gift");
               break;
            case 5:
               var3 = super.b_.a.b("rose-small");
               break;
            case 6:
               var3 = super.b_.a.b("kiss");
            }
         } else if (var1.substring(var2, var2 + 3).toLowerCase().equals("[#/")) {
            switch(Integer.parseInt(var1.substring(var2 + 3, var2 + 4))) {
            case 0:
               var3 = super.b_.a.b("ghost");
               break;
            case 1:
               var3 = super.b_.a.b("head-buntis");
               break;
            case 2:
               var3 = super.b_.a.b("head-saiyan");
               break;
            case 3:
               var3 = super.b_.a.b("head-root");
               break;
            case 4:
               var3 = super.b_.a.b("head-valkyrie");
               break;
            case 5:
               var3 = super.b_.a.b("head-kool");
               break;
            case 6:
               var3 = super.b_.a.b("head-deckard");
               break;
            case 7:
               var3 = super.b_.a.b("head-lupz");
               break;
            case 8:
               var3 = super.b_.a.b("head-requiem");
               break;
            case 9:
               var3 = super.b_.a.b("head-jp");
            }
         }

         return var3;
      } catch (Exception var5) {
         return null;
      }
   }

   public final void a(e var1) {
      this.d();
      ag var2 = new ag(0, 0);
      ai var4 = null;
      boolean var5 = false;
      int var6 = this.j.a(this.i, this.s().b - 5);
      int var7 = 6;

      for(int var8 = this.i; var8 < var6; ++var8) {
         <undefinedtype> var9 = this.j.a(var8);
         this.g = this.c;
         int var15 = this.b.b;
         j var10002;
         ao var10003;
         String var10004;
         if (var9.b.startsWith("* ")) {
            this.g = this.e;
            var2.a = 0;
            var10002 = this.b;
            var10003 = this.g;
            var10004 = var9.b.substring(2);
            var1.getClass();
            var1.getClass();
            var1.a(var2, var10002, var10003, var10004, 0);
            this.g = this.c;
            var2.b += var15;
            var7 = 6;
         } else if (var9.b.startsWith("- ")) {
            this.g = this.f;
            var2.a = 0;
            var10002 = this.b;
            var10003 = this.g;
            var10004 = var9.b.substring(2);
            var1.getClass();
            var1.getClass();
            var1.a(var2, var10002, var10003, var10004, 0);
            this.g = this.c;
            var2.b += var15;
            var7 = 6;
         } else {
            var2.a = 2;
            int var12 = 0;

            while(var12 < var9.b.length()) {
               String var10 = var9.b.substring(var12);
               int var13 = bg.a().b(var10);
               int var14;
               if ((var14 = (var14 = var10.indexOf("[")) + 4 >= var10.length() ? -1 : (var10.charAt(var14 + 4) != ' ' ? -1 : var14)) == -1 && var13 == -1) {
                  var10002 = this.b;
                  var10003 = this.g;
                  var1.getClass();
                  var1.getClass();
                  var1.a(var2, var10002, var10003, var10, 0);
                  var12 += var10.length();
               } else if (var14 > -1 && (var13 == -1 || var14 < var13)) {
                  if (var14 > 0) {
                     var10002 = this.b;
                     var10003 = this.g;
                     var10004 = var10.substring(0, var14);
                     var1.getClass();
                     var1.getClass();
                     var1.a(var2, var10002, var10003, var10004, 0);
                     var2.a += this.b.a(var10.substring(0, var14));
                     var12 += var14;
                  }

                  var12 += 4;
                  String var11 = new String(var10.substring(var14 + 1, var14 + 2) + "0" + var10.substring(var14 + 2, var14 + 3) + "0" + var10.substring(var14 + 3, var14 + 4) + "0");
                  if (this.h.a(var11)) {
                     this.g = this.h;
                  } else {
                     var4 = this.a(var10, var14);
                  }

                  if (var4 != null) {
                     ++var2.a;
                     if (var7 > 0) {
                        var1.a(var2, var4);
                     }

                     --var7;
                     var15 = var15 > var4.a().b ? var15 : var4.a().b;
                     var2.a = var2.a + var4.a().a + 1;
                     var4 = null;
                  }
               } else if (var13 > -1 && (var14 == -1 || var14 > var13)) {
                  if (var13 > 0) {
                     var10002 = this.b;
                     var10003 = this.g;
                     var10004 = var10.substring(0, var13);
                     var1.getClass();
                     var1.getClass();
                     var1.a(var2, var10002, var10003, var10004, 0);
                     var2.a += this.b.a(var10.substring(0, var13));
                     var12 += var13;
                  }

                  cm var3 = bg.a().a(var10.substring(var13));
                  var4 = super.b_.a.b(var3.b);
                  ++var2.a;
                  if (var7 > 0) {
                     var1.a(var2, var4);
                  } else {
                     var10002 = this.b;
                     var10003 = this.e;
                     var10004 = var3.a;
                     var1.getClass();
                     var1.getClass();
                     var1.a(var2, var10002, var10003, var10004, 0);
                  }

                  var2.a = var2.a + var4.a().a + 1;
                  var12 += var3.a.length();
                  var15 = var15 > var4.a().b ? var15 : var4.a().b;
                  var4 = null;
               }
            }

            var2.b += var15;
            var4 = null;
            var2.a = 2;
         }
      }

      this.a(var1, this.i, this.j.a(this.i, this.s().b - 5) - this.i, this.j.a());
   }

   public final boolean a(al var1) {
      if (!this.a) {
         return false;
      } else if (var1.b == 2) {
         if (this.i < this.j.b(this.s().b - 5)) {
            ++this.i;
            this.w();
         }

         return true;
      } else if (var1.b == 1) {
         if (this.i > 0) {
            --this.i;
            this.w();
         }

         return true;
      } else {
         return super.a(var1);
      }
   }

   public final void b() {
      this.i = this.j.b(this.s().b - 5);
   }
}
