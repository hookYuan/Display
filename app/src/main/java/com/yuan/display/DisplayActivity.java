package com.yuan.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Toast;

/**
 * 要实现双屏异显需要有两块屏幕，并且他们分别与Android系统直连。
 * 或者在手机等设备上实现主屏幕，把无线连接支持DLNA（华为手机多屏互动，此功能可以
 * 免驱和windows10,android等设备连接）的设备作为第二块屏幕
 */
public class DisplayActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        DisplayManager displayManager = (DisplayManager) this.getSystemService(Context.DISPLAY_SERVICE);
        //获取屏幕数量
        Display[] presentationDisplays = displayManager.getDisplays();
        DifferentDisplay presentation;
        if (presentationDisplays.length > 1) {
            presentation = new DifferentDisplay(this, presentationDisplays[1]);
        } else {
            presentation = new DifferentDisplay(this, presentationDisplays[0]);
        }
        presentation.show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "点击事件成功", Toast.LENGTH_SHORT).show();
    }
}
