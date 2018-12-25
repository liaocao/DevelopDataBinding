package com.cookie.developdatabinding.B;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityGoodsBinding;
import com.cookie.developdatabinding.BR;

import java.util.Random;

public class GoodsActivity extends AppCompatActivity {

    private static final String TAG = "GoodsActivity";
    
    private Goods goods;
    private ActivityGoodsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_goods);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_goods);
        goods = new Goods("code", "hi", 24);
        binding.setGoods(goods);
        binding.setGoodsHandler(new GoodsHandler());

        goods.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            //注册一个监听器，当可观察对象的属性更改时就会通知这个监听器，感觉这个更像是观察哪个方法被调用了，而不是每次输出具体的属性
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (propertyId == BR.name) {
                    Log.e(TAG, "BR.name");
                } else if (propertyId == BR.details) {
                    Log.e(TAG, "BR.details");
                } else if (propertyId == BR._all) {
                    Log.e(TAG, "BR._all");
                } else {
                    Log.e(TAG, "未知");
                }
            }
        });
    }

    public class GoodsHandler {

        public void changeGoodsName() {
            goods.setName("code" + new Random().nextInt(100));
            goods.setPrice(new Random().nextInt(100));//由于setName里只是针对name更新，所以这个Price没反应（ notifyPropertyChanged(BR.name);）
        }

        public void changeGoodsDetails() {
            goods.setDetails("hi" + new Random().nextInt(100));//setDetail里面是notifyChange();当数据有变化的时候，就会改变
            goods.setPrice(new Random().nextInt(100));
        }

    }
}
