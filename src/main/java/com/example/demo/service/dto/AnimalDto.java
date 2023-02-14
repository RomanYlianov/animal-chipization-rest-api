package com.example.demo.service.dto;

import com.example.demo.model.Gender;
import com.example.demo.model.LifeStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@Data
public class AnimalDto {

    @JsonProperty
    private Long id;

    @JsonProperty
    @NotNull(message = "animal must be have type")
    private Set<Long> animalTypes;

    @JsonProperty
    @NotNull(message = "weight is mandatory")
    @Positive(message = "weight must be positive")
    private Float weight;

    @JsonProperty
    @NotNull(message = "height is mandatory")
    @Positive(message = "height must be positive")
    private Float height;

    @JsonProperty
    @NotNull(message = "length is mandatory")
    @Positive(message = "length must be positive")
    private Float length;

    @JsonProperty
    @NotNull(message = "gender is mandatory")
    private Gender gender;

    @JsonProperty
    @NotNull(message = "lifeStatus is mandatory")
    private LifeStatus lifeStatus;

    @JsonProperty
    @NotNull(message = "chippingDate time is mandatory")
    private Date chippingDateTime;

    @JsonProperty
    @NotNull(message = "chipperId is mandatory")
    @Positive(message = "chipperId must be positive")
    private Integer chipperId;

    @JsonProperty(value = "chippingLocationId")
    @NotNull(message = "chippingLocationPointId is mandatory")
    @Positive(message = "chippingLocationPointId must be positive")
    private Long chippingLocationId;

    @JsonProperty(value = "visitedLocations")
    private List<Long> visitedLocations;


    @JsonProperty
    private Date deathDatetime;

}
