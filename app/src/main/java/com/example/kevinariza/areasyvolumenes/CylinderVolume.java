package com.example.kevinariza.areasyvolumenes;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CylinderVolume extends AppCompatActivity {
    private EditText heightValue, radiusValue;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder_volume);

        heightValue = (EditText)findViewById(R.id.txtHeight);
        radiusValue = (EditText)findViewById(R.id.txtRadius);
        resources = this.getResources();
    }

    public void calculate(View view){
        double height, radius, result;
        if (validate()) {
            height = Double.parseDouble(heightValue.getText().toString());
            radius = Double.parseDouble(radiusValue.getText().toString());
            result = 3.1416 * (height * (radius*radius));

            OperationPerformed op = new OperationPerformed(String.valueOf(R.string.CylinderVolume), R.string.heightValue + ": " + height + "\n" + R.string.radiusValue + ": " + radius, result);
            op.save();
            Toast.makeText(this, resources.getString(R.string.message_calculate_result) + "\n" + resources.getString(R.string.volume) + " " + result, Toast.LENGTH_SHORT).show();
            clearField();
        }
    }

    public boolean validate(){
        if (radiusValue.getText().length() == 0){
            radiusValue.setError(resources.getString(R.string.message_error_circleArea));
            return false;
        }
        if (heightValue.getText().length() == 0){
            heightValue.setError(resources.getString(R.string.message_error_rectangleAreaH));
            return false;
        }
        return true;
    }

    public void clear(View v){
        heightValue.setText("");
        radiusValue.setText("");
    }

    public void clearField(){
        heightValue.setText("");
        radiusValue.setText("");
    }
}
