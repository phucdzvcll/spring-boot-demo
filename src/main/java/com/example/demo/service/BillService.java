package com.example.demo.service;

import com.example.demo.entity.Bills;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface BillService {
    Bills addBill(Bills bill);

    Optional<Bills> findBillById(Long id);
}
