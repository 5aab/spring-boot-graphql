package com.example.spring.boot.graphql.application.vehicle;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.spring.boot.graphql.domain.vehicle.Vehicle;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;

@Component
@AllArgsConstructor
public class VehicleQuery implements GraphQLQueryResolver {

    private VehicleService vehicleService;

    public Set<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }
}
