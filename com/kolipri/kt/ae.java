package com.kolipri.kt;

import java.util.Vector;

public class ae extends af {
   protected String a = null;
   protected Vector b = new Vector();
   protected d c = new d(0, 0);
   protected boolean d = false;

   public ae(r var1, String var2) {
      super(var1);
      this.a = var2;
   }

   public final int g(int var1) {
      int var2 = -1;
      <undefinedtype> var3;
      if (var1 >= 0 && var1 < this.b.size() && (var3 = (<undefinedtype>)this.b.elementAt(var1)) != null) {
         var2 = var3.a;
      }

      return var2;
   }

   public final void a(int var1, String var2) {
      this.a(var1, (ai)null, var2, (String)null);
   }

   public final void a(int var1, ai var2, String var3) {
      this.a(var1, var2, var3, (String)null);
   }

   public final void a(int var1, ai var2, String var3, String var4) {
      Object var5;
      ((<undefinedtype>)(var5 = new Object(this) {
         public int a = -1;
         public String b = null;
         public String c = null;
         public ai d = null;
      })).a = var1;
      ((<undefinedtype>)var5).d = var2;
      ((<undefinedtype>)var5).b = var3;
      ((<undefinedtype>)var5).c = var4;
      this.b.addElement(var5);
      if (var2 != null) {
         if (var2.a().a > this.c.a) {
            this.c.a = var2.a().a;
         }

         if (var2.a().b > this.c.b) {
            this.c.b = var2.a().b;
         }
      }

      if (var4 != null) {
         this.d = true;
      }

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

   public final String b_(int var1) {
      String var2 = null;
      <undefinedtype> var3;
      if (this.d && var1 >= 0 && var1 < this.b.size() && (var3 = (<undefinedtype>)this.b.elementAt(var1)) != null) {
         var2 = var3.c;
      }

      return var2;
   }

   public final ai b(int var1) {
      ai var2 = null;
      <undefinedtype> var3;
      if (var1 >= 0 && var1 < this.b.size() && (var3 = (<undefinedtype>)this.b.elementAt(var1)) != null) {
         var2 = var3.d;
      }

      return var2;
   }

   public final d b() {
      return this.c;
   }

   public final boolean d_() {
      return this.d;
   }

   public final int e() {
      return super.j;
   }
}
