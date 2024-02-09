package org.example.structural.adapter;

public class Adapter implements Service {

    private final ThirdPartyLibrary library;

    public Adapter(ThirdPartyLibrary library) {
        this.library = library;
    }

    @Override
    public void getLibData(String jsonDocument) {
        String xmlDocument = jsonToXmlConvertor(jsonDocument);
        library.getLibData(xmlDocument);
    }

    private String jsonToXmlConvertor(String jsonDocument) {
        return "xmlDocument";
    }


}
