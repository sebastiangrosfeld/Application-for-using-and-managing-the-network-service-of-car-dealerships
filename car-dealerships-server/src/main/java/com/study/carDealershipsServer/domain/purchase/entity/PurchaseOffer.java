package com.study.carDealershipsServer.domain.purchase.entity;

import com.study.carDealershipsServer.domain.manager.entity.Manager;
import com.study.carDealershipsServer.domain.vehicle.entity.Vehicle;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PurchaseOffer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne
    private Manager manager;

    @OneToOne
    private Vehicle vehicle;
}
