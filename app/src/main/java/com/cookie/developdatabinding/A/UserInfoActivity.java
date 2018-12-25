package com.cookie.developdatabinding.A;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityUserInfoBinding;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityUserInfoBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_user_info);

        User2 mUser2 = new User2();
        binding.setUser2(mUser2);
        mUser2.firstName.set("Mr");
        mUser2.lastName.set("Bean");
        mUser2.age.set(20);
        mUser2.isStudent.set(false);
    }
}
