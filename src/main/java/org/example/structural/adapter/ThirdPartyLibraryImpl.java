package org.example.structural.adapter;

public class ThirdPartyLibraryImpl implements ThirdPartyLibrary {

    @Override
    public void getLibData(String xmlDocument) {
        System.out.println("Request received in " + xmlDocument);
    }
}
