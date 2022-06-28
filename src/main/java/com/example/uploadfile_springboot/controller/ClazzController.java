package com.example.uploadfile_springboot.controller;

import com.example.uploadfile_springboot.model.Clazz;
import com.example.uploadfile_springboot.service.clazz.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api/clazz")
public class ClazzController {
    @Autowired
    ClazzService clazzService;
    @GetMapping
    public ResponseEntity<Iterable<Clazz>> findAll(){
        return new ResponseEntity<>(clazzService.findAll(), HttpStatus.OK);
    }

}
