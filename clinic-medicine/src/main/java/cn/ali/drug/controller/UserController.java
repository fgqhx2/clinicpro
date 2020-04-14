package cn.ali.drug.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class UserController {
    @GetMapping("/list")
    public Map list() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "list");
        return map;
    }
}
