package com.flightreservation.serviceImpl;

import com.flightreservation.repository.FlightRepository;
import com.flightreservation.service.FlightService;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }
}
