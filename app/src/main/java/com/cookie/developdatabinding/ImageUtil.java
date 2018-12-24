package com.cookie.developdatabinding;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

public class ImageUtil {
    @BindingAdapter({"image"})
    public static void imageLoader(ImageView imageView, String url) {
        ImageLoader.getInstance().displayImage(url, imageView);
    }
}
