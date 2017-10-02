package com.example.kevinariza.areasyvolumenes;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultList extends AppCompatActivity {
    private TableLayout table;
    private ArrayList<OperationPerformed> operationPerformeds;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_list);

        table = (TableLayout) findViewById(R.id.table);
        operationPerformeds = Data.getArray();
        resources = this.getResources();

        for (int i = 0; i < operationPerformeds.size() ; i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(""+operationPerformeds.get(i).getOperationName());
            c3.setText(""+operationPerformeds.get(i).getData());
            c4.setText(""+operationPerformeds.get(i).getResult());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            table.addView(fila);
        }
    }
}
