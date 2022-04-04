package com.starter.common

import io.restassured.RestAssured
import spock.lang.Shared
import spock.lang.Specification

abstract class ApiTestBase extends Specification {

    @Shared
    def headers = ['Accept'         : '*/*',
                   'Accept-Language': 'pl-PL']

    def setupSpec() {
        RestAssured.baseURI = 'https://postman-echo.com'
    }
}
