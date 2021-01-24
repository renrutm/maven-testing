package com.mkturner.maventesting

import spock.lang.Specification

class HelloWorldSpecTest extends Specification {
    def "GetHello"() {
        HelloWorld helloWorld = new HelloWorld()

        when helloWorld.hello == "Hello World"
        then true
    }
}
