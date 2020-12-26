package ru.itis.mognodemotest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.mognodemotest.dao.VacancyRepository;
import ru.itis.mognodemotest.models.Vacancy;

@Service
public class VacancyService {

    @Autowired
    private VacancyRepository vacancyRepository;


    public Vacancy apply(String vacancyId) {
        Vacancy vacancy = vacancyRepository.findById(vacancyId).orElseThrow(IllegalStateException::new);
        return apply(vacancy);
    }
    public Vacancy apply(Vacancy vacancy) {
        System.out.println("APPLYING FOR " + vacancy);
        return vacancy;
    }
}
