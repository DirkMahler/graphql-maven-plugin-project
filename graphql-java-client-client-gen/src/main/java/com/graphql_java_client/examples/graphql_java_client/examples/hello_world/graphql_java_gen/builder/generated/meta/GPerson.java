package com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.generated.meta;

import com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.client.AbstractFieldDefinition;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class GPerson<T extends AbstractFieldDefinition> extends AbstractFieldDefinition {

    public static final GPerson<GString> name = new GPerson<>("name");

    private GPerson(String fieldName) {
        super(fieldName, emptyList());
    }

    private GPerson(String fieldName, AbstractFieldDefinition... fields) {
        super(fieldName, asList(fields));
    }

    public static GPerson<?> addresses(GAddress<?>... fields) {
        return new GPerson<>("addresses", fields);
    }
}
