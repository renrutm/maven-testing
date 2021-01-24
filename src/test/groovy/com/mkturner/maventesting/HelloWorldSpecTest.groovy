package com.mkturner.maventesting

import spock.lang.Specification

class HelloWorldSpecTest extends Specification {
    def "GetHello"() {
//        HelloWorld helloWorld = new HelloWorld()

        when:
        def foo = "123"
        then:
        true
    }
}
