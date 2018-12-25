package com.cookie.developdatabinding.B;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityLoadImageBinding;

import java.util.Random;

public class LoadImageActivity extends AppCompatActivity {

    private static final String TAG = "LoadImageActivity";
    private ActivityLoadImageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_load_image);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_load_image);
        binding.setImage(new Image("https://raw.githubusercontent.com/liaocao/2048/master/res/drawable-xxhdpi/1.jpg"));
        binding.setHandler(new Handler());
    }

    @BindingAdapter("android:text")
    public static void setText(Button view, String text) {
        view.setText(text + "-Button");
    }

    public class Handler {
        public void onClick(Image image) {
            image.getUrl().set("xxxxx" + new Random().nextInt(1000));
        }
    }

    @BindingAdapter({"url"})//这里的url对应的到底是什么值，对应的是Image里的url元素么
    public static void loadImage(ImageView view, String url) {
        Log.e(TAG, "loadImage url : " + url);
    }

    @BindingConversion
    public static Drawable convertStringToDrawable(String str) {
        if (str.equals("红色")) {
            return new ColorDrawable(Color.parseColor("#FF4081"));
        }
        if (str.equals("蓝色")) {
            return new ColorDrawable(Color.parseColor("#3F51B5"));
        }
        return new ColorDrawable(Color.parseColor("#344567"));
    }

    @BindingConversion
    public static int convertStringToColor(String str) {
        if (str.equals("红色")) {
            return Color.parseColor("#FF4081");
        }
        if (str.equals("蓝色")) {
            return Color.parseColor("#3F51B5");
        }
        return Color.parseColor("#344567");
    }

}