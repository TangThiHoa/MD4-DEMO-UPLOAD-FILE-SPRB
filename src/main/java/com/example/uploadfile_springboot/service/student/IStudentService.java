package com.example.uploadfile_springboot.service.student;

import com.example.uploadfile_springboot.model.Student;
import com.example.uploadfile_springboot.service.IService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService extends IService<Student> {
    Page<Student> findAllByScoreGreaterThan8(Pageable pageable, Double score);

    Iterable<Class> findAllByClazzId(Long id);

    Iterable<Student> findAllScoreBetween(Double from, Double to);
}