package com.example.recycleview_inside_nestedscrolview_6_injava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.recycleview_inside_nestedscrolview_6_injava.R;
import com.example.recycleview_inside_nestedscrolview_6_injava.adapter.CustomAdapter;
import com.example.recycleview_inside_nestedscrolview_6_injava.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private NestedScrollView nestedScrollView;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        List<Member> members = prepareMemberList();
        refreshAdapter(members);
    }

    private void initView() {
        nestedScrollView = findViewById(R.id.nestedScrolView);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }

    private void refreshAdapter(List<Member> members) {
        CustomAdapter adapter = new CustomAdapter(context,members);
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
    }

    private List<Member> prepareMemberList() {
        List<Member> members = new ArrayList<>();

        for (int i = 0; i < 30 ; i++) {
            if (i == 1 || i == 10) {
                members.add(new Member("Ilhombek" + i,"Ubaydullayev" + i));
            }else {
                members.add(new Member("Ilhombek" + i,"Ubaydullayev" + i));
            }
        }

        return members;
    }


}