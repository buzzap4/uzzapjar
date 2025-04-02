package com.kolipri.kpr;

import com.kolipri.kimp.ab;

public final class g {
   protected ab a = null;
   protected boolean b;
   protected <undefinedtype> c;
   protected StringBuffer d;
   protected String e;
   protected boolean f;
   protected b g;

   public g(ab var1) {
      this.a = var1;
      this.a();
      this.b();
   }

   private void b() {
      this.g = new b();
      this.g.a("amp", "&");
      this.g.a("lt", "<");
      this.g.a("gt", ">");
      this.g.a("apos", "'");
      this.g.a("quot", "\"");
   }

   public final void a() {
      this.b = false;
      this.c = null;
      this.d = new StringBuffer();
      this.f = false;
   }

   private void a(char var1) {
      if (this.c == null) {
         if (var1 != '<' || this.b) {
            if (var1 == '&' && !this.f) {
               this.f = true;
               this.e = "";
               return;
            }

            if (var1 == '&' && this.f) {
               this.d.append(var1);
               return;
            }

            if (var1 == ';' && this.f) {
               this.f = false;
               if (this.g.a(this.e) != null) {
                  this.d.append(this.g.a(this.e));
                  return;
               }

               this.d.append(this.e);
               this.e = "";
            } else if (var1 == ' ' && this.f) {
               this.f = false;
               this.d.append("&");
               this.d.append(this.e);
               this.e = "";
            }

            if (this.f) {
               this.e = this.e + var1;
               return;
            }

            this.d.append(var1);
            return;
         }

         this.c = (<undefinedtype>)(new Object(this) {
            public StringBuffer a;
            public b b;
            public <undefinedtype> c;
            public boolean d;
            public int e;
            public char f;
            private final g g;

            public {
               this.g = var1;
               this.d();
            }

            private void d() {
               this.a = new StringBuffer();
               this.b = new b();
               this.c = null;
               this.d = false;
               this.e = 0;
               this.f = 0;
            }

            public final void a(char var1) {
               if (!this.d && var1 != '>') {
                  if (var1 == ' ') {
                     this.d = true;
                  } else if (this.a.length() == 0 || var1 != '/') {
                     this.a.append(var1);
                  }
               } else if (this.c != null) {
                  this.c.a(var1);
                  if (this.c.c == 1) {
                     if (this.c.a.length() > 0) {
                        this.b.a(this.c.a.toString(), this.c.b.toString());
                     }

                     this.c = null;
                  }
               } else if (var1 != '?') {
                  if (var1 == '>') {
                     this.e = 1;
                     var1 = this.f;
                  } else if (var1 != ' ' && var1 != '\t' && var1 != '\n' && var1 != '\r' && var1 != '/') {
                     this.c = (<undefinedtype>)(new Object(this.g) {
                        public StringBuffer a;
                        public StringBuffer b;
                        public int c;
                        public boolean d;
                        public boolean e;
                        public boolean f;

                        public {
                           this.a();
                        }

                        private void a() {
                           this.c = 0;
                           this.a = new StringBuffer();
                           this.b = new StringBuffer();
                           this.d = false;
                           this.e = false;
                           this.f = false;
                        }

                        public final void a(char var1) {
                           if (!this.f) {
                              if (var1 == '=') {
                                 this.f = true;
                                 return;
                              }

                              if (var1 != ' ' && var1 != '\t' && var1 != '\r') {
                                 if (var1 == '\n') {
                                    return;
                                 }

                                 this.a.append(var1);
                                 return;
                              }
                           } else {
                              if (!this.e && !this.d && this.b.length() < 1) {
                                 if (var1 == ' ' || var1 == '\t' || var1 == '\r') {
                                    return;
                                 }

                                 if (var1 == '\n') {
                                    return;
                                 }
                              }

                              if (var1 == '"' && !this.e) {
                                 this.d = !this.d;
                                 if (!this.d) {
                                    this.c = 1;
                                    return;
                                 }
                              } else if (var1 == '\'' && !this.d) {
                                 this.e = !this.e;
                                 if (!this.e) {
                                    this.c = 1;
                                    return;
                                 }
                              } else {
                                 this.b.append(var1);
                              }
                           }

                        }
                     });
                     this.c.a(var1);
                  }
               }

               this.f = var1;
            }

            public final String a() {
               String var1 = null;
               if (this.a.length() > 1 && this.a.charAt(0) == '/') {
                  var1 = this.a.toString().substring(1);
               } else if (this.a.length() > 0 && this.a.charAt(0) != '/') {
                  var1 = this.a.toString();
               }

               int var2;
               if (var1 != null && (var2 = var1.indexOf(58)) >= 0) {
                  var1 = var1.substring(var2 + 1);
               }

               return var1;
            }

            public final boolean b() {
               boolean var1 = false;
               if (this.a.length() > 0 && this.a.charAt(0) != '/') {
                  var1 = true;
               }

               return var1;
            }

            public final boolean c() {
               boolean var1 = false;
               if (this.a.length() > 1 && this.a.charAt(0) == '/') {
                  var1 = true;
               } else if (this.e == 1 && this.f == '/') {
                  var1 = true;
               }

               return var1;
            }
         });
         if (this.d.length() > 0 && this.a != null) {
            this.a.d(this.d.toString());
            this.d = new StringBuffer();
            return;
         }
      } else {
         this.c.a(var1);
         if (this.c.e == 2) {
            return;
         }

         if (this.c.e == 1) {
            if (this.c.a.length() >= 1 && this.a != null && this.c.a() != null) {
               if (this.c.b() && !this.c.a().equals("?xml")) {
                  this.a.a(this.c.a(), this.c.b);
               }

               if (this.c.c()) {
                  this.a.c(this.c.a());
               }
            }

            this.c = null;
         }
      }

   }

   public final void a(String var1) {
      for(int var2 = 0; var1 != null && var2 < var1.length(); ++var2) {
         this.a(var1.charAt(var2));
      }

      if (this.d.length() > 0 && this.a != null) {
         this.a.d(this.d.toString());
         this.d = new StringBuffer();
      }

   }
}
