package ru.itis.mognodemotest.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.itis.mognodemotest.models.Person;

import java.util.Collection;
import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {

    @Query(value = "{skills: ?skill}")
    List<Person> findWithSkill(@Param("skill")String skill);

    List<Person> findBySkillsIn(List<String> skills);
}
