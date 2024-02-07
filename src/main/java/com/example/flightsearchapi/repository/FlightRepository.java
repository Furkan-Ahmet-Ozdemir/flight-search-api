package com.example.flightsearchapi.repository;


import com.example.flightsearchapi.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByDepartureAirportIdAndArrivalAirportIdAndDepartureDateTimeGreaterThanEqual(
            Long departureAirportId, Long arrivalAirportId, LocalDateTime departureDateTime);

}