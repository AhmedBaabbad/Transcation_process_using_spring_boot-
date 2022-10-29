package com.flightbooking.util;

import com.flightbooking.exception.insufficentAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtil {
    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc1", 10000.0);
        paymentMap.put("acc2", 12000.0);
        paymentMap.put("acc3", 15000.0);
        paymentMap.put("acc4", 20000.0);
    }


    public static boolean validateCreditLimit (String accNo, double paidAmount) {
        if (paidAmount > paymentMap.get(accNo)) {
            throw new insufficentAmountException("insufficient fund ..!");

        } else {
            return true;
        }

    }
}
