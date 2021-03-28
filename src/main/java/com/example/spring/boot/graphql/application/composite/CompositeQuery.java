package com.example.spring.boot.graphql.application.composite;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.spring.boot.graphql.domain.composite.CompositeOutputVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@AllArgsConstructor
public class CompositeQuery implements GraphQLQueryResolver {

    private CompositeService compositeService;

    public Set<CompositeOutputVO> getComposits(final String brandName) {
        return this.compositeService.getAllComposites(brandName);
    }

}
