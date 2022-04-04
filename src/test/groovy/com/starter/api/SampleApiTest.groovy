package com.starter.api

import io.restassured.RestAssured
import io.restassured.response.Response
import spock.lang.Shared
import spock.lang.Specification

class SampleApiTest extends Specification {

    @Shared
    def headers = ['Accept'         : '*/*',
                   'Accept-Language': 'pl-PL']

    def setupSpec() {
        RestAssured.baseURI = 'https://postman-echo.com'
    }

    def 'get status code form postman API endpoint'() {
        given: 'set facts for test'
        def requestStatus = 200

        when: 'api call is made for given query'
        Response response = RestAssured.given()
                .headers(headers)
                .get('/status/200')

        then: 'actual output matches expected output'
        response.getStatusCode() == requestStatus
    }
}
