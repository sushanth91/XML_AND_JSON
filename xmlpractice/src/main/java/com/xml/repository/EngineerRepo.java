package com.xml.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xml.entity.Engineer;

public interface EngineerRepo extends JpaRepository<Engineer, Long> {

}
