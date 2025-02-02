package com.thompete.cicdtest.repository;

import com.thompete.cicdtest.entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "pets", collectionResourceRel = "pets", itemResourceRel = "pet")
public interface PetRepository extends JpaRepository<PetEntity, Long> {

    @RestResource(path = "byName", rel = "byName")
    List<PetEntity> findByNameContainingIgnoreCase(@Param("name") String name);
}
