package org.example.structural.adapter;

public class ServiceImpl implements Service {


    @Override
    public void getLibData(String jsonDocument) {
        System.out.println("Sending request to Lib in " + jsonDocument);

    }
}
