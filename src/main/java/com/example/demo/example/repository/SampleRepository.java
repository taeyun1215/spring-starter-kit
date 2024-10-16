package com.example.demo.example.repository;

import com.example.demo.example.entity.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long>, SampleRepositoryCustom {
}