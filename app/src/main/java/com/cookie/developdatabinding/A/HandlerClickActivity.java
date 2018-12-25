package com.cookie.developdatabinding.A;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityHandlerClickBinding;

public class HandlerClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_click);

        ActivityHandlerClickBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_handler_click);
        binding.setHandle(new MyHandler());
    }
}
