package com.starter.api

import com.starter.common.ApiTestBase
import io.restassured.RestAssured
import io.restassured.response.Response
import org.json.JSONObject
import org.skyscreamer.jsonassert.JSONAssert
import spock.lang.Unroll

class SampleApiTest extends ApiTestBase {

    def 'get status code form postman API endpoint'() {
        given: 'set facts for test'
        def requestStatus = 200
        def expectedResponse = '{"status":200}'

        when: 'api call is made for given query'
        Response response = RestAssured.given()
                .headers(headers)
                .get('/status/200')

        then: 'actual output matches expected output'
        response.getStatusCode() == requestStatus
        JSONAssert.assertEquals(expectedResponse, new JSONObject(response.getBody().asString()), true)
    }

    @Unroll
    def 'get parameters form postman API endpoint'() {
        given: 'set facts for test'
        def requestStatus = 200

        when: 'api call is made for given query'
        Response response = RestAssured.given()
                .headers(headers)
                .get("/get?$arguments")

        then: 'actual output matches expected output'
        response.getStatusCode() == requestStatus
        JSONAssert.assertEquals(expectedResponse, new JSONObject(response.getBody().asString()).get('args'), true)

        where:
        arguments             | expectedResponse
        'grze=gorz'           | '{"grze":"gorz"}'
        'foo1=bar1&foo2=bar2' | '{"foo1":"bar1", "foo2":"bar2"}'
    }
}
