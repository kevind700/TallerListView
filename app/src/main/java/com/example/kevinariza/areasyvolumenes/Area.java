package com.example.kevinariza.areasyvolumenes;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Area extends AppCompatActivity {
    private ListView listView;
    private Resources resources;
    private String option[];
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        listView = (ListView)findViewById(R.id.FigureArea);
        resources = this.getResources();
        option = resources.getStringArray(R.array.area);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, option);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent = new Intent(Area.this, SquareArea.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Area.this, RectangleArea.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Area.this, TriangleArea.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Area.this, CicleArea.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
