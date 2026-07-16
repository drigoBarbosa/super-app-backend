package com.drigobarbosa.superapp.financial.repository;

import com.drigobarbosa.superapp.financial.domain.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {

}
