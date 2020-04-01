package com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder;

import com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.client.ObjectResponse;
import com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.generated.meta.GPerson;

import static com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.generated.meta.GAddress.city;
import static com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.generated.meta.GAddress.zip;
import static com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.generated.meta.GPerson.addresses;
import static com.graphql_java_client.examples.graphql_java_client.examples.hello_world.graphql_java_gen.builder.generated.meta.GPerson.name;

public class BuilderTest {

    public void builder() {
        ObjectResponse objectResponse = ObjectResponse.builder(GPerson.class)
                .select(name, addresses(city, zip))
                .build();
    }

}
