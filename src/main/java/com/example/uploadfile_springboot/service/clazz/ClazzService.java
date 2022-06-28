package com.example.uploadfile_springboot.service.clazz;

import com.example.uploadfile_springboot.model.Clazz;
import com.example.uploadfile_springboot.repository.ClazzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClazzService implements IClazzService{
@Autowired
private ClazzRepository clazzRepository;
    @Override
    public Iterable findAll() {
        return clazzRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return clazzRepository.findById(id);
    }
}
