package com.flightbooking.dto;

import com.flightbooking.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknow {

    private String status;
    private double totalfare;
    private String pnrNo;
    private PassengerInfo passengerInfo ;
}
