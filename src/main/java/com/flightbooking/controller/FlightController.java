package com.flightbooking.controller;

import com.flightbooking.dto.FlightBookingAcknow;
import com.flightbooking.dto.FlightBookingRequest;
import com.flightbooking.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
    @Autowired
    FlightBookingService flightBookingService;
    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknow bookFlightTicket (@RequestBody FlightBookingRequest request) {
        return flightBookingService.bookFlightTicket(request);

    }
}
