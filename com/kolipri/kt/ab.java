package com.kolipri.kt;

import com.kolipri.kalypte.cm;

public class ab extends l {
   protected int a;
   protected int b;
   protected int c;
   protected boolean e;
   protected int f;
   protected boolean g;
   private ab h;
   private String i;

   public ab(r var1) {
      this(var1, (ab)null);
   }

   public ab(r var1, ab var2) {
      super(var1);
      this.a = 0;
      this.b = 0;
      this.c = 0;
      this.e = true;
      this.g = false;
      this.i = null;
      if (var2 != null) {
         this.h = var2;
      } else {
         this.h = this;
      }
   }

   public final void b() {
      this.e = false;
   }

   public final void c(boolean var1) {
      this.g = var1;
   }

   public final void d() {
      this.c("");
   }

   public final void c(String var1) {
      this.i = var1;
   }

   public final void d(String var1) {
      if (var1 != null && this.h.e() != null && this.f > 0 && this.h.e().length() + var1.length() >= this.f) {
         int var2 = this.f / 10;
         if (var1.length() > var2) {
            var2 = var1.length();
         }

         this.a(var2);
      }

      if (this.h.e() == null) {
         this.i = new String("");
      }

      this.i = this.i + var1;
   }

   public final void a(int var1) {
      int var3 = this.h.e().length();
      StringBuffer var4 = new StringBuffer(var3);

      for(int var2 = var1; var2 <= var3 - 1; ++var2) {
         char var5 = this.h.e().charAt(var2);
         var4.append(var5);
      }

      this.i = var4.toString();
   }

   public void a() {
      super.a();
   }

   public final d c() {
      j var1 = this.e("kt.textview.font");
      int var2 = 0;

      int var3;
      int var5;
      for(var5 = 0; var2 < this.h.e().length() && (var3 = this.a(this.h.e(), var1, this.s().a - 16, var2)) >= 1; var2 += var3) {
         ++var5;
      }

      int var10003 = var5 * (var1.b + 3);
      return new d(this.s().a, var10003);
   }

   protected final int a(String var1, j var2, int var3, int var4) {
      int var5 = 0;
      int var6 = 0;
      boolean var7 = false;
      int var8 = -1;
      cm var11 = null;
      ai var12 = null;
      int var13 = -1;
      boolean var14 = false;

      do {
         if (var4 + var5 >= var1.length()) {
            return var5;
         }

         char var9 = var1.charAt(var4 + var5);
         char var10;
         if (var4 + var5 + 1 < var1.length()) {
            var10 = var1.charAt(var4 + var5 + 1);
         } else {
            var10 = '\n';
         }

         if (var9 == '[' || (var9 == ':' || var9 == 'o' || var9 == ';' || var9 == ')' || var9 == '(' || var9 == '>' || var9 == 'O' || var9 == '<') && (var10 == ')' || var10 == '(' || var10 == 'D' || var10 == 'e' || var10 == '|' || var10 == '>' || var10 == 'o' || var10 == 'O' || var10 == '/' || var10 == 'B' || var10 == 'c' || var10 == '+' || var10 == '-')) {
            String var15 = var1.substring(var4 + var5, var1.length());
            int var17;
            if ((var17 = this.g(var15)) != -1) {
               var11 = this.g ? com.kolipri.kalypte.a.a(var17) : com.kolipri.kalypte.i.a(var17);
               var12 = super.b_.a.b(var11.b);
               var13 = var15.indexOf(var11.a) + var4 + var5;
            }
         }

         int var16;
         if (var13 == var5 + var4) {
            var16 = var12.a().a;
            var6 += var16;
            var5 += var11.a.length();
         } else {
            if (var9 == '\n') {
               return var5 + 1;
            }

            if (var9 != '\r') {
               if (var9 == '\t') {
                  var9 = ' ';
               }

               if (var9 == ' ') {
                  var8 = var5;
               }

               var16 = var2.a(var9);
               var6 += var16;
               ++var5;
            }
         }
      } while(var6 < var3);

      if (var5 > 0 && var8 > 0) {
         var5 = var8 + 1;
      }

      return var5;
   }

   public final void a(e var1) {
      j var2 = this.e("kt.textview.font");
      ao var3 = this.f("kt.textview.font.color");
      ao var4 = this.f("kt.textview.special.color");
      ao var5 = this.f("kt.textview.other.special.color");
      ao var6 = var3;
      int var7 = 0;
      int var9 = 0;
      boolean var10 = true;
      this.c = 0;
      this.b = 0;

      int var8;
      for(int var11 = 0; this.h.e() != null && var7 < this.h.e().length() && (var8 = this.a(this.h.e(), var2, this.s().a - 16, var7)) >= 1; ++this.c) {
         if (this.c >= this.a && var9 + var2.b <= this.s().b) {
            String var12 = this.h.e().substring(var7, var7 + var8);
            if (var10 && var12.charAt(0) == '*' && var12.charAt(1) == ' ') {
               var6 = var4;
               var12 = var12.substring(2);
            }

            if (var10 && var12.charAt(0) == '-' && var12.charAt(1) == ' ') {
               var6 = var5;
               var12 = var12.substring(2);
            }

            String var13 = var12;
            ai var16 = null;
            boolean var20 = true;
            boolean var21 = false;
            byte var18 = 0;

            while(var18 < 1) {
               ag var10001;
               int var19;
               String var10004;
               if ((var19 = this.g(var13)) == -1) {
                  if (var20) {
                     var10001 = new ag(var11, var9);
                     var10004 = var13.trim();
                     var1.getClass();
                     var1.getClass();
                     var1.a(var10001, var2, var6, var10004, 0);
                  }

                  var11 += var2.a(var13);
                  var18 = 1;
               } else {
                  var20 = false;
                  var21 = true;
                  cm var15 = this.g ? com.kolipri.kalypte.a.a(var19) : com.kolipri.kalypte.i.a(var19);
                  var16 = super.b_.a.b(var15.b);
                  String var14 = var13.substring(0, var13.indexOf(var15.a));
                  var10001 = new ag(var11, var9);
                  var10004 = var14.trim();
                  var1.getClass();
                  var1.getClass();
                  var1.a(var10001, var2, var6, var10004, 0);
                  var11 += var2.a(var14);
                  if (var16.a().b + var9 < this.s().b) {
                     var1.a(new ag(var11, var9), var16);
                     var20 = true;
                  }

                  var9 += this.g ? var16.a().b - var2.b : 0;
                  var13 = var13.substring(var14.length() + var15.a.length(), var13.length());
                  var11 += this.g ? var16.a().a + 2 : var16.a().a;
               }
            }

            if (var21 && !this.g) {
               var9 = var9 + var2.b + (var16.a().b - var2.b - 2);
            } else {
               var9 += var2.b;
            }

            var11 = 0;
            ++this.b;
            if (var12.charAt(var12.length() - 1) == '\n') {
               var10 = true;
               var6 = var3;
            } else {
               var10 = false;
            }
         }

         var7 += var8;
      }

      this.a(var1, this.a, this.b, this.c);
   }

   public final int g(String var1) {
      boolean var3 = false;
      int var4 = -1;
      int var5 = var1.length() + 1;
      String var6 = null;
      Object var7 = null;
      int var2 = this.g ? com.kolipri.kalypte.a.a() : com.kolipri.kalypte.i.a();
      --var2;

      for(; var2 >= 0; --var2) {
         var6 = (this.g ? com.kolipri.kalypte.a.a(var2) : com.kolipri.kalypte.i.a(var2)).a;
         int var8;
         if ((var8 = var1.indexOf(var6)) != -1 && var8 < var5) {
            var5 = var8;
            var4 = var2;
         }
      }

      return var4;
   }

   public boolean a(al var1) {
      if (!this.e) {
         return false;
      } else if (var1.b == 2) {
         if (this.a + this.b < this.c) {
            ++this.a;
            this.w();
         }

         return true;
      } else if (var1.b == 1) {
         if (this.a > 0) {
            --this.a;
            this.w();
         }

         return true;
      } else {
         return super.a(var1);
      }
   }

   public final String e() {
      return this.i;
   }
}
