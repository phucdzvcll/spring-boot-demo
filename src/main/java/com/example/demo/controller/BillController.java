package com.example.demo.controller;

import com.example.demo.entity.Bills;
import com.example.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/bill")
public class BillController {
    @Autowired
    private BillService billService;

    @PostMapping("/add")
    public Bills addBuild(@RequestBody Bills bill) {
        return billService.addBill(bill);
    }

    @GetMapping("/get")
    public Optional<Bills> findBillById(@RequestParam Long id) {
        return billService.findBillById(id);
    }

}
