package com.yuxi.xiao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testContr {

    @GetMapping("/xiao")
    public List<String> xiao()
    {
        return List.of("eval","cogarous");
    }
}
