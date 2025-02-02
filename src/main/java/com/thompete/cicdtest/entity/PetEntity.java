package com.thompete.cicdtest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pet")
public class PetEntity {

    @Id
    @GeneratedValue
    @Column(name = "pet_id")
    private Long id;

    private String name;

    private String species;

    private int age;

    private Gender gender;
}
