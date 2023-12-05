package com.example.springbootrestapi.service;

import com.example.springbootrestapi.entity.Donor;
import org.springframework.data.repository.CrudRepository;

public interface DonorService extends CrudRepository<Donor, Integer> {
}
