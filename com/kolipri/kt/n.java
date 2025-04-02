package com.kolipri.kt;

import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class n {
   private Image[] a;
   private <undefinedtype>[] b;
   private int c = 0;
   private int d = 0;
   private Boolean e;
   private int f;
   private Random g;

   public n(int var1, int var2, int var3, int var4, aj var5) {
      this.e = Boolean.FALSE;
      this.f = 0;
      this.g = new Random();
      this.c = var1;
      this.d = var2;
      this.b = new <undefinedtype>[3];
      this.a = new Image[4];
      this.a[0] = var5.b("dolphin1").b();
      this.a[1] = var5.b("dolphin2").b();
      this.a[2] = var5.b("dolphin3").b();
      this.a[3] = var5.b("dolphin4").b();
      int var6 = this.a[0].getWidth();
      int var7 = this.a[0].getHeight();

      for(int var8 = 0; var8 < this.b.length; ++var8) {
         this.b[var8] = (<undefinedtype>)(new Object(this, null) {
            protected int a;
            protected int b;
            protected int[] c;
            protected int[] d;

            private {
               this.a = 0;
               this.b = 0;
            }
         });
         this.b[var8].c = new int[10];
         this.b[var8].d = new int[10];

         for(int var9 = 0; var9 < 10; ++var9) {
            this.b[var8].c[var9] = this.g.nextInt() % (var3 - var6);
            this.b[var8].d[var9] = this.g.nextInt() % (var4 - var7);
         }
      }

   }

   public final void a(Graphics var1) {
      this.e = Boolean.TRUE;
      if (this.f < this.c) {
         for(int var2 = 0; var2 < this.b.length; ++var2) {
            var1.drawImage(this.a[this.b[var2].a], this.b[var2].c[this.b[var2].b], this.b[var2].d[this.b[var2].b], 0);
         }
      }

      this.e = Boolean.FALSE;
   }

   public final boolean a() {
      return this.e;
   }

   public final int b() {
      return this.f >= this.c ? 0 : this.d;
   }

   public final void c() {
      this.e = Boolean.TRUE;

      for(int var1 = 0; var1 < this.b.length; ++var1) {
         ++this.b[var1].a;
         if (this.b[var1].a >= this.a.length) {
            this.b[var1].a = 0;
            ++this.b[var1].b;
            if (this.b[var1].b >= this.b[var1].c.length) {
               this.b[var1].b = 0;
            }
         }
      }

      ++this.f;
      this.e = Boolean.FALSE;
   }
}
