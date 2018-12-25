package com.cookie.developdatabinding.B;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Toast;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivityAfterTextChangedBinding;

public class AfterTextChangedActivity extends AppCompatActivity {

    private ActivityAfterTextChangedBinding activityMain5Binding;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain5Binding = DataBindingUtil.setContentView(this, R.layout.activity_after_text_changed);
        user = new User("leavesC", "12345");
        activityMain5Binding.setUserInfo(user);
        activityMain5Binding.setUserPresenter(new UserPresenter());
    }

    public class UserPresenter {

        public void onUserNameClick(User user) {
            Toast.makeText(AfterTextChangedActivity.this, "用户名：" + user.getName(), Toast.LENGTH_SHORT).show();
        }

        public void afterTextChanged(Editable s) {
            user.setName(s.toString());
            activityMain5Binding.setUserInfo(user);
        }

        public void afterUserPasswordChanged(Editable s) {
            user.setPassword(s.toString());
            activityMain5Binding.setUserInfo(user);
        }

    }

}
