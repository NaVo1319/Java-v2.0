package com.example.pr14.Controllers;

import com.example.pr14.entity.Departure;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ControlDeparture {
    ArrayList<Departure> list = new ArrayList<>();

    @PostMapping(value = "/postDep")
    public String addDep(@RequestBody Departure dep) {
        list.add(dep);
        return "add-success";
    }

    @GetMapping("/dep")
    public Departure getDep(@RequestParam(value = "index") int index) {
        return list.get(index);
    }

    @PostMapping(value = "/delDep")
    public String delDep(@RequestParam(value = "index") int index) {
        Departure buf = list.get(index);
        list.remove(index);
        return "Delete object: " + buf;
    }

    @GetMapping("/deps")
    public String getDeps() {
        return list.toString();
    }
}
