package com.sparta.sc.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

    @JsonProperty("1h")
    private double jsonMember1h;

    @JsonProperty("3h")
    private double jsonMember3h;

    public double getJsonMember1h() {
        return jsonMember1h;
    }

    public double getJsonMember3h() {
        return jsonMember3h;
    }


}