package com.cookie.developdatabinding.B;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityDuplexingBinding;

public class DuplexingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duplexing);

        ActivityDuplexingBinding activityMain10Binding = DataBindingUtil.setContentView(this, R.layout.activity_duplexing);
        ObservableGoods goods = new ObservableGoods("code", "hi", 23);
        activityMain10Binding.setGoods(goods);
    }
}