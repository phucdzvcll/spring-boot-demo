package com.example.demo.service;

import com.example.demo.entity.Bills;
import com.example.demo.repo.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;

    @Override
    public Bills addBill(Bills bill) {
        return billRepository.save(bill);
    }

    @Override
    public Optional<Bills> findBillById(Long id) {
        return billRepository.findById(id);
    }

}
