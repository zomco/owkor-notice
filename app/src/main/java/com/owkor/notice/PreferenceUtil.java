package com.owkor.notice;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferenceUtil {
    SharedPreferences sharedPref = null;
    Context context = null;

    public PreferenceUtil(Context context) {
        this.context = context;
        init();
    }

    public void init() {
        sharedPref = PreferenceManager.getDefaultSharedPreferences(this.context);

    }

    public String getDeviceid() {
        return this.sharedPref.getString("deviceid", "");
    }

    public boolean isEncrypt() {
        return this.sharedPref.getBoolean("isencrypt", false);
    }

    public boolean isEcho() {
        return this.sharedPref.getBoolean("isecho", false);
    }

    public boolean isWakelock() {
        return this.sharedPref.getBoolean("iswakelock", false);
    }

    public boolean isAppendDeviceiduuid() {
        return this.sharedPref.getBoolean("isappenddeviceiduuid", false);
    }

    public boolean isSkipEncryptDeviceid() {
        return this.sharedPref.getBoolean("isskipencryptdeviceid", false);
    }

    public boolean isTrustAllCertificates() {
        return this.sharedPref.getBoolean("istrustallcertificates", false);
    }

    public String getEchoServer() {
        return this.sharedPref.getString("echoserver", null);
    }

    public String getEchoInterval() {
        return this.sharedPref.getString("echointerval", "");
    }

    public String getEncryptMethod() {
        return this.sharedPref.getString("encryptmethod", null);
    }

    public String getPasswd() {
        return this.sharedPref.getString("passwd", null);
    }

    public boolean isRemoveNotification() {
        return this.sharedPref.getBoolean("isremovenotification", false);
    }

    public boolean isPostRepeat() {
        return this.sharedPref.getBoolean("ispostrepeat", false);
    }

    public String getPostRepeatNum() {
        return this.sharedPref.getString("postrepeatnum", "3");
    }

    public String getCustomOption() {
        return this.sharedPref.getString("custom_option", "");
    }
    public String getEchoCustomOption() {
        return this.sharedPref.getString("echo_custom_option", "");
    }

}
