package com.example.kevinariza.areasyvolumenes;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CubeVolume extends AppCompatActivity {
    private EditText aristasValue;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube_volume);

        aristasValue = (EditText)findViewById(R.id.txtAristas);
        resources = this.getResources();
    }

    public void calculate(View view){
        double aristas, result;
        if (validate()) {
            aristas = Double.parseDouble(aristasValue.getText().toString());
            result = (6 * (aristas*aristas));

            OperationPerformed op = new OperationPerformed(resources.getString(R.string.cubeVolume), resources.getString(R.string.aristaValue) + ": " + aristas, result);
            op.save();
            Toast.makeText(this, resources.getString(R.string.message_calculate_result) + "\n" + resources.getString(R.string.volume) + " " + result, Toast.LENGTH_SHORT).show();
            clearField();
        }
    }

    public boolean validate(){
        if (aristasValue.getText().length() == 0){
            aristasValue.setError(resources.getString(R.string.message_error_artistas));
            return false;
        }
        return true;
    }

    public void clear(View v){
        aristasValue.setText("");
    }

    public void clearField(){
        aristasValue.setText("");
    }
}
