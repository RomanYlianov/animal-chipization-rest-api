package com.example.demo.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@NoArgsConstructor
@Data
public class AnimalVisitedLocationDto {

    @JsonProperty
    private Long id;

    @JsonProperty
    @NotNull(message = "locationPointId is mandatory")
    @Positive(message = "locationPointId must be positive")
    private Long locationPointId;

    @JsonProperty
    @NotNull(message = "dateTimeOfVisitedLocationPoint is mandatory")
    private Date dateTimeOfVisitedLocationPoint;




}