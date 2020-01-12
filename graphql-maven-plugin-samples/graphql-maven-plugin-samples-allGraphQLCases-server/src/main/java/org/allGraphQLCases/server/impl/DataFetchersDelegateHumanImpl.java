package org.allGraphQLCases.server.impl;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import javax.annotation.Resource;

import org.allGraphQLCases.server.Character;
import org.allGraphQLCases.server.DataFetchersDelegateHuman;
import org.allGraphQLCases.server.Episode;
import org.allGraphQLCases.server.Human;
import org.dataloader.DataLoader;
import org.springframework.stereotype.Component;

import graphql.schema.DataFetchingEnvironment;

/**
 * @author EtienneSF
 *
 */
@Component
public class DataFetchersDelegateHumanImpl implements DataFetchersDelegateHuman {

	@Resource
	DataGenerator generator;

	@Override
	public CompletableFuture<Character> bestFriend(DataFetchingEnvironment dataFetchingEnvironment,
			DataLoader<UUID, Character> dataLoader, Human source) {
		UUID key = generator.generateInstance(UUID.class, 2);
		return dataLoader.load(key);
	}

	@Override
	public List<Character> friends(DataFetchingEnvironment dataFetchingEnvironment, Human source) {
		return generator.generateInstanceList(Character.class, 2, 6);
	}

	@Override
	public List<String> comments(DataFetchingEnvironment dataFetchingEnvironment, Human source) {
		return generator.generateInstanceList(String.class, 2, 10);

	}

	@Override
	public List<Episode> appearsIn(DataFetchingEnvironment dataFetchingEnvironment, Human source) {
		return generator.generateInstanceList(Episode.class, 2, 2);
	}

	@Override
	public List<Human> batchLoader(List<UUID> keys) {
		return generator.generateInstanceList(Human.class, 2, keys.size());
	}

}
