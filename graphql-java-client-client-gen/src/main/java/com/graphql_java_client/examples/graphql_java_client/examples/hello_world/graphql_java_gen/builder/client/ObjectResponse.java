package com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.client;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ObjectResponse {

    private final List<AbstractFieldDefinition> fields;

    private ObjectResponse(List<AbstractFieldDefinition> fields) {
        this.fields = fields;
    }

    public static <T extends AbstractFieldDefinition> ObjectResponseBuilder<T> builder(Class<T> type) {
        return new ObjectResponseBuilder<T>();
    }

    public static class ObjectResponseBuilder<T extends AbstractFieldDefinition> {

        private List<AbstractFieldDefinition> fields = new ArrayList<>();

        public ObjectResponseBuilder<T> select(AbstractFieldDefinition... fields) {
            this.fields.addAll(asList(fields));
            return this;
        }

        public ObjectResponse build() {
            return new ObjectResponse(fields);
        }
    }
}
