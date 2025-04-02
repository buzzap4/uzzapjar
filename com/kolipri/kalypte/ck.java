package com.kolipri.kalypte;

public class ck extends com.kolipri.kt.l implements com.kolipri.kt.o {
   protected StringBuffer b = new StringBuffer();
   protected <undefinedtype> c = new com.kolipri.kpr.b(this) {
      protected char b = 0;
      protected long c = 0L;
      protected int d = 0;

      public {
         this.b("0", " ");
         this.b("1", ".,'?!\"-()@/~:_;+&%*=<>$[]{}\\#|");
         this.b("2", "abcABC");
         this.b("3", "defDEF");
         this.b("4", "ghiGHI");
         this.b("5", "jklJKL");
         this.b("6", "mnoMNO");
         this.b("7", "pqrsPQRS");
         this.b("8", "tuvTUV");
         this.b("9", "wxyzWXYZ");

         for(int var2 = 65; var2 < 123; ++var2) {
            if (var2 < 91 || var2 > 96) {
               this.b(String.valueOf((char)var2), String.valueOf((char)var2));
            }
         }

      }

      public final void c() {
         this.b = 0;
         this.c = 0L;
      }

      private String b(char var1) {
         StringBuffer var2;
         (var2 = new StringBuffer()).append(var1);
         return this.a(var2.toString());
      }

      public final char a(char var1) {
         char var2 = 0;
         long var3 = System.currentTimeMillis();
         String var5;
         if (var1 > 0 && (var5 = this.b(var1)) != null) {
            if (var1 == this.b && var3 < this.c + 1000L) {
               ++this.d;
            } else {
               this.d = 0;
            }

            if (this.d >= var5.length()) {
               this.d = 0;
            }

            if (this.d < var5.length()) {
               var2 = var5.charAt(this.d);
            }
         }

         this.b = var1;
         this.c = var3;
         return var2;
      }

      public final int d() {
         return this.d;
      }
   };

   public ck(com.kolipri.kt.r var1) {
      super(var1);
   }

   public void a() {
      super.a();
   }

   public final void a(com.kolipri.kt.e var1) {
      int var2 = 2;
      com.kolipri.kt.ai var3 = super.b_.a.b("search");
      var1.a(new com.kolipri.kt.ag(0, 0), this.s(), this.f("kt.editor.border.color"));
      var1.a(new com.kolipri.kt.ag(1, 1), new com.kolipri.kt.d(this.s().a - 2, this.s().b - 2), this.f("kt.editor.background.color"));
      if (var3 != null) {
         var1.a(new com.kolipri.kt.ag(2, (this.s().b - var3.a().b) / 2), var3);
         var2 = 2 + var3.a().a + 8;
      }

      com.kolipri.kt.j var5 = this.a(1, "kt.editor.font");
      com.kolipri.kt.ag var10001 = new com.kolipri.kt.ag(var2, (this.s().b - var5.b) / 2);
      com.kolipri.kt.ao var10003 = this.f("kt.editor.font.color");
      String var10004 = this.b.toString();
      var1.getClass();
      var1.a(var10001, var5, var10003, var10004, 0);
      var2 += var5.a(this.b.toString());
      ++var2;
      if (var2 < this.s().a) {
         var1.a(new com.kolipri.kt.ag(var2, 2), new com.kolipri.kt.d(1, this.s().b - 4), this.f("kt.editor.font.color"));
      }

   }

   public final void a(String var1) {
      this.a_(var1);
   }

   public final void d(String var1) {
      this.b = new StringBuffer(var1);
   }

   public void a_(String var1) {
      this.b = new StringBuffer(var1);
      this.c.c();
      this.b();
   }

   public void c_() {
   }

   public final void c(String var1) {
   }

   public final boolean a(com.kolipri.kt.al var1) {
      boolean var2 = false;
      boolean var3 = false;
      if (var1.b != 8 && var1.b != 3) {
         if (var1.a() != 0) {
            char var4;
            if ((var4 = this.c.a(var1.a())) > 0) {
               if (this.c.d() > 0 && this.b.length() > 0) {
                  this.b.deleteCharAt(this.b.length() - 1);
               }

               this.b.append(var4);
               var2 = true;
            }

            var3 = true;
         }
      } else {
         if (this.b.length() > 0) {
            this.b.deleteCharAt(this.b.length() - 1);
            var2 = true;
         }

         var3 = true;
      }

      if (var2) {
         this.b();
         this.w();
      }

      return var3;
   }

   protected void b() {
      ((Kalypte)super.b_).k.a(this.b.toString());
   }

   public final String d() {
      return this.b.toString();
   }

   public final boolean a(int var1, int var2) {
      com.kolipri.kt.ad var3;
      (var3 = new com.kolipri.kt.ad(super.b_)).a();
      var3.a((com.kolipri.kt.o)this);
      var3.b("Edit text");
      var3.c(this.b.toString());
      var3.b();
      return true;
   }

   public final com.kolipri.kt.d c() {
      com.kolipri.kt.ai var1;
      return (var1 = super.b_.a.b("search")) == null ? new com.kolipri.kt.d(16, 16) : new com.kolipri.kt.d(var1.a().a + 4, var1.a().b + 4);
   }
}
