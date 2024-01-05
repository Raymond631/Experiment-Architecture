package com.example.exp03.task8;

import com.example.exp03.task8.lib.KNN;

public class Main {
    public static void main(String[] args) {
        DataProcess process = new KNNDataProcess(new KNN());
        process.readData();
        process.dataConvert();
        process.classify();
        process.showResult();
    }
}
