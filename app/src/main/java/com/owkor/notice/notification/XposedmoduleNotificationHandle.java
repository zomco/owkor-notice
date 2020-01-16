package com.owkor.notice.notification;
import android.app.Notification;

import com.owkor.notice.IDoPost;
import com.owkor.notice.notification.NotificationHandle;

import java.util.Map;
import java.util.HashMap;


public class XposedmoduleNotificationHandle extends NotificationHandle {
        public XposedmoduleNotificationHandle(String pkgtype, Notification notification, IDoPost postpush){
                super(pkgtype,notification,postpush);
        }

        public void handleNotification(){
                if(content.contains("微信支付")&&content.contains("收款")){
                        Map<String,String> postmap=new HashMap<String,String>();
                                postmap.put("type","wechat");
                                postmap.put("time",notitime);
                                postmap.put("title","微信支付");
                                postmap.put("money",extractMoney(content));
                                postmap.put("content",content);
                                postpush.doPost(postmap);
                                return ;
                }




        }













}
