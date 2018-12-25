package com.cookie.developdatabinding.B;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityObservableGoodsBinding;

import java.util.Random;

public class ObservableGoodsActivity extends AppCompatActivity {

    private ObservableGoods observableGoods;

    private ActivityObservableGoodsBinding observableGoodsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_observable_goods);

        observableGoodsBinding = DataBindingUtil.setContentView(this, R.layout.activity_observable_goods);
        observableGoods = new ObservableGoods("code", "hello", 25);
        observableGoodsBinding.setObservableGoods(observableGoods);
        observableGoodsBinding.setObservableGoodsHandler(new ObservableGoodsHandler());
    }

    public class ObservableGoodsHandler {

        public void changeGoodsName() {
            observableGoods.getName().set("code" + new Random().nextInt(100));
        }

        public void changeGoodsDetails() {
            observableGoods.getDetails().set("hi" + new Random().nextInt(100));
        }

    }
}
