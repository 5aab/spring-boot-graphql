package com.example.spring.boot.graphql.application.composite;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.spring.boot.graphql.domain.composite.CompositeOutputVO;
import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Set;

@Component
@AllArgsConstructor
public class CompositeQuery implements GraphQLQueryResolver {

    private CompositeService compositeService;

    public Set<CompositeOutputVO> getComposites(final String brandName) {
        return this.compositeService.getAllComposites(brandName);
    }

    public Set<CompositeOutputVO> getCompositeWithArgs(final Set<String> brandNames) {
        return Sets.newHashSet(new CompositeOutputVO (1,"Car Insurance","Aveo","Chevrolet", LocalDate.now(),"Bajaj",LocalDate.of(2020,3,29)));
    }

}
