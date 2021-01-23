package com.mkturner.maventesting;

public class HelloWorldTest {
    public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assert("Hello World".equals(helloWorld.sayHello()));
    }
}