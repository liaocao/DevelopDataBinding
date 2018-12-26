package com.cookie.developdatabinding.C;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.cookie.developdatabinding.R;
import com.cookie.developdatabinding.databinding.ActivitySingleListBinding;

import java.util.ArrayList;
import java.util.List;

public class SingleListActivity extends AppCompatActivity {

    //要展示的数据源
    public final ObservableArrayList<Student> showDatas = new ObservableArrayList<>();
    //对应的是android.databinding.ObservableList
    {
        List<Student> students =  new ArrayList<>();
        //初始化数据源
        for (int i = 0; i < 20; i++) {
            students.add(new Student("学生:" + i));
        }
        showDatas.addAll(students);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //完成数据和布局的绑定
        ActivitySingleListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_single_list);
        binding.setActivity(this);
    }

    public void onBindItem(ViewDataBinding binding, Object data, int position) {
        binding.getRoot().setOnClickListener(v -> Toast.makeText(this, data.toString(), Toast.LENGTH_SHORT).show());
    }

    //数据的实体类
    public class Student {
        public String name;
        public Student(String name) {
            this.name = name;
        }
    }
}
