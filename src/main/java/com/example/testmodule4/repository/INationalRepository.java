package com.example.testmodule4.repository;

import com.example.testmodule4.model.National;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INationalRepository extends JpaRepository<National, Long> {
}