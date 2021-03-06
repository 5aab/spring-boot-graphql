package com.example.spring.boot.graphql.application.composite;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.spring.boot.graphql.domain.composite.CompositeOutputVO;
import com.example.spring.boot.graphql.domain.query.QueryArgument;
import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Slf4j
@Component
@AllArgsConstructor
public class CompositeQuery implements GraphQLQueryResolver {

    private CompositeService compositeService;

    public Set<CompositeOutputVO> getComposites(final String brandName) {
        return this.compositeService.getAllComposites(brandName);
    }

    public Set<CompositeOutputVO> getCompositeWithArgs(final Set<String> brandNames) {
        log.info("Arguments Received {}", brandNames);
        return Sets.newHashSet(new CompositeOutputVO (1,"Car Insurance","Chrysler","Chevrolet", LocalDate.now(),"Bajaj",LocalDate.of(2020,3,29)));
    }

    public Set<CompositeOutputVO> getCompositeWithQueryArguments(final Set<QueryArgument> queryArguments) {
        log.info("Query Arguments Received {}", queryArguments);
        return Sets.newHashSet(new CompositeOutputVO (1,"Car Insurance","Hummer","General Motors (GMC)", LocalDate.now(),"Reliance",LocalDate.of(2020,3,29)));
    }

}
