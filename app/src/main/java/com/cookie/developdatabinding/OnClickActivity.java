package com.cookie.developdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cookie.developdatabinding.databinding.ActivityOnClickBinding;

public class OnClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityOnClickBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_on_click);
        binding.setOnClickActivity(this);
    }

    public void onClick(View view) {
        Toast.makeText(this,"点击事件", Toast.LENGTH_LONG).show();
    }
}
