package com.project.studententity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.studententity.entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {
 
}