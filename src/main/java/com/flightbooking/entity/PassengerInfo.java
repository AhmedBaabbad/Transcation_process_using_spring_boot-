package com.flightbooking.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PASSENGER_info")
public class PassengerInfo {
    @Id
    @GeneratedValue
    @Column(name = "p_id")
    private long id;
    @Column(name = "p_name")
    private String name;
    @Column(name = "p_email")
    private String email;
    @Column(name = "p_destinction")
    private String destinction;
    @Column(name = "p_source")
    private String source;
    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    @Column(name = "p_travelDate")
    private Date travelDate;
    @Column(name = "p_pickTime")
    private String pickTime;
    @Column(name = "p_arrivalTime")
    private String arrivalTime;
    @Column(name = "p_pfare")
    private double fare;

}
