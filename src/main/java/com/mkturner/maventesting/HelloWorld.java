package com.mkturner.maventesting;

public class HelloWorld {
    public String getHello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getHello());
    }
}
