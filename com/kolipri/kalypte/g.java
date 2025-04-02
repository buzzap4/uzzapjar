package com.kolipri.kalypte;

public final class g extends com.kolipri.kt.af {
   private com.kolipri.kpr.f a = new com.kolipri.kpr.f();

   public g(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a(String var1, String var2) {
      this.a.a(new Object(this, var1, var2, 1) {
         protected boolean a = false;
         protected String b;
         protected String c;
         protected int d;
         public int e = 0;

         public {
            this.b = var2;
            this.c = var3;
            this.d = var4;
         }
      });
   }

   public final void a(String var1, String var2, boolean var3) {
      Object var4;
      ((<undefinedtype>)(var4 = new Object(this, var1, var2, 2) {
         protected boolean a = false;
         protected String b;
         protected String c;
         protected int d;
         public int e = 0;

         public {
            this.b = var2;
            this.c = var3;
            this.d = var4;
         }
      })).a = var3;
      this.a.a(var4);
   }

   public final com.kolipri.kt.d b() {
      return super.i.a.b("tickbox-selected").a();
   }

   public final com.kolipri.kt.ai b(int var1) {
      return ((<undefinedtype>)this.a.b(var1)).a ? super.i.a.b("tickbox-selected") : super.i.a.b("tickbox-not-selected");
   }

   public final boolean e(int var1) {
      <undefinedtype> var2;
      (var2 = (<undefinedtype>)this.a.b(var1)).a = !var2.a;
      if (var2.d == 1) {
         for(int var3 = 0; var3 < this.a.b(); ++var3) {
            var2 = (<undefinedtype>)this.a.b(var3);
            if (var3 != var1 && var2.d != 2) {
               var2.a = false;
            }
         }
      }

      return false;
   }

   public final int c() {
      return this.a.b();
   }

   public final String a(int var1) {
      return ((<undefinedtype>)this.a.b(var1)).c;
   }

   public final String a() {
      return "Choice-Menu-Entries";
   }

   public final int f(int var1) {
      return ((<undefinedtype>)this.a.b(var1)).e;
   }

   public final void a(String var1, String var2, int var3) {
      Object var4;
      ((<undefinedtype>)(var4 = new Object(this, var1, var2, 2) {
         protected boolean a = false;
         protected String b;
         protected String c;
         protected int d;
         public int e = 0;

         public {
            this.b = var2;
            this.c = var3;
            this.d = var4;
         }
      })).e = var3;
      this.a.a(var4);
   }

   public final String d() {
      for(int var1 = 0; var1 < this.a.b(); ++var1) {
         <undefinedtype> var2;
         if ((var2 = (<undefinedtype>)this.a.b(var1)).a) {
            return var2.b;
         }
      }

      return null;
   }

   public final boolean a_() {
      for(int var1 = 0; var1 < this.a.b(); ++var1) {
         <undefinedtype> var2;
         if ((var2 = (<undefinedtype>)this.a.b(var1)).d == 2) {
            return var2.a;
         }
      }

      return false;
   }
}
