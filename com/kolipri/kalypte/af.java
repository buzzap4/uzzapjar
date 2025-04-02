package com.kolipri.kalypte;

public class af extends com.kolipri.kt.l implements com.kolipri.kt.b, com.kolipri.kimp.j, dl {
   public String a = null;
   public String b = null;
   public com.kolipri.kpr.f c = new com.kolipri.kpr.f();
   public com.kolipri.kpr.f e = new com.kolipri.kpr.f();
   protected com.kolipri.kt.aq f = null;
   protected com.kolipri.kpr.i g = new com.kolipri.kpr.i();
   protected com.kolipri.kt.a h = null;
   private boolean j = false;
   public boolean i = false;

   public af(com.kolipri.kt.r var1) {
      super(var1);
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
   }

   public final void f() {
      super.f();
      ((Kalypte)super.b_).j.b(this);
      if (((Kalypte)super.b_).i != null && this.a != null && this.a.length() > 0) {
         ((Kalypte)super.b_).i.a(com.kolipri.kimp.u.a(this.a));
      }

   }

   public final void a() {
      super.a();
      this.f = new com.kolipri.kt.aq(super.b_);
      this.f.a();
      this.f.b(1);
      this.f.b(true);
      this.d(this.f);
   }

   public void a(com.kolipri.kt.x var1) {
      var1.a("Options", "Buddies");
   }

   public void b(String var1) {
      if (var1 != null && var1.equals("Options")) {
         com.kolipri.kt.ae var4 = new com.kolipri.kt.ae(super.b_, "chat-room-actions");
         if (this.j) {
            var4.a(10, (com.kolipri.kt.ai)null, "Send Message");
            if (this.e.b() > 0) {
               var4.a(12, (com.kolipri.kt.ai)null, "Send Whisper");
            }

            var4.a(13, (com.kolipri.kt.ai)null, "List Participants");
            var4.a(15, (com.kolipri.kt.ai)null, "Invite Participants");
         }

         var4.a(20, (com.kolipri.kt.ai)null, "Leave Chatroom");
         var4.a(this);
         com.kolipri.kt.g var3;
         (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var4);
         var3.a(super.b_.c());
      } else {
         bu var2;
         if (var1 != null && var1.equals("Buddies") && (var2 = bu.f(this)) != null) {
            var2.H();
         }

      }
   }

   public boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("chat-room-actions")) {
         switch(var2) {
         case 10:
            this.g();
         case 11:
         case 14:
         case 16:
         case 17:
         case 18:
         case 19:
         default:
            break;
         case 12:
            if (this.e.b() > 0) {
               p var7;
               (var7 = new p(super.b_, this.e, this.a, this.b)).a(this);
               var7.c();
            }
            break;
         case 13:
            String var6 = "- No of Chatters: ";
            var6 = var6 + (this.e.b() + 1);

            for(int var4 = 0; var4 < this.e.b(); ++var4) {
               com.kolipri.kimp.p var5;
               if ((var5 = (com.kolipri.kimp.p)this.e.b(var4)) != null && var5.a("username") != null) {
                  var6 = var6 + "\n- ";
                  var6 = var6 + var5.a("username");
               }
            }

            var6 = var6 + "\n- " + this.b + "\n";
            this.d(var6);
            break;
         case 15:
            cf var3;
            (var3 = new cf(super.b_)).a((com.kolipri.kpr.f)((Kalypte)super.b_).k.c("username"), (String)null);
            var3.a((dl)this);
            var3.a(super.b_.c());
            break;
         case 20:
            this.D();
         }
      }

      return true;
   }

   public final boolean a(com.kolipri.kt.al var1) {
      boolean var2 = false;
      if (var1.b == 5 || var1.b < 1 || var1.b > 7) {
         this.g();
         var2 = true;
      }

      if (!var2) {
         var2 = super.a(var1);
      }

      return var2;
   }

   public String E() {
      return "Chat - " + this.a;
   }

   public final void a(com.kolipri.kimp.m var1) {
      com.kolipri.kimp.q var2;
      if (var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null && (var2 = ((com.kolipri.kimp.d)var1).a).a("iq.amaz-protocol") != null && var2.a("iq.amaz-protocol").equals("chat")) {
         this.a(var2);
      }

   }

   public final void a(com.kolipri.kimp.q var1) {
      if (var1.a("iq/chatuser") != null && var1.a("iq.type") != null && var1.a("iq.type").equals("error") && var1.a("iq/chatuser.nick") != null && var1.a("iq/chatuser.nick").equals(com.kolipri.kpr.i.a(this.b)) && var1.a("iq/chatuser.room") != null && var1.a("iq/chatuser.room").equals(this.a)) {
         this.d("- Failed to join the chatroom (chat service not available)\n");
      } else if (var1.a("iq/msg") != null && var1.a("iq/error") != null) {
         this.d("- Failed to send message\n");
      } else {
         if (var1.a("iq/error") != null) {
            String var8;
            if ((var8 = var1.a("iq/error.amaz-error")) != null) {
               this.D();
            }

            if (var8 != null && var8.equals("room-full")) {
               this.h("* Room Is Full\n\nThis room is already full, please try later or try another room.");
            } else if (var8 != null && var8.equals("join-failed")) {
               this.h("* Join Failed\n\nThis room does not exist in the server..");
            } else if (var8 != null && var8.equals("not-authorized")) {
               this.h("* Access Denied\n\nYou are not allowed in this chatroom.");
            } else if (var8 != null && var8.equals("duplicate-nick")) {
               this.h("* Duplicate Nickname\n\nSomebody is already using this nickname.");
            } else if (var8 != null && var8.equals("duplicate-jid")) {
               this.h("* Application Error\n\nDuplicate JID.");
            } else if (var8 != null && var8.equals("duplicate-room")) {
               this.h("* Duplicate Room\n\nRoom Unavailable.");
            } else if (var8 != null && var8.equals("ug-not-available")) {
               this.h("* Service Unavailable\n\nUser generated room service is currently not available.");
            } else if (var8 != null && var8.equals("max-ug-rooms")) {
               this.h("* Error\n\nUser limit exceeded.");
            } else if (var8 != null && var8.equals("max-sys-ug-rooms")) {
               this.h("* Error\n\nService limit exceeded.");
            } else if (var8 != null && var8.equals("name-len-error-short")) {
               this.h("* Name Error\n\nRoom name is too short, it should be at least 6 characters long.");
            } else if (var8 != null && var8.equals("name-len-error-long")) {
               this.h("* Name Error\n\nRoom name is too long, it should not exceed 30 characters.");
            } else if (var8 != null && var8.equals("ug-not-available")) {
               this.h("* Service Unavailable\n\nUser generated room service is currently not available.");
            } else {
               if (var8 == null || !var8.equals("no-rooms-found")) {
                  if (var1.a("iq/error") != null && var1.a("iq/error").length() > 0) {
                     this.h(var1.a("iq/error"));
                  }

                  return;
               }

               this.h("* Error\n\nNo rooms found.");
            }
         } else {
            StringBuffer var2;
            String var3;
            String var5;
            String var6;
            String var9;
            if (var1.a("iq/msg") != null && var1.a("iq/msg.room") != null && var1.a("iq/msg.room").equals(this.a) && var1.a("iq/msg.type") != null && var1.a("iq/msg.type").equals("privatechat")) {
               var2 = new StringBuffer();
               var3 = com.kolipri.kpr.d.b(-1L);
               var2.append("* ");
               var2.append(com.kolipri.kpr.i.a(var1.a("iq/msg.from")));
               var2.append(" (Whisper ");
               var2.append(var3);
               var2.append("):\n");
               if (var1.a("iq/msg") != null && var1.a("iq/msg").length() > 0) {
                  var9 = com.kolipri.kpr.i.a(var1.a("iq/msg"));
                  var5 = "- Whispers:\n";
                  var6 = "\n- To: ";
                  if (var9.indexOf(var5) != -1) {
                     var9 = var9.substring(var5.length(), var9.length());
                  }

                  int var10;
                  if ((var10 = var9.indexOf(var6)) != -1) {
                     var9 = var9.substring(0, var10);
                  }

                  var2.append(var9 == null ? "" : var9);
                  var2.append("\n");
                  if (var1.a("iq/msg.recipient") != null) {
                     var2.append("- To: " + com.kolipri.kpr.i.a(var1.a("iq/msg.recipient")));
                     var2.append("\n");
                  }
               }

               this.d(var2.toString());
               if (!var1.a("iq/msg.from").equals(this.b)) {
                  ((Kalypte)super.b_).n.c();
                  super.b_.g();
               }

               return;
            }

            if (var1.a("iq/msg") != null && var1.a("iq/msg.room") != null && var1.a("iq/msg.room").equals(this.a)) {
               var2 = new StringBuffer();
               com.kolipri.kpr.d.b(-1L);
               var3 = null;
               var2.append("* ");
               var2.append(com.kolipri.kpr.i.a(var1.a("iq/msg.from")));
               var2.append(":\n");
               if (var1.a("iq/msg") != null && var1.a("iq/msg").length() > 0) {
                  var2.append(com.kolipri.kpr.i.a(var1.a("iq/msg")));
                  var2.append("\n");
               }

               this.d(var2.toString());
               if (!var1.a("iq/msg.from").equals(this.b)) {
                  if ((var9 = ((Kalypte)this.t()).h.a("chatroom.alert")) == null ? true : var9.equals("yes")) {
                     ((Kalypte)super.b_).n.c();
                  }

                  super.b_.g();
               }

               return;
            }

            if (var1.a("iq/chatuser.room") != null && var1.a("iq/chatuser.room").equals(this.a) && var1.a("iq/chatuser.nick") != null) {
               this.j = true;
               var2 = new StringBuffer();
               var3 = com.kolipri.kpr.d.b(-1L);

               for(int var4 = 0; var4 < var1.b(); ++var4) {
                  var5 = var1.a(var4);
                  String var7 = var1.b(var4);
                  if (var5 != null && var7 != null && var5.equals("iq/chatuser.nick")) {
                     var6 = com.kolipri.kpr.i.a(var7);
                     if (var1.a("iq/chatuser.type") != null && var1.a("iq/chatuser.type").equals("unavailable")) {
                        var2.append("* ");
                        var2.append(var6);
                        var2.append("\n");
                        var2.append("leaves the chat");
                        var2.append(" (");
                        var2.append(var3);
                        var2.append(")\n");
                        this.c(var6);
                     } else if (var1.a("iq/chatuser.initial") != null && var1.a("iq/chatuser.initial").equals("yes")) {
                        var2.append("- ");
                        var2.append(var6);
                        var2.append("\n");
                        this.a(var6);
                     } else {
                        if (!var1.a("iq/chatuser.nick").equals(this.b)) {
                           var2.append("* ");
                           var2.append(var6);
                           var2.append("\n");
                           var2.append("joins the chat");
                           var2.append(" (");
                           var2.append(var3);
                           var2.append(")\n");
                        }

                        if (var1.a("iq/chatuser.role") != null && !var1.a("iq/chatuser.role").equals("moderator")) {
                           this.a(var6);
                        }
                     }

                     if (var1.a("iq/chatuser.nick").equals(this.b)) {
                        this.a(this.c, "");
                     }
                  }
               }

               if (this.i && var1.a("iq.type").equals("result") && var1.a("iq/chatuser.nick").equals(com.kolipri.kpr.i.a(this.b)) && var1.a("iq/chatuser.room").equals(this.a)) {
                  this.h("* Success!\n\nTo get started, choose Options and invite buddies from your buddy list to join you.");
               }

               this.d(var2.toString());
            }
         }

      }
   }

   public final void a(String var1) {
      boolean var2 = false;
      if (!var1.equals(this.b)) {
         com.kolipri.kimp.p var3 = null;

         for(int var4 = 0; var1 != null && this.e != null && var4 <= this.e.b(); ++var4) {
            if ((var3 = (com.kolipri.kimp.p)this.e.b(var4)) != null && var3.a("username").toString().toLowerCase().compareTo(var1.toLowerCase()) > 0) {
               com.kolipri.kimp.p var6;
               (var6 = new com.kolipri.kimp.p()).b("username", var1);
               this.e.a(var4, var6);
               var2 = true;
               break;
            }
         }

         if (!var2) {
            com.kolipri.kimp.p var7;
            (var7 = new com.kolipri.kimp.p()).b("username", var1);
            this.e.a(var7);
         }
      }

   }

   public final void c(String var1) {
      com.kolipri.kimp.p var3 = null;

      for(int var4 = 0; var1 != null && this.e != null && var4 <= this.e.b(); ++var4) {
         if ((var3 = (com.kolipri.kimp.p)this.e.b(var4)) != null && var3.a("username") != null && var1.equals(var3.a("username"))) {
            this.e.c(var3);
            return;
         }
      }

   }

   public final void z() {
      super.z();
      if (this.f != null) {
         this.f.b();
         this.w();
      }

      if (this.b == null || this.b.length() < 1) {
         com.kolipri.kt.ad var1;
         (var1 = new com.kolipri.kt.ad(this, super.b_, this) {
            protected af a;
            private final af l;

            public {
               this.l = var1;
               this.a = var3;
            }

            public final void a() {
               super.a();
               this.b("Enter your nickname");
               this.b(12);
               if (((Kalypte)super.b).h.a(((Kalypte)super.b).i.c() + ".chat_alias") != null) {
                  this.c(((Kalypte)super.b).h.a(((Kalypte)super.b).i.c() + ".chat_alias"));
               } else {
                  if (((Kalypte)super.b).i != null) {
                     this.c(((Kalypte)super.b).i.c());
                  }

               }
            }

            public final void a(String var1) {
               if (this.a != null) {
                  ((Kalypte)super.b).h.b(((Kalypte)super.b).i.c() + ".chat_alias", var1);
                  ((Kalypte)super.b).h.c();
                  if (this.a.i) {
                     this.l.b = var1;
                     this.l.e();
                     return;
                  }

                  this.a.g(var1);
               }

            }

            public final void c() {
               if (this.a != null) {
                  this.a.D();
               }

            }
         }).a();
         var1.b();
      }

   }

   public final void d(String var1) {
      if (this.f != null) {
         this.f.a(var1);
         this.f.b();
         this.w();
      }

   }

   public final void d() {
      if (((Kalypte)super.b_).i != null && this.a != null && this.a.length() > 0 && this.b != null && this.b.length() > 0) {
         ((Kalypte)super.b_).i.a(com.kolipri.kimp.u.a(this.a, this.a, com.kolipri.kpr.i.b(this.b)));
         this.d("- Creating private conference room..\n");
      }

   }

   public final void e() {
      if (((Kalypte)super.b_).i != null && this.a != null && this.a.length() > 0 && this.b != null && this.b.length() > 0) {
         ((Kalypte)super.b_).i.a(com.kolipri.kimp.u.b(this.a, com.kolipri.kpr.i.b(this.b)));
         this.d("- Your room is being created, please wait...\n");
      }

   }

   public final void g(String var1) {
      if (var1 != null && var1.length() > 0) {
         this.b = var1;
         if (((Kalypte)super.b_).i != null) {
            ((Kalypte)super.b_).i.a(com.kolipri.kimp.u.a(this.a, com.kolipri.kpr.i.b(this.b)));
            this.d("- Joining room as '" + this.b + "'..\n");
            return;
         }

         this.d("- Server connection has been lost\n");
      }

   }

   public final void g() {
      (new bl(super.b_, this.a, "chatroom")).d();
   }

   public final void a(com.kolipri.kpr.f var1, String var2) {
      if (((Kalypte)super.b_).i != null) {
         for(int var3 = 0; var1 != null && var3 < var1.b(); ++var3) {
            com.kolipri.kimp.p var4;
            if ((var4 = (com.kolipri.kimp.p)var1.b(var3)) != null && var4.a("username") != null) {
               ((Kalypte)super.b_).i.a(com.kolipri.kimp.u.b(this.a, var4.a("username"), var2));
               this.d("Invited user '" + var4.a("username") + "'.\n");
            }
         }

      }
   }

   public final void h(String var1) {
      this.h = new com.kolipri.kt.a(super.b_);
      this.h.a();
      this.h.a(var1);
      this.h.a(super.b_.c());
   }

   public final void a(com.kolipri.kpr.f var1) {
      this.a(var1, "");
   }

   public final void e_() {
   }
}
