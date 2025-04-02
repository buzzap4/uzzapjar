package com.kolipri.kt;

public final class al {
   public int a = -1;
   public int b = 0;

   public al() {
   }

   public al(int var1) {
      this.b = var1;
   }

   public final char a() {
      boolean var1 = false;
      char var10000;
      switch(this.a) {
      case 35:
         var10000 = '#';
         break;
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      default:
         var10000 = this.a <= 0 ? 0 : (char)this.a;
         break;
      case 42:
         var10000 = '*';
         break;
      case 48:
         var10000 = '0';
         break;
      case 49:
         var10000 = '1';
         break;
      case 50:
         var10000 = '2';
         break;
      case 51:
         var10000 = '3';
         break;
      case 52:
         var10000 = '4';
         break;
      case 53:
         var10000 = '5';
         break;
      case 54:
         var10000 = '6';
         break;
      case 55:
         var10000 = '7';
         break;
      case 56:
         var10000 = '8';
         break;
      case 57:
         var10000 = '9';
      }

      return var10000;
   }
}
