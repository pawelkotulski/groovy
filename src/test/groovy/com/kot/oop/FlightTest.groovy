package com.kot.oop

import spock.lang.Specification

class FlightTest extends Specification {

    def "should set carrier and number"() {
        when:
        def flight = new Flight.Builder()
                .withNumber("123")
        .withCarrier("FR")
                .build()

        then:
        flight.flightNumber() == "FR123"
    }

    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

}
