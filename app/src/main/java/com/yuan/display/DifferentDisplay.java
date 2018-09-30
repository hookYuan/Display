package com.yuan.display;

import android.app.Presentation;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;

/**
 * Created by YuanYe on 2018/8/22.
 * 异显屏幕画面，如果需要与Activity显示效果分离，可以将
 * DifferentDisplay的启动放到Service中实现
 */
public class DifferentDisplay extends Presentation {

    public DifferentDisplay(Context outerContext, Display display) {
        super(outerContext, display);
    }

    public DifferentDisplay(Context outerContext, Display display, int theme) {
        super(outerContext, display, theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_layout);
    }
}
