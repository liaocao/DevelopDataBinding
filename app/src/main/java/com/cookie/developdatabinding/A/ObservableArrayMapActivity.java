package com.cookie.developdatabinding.A;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityObservableArrayMapBinding;

public class ObservableArrayMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_observable_array_map);
        ActivityObservableArrayMapBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable_array_map);
        ObservableArrayMap<String, Object> user = new ObservableArrayMap<>();
        user.put("firstName", "Google");
        user.put("lastName", "Inc.");
        user.put("age", 17);

        binding.setUser(user);
    }
}
