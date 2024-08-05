package com.example.collage.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.collage.Entity.Collage;

@Repository
public interface CollageDao extends JpaRepository<Collage, Long> {

}
