package com.example.spring.boot.graphql.domain.query;

import lombok.*;

@Data
public class QueryArgument {
    private String columnName;
    private String operator;
    private String value;

}
