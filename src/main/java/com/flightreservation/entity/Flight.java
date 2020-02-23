package com.flightreservation.entity;



import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "FLIGHT")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FLIGHT_NUMBER")
    private String flightNumber;

    @Column(name = "OPERATING_AIRLINES")
    private String operatingAirlines;

    @Column(name = "DEPARTURE_CITY")
    private String departureCity;

    @Column(name = "ARRIVAL_CITY")
    private String arrivalCity;

    @Column(name = "DATE_OF_DEPARTURE")
    private Date dateOfDeparture;

    @Column(name = "ESTIMATED_DEPARTURE_TIME")
    private Timestamp estimatedDepartureTime;
}
