package com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.client;

import java.util.List;

public abstract class AbstractFieldDefinition {

    private final String fieldName;

    private final List<AbstractFieldDefinition> fieldDefinitions;

    protected AbstractFieldDefinition(String fieldName, List<AbstractFieldDefinition> fieldDefinitions) {
        this.fieldName = fieldName;
        this.fieldDefinitions = fieldDefinitions;
    }
}
