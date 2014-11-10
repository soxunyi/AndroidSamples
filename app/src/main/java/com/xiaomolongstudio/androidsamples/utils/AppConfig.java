package com.xiaomolongstudio.androidsamples.utils;

import android.os.Environment;

import com.xiaomolongstudio.androidsamples.photograph.PhotographActivity;
import com.xiaomolongstudio.androidsamples.topnews.TopNewsActivity;

/**
 * Created by wxl on 2014/11/4.
 */
public class AppConfig {
    public static Class[] mActivities = new Class[]{PhotographActivity.class, TopNewsActivity.class, TopNewsActivity.class
    };
    public static String[] mActivityName = {"Photograph"
    };
    public static int PHOTOGRAPH = 1;
    public static int PHOTO_CUTTING = 2;
    public static int REQUEST_CODE_USER_ALBUM = 3;// 验证码登录
    public static int BTN_PHOTOGRAPH = 4;// 验证码登录
    public static String SAVED_IMAGE_DIR_PATH = Environment
            .getExternalStorageDirectory().getPath() + "/AndroidSamples/camera/";// 拍照路径
}
