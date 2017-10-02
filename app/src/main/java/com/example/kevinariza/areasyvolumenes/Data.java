package com.example.kevinariza.areasyvolumenes;

import java.util.ArrayList;

/**
 * Created by Kevin Ariza on 01/10/2017.
 */

public class Data {
    private static ArrayList<OperationPerformed> operationPerformeds = new ArrayList<>();

    public static void save(OperationPerformed op){
        operationPerformeds.add(op);
    }

    public static ArrayList<OperationPerformed> getArray(){
        return operationPerformeds;
    }
}
