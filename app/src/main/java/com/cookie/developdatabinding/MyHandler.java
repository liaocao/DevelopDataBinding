package com.cookie.developdatabinding;

import android.view.View;
import android.widget.Toast;

public class MyHandler {
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "点击事件", Toast.LENGTH_LONG).show();
    }
}
