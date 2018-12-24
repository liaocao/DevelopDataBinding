package com.cookie.developdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cookie.developdatabinding.databinding.ActivityImageBinding;
import com.cookie.developdatabinding.databinding.ActivityMainBinding;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityImageBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_image);
        binding.setImageUrl("https://raw.githubusercontent.com/liaocao/2048/master/res/drawable-xxhdpi/1.jpg");
    }
}
//https://raw.githubusercontent.com/liaocao/2048/master/res/drawable-xxhdpi/1.jpg