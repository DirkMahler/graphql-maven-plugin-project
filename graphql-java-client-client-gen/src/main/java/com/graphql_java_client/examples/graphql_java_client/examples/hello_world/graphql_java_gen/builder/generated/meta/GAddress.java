package com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.generated.meta;

import com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.client.AbstractFieldDefinition;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class GAddress<T extends AbstractFieldDefinition> extends AbstractFieldDefinition {

    public static final GAddress<GString> city = new GAddress<>("city");
    public static final GAddress<GInt> zip = new GAddress<>("zip");

    private GAddress(String fieldName) {
        super(fieldName, emptyList());
    }

    private GAddress(String fieldName, AbstractFieldDefinition... fields) {
        super(fieldName, asList(fields));
    }
}
