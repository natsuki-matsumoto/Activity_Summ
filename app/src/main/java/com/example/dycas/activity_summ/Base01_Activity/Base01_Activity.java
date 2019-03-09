package com.example.dycas.activity_summ.Base01_Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dycas.activity_summ.R;
import com.example.dycas.baseproject.ActivityClassSummary;

import Util.LogUtil;

/**
 * 基底クラスとするActivity
 */
public class Base01_Activity extends AppCompatActivity implements ActivityClassSummary {
    /** title */
    static final String ACTIVITY_TITLE = "Activity 基底クラス.";

    /** 概要 */
    static final String ACTIVITY_OUTLINE = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogUtil.methodCall();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base01);
    }

    @Override
    protected void onStart() {
        LogUtil.methodCall();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        LogUtil.methodCall();
        super.onRestart();
    }

    @Override
    protected void onResume() {
        LogUtil.methodCall();
        super.onResume();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        LogUtil.methodCall();
        super.onWindowFocusChanged(hasFocus);
    }

    @Override
    protected void onPause() {
        LogUtil.methodCall();
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        LogUtil.methodCall();
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        LogUtil.methodCall();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        LogUtil.methodCall();
        super.onDestroy();
    }

    @Override
    public String getActivityTitle() {
        return ACTIVITY_TITLE;
    }

    @Override
    public String getActivityOutLine() {
        return ACTIVITY_OUTLINE;
    }
}
