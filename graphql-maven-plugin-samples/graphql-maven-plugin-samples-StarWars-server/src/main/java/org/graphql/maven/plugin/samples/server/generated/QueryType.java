package org.graphql.maven.plugin.samples.server.generated;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

/**
 * @author generated by graphql-maven-plugin
 */
public abstract class QueryType implements GraphQLQueryResolver {

	/** The logger for this instance */
	protected Logger logger = LogManager.getLogger();

	/**
	 * This method is expected by the graphql-java framework. It will be called when this query is called. It offers a
	 * logging of the call (if in debug mode), or of the call and its parameters (if in trace mode).
	 */
	public Human human(String id) {
		if (logger.isTraceEnabled()) {
			logger.trace("Executing of query 'human' with parameters: {} ", id);
		} else if (logger.isDebugEnabled()) {
			logger.debug("Executing of query 'human'");
		}

		return doHuman(id);
	}

	/**
	 * This method is called when this query is called. The implementation code of the server part should create a class
	 * extending this query {@link QueryType), and implement the actual query.
	 */
	abstract protected Human doHuman(String id);

}