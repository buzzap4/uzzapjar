package com.kolipri.kalypte;

public final class v extends com.kolipri.kt.af {
   protected com.kolipri.kpr.b a = new com.kolipri.kpr.b();

   public v(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final String a() {
      return "buddylist";
   }

   public final com.kolipri.kimp.p a_(int var1) {
      com.kolipri.kimp.p var2 = null;
      if (var1 != 0) {
         int var4 = 1;

         for(int var3 = 0; var3 < ((Kalypte)super.i).k.c.b(); ++var3) {
            com.kolipri.kimp.ac var5 = (com.kolipri.kimp.ac)((Kalypte)super.i).k.c.b(var3);
            if (var4 == var1) {
               var2 = null;
               break;
            }

            if (var5 != null) {
               if (this.a(var5.a())) {
                  if (var1 > var4 && var1 - 1 < var4 + var5.e()) {
                     var2 = var5.a(var1 - 1 - var4);
                     break;
                  }

                  var4 += var5.e();
               }

               ++var4;
            }
         }
      }

      return var2;
   }

   protected final boolean a(String var1) {
      boolean var2 = false;
      if (((Kalypte)super.i).k.d != null && ((Kalypte)super.i).k.d.length() > 0) {
         var2 = true;
      } else if (this.a.a(var1) != null && this.a.a(var1).equals("yes")) {
         var2 = true;
      }

      return var2;
   }

   public final int c() {
      int var1 = 1;

      for(int var2 = 0; var2 < ((Kalypte)super.i).k.c.b(); ++var2) {
         com.kolipri.kimp.ac var4 = (com.kolipri.kimp.ac)((Kalypte)super.i).k.c.b(var2);
         ++var1;
         if (var4 != null) {
            String var3 = var4.a();
            if (this.a(var3)) {
               var1 += var4.e();
            }
         }
      }

      return var1;
   }

   public final com.kolipri.kt.ai b(int var1) {
      com.kolipri.kt.ai var2 = null;
      if (var1 == 0) {
         com.kolipri.kimp.p var4 = ((Kalypte)super.i).s();
         String var5 = null;
         if (var4 != null) {
            var5 = var4.a("status");
         }

         if (var5 == null || var5.equals("unknown")) {
            var5 = "offline";
         }

         if (var5.equals("freeforchat")) {
            var5 = "online";
         }

         if ((var2 = super.i.a.b(var5)) == null) {
            var2 = super.i.a.b("offline");
         }
      } else {
         com.kolipri.kimp.p var3;
         if ((var3 = this.a_(var1)) != null) {
            if (var3.a("username") == null && var3.a("status") == null) {
               var2 = super.i.a.b("offline");
            } else if (var3.a("yahoo-id") != null) {
               if (var3.a("status") != null && var3.a("status").equals("online")) {
                  var2 = super.i.a.b("yahoo-online");
               } else {
                  var2 = super.i.a.b("yahoo-offline");
               }
            } else if (var3.a("msn-id") != null) {
               if (var3.a("status") != null && var3.a("status").equals("online")) {
                  var2 = super.i.a.b("msn-online");
               } else {
                  var2 = super.i.a.b("msn-offline");
               }
            } else {
               String var8;
               if ((var8 = var3.a("status")) == null || var8.equals("unknown") || var3.a("authorized") == null) {
                  var8 = "offline";
               }

               if (var8.equals("freeforchat")) {
                  var8 = "online";
               }

               if ((var2 = super.i.a.b(var8)) == null) {
                  var2 = super.i.a.b("offline");
               }
            }
         } else {
            int var10 = 1;

            for(int var9 = 0; var9 < ((Kalypte)super.i).k.c.b(); ++var9) {
               com.kolipri.kimp.ac var6;
               String var7;
               if ((var6 = (com.kolipri.kimp.ac)((Kalypte)super.i).k.c.b(var9)) != null) {
                  var7 = var6.a();
               } else {
                  var7 = "";
               }

               if (var10 == var1) {
                  if (this.a(var7)) {
                     var2 = super.i.a.b("minus");
                  } else {
                     var2 = super.i.a.b("plus");
                  }
                  break;
               }

               ++var10;
               if (var6 != null && this.a(var7)) {
                  var10 += var6.e();
               }
            }
         }
      }

      return var2;
   }

   public final String a(int var1) {
      String var2 = "";
      String var6;
      if (var1 == 0) {
         com.kolipri.kimp.p var5 = ((Kalypte)super.i).s();
         var6 = null;
         if (var5 != null) {
            var2 = var5.d();
            var6 = var5.a("message");
         }

         if (var2 == null || var2.length() < 1 && ((Kalypte)super.i).i != null) {
            var2 = ((Kalypte)super.i).i.c();
         }

         if (var2 == null || var2.length() < 1) {
            var2 = "[Your profile]";
         }

         if (var6 != null && var6.length() > 0) {
            var2 = var2 + " - ";
            var2 = var2 + var6;
         }
      } else {
         com.kolipri.kimp.p var4;
         if ((var4 = this.a_(var1)) != null) {
            var2 = var4.d();
            String var9;
            if (var4.a("username") != null && (var4.a("status") == null || var4.a("status").equals("unknown") || var4.a("authorized") == null)) {
               String var7;
               if ((var9 = var4.a("abm")) != null && var9.equals("yes")) {
                  var6 = var4.a("lastname");
                  if ((var2 = (var7 = var4.a("firstname")) == null ? var2 : var7).equals("")) {
                     var2 = var4.d();
                  }

                  var2 = var2 + " ";
                  var2 = var2 + (var6 == null ? "" : var6);
                  var2 = var2 + "- Add?";
               } else if (var4.a("authorized") == null) {
                  var6 = var4.a("lastname");
                  if ((var2 = (var7 = var4.a("firstname")) == null ? var2 : var7).equals("")) {
                     var2 = var4.d();
                  }

                  var2 = var2 + " ";
                  var2 = var2 + (var6 == null ? "" : var6);
                  var2 = var2 + " - Authorize?";
               } else {
                  var2 = var2 + " - Add request pending";
               }
            } else if ((var9 = var4.a("message")) != null && var9.length() > 0) {
               var2 = var2 + " - ";
               var2 = var2 + var9;
            }
         } else {
            int var11 = 1;

            for(int var10 = 0; var10 < ((Kalypte)super.i).k.c.b(); ++var10) {
               com.kolipri.kimp.ac var12 = (com.kolipri.kimp.ac)((Kalypte)super.i).k.c.b(var10);
               if (var11 == var1) {
                  if (var12 != null) {
                     var2 = var12.g();
                  } else {
                     var2 = "[NULL]";
                  }
                  break;
               }

               ++var11;
               if (var12 != null) {
                  String var8 = var12.a();
                  if (this.a(var8)) {
                     var11 += var12.e();
                  }
               }
            }
         }
      }

      return var2;
   }

   public final String h(int var1) {
      String var2 = null;
      if (var1 != 0 && this.a_(var1) == null) {
         int var4 = 1;

         for(int var3 = 0; var3 < ((Kalypte)super.i).k.c.b(); ++var3) {
            com.kolipri.kimp.ac var5 = (com.kolipri.kimp.ac)((Kalypte)super.i).k.c.b(var3);
            if (var4 == var1) {
               var2 = var5.a();
               break;
            }

            ++var4;
            if (var5 != null) {
               String var6 = var5.a();
               if (this.a(var6)) {
                  var4 += var5.e();
               }
            }
         }
      }

      return var2;
   }

   public final com.kolipri.kt.d b() {
      return super.i.a.b("offline").a();
   }

   public final int d(int var1) {
      return this.a_(var1) == null ? 0 : 16;
   }

   public final void b(String var1) {
      if (this.a.a(var1) != null && this.a.a(var1).equals("yes")) {
         this.a.b(var1, "no");
      } else {
         this.a.b(var1, "yes");
      }
   }
}
