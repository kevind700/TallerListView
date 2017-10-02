package com.example.kevinariza.areasyvolumenes;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SquareArea extends AppCompatActivity {
    private EditText sideValue;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_area);

        sideValue = (EditText)findViewById(R.id.txtSideValue);
        resources = this.getResources();
    }

    public void calculate(View view){
        double side, result;
        if (validate()) {
            side = Double.parseDouble(sideValue.getText().toString());
            result = side * side;

            OperationPerformed op = new OperationPerformed(String.valueOf(R.string.squareArea), R.string.sideValue + ": " + side, result);
            op.save();
            Toast.makeText(this, resources.getString(R.string.message_calculate_result) + "\n" + resources.getString(R.string.area) + " " + result, Toast.LENGTH_SHORT).show();
            clearField();
        }
    }

    public boolean validate(){
        if (sideValue.getText().length() == 0){
            sideValue.setError(resources.getString(R.string.message_error_squareArea));
            return false;
        }
        return true;
    }

    public void clear(View v){
        sideValue.setText("");
    }

    public void clearField(){
        sideValue.setText("");
    }
}
