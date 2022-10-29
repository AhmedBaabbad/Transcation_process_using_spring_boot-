package com.flightbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.flightbooking.entity.PaymentInfo;

public interface PayementInfoRepository extends JpaRepository<PaymentInfo,String> {
}
