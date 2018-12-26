package com.cookie.developdatabinding;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.cookie.developdatabinding.A.DelayActivity;
import com.cookie.developdatabinding.A.HandlerClickActivity;
import com.cookie.developdatabinding.A.ImageViewActivity;
import com.cookie.developdatabinding.A.ObservableArrayMapActivity;
import com.cookie.developdatabinding.A.OnClickActivity;
import com.cookie.developdatabinding.A.RecyclerViewActivity;
import com.cookie.developdatabinding.A.TextViewActivity;
import com.cookie.developdatabinding.A.UserInfoActivity;
import com.cookie.developdatabinding.B.AfterTextChangedActivity;
import com.cookie.developdatabinding.B.AllCollectionActivity;
import com.cookie.developdatabinding.B.ChangeTextActivity;
import com.cookie.developdatabinding.B.CollectionActivity;
import com.cookie.developdatabinding.B.DuplexingActivity;
import com.cookie.developdatabinding.B.GoodsActivity;
import com.cookie.developdatabinding.B.LoadImageActivity;
import com.cookie.developdatabinding.B.ObservableGoodsActivity;
import com.cookie.developdatabinding.C.SingleListActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new SimpleAdapter(this, getData(), android.R.layout.simple_list_item_1, new String[] {"title"}, new int[] {android.R.id.text1}));
    }

    protected List<Map<String, Object>> getData(){
        List<Map<String, Object>> myData = new ArrayList<Map<String, Object>>();
        addItem(myData, "TextViewActivity", new Intent(this, TextViewActivity.class));
        addItem(myData, "ImageViewActivity", new Intent(this, ImageViewActivity.class));
        addItem(myData, "OnClickActivity", new Intent(this, OnClickActivity.class));
        addItem(myData, "HandlerClickActivity", new Intent(this, HandlerClickActivity.class));
        addItem(myData, "DelayActivity", new Intent(this, DelayActivity.class));
        addItem(myData, "UserInfoActivity", new Intent(this, UserInfoActivity.class));
        addItem(myData, "ObservableArrayMapActivity", new Intent(this, ObservableArrayMapActivity.class));
        addItem(myData, "RecyclerViewActivity", new Intent(this, RecyclerViewActivity.class));
        addItem(myData, "========>【Android】DataBinding库（MVVM设计模式）<========", null);
        addItem(myData, "GoodsActivity", new Intent(this, GoodsActivity.class));
        addItem(myData, "ObservableGoodsActivity", new Intent(this, ObservableGoodsActivity.class));
        addItem(myData, "CollectionActivity", new Intent(this, CollectionActivity.class));
        addItem(myData, "DuplexingActivity", new Intent(this, DuplexingActivity.class));//大赞，完全做到了数据绑定
        addItem(myData, "AfterTextChangedActivity", new Intent(this, AfterTextChangedActivity.class));
        addItem(myData, "LoadImageActivity", new Intent(this, LoadImageActivity.class));
        addItem(myData, "ChangeTextActivity", new Intent(this, ChangeTextActivity.class));
        addItem(myData, "AllCollectionActivity", new Intent(this, AllCollectionActivity.class));
        addItem(myData, "SingleListActivity", new Intent(this, SingleListActivity.class));
        return myData;
    }

    private void addItem(List<Map<String, Object>> data, String title, Intent intent){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", title);
        map.put("intent", intent);

        data.add(map);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        Map<String, Object> map = (Map<String, Object>) l.getItemAtPosition(position);

        Intent i = (Intent) map.get("intent");
        if(i != null)
            startActivity(i);
    }
}