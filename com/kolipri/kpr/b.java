package com.kolipri.kpr;

import java.util.Vector;

public class b {
   protected Vector a = new Vector();

   public final void a() {
      this.a.removeAllElements();
   }

   public final void a(String var1, String var2) {
      this.a.addElement(new Object(this, var1, var2) {
         public String a;
         public String b;

         public {
            this.a = new String(var2);
            this.b = new String(var3);
         }
      });
   }

   public final void a(b var1) {
      for(int var2 = 0; var2 < var1.b(); ++var2) {
         if (var1.a(var2) != null) {
            this.b(var1.a(var2), var1.b(var2));
         }
      }

   }

   public final void b(String var1, String var2) {
      boolean var4 = false;

      for(int var3 = 0; var3 < this.b(); ++var3) {
         <undefinedtype> var5;
         if ((var5 = (<undefinedtype>)this.a.elementAt(var3)) != null && var5.a.equals(var1)) {
            var5.b = new String(var2);
            var4 = true;
            break;
         }
      }

      if (!var4) {
         this.a(var1, var2);
      }

   }

   public final void a(int var1, String var2) {
      <undefinedtype> var3;
      if (var1 >= 0 && var1 < this.b() && (var3 = (<undefinedtype>)this.a.elementAt(var1)) != null) {
         var3.b = new String(var2);
      }

   }

   public final int b() {
      return this.a.size();
   }

   public final String a(String var1) {
      String var2 = null;

      for(int var3 = 0; var3 < this.b(); ++var3) {
         <undefinedtype> var4;
         if ((var4 = (<undefinedtype>)this.a.elementAt(var3)) != null && var4.a.equals(var1)) {
            var2 = var4.b;
            break;
         }
      }

      return var2;
   }

   public final String a(int var1) {
      String var2 = null;
      <undefinedtype> var3;
      if (var1 < this.a.size() && (var3 = (<undefinedtype>)this.a.elementAt(var1)) != null) {
         var2 = var3.a;
      }

      return var2;
   }

   public final String b(int var1) {
      String var2 = null;
      <undefinedtype> var3;
      if (var1 < this.a.size() && (var3 = (<undefinedtype>)this.a.elementAt(var1)) != null) {
         var2 = var3.b;
      }

      return var2;
   }
}
