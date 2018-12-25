package com.cookie.developdatabinding.B;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityAllCollectionBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AllCollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_collection);

        ActivityAllCollectionBinding activityMain7Binding = DataBindingUtil.setContentView(this, R.layout.activity_all_collection);
        activityMain7Binding.setList(new ArrayList<String>());
        Map<String, String> map = new HashMap<>();
        map.put("leavesC", "Hi");
        activityMain7Binding.setMap(map);
        activityMain7Binding.setKey("leavesC");
        Set<String> set = new HashSet<>();
        set.add("xxx");
        activityMain7Binding.setSet(set);
        activityMain7Binding.setArray(new String[]{"Hi", "hello"});
    }
}
