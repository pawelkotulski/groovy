package com.kot.oop

import java.time.Duration;
import java.time.Instant;

class Flight {

    private final String carrier;
    private final String number;
    private final Instant startTime;
    private final Instant landingTime;
    private final JourneyClass journeyClass;

    private Flight(String carrier, String number) {
        this.carrier = carrier
        this.number = number
    }

    def flightTime() {
        Duration.between(startTime, landingTime)
    }

    def flightNumber() {
        carrier+number
    }



    class Builder {

        private String flightNumber
        private String carrier
        private JourneyClass flightJourneyClass

        def withNumber(String number) {
            flightNumber = number
            return this
        }

        def withBusinessClass() {
            flightJourneyClass = JourneyClass.BUSINESS
            return this
        }

        def withCarrier(String carrier) {
            this.carrier = carrier
            return this
        }

        def withEconomyClass() {
            flightJourneyClass = JourneyClass.ECONOMY
            return this
        }

        def build() {
            return new Flight(carrier, flightNumber)
        }

    }
}
