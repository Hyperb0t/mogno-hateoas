package ru.itis.mognodemotest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.itis.mognodemotest.models.Company;

import java.util.Optional;

public interface CompanyRepository extends MongoRepository<Company, String> {

    Optional<Company> findByName(String name);
}
