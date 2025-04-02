package com.kolipri.kimp;

import java.util.Vector;

public abstract class ac {
   protected aa b = null;
   protected int c = 0;
   public String d = null;
   protected Vector e = new Vector();

   public ac(aa var1) {
      this.b = var1;
   }

   public abstract String a();

   public abstract String b();

   public abstract boolean a(p var1);

   protected final void c() {
      this.c = 0;

      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         p var2;
         if ((var2 = (p)this.e.elementAt(var1)) != null && var2.e()) {
            ++this.c;
         }
      }

   }

   public final synchronized int d() {
      return this.c;
   }

   public final synchronized int e() {
      return this.e.size();
   }

   public synchronized void b(p var1) {
      if (var1 != null) {
         String var3 = var1.d().toLowerCase();
         String var4 = null;
         String var5 = "";
         boolean var6 = var1.e();
         String var7 = this.b.l.a("amazilia.username");
         if (!this.a().equals("chatterbox") && !this.a().equals("action_required") && !this.a().equals("most_frequent") && !this.a().equals("other_contacts")) {
            String var8 = this.b.l.a("amazilia.username") + ".groups.sort" == null ? "" : this.b.l.a("amazilia.username") + ".groups.sort";
            var8 = this.b.l.a(var8.toString()) == null ? "" : this.b.l.a(var8.toString());
            String var9 = this.b.l.a("amazilia.username") + ".groups.list";
            var9 = this.b.l.a(var9.toString()) == null ? "" : this.b.l.a(var9.toString());
            String[] var10 = com.kolipri.kpr.i.a(var8, ",");
            int var12;
            if ((var12 = a(com.kolipri.kpr.i.a(var9, ","), this.a())) != -1) {
               var5 = var10[var12];
            }
         } else {
            var7 = var7 + ".groups.sort." + this.a();
            var5 = this.b.l.a(var7.toString());
         }

         if (var5 == null && var5.equals("")) {
            var5 = "1";
         }

         this.d = var5;

         for(int var2 = 0; var2 < this.e.size(); ++var2) {
            p var13;
            if ((var13 = (p)this.e.elementAt(var2)) != null) {
               if (var5.equals("0")) {
                  var4 = var13.d().toLowerCase();
                  if (var3.compareTo(var4) < 0) {
                     this.e.insertElementAt(var1, var2);
                     var1 = null;
                     break;
                  }
               }

               if (var5.equals("1") && (var6 || !var13.e())) {
                  var4 = var13.d().toLowerCase();
                  if (var6 && !var13.e() || var3.compareTo(var4) < 0) {
                     this.e.insertElementAt(var1, var2);
                     var1 = null;
                     break;
                  }
               }
            }
         }

         if (var1 != null) {
            this.e.addElement(var1);
         }

         this.c();
      }
   }

   public final synchronized void c(p var1) {
      for(int var2 = 0; var2 < this.e.size(); ++var2) {
         p var3;
         if ((var3 = (p)this.e.elementAt(var2)) != null && var3.b == var1.b) {
            this.e.removeElementAt(var2);
            break;
         }
      }

      this.c();
   }

   public final synchronized com.kolipri.kpr.f f() {
      com.kolipri.kpr.f var1 = new com.kolipri.kpr.f();

      for(int var2 = 0; var2 < this.e.size(); ++var2) {
         p var3;
         if ((var3 = (p)this.e.elementAt(var2)) != null) {
            p var4 = new p(var3);
            var1.a(var4);
         }
      }

      return var1;
   }

   public final synchronized p a(int var1) {
      p var2 = null;
      p var3;
      if (var1 >= 0 && var1 < this.e.size() && (var3 = (p)this.e.elementAt(var1)) != null) {
         var2 = new p(var3);
      }

      return var2;
   }

   public final String g() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append(this.b());
      if (this.a().equals("buddies")) {
         this.d = "1";
      }

      if (this.d != null && this.d.equals("1") && !this.a().equals("other_contacts") && this.d.equals("1") && !this.a().equals("action_required") && this.d() != 0) {
         var1.append(" (");
         var1.append(this.d());
         var1.append(")");
      } else if (this.a().equals("action_required") && this.e.size() > 0) {
         var1.append(" (");
         var1.append(this.e.size());
         var1.append(")");
      } else if (!this.a().equals("other_contacts") && this.d() != 0) {
         var1.append(" (");
         var1.append(this.d());
         var1.append(")");
      }

      return var1.toString();
   }

   public final String h() {
      StringBuffer var1;
      (var1 = new StringBuffer()).append(this.b());
      return var1.toString();
   }

   public static int a(String[] var0, String var1) {
      int var2 = -1;

      for(int var3 = 0; var1 != null && var0 != null && var3 < var0.length; ++var3) {
         if (var1.equals(var0[var3])) {
            var2 = var3;
            break;
         }
      }

      return var2;
   }
}
