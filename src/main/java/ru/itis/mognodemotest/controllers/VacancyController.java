package ru.itis.mognodemotest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.mognodemotest.services.VacancyService;

@RepositoryRestController
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;

    @RequestMapping(value = "/vacancies/{vacancy-id}/apply", method = RequestMethod.PUT)
    public @ResponseBody
    ResponseEntity<?> publish(@PathVariable("vacancy-id") String vacancyId) {
        return ResponseEntity.ok(
                EntityModel.of(vacancyService.apply(vacancyId)));
    }
}
