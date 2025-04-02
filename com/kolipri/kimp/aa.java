package com.kolipri.kimp;

public final class aa {
   protected int a = 0;
   public com.kolipri.kpr.f b = new com.kolipri.kpr.f();
   public com.kolipri.kpr.f c = new com.kolipri.kpr.f();
   public String d = new String("");
   protected int e = 500;
   public String f = new String("");
   public String g;
   public String h;
   public String i;
   public String j;
   public String k;
   public com.kolipri.kpr.m l = new com.kolipri.kpr.m();

   public aa() {
      this.d();
   }

   public final int a() {
      return this.e;
   }

   public final void a(String var1) {
      this.d = var1;
      if (this.d == null) {
         this.d = new String("");
      }

      this.d();
   }

   public final synchronized void b() {
      this.c.a();
      this.b.a();
      this.d();
   }

   public final synchronized p a(int var1) {
      return new p((p)this.b.b(var1));
   }

   public final synchronized int c() {
      return this.b.b();
   }

   private synchronized void e() {
      this.c.a();
      String var1 = this.l.a("amazilia.username");
      this.j = var1 + ".groups.chatterbox";
      this.j = this.l.a(this.j.toString());
      this.h = var1 + ".groups.most_frequent";
      this.h = this.l.a(this.h.toString());
      this.g = var1 + ".groups.buddies";
      this.g = this.l.a(this.g.toString());
      this.i = var1 + ".groups.action_required";
      this.i = this.l.a(this.i.toString());
      this.k = var1 + ".groups.other_contacts";
      this.k = this.l.a(this.k.toString());
      this.c.a(new a(this));
      this.c.a(new x(this));
      this.c.a(new c(this));
      this.c.a(new r(this));
      this.c.a(new b(this));
      String var2 = var1 + ".groups.list";
      String var3 = var1 + ".groups.sort";
      String var4 = this.l.a(var2.toString());
      this.l.a(var3.toString());
      String var6 = ",";
      com.kolipri.kpr.f var7 = new com.kolipri.kpr.f();
      new com.kolipri.kpr.f();
      int var9;
      if (var4 != null && var4.length() > 0) {
         for(var9 = var4.indexOf(var6); var9 >= 0; var9 = (var4 = var4.substring(var9 + var6.length())).indexOf(var6)) {
            if (var4 != "") {
               var7.a(var4.substring(0, var9));
            }
         }

         if (var4 != "") {
            var7.a(var4);
         }
      }

      for(var9 = 0; var9 < var7.b(); ++var9) {
         String var10;
         if ((var10 = var7.b(var9).toString()) != null && (var10 != "" || var10.length() > 0)) {
            this.f(var10);
         }
      }

   }

   public final void a(p var1) {
      if (var1 != null) {
         for(int var2 = 0; this.b != null && var2 < this.b.b(); ++var2) {
            p var3 = (p)this.b.b(var2);
            if (var1.b == var3.b) {
               this.b.c(var3);
               this.b.a(var1);
               this.d(var1);
               return;
            }
         }
      }

   }

   public final void b(String var1) {
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      ac var3 = null;
      if (var1 != null) {
         int var4;
         for(var4 = 0; var4 < this.c.b(); ++var4) {
            if ((var3 = (ac)this.c.b(var4)) != null && var3.a().equals(var1)) {
               var2 = var3.f();
               this.c.a(var4);
               break;
            }
         }

         for(var4 = 0; var3 != null && var2 != null && var4 < var2.b(); ++var4) {
            p var5;
            if ((var5 = (p)var2.b(var4)) != null) {
               var3.c(var5);
            }
         }
      }

   }

   public final com.kolipri.kpr.f c(String var1) {
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();

      for(int var3 = 0; var3 < this.c(); ++var3) {
         p var4 = this.a(var3);
         if (var1.equals("username")) {
            if (var4 != null && var4.a(var1) != null && var4.a("authorized") != null && var4.a("status") != null && !var4.a("status").equals("unknown")) {
               var2.a(var4);
            }
         } else if (var1.equals("sms")) {
            if (!var4.g() && (var4.a("username") == null || var4.a("authorized") != null && var4.a("authorized").equals("yes") && var4.a("status") != null && !var4.a("status").equals("unknown"))) {
               var2.a(var4);
            }
         } else if (var4 != null && var4.a(var1) != null) {
            var2.a(var4);
         }
      }

      return var2;
   }

   public final void d() {
      this.c.a();
      this.e();
      synchronized(this) {
         for(int var1 = 0; var1 < this.b.b(); ++var1) {
            p var3;
            if ((var3 = (p)this.b.b(var1)) != null) {
               this.d(var3);
            }
         }

      }
   }

   public final com.kolipri.kpr.f d(String var1) {
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      this.d();
      ac var3 = null;
      if (var1 != null) {
         for(int var4 = 0; var4 < this.c.b(); ++var4) {
            String var5;
            if ((var3 = (ac)this.c.b(var4)) != null && (var5 = var3.a()) != null && var5.equals(var1)) {
               var2 = var3.f();
               break;
            }
         }
      }

      return var2;
   }

   public final void e(String var1) {
      new com.kolipri.kpr.f();
      ac var3 = null;
      if (var1 != null) {
         int var4;
         for(var4 = 0; var4 < this.c.b(); ++var4) {
            String var5;
            if ((var3 = (ac)this.c.b(var4)) != null && (var5 = var3.a()) != null && var5.equals(var1)) {
               var3.f();
               break;
            }
         }

         if (var3 != null) {
            for(var4 = 0; this.b != null && var4 < this.b.b(); ++var4) {
               p var6;
               if ((var6 = (p)this.b.b(var4)) != null) {
                  var3.c(var6);
                  var3.a(var6);
               }
            }
         }
      }

      var3.c();
   }

   public final void f(String var1) {
      if (var1 != null && var1.length() >= 1) {
         boolean var2 = false;
         int var5 = 0;

         int var4;
         ac var7;
         for(var4 = 0; var4 < this.c.b(); ++var4) {
            if ((var7 = (ac)this.c.b(var4)) != null && var7.a().equals(var1)) {
               var2 = true;
               break;
            }
         }

         if (!var2) {
            for(var4 = 5; var4 < this.c.b(); ++var4) {
               if ((var7 = (ac)this.c.b(var4)) != null) {
                  String var6 = var7.a();
                  if ((var5 = var1.compareTo(var6.toString())) <= 0) {
                     var2 = false;
                     break;
                  }
               }
            }
         }

         if (!var2) {
            if (var5 <= 0 && this.c.b() > 4) {
               this.c.a(var4, new f(this, var1));
               return;
            }

            this.c.a(new f(this, var1));
         }

      }
   }

   private void g(String var1) {
      if (var1 != null) {
         StringBuffer var2 = new StringBuffer();

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            char var4;
            if ((var4 = var1.charAt(var3)) == ',') {
               if (var2.length() > 0) {
                  this.f(var2.toString());
               }

               var2 = new StringBuffer();
            } else {
               var2.append(var4);
            }
         }

         if (var2.length() > 0) {
            this.f(var2.toString());
         }

      }
   }

   private void a(p var1, boolean var2) {
      if (var1 != null) {
         this.g(var1.a("groups"));
         if (this.d == null || this.d.length() <= 0 || var1.b(this.d)) {
            for(int var3 = 0; var3 < this.c.b(); ++var3) {
               ac var4;
               if ((var4 = (ac)this.c.b(var3)) != null) {
                  if (var2) {
                     var4.c(var1);
                  }

                  var4.a(var1);
               }
            }

         }
      }
   }

   private void d(p var1) {
      this.a(var1, true);
   }

   private void e(p var1) {
      if (var1 != null) {
         for(int var2 = 0; var2 < this.c.b(); ++var2) {
            ac var3;
            if ((var3 = (ac)this.c.b(var2)) != null) {
               var3.c(var1);
            }
         }

      }
   }

   public final synchronized p a(String var1, String var2) {
      p var3 = null;

      for(int var6 = 0; var6 < this.b.b(); ++var6) {
         p var4;
         String var5;
         if ((var4 = (p)this.b.b(var6)) != null && (var5 = var4.a(var1)) != null && var5.equals(var2)) {
            var3 = new p(var4);
            break;
         }
      }

      return var3;
   }

   private p c(String var1, String var2) {
      p var3 = null;

      for(int var6 = 0; var6 < this.b.b(); ++var6) {
         p var4;
         String var5;
         if ((var4 = (p)this.b.b(var6)) != null && (var5 = var4.a(var1)) != null && var5.equals(var2)) {
            var3 = var4;
            break;
         }
      }

      return var3;
   }

   public final synchronized void b(p var1) {
      p var2 = null;
      String var3 = null;
      if (var1.a("amaz-cid") != null) {
         var2 = this.c("amaz-cid", var1.a("amaz-cid"));
         var3 = "amazilia";
      }

      if (var2 == null && var1.a("yahoo-id") != null) {
         var2 = this.c("yahoo-id", var1.a("yahoo-id"));
         var3 = "yahoo";
      }

      if (var2 == null && var1.a("msn-id") != null) {
         var2 = this.c("msn-id", var1.a("msn-id"));
         var3 = "msn";
      }

      if (var2 == null && var1.a("username") != null) {
         var2 = this.c("username", var1.a("username"));
      }

      if (var2 == null) {
         if (var3 != null) {
            var1.b("type", var3);
            p var4;
            if (this.b.b() <= this.a()) {
               var4 = new p(var1, this.a++);
               this.b.a(var4);
               this.d(var4);
               return;
            }

            if (var3.equals("yahoo") || var3.equals("msn")) {
               var4 = new p(var1, this.a++);
               this.b.a(var4);
               this.d(var4);
               return;
            }
         }
      } else {
         for(int var6 = 0; var6 < var1.b(); ++var6) {
            String var5;
            if ((var5 = var1.a(var6)) != null && var5.length() > 0) {
               var2.b(var5, var1.b(var6));
            }
         }

         this.d(var2);
      }

   }

   private synchronized void f(p var1) {
      if (var1 != null) {
         for(int var2 = 0; var2 < this.b.b(); ++var2) {
            if (((p)this.b.b(var2)).b == var1.b) {
               this.b.a(var2);
               return;
            }
         }

      }
   }

   private void g(p var1) {
      this.f(var1);
      this.e(var1);
   }

   public final synchronized void c(p var1) {
      if (var1 != null && var1.a("amaz-cid") != null) {
         this.g(this.a("amaz-cid", var1.a("amaz-cid")));
      }

   }

   public final void b(String var1, String var2) {
      p var3;
      while((var3 = this.a(var1, var2)) != null) {
         this.g(var3);
      }

   }
}
