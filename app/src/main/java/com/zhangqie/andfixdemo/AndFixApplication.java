package com.zhangqie.andfixdemo;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.IOException;

/**
 * Created by zhangqie on 2018/3/11.
 */

public class AndFixApplication extends Application {

    public static PatchManager mPatchManager;

    public String TAG = "Application";

    private static final String APATCH_PATH = "";

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化patch管理类
        mPatchManager = new PatchManager(this);
        // 初始化patch版本
        mPatchManager.init("1.0");

        mPatchManager.loadPatch();


        try {
            // .apatch file path ，这里一定要注意每台手机sd卡路径不同
            String patchFileString =  Environment.getExternalStorageDirectory().getAbsolutePath()  + APATCH_PATH;
            Log.i(TAG, "onCreate: "+patchFileString);
            //3）添加patch
            mPatchManager.addPatch(patchFileString);
            Log.d(TAG, "apatch:" + patchFileString + " added.");
        } catch (IOException e) {
            Log.e(TAG, "", e);
        }


    }
}
