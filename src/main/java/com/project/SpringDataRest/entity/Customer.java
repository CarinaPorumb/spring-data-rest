package com.project.SpringDataRest.entity;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;
@Data
@Builder
public class Customer {

    private UUID id;

    private String name;

}