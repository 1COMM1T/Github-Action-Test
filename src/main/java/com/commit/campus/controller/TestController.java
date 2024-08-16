package com.commit.campus.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @PostMapping("main")
    public ResponseEntity<Void> test2() {
        log.info("메인임");
        return ResponseEntity.ok().build();
    }
}
