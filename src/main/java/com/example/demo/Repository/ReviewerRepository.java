package com.example.demo.repository;

import com.example.demo.model.Reviewer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewerRepository extends JpaRepository<Reviewer, Long> {

    

}
