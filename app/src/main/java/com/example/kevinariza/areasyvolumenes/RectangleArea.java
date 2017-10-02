package com.example.kevinariza.areasyvolumenes;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RectangleArea extends AppCompatActivity {
    private EditText heightValue, baseValue;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_area);

        heightValue = (EditText)findViewById(R.id.txtHeight);
        baseValue = (EditText)findViewById(R.id.txtBase);
        resources = this.getResources();
    }

    public void calculate(View view){
        double height, base, result;
        if (validate()) {
            height = Double.parseDouble(heightValue.getText().toString());
            base = Double.parseDouble(baseValue.getText().toString());
            result = height * base;

            OperationPerformed op = new OperationPerformed(String.valueOf(R.string.rectangleArea), R.string.heightValue + ": " + height + "\n" + R.string.baseValue + ": " + base, result);
            op.save();
            Toast.makeText(this, resources.getString(R.string.message_calculate_result) + "\n" + resources.getString(R.string.area) + " " + result, Toast.LENGTH_SHORT).show();
            clearField();
        }
    }

    public boolean validate(){
        if (heightValue.getText().length() == 0){
            heightValue.setError(resources.getString(R.string.message_error_rectangleAreaH));
            return false;
        }
        if (baseValue.getText().length() == 0){
            baseValue.setError(resources.getString(R.string.message_error_rectangleAreaB));
            return false;
        }
        return true;
    }

    public void clear(View v){
        heightValue.setText("");
        baseValue.setText("");
    }

    public void clearField(){
        heightValue.setText("");
        baseValue.setText("");
    }
}
