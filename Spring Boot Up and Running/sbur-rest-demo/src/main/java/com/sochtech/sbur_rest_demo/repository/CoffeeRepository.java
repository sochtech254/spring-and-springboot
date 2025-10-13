package com.sochtech.sbur_rest_demo.repository;

import com.sochtech.sbur_rest_demo.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
