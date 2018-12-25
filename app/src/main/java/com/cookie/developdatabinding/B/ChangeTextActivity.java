package com.cookie.developdatabinding.B;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityChangeTextBinding;

public class ChangeTextActivity extends AppCompatActivity {

    private ActivityChangeTextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_change_text);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_change_text);
    }

    @BindingAdapter("android:text")
    public static void setText(Button view, String text) {
        view.setText(text + "-Button");
    }
}
