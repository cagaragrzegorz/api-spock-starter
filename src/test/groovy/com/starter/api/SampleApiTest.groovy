package com.starter.api

import spock.lang.Specification

class SampleApiTest extends Specification {

    def 'first test'() {
        when:
        def a = 2
        def b = 2

        then:
        a + b == 4
    }
}
