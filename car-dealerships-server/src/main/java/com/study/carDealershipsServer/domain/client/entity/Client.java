package com.study.carDealershipsServer.domain.client.entity;

import com.study.carDealershipsServer.domain.manager.entity.Purchase;
import com.study.carDealershipsServer.domain.manager.entity.Rental;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    private UUID id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false, unique = true)
    private String personalNumber;

    @Column(nullable = false)
    private String firstName;

    @Column
    private String secondName;

    @Column(nullable = false)
    private String surname;

    @Column(unique = true, nullable = false)
    private String phone;

    @Column
    private boolean active = true;

    @OneToMany
    private List<VehiclePreference> vehiclePreferences;

    @OneToMany
    private List<Purchase> purchases;

    @OneToMany
    private List<Rental> rentals;

}
