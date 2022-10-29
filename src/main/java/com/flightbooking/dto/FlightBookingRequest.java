package com.flightbooking.dto;

import com.flightbooking.entity.PassengerInfo;
import com.flightbooking.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PaymentInfo paymentInfo;
    private PassengerInfo passengerInfo ;
}
