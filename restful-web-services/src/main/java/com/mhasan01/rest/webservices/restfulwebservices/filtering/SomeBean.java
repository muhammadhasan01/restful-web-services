package com.mhasan01.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SomeBean {
    private String field1;
    private String field2;
    @JsonIgnore
    private String field3;
}
