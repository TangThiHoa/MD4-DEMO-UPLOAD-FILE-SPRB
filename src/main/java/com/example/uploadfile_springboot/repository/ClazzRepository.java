package com.example.uploadfile_springboot.repository;

import com.example.uploadfile_springboot.model.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepository extends JpaRepository<Clazz,Long> {
}
