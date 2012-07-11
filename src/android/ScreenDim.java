package com.phonegap.build.screendim;

import org.json.JSONArray;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.apache.cordova.api.LOG;

import android.app.Activity;
import android.view.WindowManager;
import android.view.Window;

public class ScreenDim extends Plugin {
    public PluginResult execute(String action, JSONArray args, String callbackId) {
        if (action.equals("enable")) {
            enable();
        } else if (action.equals("disable")) {
            disable();
        }

        return new PluginResult(PluginResult.Status.OK);
    }

    public void enable() {
        LOG.d("CordovaLog", "Enable called");   
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    public void disable() {
        LOG.d("CordovaLog", "Disable called");   
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    protected Window getWindow() {
        Activity ctxActivity = (Activity) ctx.getContext();
        return ctxActivity.getWindow();
    }
}
