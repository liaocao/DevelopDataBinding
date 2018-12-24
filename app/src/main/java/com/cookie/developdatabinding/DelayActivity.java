package com.cookie.developdatabinding;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cookie.developdatabinding.databinding.ActivityDelayBinding;

public class DelayActivity extends AppCompatActivity {

    private User user;
    private ActivityDelayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_delay);
        user = new User("Micheal", "Jack");
        binding.setUser(user);
        binding.setHandle(new MyHandler());
        delay();
    }
    /**
     * 两秒后改变firstName
     */
    private void delay() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                user.setFirstName("Com");
                binding.setUser(user);
            }
        }, 2000);
    }
}
