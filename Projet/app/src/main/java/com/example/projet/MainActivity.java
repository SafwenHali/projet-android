package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        FirebaseRecyclerOptions<CategoryModel> options = new FirebaseRecyclerOptions.Builder<CategoryModel>()
                .setQuery(FirebaseDatabase.getInstance().getReference().child("cars"), CategoryModel.class)
                .build();
        CategoryAdapter adapter = new CategoryAdapter(options);
        recyclerView.setAdapter(adapter);*/

        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Item> itemList = generateItemList(); // Define your dataset here
        ItemAdapter itemAdapter = new ItemAdapter(itemList);

        recyclerView.setAdapter(itemAdapter);
    }

    private List<Item> generateItemList() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Toyota"));
        itemList.add(new Item("Nissan"));
        itemList.add(new Item("Lada"));
        // Add more items as needed
        return itemList;
    }

}