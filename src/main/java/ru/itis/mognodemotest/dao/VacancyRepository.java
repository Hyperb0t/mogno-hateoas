package ru.itis.mognodemotest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.itis.mognodemotest.models.Vacancy;

import java.util.List;
import java.util.Optional;

public interface VacancyRepository extends MongoRepository<Vacancy, String> {

    Optional<Vacancy> findByTitle(String title);
}
