package com.graph.controller;

import graphql.kickstart.execution.GraphQLObjectMapper;
import graphql.kickstart.spring.AbstractGraphQLController;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

import java.util.Map;

@Primary
@RestController
public class MyGraphQLController extends AbstractGraphQLController {

    private static final GraphQLObjectMapper objectMapper = GraphQLObjectMapper.newBuilder().build();

    public MyGraphQLController() {
        super(objectMapper);
    }

    @Override
    public Object graphqlGET(String query, String operationName, String variablesJson, ServerWebExchange serverWebExchange) {
        return "super.graphqlGET(query, operationName, variablesJson, serverWebExchange)";
    }

    @Override
    protected Object executeRequest(String query, String operationName, Map<String, Object> variables, ServerWebExchange serverWebExchange) {
        return null;
    }
}
