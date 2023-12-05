package com.example.springbootrestapi.controller;

import com.example.springbootrestapi.entity.Donor;
import com.example.springbootrestapi.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DonorController {

    @Autowired
    private DonorService donorService;

    @PostMapping("/donor")
    private Donor create(@RequestBody Donor donor) {
        // Return service.save();
        return donorService.save(donor);
    }

    @GetMapping("/donor")
    private Iterable<Donor> view() {
        // Return service.findAll();
        return donorService.findAll();
    }

    @PutMapping("/donor")
    private Donor update(@RequestBody Donor donor) {
        // Return service.save();
        return donorService.save(donor);
    }

    @DeleteMapping("/donor/{id}")
    private void delete(@PathVariable Integer id) {
        // delete donor service.deleteById();
        donorService.deleteById(id);
    }
}
