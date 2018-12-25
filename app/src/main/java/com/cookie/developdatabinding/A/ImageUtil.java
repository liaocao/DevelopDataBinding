package com.cookie.developdatabinding.A;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

public class ImageUtil {
    @BindingAdapter({"image"})//这里的image对应的是app:image？
    public static void imageLoader(ImageView imageView, String url) {
        ImageLoader.getInstance().displayImage(url, imageView);
    }
}
