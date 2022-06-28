package com.example.uploadfile_springboot.service.clazz;

import java.util.Optional;

public interface IClazzService<Clazz> {
    Iterable<Clazz> findAll();

    Optional<Clazz> findById(Long id);
}
