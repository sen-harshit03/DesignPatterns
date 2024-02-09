package org.example.structural.adapter;

import java.util.Arrays;

/**
 *   Used to make 2 interface which aren't compatible with each other, compatible.
 *
 *   Real life analogy -:
 *   Suppose you want to transfer some data from your phone to your laptop.
 *   So, you use a wire (USB Type C to USB 3.0)
 *   You plug-in the Type C end to the mobile, and the other end (USB 3.0) to the laptop.
 *   Oops, there is no USB 3.0 in the laptop
 *
 *
 *   Adapter pattern converts the interface of a class into another interface the client expects.
 *
 *   Components:
 *   Client -> ITarget
 *               ^
 *               |
 *               Adapter -> Adaptee
 *
 *    So, Adapter has to adapt to the adaptee
 *
 *    It is also called as 'Wrapper' coz Adapter wraps the Adaptee
 *
 *
 *
 */
public class App {
    public static void main(String[] args) {

        Service service = new ServiceImpl();

        ThirdPartyLibrary library = new ThirdPartyLibraryImpl();

        Service adapter = new Adapter(library);

        adapter.getLibData("jsonDocument");

    }
}
