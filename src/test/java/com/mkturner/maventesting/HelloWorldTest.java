package com.mkturner.maventesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void sayHello() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.sayHello());
    }
}