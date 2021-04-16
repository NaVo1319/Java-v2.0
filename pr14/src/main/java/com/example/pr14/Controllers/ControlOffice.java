package com.example.pr14.Controllers;

import com.example.pr14.entity.PostOffice;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControlOffice {
    ArrayList<PostOffice> list = new ArrayList<>();

    @PostMapping(value = "/postOffice")
    public String addDep(@RequestBody PostOffice dep) {
        list.add(dep);
        return "add-success";
    }

    @GetMapping("/Office")
    public PostOffice getDep(@RequestParam(value = "index") int index) {
        return list.get(index);
    }

    @PostMapping(value = "/delOffice")
    public String delDep(@RequestParam(value = "index") int index) {
        PostOffice buf = list.get(index);
        list.remove(index);
        return "Delete object: " + buf;
    }

    @GetMapping("/Offices")
    public String getDeps() {
        return list.toString();
    }
}
