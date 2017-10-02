package com.example.kevinariza.areasyvolumenes;

/**
 * Created by Kevin Ariza on 01/10/2017.
 */

public class OperationPerformed {
    private String operationName;
    private String data;
    private double result;

    public OperationPerformed(String operationName, String data, double result) {
        this.operationName = operationName;
        this.data = data;
        this.result = result;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void save(){
        Data.save(this);
    }
}
