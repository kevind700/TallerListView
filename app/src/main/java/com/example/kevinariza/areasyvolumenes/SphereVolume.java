package com.example.kevinariza.areasyvolumenes;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SphereVolume extends AppCompatActivity {
    private EditText radiusValue;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_volume);

        radiusValue = (EditText)findViewById(R.id.txtRadius);
        resources = this.getResources();
    }

    public void calculate(View view){
        double radius, result;
        if (validate()) {
            radius = Double.parseDouble(radiusValue.getText().toString());
            result = (4/3) * 3.1416 * (radius*radius*radius);

            OperationPerformed op = new OperationPerformed(resources.getString(R.string.sphereVolume), resources.getString(R.string.radiusValue) + ": " + radius, result);
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
        return true;
    }

    public void clear(View v){
        radiusValue.setText("");
    }

    public void clearField(){
        radiusValue.setText("");
    }
}
