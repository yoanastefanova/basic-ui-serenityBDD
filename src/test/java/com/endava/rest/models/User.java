package com.endava.rest.models;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("email")
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("id")
    private int id;
    @JsonProperty("is_admin")
    private boolean isAdmin;
    @JsonProperty("password")
    private String password;
    @JsonProperty("sir_name")
    private String sirName;
    @JsonProperty("title")
    private String title;


}
