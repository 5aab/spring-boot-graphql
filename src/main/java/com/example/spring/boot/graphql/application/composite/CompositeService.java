package com.example.spring.boot.graphql.application.composite;

import com.example.spring.boot.graphql.domain.composite.CompositeOutputVO;
import com.example.spring.boot.graphql.domain.vehicle.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@AllArgsConstructor
public class CompositeService {

    private final VehicleRepository vehicleRepository;

    @Transactional(readOnly = true)
    public List<CompositeOutputVO> getAllComposites(final String brandName) {
        return vehicleRepository.findAllComposites(brandName).stream().collect(toList());
    }

}
