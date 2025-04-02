package com.kolipri.kimp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public final class s implements m {
   public String a;
   public String b;
   public String c;
   public String d;
   public String e;
   public String f;
   public String g;
   public String h;
   public String i;
   public String j;
   public String k;
   public com.kolipri.kpr.f l;
   public com.kolipri.kpr.f m = new com.kolipri.kpr.f();
   public boolean n;
   public boolean o;
   public boolean p;
   public boolean q;
   public boolean r = false;
   public String s;
   public String t;
   protected com.kolipri.kpr.i u = new com.kolipri.kpr.i();

   public s() {
      this.c();
   }

   public s(s var1) {
      this.c();
      this.a(var1);
   }

   private void a(s var1) {
      this.a = var1.a != null ? new String(var1.a) : null;
      this.b = var1.b != null ? new String(var1.b) : null;
      this.c = var1.c != null ? new String(var1.c) : null;
      this.g = var1.g != null ? new String(var1.g) : null;
      this.d = var1.d != null ? new String(var1.d) : null;
      this.e = var1.e != null ? new String(var1.e) : null;
      this.i = var1.i != null ? new String(var1.i) : null;
      this.h = var1.h != null ? new String(var1.h) : null;
      this.m = null;
      this.n = var1.n;
      this.l = var1.l;
      this.o = var1.o;
      this.r = var1.r;
      this.f = var1.f;
      this.p = var1.p;
      this.q = var1.q;
      this.s = var1.s;
      this.t = var1.t;
   }

   private void c() {
      this.a = "";
      this.b = "";
      this.c = "";
      this.g = "";
      this.d = "";
      this.e = "im";
      this.l = null;
      this.h = "";
      this.m = null;
      this.n = false;
      this.o = false;
      this.f = "";
      this.p = false;
      this.q = false;
      this.s = "0";
      this.t = "";
      this.i = "";
   }

   private boolean a(OutputStream var1) {
      boolean var2 = false;

      try {
         OutputStreamWriter var3;
         (var3 = new OutputStreamWriter(var1, "UTF-8")).write((this.f != null ? this.f : "") + ":");
         var3.write((this.a != null ? this.a : "") + ":");
         var3.write((this.c != null ? this.c : "") + ":");
         var3.write((this.g != null ? this.g : "") + ":");
         var3.write((this.e != null ? this.e : "") + ":");
         var3.write((this.h != null ? this.h : "") + ":");
         var3.write(this.d != null ? this.d : "");
         var2 = true;
      } catch (Exception var4) {
         var4.toString();
         var2 = false;
      }

      return var2;
   }

   public final byte[] a() {
      byte[] var1 = null;
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      if (this.a((OutputStream)var2)) {
         var1 = var2.toByteArray();

         try {
            var2.close();
         } catch (Exception var4) {
            var4.toString();
         }
      }

      return var1;
   }

   private static int a(InputStreamReader var0) {
      boolean var1 = false;

      int var4;
      try {
         var4 = var0.read();
      } catch (Exception var3) {
         var4 = -1;
      }

      return var4;
   }

   private static s a(String var0) {
      s var1 = new s();
      int var2 = 0;

      try {
         StringBuffer var3;
         for(var3 = new StringBuffer(); var2 < var0.length() && var0.charAt(var2) != ':'; ++var2) {
            var3.append(var0.charAt(var2));
         }

         if (var0.charAt(var2) == ':') {
            ++var2;
         }

         var1.f = var3.toString();

         for(var3 = new StringBuffer(); var2 < var0.length() && var0.charAt(var2) != ':'; ++var2) {
            var3.append(var0.charAt(var2));
         }

         if (var0.charAt(var2) == ':') {
            ++var2;
         }

         var1.a = var3.toString();

         for(var3 = new StringBuffer(); var2 < var0.length() && var0.charAt(var2) != ':'; ++var2) {
            var3.append(var0.charAt(var2));
         }

         if (var0.charAt(var2) == ':') {
            ++var2;
         }

         var1.c = var3.toString();

         for(var3 = new StringBuffer(); var2 < var0.length() && var0.charAt(var2) != ':'; ++var2) {
            var3.append(var0.charAt(var2));
         }

         if (var0.charAt(var2) == ':') {
            ++var2;
         }

         var1.g = var3.toString();
         if (!var1.g.equals("")) {
            for(var3 = new StringBuffer(); var2 < var0.length() && var0.charAt(var2) != ':'; ++var2) {
               var3.append(var0.charAt(var2));
            }

            if (var0.charAt(var2) == ':') {
               ++var2;
            }
         }

         for(var3 = new StringBuffer(); var2 < var0.length() && var0.charAt(var2) != ':'; ++var2) {
            var3.append(var0.charAt(var2));
         }

         if (var0.charAt(var2) == ':') {
            ++var2;
         }

         var1.e = var3.toString();

         for(var3 = new StringBuffer(); var2 < var0.length() && var0.charAt(var2) != ':'; ++var2) {
            var3.append(var0.charAt(var2));
         }

         if (var0.charAt(var2) == ':') {
            ++var2;
         }

         var1.h = var3.toString();

         for(var3 = new StringBuffer(); var2 < var0.length(); ++var2) {
            var3.append(var0.charAt(var2));
         }

         var1.d = var3.toString();
      } catch (Exception var4) {
         (new StringBuffer()).append("from string:").append(var4.toString()).toString();
      }

      return var1;
   }

   public static s a(byte[] var0) {
      InputStreamReader var2 = null;

      try {
         var2 = new InputStreamReader(new ByteArrayInputStream(var0), "UTF-8");
      } catch (Exception var4) {
         var4.toString();
      }

      StringBuffer var3 = new StringBuffer();

      int var1;
      while(var2 != null && (var1 = a(var2)) >= 0) {
         var3.append((char)var1);
      }

      return var3.length() < 1 ? null : a(var3.toString());
   }

   private static String b(String var0) {
      if (var0 == null) {
         return "";
      } else {
         return var0.indexOf(64) < 0 ? var0 : var0.substring(0, var0.indexOf(64));
      }
   }

   private static String c(String var0) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         char var3;
         if (Character.isDigit(var3 = var0.charAt(var2))) {
            var1.append(var3);
         }
      }

      return var1.toString();
   }

   public static s a(q var0) {
      s var1 = null;
      if (var0.a("message") != null) {
         (var1 = new s()).e = var0.a("message.amaz-protocol");
         if (var1.e != null) {
            var1.a = var0.a("message.amaz-from");
         }

         if (var1.e == null && var0.a("message.sms-from") != null) {
            var1.e = "smsr";
            var1.a = var0.a("message.sms-from");
         }

         if (var1.e == null) {
            var1.e = "im";
            var1.a = b(var0.a("message.from"));
         }

         if (var0.a("message.ts") != null) {
            var1.f = var0.a("message.ts").toString();
         }

         var1.s = var0.a("tries");
         var1.t = var0.a("message.amaz-msg-id");
         var1.b = var0.a("message.amaz-display-name");
         var1.c = b(var0.a("message.to"));
         var1.d = var0.a("message/body");
         if (var0.a("message.amaz-buddy-invite") != null) {
            var1.n = true;
         }

         if (var0.a("message.amaz-abm-from") != null) {
            var1.a = var0.a("message.amaz-abm-from");
            var1.o = true;
         }

         if (var1.e != null && var1.e.equals("email")) {
            var1.a = var0.a("message/email.from");
            var1.b = var0.a("message/email.fromname");
         }

         if (var1.a == null) {
            var1.a = var0.a("message.from");
         }

         if (var1.b == null || var1.b.length() < 1) {
            var1.b = var1.a;
         }

         int var2;
         String var3;
         String var4;
         p var5;
         for(var2 = 0; var0.b() > 1 && var2 < var0.b(); ++var2) {
            if ((var3 = var0.a(var2)) != null && var3.equals("message/recipient.username") && (var4 = var0.b(var2)) != null) {
               if (var1.l == null) {
                  var1.l = new com.kolipri.kpr.f();
               }

               (var5 = new p()).b("username", var4);
               var1.l.a(var5);
            }
         }

         for(var2 = 0; var2 < var0.b(); ++var2) {
            if ((var3 = var0.a(var2)) != null && var3.equals("message/contact.username") && (var4 = var0.b(var2)) != null) {
               if (var1.m == null) {
                  var1.m = new com.kolipri.kpr.f();
               }

               (var5 = new p()).b("username", var4);
               var1.m.a(var5);
            }
         }
      }

      return var1;
   }

   public final String b() {
      StringBuffer var1 = new StringBuffer();
      new com.kolipri.kpr.i();
      this.k = com.kolipri.kpr.i.a("]]>", "]]]]><![CDATA[>", this.d);
      if (this.k == null) {
         this.k = this.d;
      }

      int var2;
      StringBuffer var4;
      p var5;
      String var6;
      String var7;
      StringBuffer var9;
      p var10;
      if (this.e != null && this.e.length() >= 1 && !this.e.equals("im")) {
         if (this.e.equals("smsr")) {
            var1.append("<message");
            var1.append(" to='sms'");
            if (this.s != null) {
               var1.append(" amaz-retry='" + this.s + "'");
            }

            var1.append(" sms-to='" + c(this.c) + "'");
            if (this.p) {
               var1.append(" type='kalypte-sms-invite'");
            }

            if (this.q) {
               var1.append(" type='kalypte-sms-invite'");
            }

            if (this.t != null && !this.s.equals("0")) {
               var1.append(" id='" + this.t + "'");
            }

            if (this.i != null) {
               this.i = com.kolipri.kpr.i.b(this.i);
            }

            var1.append(" amaz-display-name='" + this.i + "'");
            var1.append(">");
            var1.append("<body><![CDATA[");
            var1.append(this.k);
            var1.append("]]></body>");
            var4 = new StringBuffer();
            if (this.l != null) {
               for(var2 = 0; var2 < this.l.b(); ++var2) {
                  if ((var5 = (p)this.l.b(var2)) != null && (var6 = com.kolipri.kpr.i.b(var5.a("username") == null ? var5.a(true) : var5.a("username"))) != null) {
                     var4.append("<recipient");
                     var4.append(" displayname=\"" + var6 + "\"");
                     var4.append(" />");
                  }
               }

               if (!this.r) {
                  var1.append(var4.toString());
               }
            }

            var1.append("</message>");
            var9 = new StringBuffer();
            if (this.l != null) {
               for(var2 = 1; var2 < this.l.b(); ++var2) {
                  if ((var10 = (p)this.l.b(var2)) != null) {
                     var7 = var10.a("mobile") == null ? var10.a("custom-mobile") : var10.a("mobile");
                     String var8 = com.kolipri.kpr.i.b(var10.a("username") == null ? var10.a(true) : var10.a("username"));
                     if (var7 != null) {
                        var9.append("<message");
                        var9.append(" to='sms'");
                        if (this.s != null) {
                           var9.append(" amaz-retry='" + this.s + "'");
                        }

                        if (this.t != null && !this.s.equals("0")) {
                           var1.append(" id='" + this.t + "'");
                        }

                        var9.append(" sms-to='" + c(var7) + "'");
                        if (var8 != null) {
                           var8 = com.kolipri.kpr.i.b(var8);
                        }

                        var9.append(" amaz-display-name='" + var8 + "'");
                        var9.append(">");
                        var9.append("<body><![CDATA[");
                        var9.append(this.d);
                        var9.append("]]></body>");
                        if (!this.r) {
                           var9.append(var4.toString());
                        }

                        var9.append("</message>");
                     }
                  }
               }

               var1.append(var9.toString());
            }
         } else if (this.e.equals("email")) {
            var1.append("<message");
            var1.append(" to='email'");
            if (this.s != null) {
               var1.append(" amaz-retry='" + this.s + "'");
            }

            var1.append(" amaz-protocol='email'");
            if (this.q) {
               var1.append(" type='kalypte-invite'");
            }

            var1.append(">");
            var1.append("<email to='" + this.c + "'");
            if (this.b != null) {
               var1.append(" displayname='" + this.b + "'");
            }

            if (this.h != null) {
               this.h = com.kolipri.kpr.i.b(this.h);
               if (!this.r) {
                  var1.append(" cc='" + this.h + "'");
               } else {
                  var1.append(" bcc='" + this.h + "'");
               }
            }

            var1.append("/>");
            var1.append("<body><![CDATA[");
            var1.append(this.k);
            var1.append("]]></body>");
            var1.append("</message>");
         } else if (this.e.equals("random")) {
            this.e = "im";
            var1.append("<message");
            if (this.j != null) {
               var1.append(" amaz-protocol='" + this.j + "'");
            } else {
               var1.append(" amaz-protocol='" + this.e + "'");
            }

            if (this.j != null && this.j.equals("sms")) {
               var1.append(" to='sms'");
               if (this.t != null) {
                  var1.append(" amaz-msg-id='" + this.t + "'");
               }

               if (this.s != null) {
                  var1.append(" amaz-retry='" + this.s + "'");
               }

               var1.append(" sms-to='" + c(this.c) + "'");
               if (this.i != null) {
                  this.i = com.kolipri.kpr.i.b(this.i);
                  var1.append(" amaz-display-name='" + this.i + "'");
               }
            } else if (this.j != null && this.j.equals("im")) {
               var1.append(" to='" + com.kolipri.kpr.i.b(this.c) + "'");
               if (this.t != null && !this.s.equals("0")) {
                  var1.append(" amaz-msg-id='" + this.t + "'");
               }

               if (this.s != null) {
                  var1.append(" amaz-retry='" + this.s + "'");
               }

               if (this.g != null) {
                  var1.append(" amaz-location='" + this.g + "'");
               }

               var1.append(" type='chat'");
            } else if (this.j != null && (this.j.equals("yahoo") || this.j.equals("msn"))) {
               var1.append(" amaz-to='" + this.c + "'");
               if (this.q) {
                  var1.append(" type='kalypte-invite'");
               }

               var1.append(" to='" + this.j + "'");
            }

            var1.append(">");
            if (this.d != null && this.d.length() > 0) {
               var1.append("<body><![CDATA[");
               var1.append(this.k);
               var1.append("]]></body>");
            }

            var4 = new StringBuffer();
            if (this.l != null) {
               for(var2 = 0; var2 < this.l.b(); ++var2) {
                  if ((var5 = (p)this.l.b(var2)) != null) {
                     var6 = var5.a("username");
                     var7 = com.kolipri.kpr.i.b(var5.a(true));
                     if (var6 != null) {
                        if (var7 == null) {
                           var7 = var6;
                        }

                        var4.append("<recipient");
                        var4.append(" username=\"" + var6 + "\"");
                        var4.append(" displayname=\"" + var7 + "\"");
                        var4.append(" />");
                     }
                  }
               }

               if (!this.r) {
                  var1.append(var4.toString());
               }
            }

            var1.append("</message>");
            var9 = new StringBuffer();
            if (this.l != null) {
               for(var2 = 1; var2 < this.l.b(); ++var2) {
                  if ((var10 = (p)this.l.b(var2)) != null && var10.a("username") != null) {
                     var9.append("<message");
                     var9.append(" to='" + com.kolipri.kpr.i.b(var10.a("username")) + "'");
                     if (this.t != null && this.s != null && !this.s.equals("0")) {
                        var9.append(" amaz-msg-id='" + this.t + "'");
                     }

                     if (this.s != null) {
                        var9.append(" amaz-retry='" + this.s + "'");
                     }

                     if (var10.a("location") != null) {
                        var9.append(" amaz-location='" + var10.a("location") + "'");
                     }

                     var9.append(" type='chat'");
                     var9.append(">");
                     if (this.d != null && this.d.length() > 0) {
                        var9.append("<body><![CDATA[");
                        var9.append(this.d);
                        var9.append("]]></body>");
                     }

                     if (!this.r) {
                        var9.append(var4.toString());
                     }

                     var9.append("</message>");
                  } else if (var10 != null && var10.g()) {
                     var9.append("<message");
                     if (this.t != null && !this.s.equals("0")) {
                        var9.append(" amaz-msg-id='" + this.t + "'");
                     }

                     if (var10.a("yahoo-id") != null) {
                        var9.append(" amaz-to='" + com.kolipri.kpr.i.b(var10.a("yahoo-id")) + "'");
                        var9.append(" to='yahoo'");
                     } else if (var10.a("msn-id") != null) {
                        var9.append(" amaz-to='" + com.kolipri.kpr.i.b(var10.a("msn-id")) + "'");
                        var9.append(" to ='msn'");
                     }

                     var9.append(">");
                     if (this.d != null && this.d.length() > 0) {
                        var9.append("<body><![CDATA[");
                        var9.append(this.d);
                        var9.append("]]></body>");
                     }

                     if (!this.r) {
                        var9.append(var4.toString());
                     }

                     var9.append("</message>");
                  } else if (var10 != null && var10.j() && var10.a("custom-mobile") != null) {
                     var9.append("<message");
                     var9.append(" to='sms'");
                     if (this.s != null) {
                        var9.append(" amaz-retry='" + this.s + "'");
                     }

                     if (this.t != null && !this.s.equals("0")) {
                        var9.append(" id='" + this.t + "'");
                     }

                     var9.append(" sms-to='" + c(var10.a("custom-mobile")) + "'");
                     if (var10.d() != null) {
                        var7 = com.kolipri.kpr.i.b(var10.d());
                        var9.append(" amaz-display-name='" + var7 + "'");
                     }

                     var9.append(">");
                     if (this.d != null && this.d.length() > 0) {
                        var9.append("<body><![CDATA[");
                        var9.append(this.d);
                        var9.append("]]></body>");
                     }

                     if (!this.r) {
                        var9.append(var4.toString());
                     }

                     var9.append("</message>");
                  }
               }

               var1.append(var9.toString());
            }
         } else {
            var1.append("<message");
            if (this.s != null) {
               var1.append(" amaz-retry='" + this.s + "'");
            }

            var1.append(" amaz-protocol='" + this.e + "'");
            if (this.t != null && !this.s.equals("0")) {
               var1.append(" id='" + this.t + "'");
            }

            var1.append(" to='" + this.e + "'");
            var1.append(" amaz-to='" + this.c + "'");
            if (this.q) {
               var1.append(" type='kalypte-invite'");
            }

            var1.append(">");
            var1.append("<body><![CDATA[");
            var1.append(this.k);
            var1.append("]]></body>");
            var1.append("</message>");
         }
      } else {
         var1.append("<message");
         var1.append(" to='" + com.kolipri.kpr.i.b(this.c) + "'");
         if (this.t != null && !this.s.equals("0")) {
            var1.append(" amaz-msg-id='" + this.t + "'");
         }

         if (this.s != null) {
            var1.append(" amaz-retry='" + this.s + "'");
         }

         if (this.g != null) {
            var1.append(" amaz-location='" + this.g + "'");
         }

         var1.append(" type='chat'");
         if (this.n) {
            var1.append(" amaz-buddy-invite='yes'");
         }

         var1.append(">");
         if (this.d != null && this.d.length() > 0) {
            var1.append("<body><![CDATA[");
            var1.append(this.k);
            var1.append("]]></body>");
         }

         var4 = new StringBuffer();
         if (this.l != null) {
            for(var2 = 0; var2 < this.l.b(); ++var2) {
               if ((var5 = (p)this.l.b(var2)) != null) {
                  var6 = var5.a("username");
                  var7 = com.kolipri.kpr.i.b(var5.a(true));
                  if (var6 != null) {
                     if (var7 == null) {
                        var7 = var6;
                     }

                     var4.append("<recipient");
                     var4.append(" username=\"" + var6 + "\"");
                     var4.append(" displayname=\"" + var7 + "\"");
                     var4.append(" />");
                  }
               }
            }

            if (!this.r) {
               var1.append(var4.toString());
            }
         }

         if (this.m != null && this.m.b() > 0) {
            for(var2 = 0; var2 < this.m.b(); ++var2) {
               if ((var5 = (p)this.m.b(var2)) != null) {
                  var6 = var5.a("username");
                  var7 = com.kolipri.kpr.i.b(var5.d());
                  if (var6 != null) {
                     if (var7 == null) {
                        var7 = var6;
                     }

                     var1.append("<contact");
                     var1.append(" username=\"" + var6 + "\"");
                     var1.append(" displayname=\"" + var7 + "\"");
                     var1.append(" />");
                  }
               }
            }
         }

         var1.append("</message>");
         var9 = new StringBuffer();
         if (this.l != null) {
            for(var2 = 1; var2 < this.l.b(); ++var2) {
               if ((var10 = (p)this.l.b(var2)) != null && (var7 = var10.a("username")) != null) {
                  var9.append("<message");
                  var9.append(" to='" + com.kolipri.kpr.i.b(var7) + "'");
                  if (this.t != null && !this.s.equals("0")) {
                     var9.append(" amaz-msg-id='" + this.t + "'");
                  }

                  if (this.s != null) {
                     var9.append(" amaz-retry='" + this.s + "'");
                  }

                  if (this.g != null) {
                     var9.append(" amaz-location='" + this.g + "'");
                  }

                  var9.append(" type='chat'");
                  var9.append(">");
                  if (this.d != null && this.d.length() > 0) {
                     var9.append("<body><![CDATA[");
                     var9.append(this.d);
                     var9.append("]]></body>");
                  }

                  if (!this.r) {
                     var9.append(var4.toString());
                  }

                  var9.append("</message>");
               }
            }

            var1.append(var9.toString());
         }
      }

      return var1.toString();
   }
}
