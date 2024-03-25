package com.learning.deploy.service;

import com.learning.deploy.model.ExampleEntity;
import com.learning.deploy.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final ExampleRepository exampleRepository;

    @Autowired
    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public void saveExample(ExampleEntity example) {
        exampleRepository.save(example);
    }

    // Add other service methods as needed
}
