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

    Duration flightTime() {
        Duration.between(startTime, landingTime)
    }

    String flightNumber() {
        carrier+number
    }

    class Builder {

        private String flightNumber
        private String carrier
        private JourneyClass flightJourneyClass

        Builder withNumber(String number) {
            flightNumber = number
            return this
        }

        Builder withBusinessClass() {
            flightJourneyClass = JourneyClass.BUSINESS
            return this
        }

        Builder withCarrier(String carrier) {
            this.carrier = carrier
            return this
        }

        Builder withEconomyClass() {
            flightJourneyClass = JourneyClass.ECONOMY
            return this
        }

        Flight build() {
            return new Flight(carrier, flightNumber)
        }

    }
}
