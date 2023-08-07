package com.mesbahi.multi_connecteurs.exception;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.execution.DataFetcherExceptionHandler;
import graphql.language.SourceLocation;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GraphQlExceptionHandler extends DataFetcherExceptionResolverAdapter{

    @Override
    public GraphQLError resolveToSingleError(Throwable exception, DataFetchingEnvironment environment) {
        return new GraphQLError() {
            @Override
            public String getMessage() {
                return exception.getMessage();
            }

            @Override
            public List<SourceLocation> getLocations() {
                return null;
            }

            @Override
            public ErrorClassification getErrorType() {
                return null;
            }
        };
    }
  }

