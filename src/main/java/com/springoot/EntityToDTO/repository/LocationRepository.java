package com.springoot.EntityToDTO.repository;

import com.springoot.EntityToDTO.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long>{
}
