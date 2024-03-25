package com.learning.deploy.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ExampleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
