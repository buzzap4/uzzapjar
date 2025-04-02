package com.kolipri.kt;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;

public class ad implements CommandListener {
   protected r b;
   protected String c;
   protected String d;
   protected TextBox e;
   protected o f;
   protected int g;
   protected int h;
   public String i;
   public String j;
   protected String k;

   public ad(r var1) {
      this(var1, "MIDP_LOWERCASE_LATIN");
   }

   public ad(r var1, String var2) {
      this.c = new String("");
      this.d = new String("");
      this.e = null;
      this.f = null;
      this.g = 0;
      this.h = 700;
      this.i = "OK";
      this.j = "Cancel";
      this.k = null;
      this.b = var1;
      this.k = var2;
   }

   public final void a(int var1) {
      switch(var1) {
      case 0:
      case 2:
      case 3:
      case 65536:
         this.g = var1;
         return;
      default:
         this.g = 0;
      }
   }

   public final void a(o var1) {
      this.f = var1;
   }

   public final void b(String var1) {
      this.c = var1;
   }

   public final void b(int var1) {
      this.h = var1 <= 0 ? 700 : var1;
   }

   public final void c(String var1) {
      if (var1 != null) {
         this.d = var1.length() > this.h ? var1.substring(0, this.h) : var1;
      } else {
         this.d = "";
      }
   }

   public void a() {
   }

   public final void b() {
      this.e = new TextBox(this.c, this.d, this.h, this.g);
      this.e.setCommandListener(this);
      this.e.setInitialInputMode(this.k);
      this.e.addCommand(new Command(this.i, 4, 1));
      this.e.addCommand(new Command(this.j, 3, 1));
      this.b.a(this.e);
   }

   public void commandAction(Command var1, Displayable var2) {
      if (var1.getCommandType() == 4) {
         this.a(this.e.getString());
      } else if (var1.getCommandType() == 3) {
         this.c();
      }

      this.b.e();
   }

   public void a(String var1) {
      if (this.f != null) {
         this.f.a_(var1);
      }

   }

   public void c() {
      if (this.f != null) {
         if (this.j == "Add Emoticon") {
            this.f.c(this.e.getString());
         }

         this.f.c_();
      }

   }
}
