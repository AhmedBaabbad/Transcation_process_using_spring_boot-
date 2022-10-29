package com.flightbooking.service;

import com.flightbooking.dto.FlightBookingAcknow;
import com.flightbooking.dto.FlightBookingRequest;
import com.flightbooking.entity.PassengerInfo;
import com.flightbooking.entity.PaymentInfo;
import com.flightbooking.repository.PassengerInfoRepository;
import com.flightbooking.repository.PayementInfoRepository;
import com.flightbooking.util.PaymentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PayementInfoRepository payementInfoRepository ;

    public FlightBookingAcknow bookFlightTicket (FlightBookingRequest request) {
        PassengerInfo passengerInfo =request.getPassengerInfo();
        passengerInfo =passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo= request.getPaymentInfo();

        PaymentUtil.validateCreditLimit(paymentInfo.getPAcc_no(), passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getId());
        paymentInfo.setPamount(passengerInfo.getFare());

        payementInfoRepository.save(paymentInfo);

        return new FlightBookingAcknow("Success",
                passengerInfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],
                passengerInfo);



    }
}
