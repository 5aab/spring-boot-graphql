package com.example.spring.boot.graphql.domain.vehicle;

import com.example.spring.boot.graphql.domain.composite.CompositeOutputVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.Set;

import static org.hibernate.jpa.QueryHints.HINT_FETCH_SIZE;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    @QueryHints(@QueryHint(name = HINT_FETCH_SIZE, value = "1000"))
    @Query("select new com.example.spring.boot.graphql.domain.composite.CompositeOutputVO(v.id,v.type,v.modelCode,v.brandName,v.launchDate,i.insuredBy,i.insuredOn) from Vehicle v, Insurance i where v.id=i.id and v.brandName= :brandName")
    Set<CompositeOutputVO> findAllComposites(@Param("brandName") String brandName);
}
