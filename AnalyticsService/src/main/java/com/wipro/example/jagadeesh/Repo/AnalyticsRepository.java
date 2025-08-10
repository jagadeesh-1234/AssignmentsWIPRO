package com.wipro.example.jagadeesh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.example.jagadeesh.Entities.QuizsCount;

public interface AnalyticsRepository extends JpaRepository<QuizsCount, Long> {

}
