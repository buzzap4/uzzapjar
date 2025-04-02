package com.kolipri.kt;

import java.util.Vector;

public final class ar extends af {
   protected String a = null;
   protected Vector b = new Vector();
   public <undefinedtype> c = null;

   public ar(r var1, String var2) {
      super(var1);
      this.a = var2;
   }

   public final boolean e(int var1) {
      try {
         this.c = (<undefinedtype>)this.b.elementAt(var1);
         if (this.c != null) {
            if (this.c.d != null && this.c.d.length() != 0) {
               a var2;
               (var2 = new a(this, super.i, this) {
                  protected ar a_ = null;

                  public {
                     this.a_ = var3;
                  }

                  public final void a(x var1) {
                     var1.a("", "Ok");
                  }

                  public final void b(String var1) {
                     if (this.a_ != null) {
                        this.a_.h();
                        this.f();
                     }

                  }

                  public final void c(String var1) {
                     super.a();
                     this.a(var1);
                  }
               }).c(this.c.d);
               var2.a(super.i.c());
            } else {
               this.c.a(super.i);
            }
         }
      } catch (ArrayIndexOutOfBoundsException var3) {
      }

      return false;
   }

   public final boolean h() {
      this.c.a(super.i);
      return true;
   }

   public final String a() {
      return this.a;
   }

   public final int c() {
      return this.b.size();
   }

   public final String a(int var1) {
      String var2 = null;
      <undefinedtype> var3;
      if (var1 >= 0 && var1 < this.b.size() && (var3 = (<undefinedtype>)this.b.elementAt(var1)) != null) {
         var2 = var3.b;
      }

      return var2;
   }

   public final boolean d_() {
      return true;
   }

   public final String b_(int var1) {
      String var2 = null;
      <undefinedtype> var3;
      if (var1 >= 0 && var1 < this.b.size() && (var3 = (<undefinedtype>)this.b.elementAt(var1)) != null) {
         var2 = var3.b();
      }

      return var2;
   }

   public final void a(String var1, String var2, String var3, String var4, int var5, int var6) {
      this.a(var1, var2, var3, (String)null, var4, var5, var6);
   }

   public final void a(String var1, String var2, String var3, String var4, String var5, int var6) {
      this.a(var1, var2, var3, var4, var5, 0, var6);
   }

   public final void a(String var1, String var2, String var3, String var4, String var5) {
      this.a(var1, var2, var3, var4, var5, 0, 0);
   }

   public final void a(String var1, String var2, String var3, String var4, String var5, int var6, int var7) {
      o var8;
      (var8 = new o(this) {
         public String a;
         public String b;
         public String c;
         public String d;
         public String e;
         public String f;
         public int g = 0;
         private ae h;

         public final boolean a(af var1, int var2) {
            System.out.println("item: " + var2);
            this.e = var1.a(var2);
            return true;
         }

         public final void a(r var1) {
            if (this.h != null) {
               this.h.a(this);
               g var3;
               (var3 = new g(var1)).a(this.c);
               var3.a((af)this.h);
               var3.a(var1.c());
            } else {
               ad var2;
               (var2 = new ad(var1)).a(this.g);
               var2.b(Integer.parseInt(this.f));
               var2.c(this.e);
               var2.b(this.c);
               var2.a((o)this);
               var2.b();
            }
         }

         public final void a_(String var1) {
            this.e = var1;
         }

         public final void c_() {
         }

         public final String b() {
            if (this.g == 65536 && this.e != null && this.e.length() > 0) {
               String var1 = "";

               for(int var2 = 0; var2 < this.e.length(); ++var2) {
                  var1 = var1 + "*";
               }

               return var1;
            } else {
               return this.e;
            }
         }

         public final void c(String var1) {
         }
      }).a = var1;
      var8.b = var2;
      var8.c = var3;
      var8.d = var4;
      var8.f = var7 <= 0 ? "700" : Integer.toString(var7);
      var8.e = var5 == null ? "" : var5;
      var8.g = var6;
      this.b.addElement(var8);
   }

   public final String a(String var1) {
      String var2 = null;

      for(int var3 = 0; var3 < this.b.size(); ++var3) {
         <undefinedtype> var4;
         if ((var4 = (<undefinedtype>)this.b.elementAt(var3)) != null && var4.a != null && var4.a.equals(var1)) {
            var2 = var4.e;
            break;
         }
      }

      return var2;
   }
}
