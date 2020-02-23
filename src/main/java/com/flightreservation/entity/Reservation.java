package com.flightreservation.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "RESERVATION")
public class Reservation extends AbstractEntity {

    @Column(name = "CHECKED_IN")
    private Boolean checkedIn;

    @Column(name = "NUMBER_OF_BAGS")
    private Integer numberOfBags;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "passenger_id", nullable = false)
    private Passenger passenger;

    @OneToOne
    private Flight flight;

}
