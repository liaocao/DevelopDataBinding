package com.cookie.developdatabinding.B;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableList;
import android.databinding.ObservableMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityCollectionBinding;

import java.util.Random;

public class CollectionActivity extends AppCompatActivity {

    private ObservableMap<String, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollectionBinding activityMain12Binding = DataBindingUtil.setContentView(this, R.layout.activity_collection);
        map = new ObservableArrayMap<>();
        map.put("name", "leavesC");
        map.put("age", "24");

        activityMain12Binding.setMap(map);
        ObservableList<String> list = new ObservableArrayList<>();
        list.add("Ye");
        list.add("leavesC");

        activityMain12Binding.setList(list);
        activityMain12Binding.setIndex(0);
        activityMain12Binding.setKey("name");
    }

    public void onClick(View view) {
        map.put("name", "leavesC,hi" + new Random().nextInt(100));
    }//当其包含的数据发生变化时，绑定的视图也会随之进行刷新
}
