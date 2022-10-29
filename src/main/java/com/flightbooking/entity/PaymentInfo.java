package com.flightbooking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PAYMENT_info")
public class PaymentInfo {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "p_pid")
    private String PPayid;
    @Column(name = "p_acc_no")
    private String pAcc_no;
    @Column(name = "p_amount")
    private double pamount;
    @Column(name = "p_cardType")
    private String cardType;
    @Column(name = "p_passengerId")
    private long passengerId;

}
