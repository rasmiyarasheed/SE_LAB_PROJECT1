package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Submissions;

@Repository
public interface SubmissionsRepository extends JpaRepository<Submissions, Long> {
    // You can add custom query methods if needed
}
