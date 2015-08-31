package com.moziqi.app.project;

/**
 * Created by moziqi on 15-8-31.
 */
public class NdkJniUtils {
    static {
        System.loadLibrary("moJniLibName");	//defaultConfig.ndk.moduleName
    }
    public native String getCLanguageString();
}
