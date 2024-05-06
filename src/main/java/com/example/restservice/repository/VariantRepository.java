package com.example.restservice.repository;

import com.example.restservice.entities.Variant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface VariantRepository extends JpaRepository<Variant, Long> {

}