package com.kolipri.kimp;

public final class g extends ab {
   protected String a = null;
   protected String b = null;
   protected String c = null;
   protected j d = null;
   protected String e = null;
   protected int f = 0;
   protected long g = 0L;
   protected long h = 0L;
   protected com.kolipri.kpr.h i = null;
   public int j;
   public int k;
   public int l;
   public int m;
   protected com.kolipri.kpr.c n = null;
   protected boolean o = false;
   private String[] x = new String[15];
   private int y = -1;
   protected String p = null;
   public int q;

   public g(j var1, com.kolipri.kpr.h var2, com.kolipri.kpr.c var3) {
      this.d = var1;
      this.i = var2;
      this.n = var3;
      this.m();
      this.e("idle");
      com.kolipri.kpr.m var4 = new com.kolipri.kpr.m();
      String var5 = null;
      String var6 = null;
      String var7 = null;
      String var8 = null;
      String var9 = null;
      if (var4.c("kalypte_config")) {
         var5 = var4.a("kolipri.xmpp.retryinterval");
         var6 = var4.a("kolipri.xmpp.retrylimit");
         var7 = var4.a("kolipri.xmpp.keepalive");
         var8 = var4.a("kolipri.xmpp.sleepinterval");
         var9 = var4.a("kolipri.roomcache.interval");
      }

      this.q = var9 != null ? Integer.parseInt(var9) : 60;
      this.j = var5 != null ? Integer.parseInt(var5) : 300;
      this.k = var6 != null ? Integer.parseInt(var6) : 3;
      this.l = var7 != null ? Integer.parseInt(var7) : 900;
      this.m = var8 != null ? Integer.parseInt(var8) : 300;
   }

   private void m() {
      this.g = com.kolipri.kpr.d.a();
   }

   public final void a() {
      this.h = com.kolipri.kpr.d.a();
      this.a(false);
   }

   private void a(boolean var1) {
      if (this.o != var1) {
         this.i.a(ae.a(var1));
         this.a((m)(new w(var1 ? "sleeping" : "awake")));
         this.o = var1;
      }

   }

   private void n() {
      if (this.h > 0L && !this.o) {
         long var1 = com.kolipri.kpr.d.a() - this.h;
         if (this.m > 0 && var1 >= (long)this.m) {
            (new StringBuffer()).append("sleepInterval ").append(this.m).append("! let's count sheep!").toString();
            this.a();
            this.a(true);
         }
      }

   }

   public final boolean b() {
      return this.o;
   }

   public final int c() {
      return this.f++;
   }

   private void a(m var1) {
      if (this.d != null) {
         s var2 = null;
         if (var1 instanceof d && (var2 = com.kolipri.kimp.s.a(((d)var1).a)) != null) {
            q var3;
            if ((var3 = ((d)var1).a).a("message.amaz-msg-id") != null) {
               StringBuffer var4;
               (var4 = new StringBuffer()).append("<iq");
               var4.append(" to=\"" + var3.a("message.from") + "\"");
               var4.append(" type=\"set\"");
               var4.append(" protocol=\"amaz-msg-ack\"");
               var4.append(" amaz-msg-id=\"" + var3.a("message.amaz-msg-id") + "\"");
               var4.append(" />");
               this.i.a(var4.toString());
               (new StringBuffer()).append("Assured Message check>> msg id: ").append(var3.a("message.amaz-msg-id")).toString();

               for(int var5 = 0; var5 < this.x.length - 1; ++var5) {
                  if (var3.a("message.amaz-msg-id").equals(this.x[var5])) {
                     return;
                  }
               }

               ++this.y;
               if (this.y == this.x.length - 1) {
                  this.y = 0;
               }

               this.x[this.y] = var3.a("message.amaz-msg-id");
            }

            var1 = var2;
         }

         this.d.a((m)var1);
      }

   }

   private void e(String var1) {
      this.e = var1;
      (new StringBuffer()).append("State now '").append(this.e).append("'").toString();
      this.a((m)(new y(var1)));
   }

   public final String d() {
      return this.e;
   }

   public final String e() {
      return this.p;
   }

   public final void a(String var1, String var2, String var3, String var4) {
      this.a = var1;
      this.b = var3;
      this.c = var4;
      this.e("connecting");
   }

   public final void f() {
      this.g();
      this.a((m)(new y("disabled")));
   }

   public final void g() {
      this.e("idle");
      super.g();
   }

   private boolean f(String var1) {
      (new StringBuffer()).append("SEND: '").append(var1).append("'").toString();
      this.m();
      return this.a(var1);
   }

   private void o() {
      com.kolipri.kpr.m var1;
      (var1 = new com.kolipri.kpr.m()).c("kalypte_config2");
      int[] var2 = new int[]{5222, 8734, 10873, 40932, 80, 25, 20, 21, 110, 443, 465};
      int var4 = 0;

      int var6;
      for(int var5 = 0; var5 < this.a.length(); ++var4) {
         if ((var6 = this.a.substring(var5).indexOf(",")) == -1) {
            ++var4;
            break;
         }

         var5 += var6 + 1;
      }

      String var10;
      int var10000 = (var10 = var1.a("kolipri.xmmp.host.index")) == null ? 0 : Integer.parseInt(var10);
      var6 = var10000;
      var6 = var10000 >= var4 ? 0 : var6;
      var1.b("kolipri.xmmp.host.index", String.valueOf(var6 + 1));
      int var7 = 0;

      while(true) {
         while(var7 < this.a.length()) {
            String var3;
            int var8;
            if ((var8 = this.a.substring(var7).indexOf(",")) == -1 && var7 < this.a.length()) {
               var3 = this.a.substring(var7);
               var7 += this.a.length();
            } else {
               var3 = this.a.substring(var7).substring(0, var8);
               var7 += var8 + 1;
            }

            if (var6 > 0) {
               --var6;
            } else {
               for(int var9 = 0; var9 < var2.length; ++var9) {
                  if (this.a(var3, var2[var9])) {
                     this.p();
                     this.e("waiting");
                     this.m();
                     return;
                  }

                  (new StringBuffer()).append("Failed to connect to '").append(this.a).append(":").append(String.valueOf(var2[var9])).append("'").toString();
               }
            }
         }

         this.d.a(new y("failed-connect"));
         return;
      }
   }

   public final void h() {
      if (!this.i()) {
         this.o();
      } else {
         this.k();

         String var1;
         while(this.i != null && (var1 = (String)this.i.a()) != null) {
            this.f(var1);
            if (var1.indexOf("<action name='update-idle-state'>") < 0) {
               this.a();
            }
         }

         this.n();
         if (this.n.c() > 0) {
            for(com.kolipri.kpr.e var2 = this.n.a(); var2 != null; var2 = this.n.a()) {
               s var3;
               int var4 = Integer.parseInt((var3 = (s)var2.c).s);
               if (com.kolipri.kpr.d.a() - Long.parseLong(var3.f) < (long)this.j) {
                  break;
               }

               ++var4;
               if (var4 <= this.k) {
                  var3.s = Integer.toString(var4);
                  var3.f = Long.toString(com.kolipri.kpr.d.a());
                  this.a(var3);
               } else {
                  var3.s = Integer.toString(var4);
                  var3.f = Long.toString(com.kolipri.kpr.d.a());
                  this.d.a(var3);
               }

               this.n.a(var2);
            }
         }

         if (com.kolipri.kpr.d.a() - this.g > (long)this.l) {
            this.a(" ");
            this.m();
         }

      }
   }

   private void p() {
      this.f("<stream to='amazilia' xmlns='jabber:client' version='1.0'>");
   }

   private void q() {
      this.f("<stream to='amazilia' xmlns='jabber:client' version='1.0' client-version='kalyptej-1.0.14' flags='model=" + com.kolipri.kpr.i.b(System.getProperty("microedition.platform")) + ",heap=" + Runtime.getRuntime().totalMemory() / 1024L + "kb'>");
   }

   private void r() {
      this.f("<iq type='set' id='" + this.c() + "'><bind xmlns='urn:ietf:params:xml:ns:xmpp-bind'>" + "<resource>kalyptej</resource></bind></iq>");
   }

   private void s() {
      s var1;
      (var1 = new s()).c = "admin";
      var1.d = "configuration please";
      this.f(var1.b());
   }

   private void a(s var1) {
      this.a((m)var1);
      this.f(var1.b());
      this.n.b((Object)var1);
   }

   private void t() {
      String var1 = null;

      try {
         var1 = com.kolipri.kpr.k.a((new String("\u0000" + this.b + "\u0000" + this.c)).getBytes("UTF-8"));
      } catch (Exception var3) {
         var3.toString();
         this.g();
      }

      if (var1 != null) {
         this.f(new String("<auth mechanism='PLAIN'>" + var1 + "</auth>"));
      }

   }

   public final void a(q var1) {
      this.m();
      this.a((m)(new d(var1)));
      if (var1.c().equals("features") && this.e.equals("waiting")) {
         this.e("login");
         this.t();
      } else if (var1.c().equals("success") && this.e.equals("login")) {
         this.p = super.w.a("success.mobile") == null ? "" : super.w.a("success.mobile");
         this.e("reinit");
         super.u.a();
         this.d.a(new y("success-connect"));
         this.q();
         this.r();
      } else {
         String var2;
         if (this.e.equals("reinit") && var1.c().equals("iq") && var1.a("iq/bind/jid") != null) {
            if ((var2 = var1.a("iq.type")) == null || !var2.equals("result")) {
               this.g();
               return;
            }

            this.e("online");
            this.s();
            this.f(ae.b());
         } else if (this.e.equals("online") && var1.c().equals("iq") && (var2 = var1.a("iq.amaz-msg-id")) != null && var1.a("iq.protocol").equals("amaz-msg-ack") && var1.a("iq.type").equals("set") && this.n != null && this.n.c() > 0) {
            for(com.kolipri.kpr.e var3 = this.n.a(); var3 != null; var3 = com.kolipri.kpr.c.b(var3)) {
               s var4 = (s)var3.c;
               this.d.a(new w(var4.e + "," + var4.c));
               if (var4.t.equals(var2)) {
                  this.n.a(var3);
                  return;
               }
            }
         }

      }
   }
}
