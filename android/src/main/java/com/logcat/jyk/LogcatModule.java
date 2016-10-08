package com.logcat.jyk;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;

import javax.annotation.Nullable;

/**
 * Created by Kun on 16/9/13.
 */
public class LogcatModule extends ReactContextBaseJavaModule {
    public LogcatModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Logcat";
    }

    @ReactMethod
    public void log(String level,String TAG,String value){
        switch (level){
            case "w":
                Log.w(TAG,value);
                break;
            case "d":
                Log.d(TAG,value);
                break;
            case "i":
                Log.i(TAG,value);
                break;
            case "e":
                Log.e(TAG,value);
                break;
            default:
                Log.v(TAG,value);
                break;
        }
    }
}
