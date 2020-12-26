package ru.itis.mognodemotest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import ru.itis.mognodemotest.controllers.VacancyController;
import ru.itis.mognodemotest.models.Vacancy;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;


@Component
public class VacancyRepresentationProcessor implements RepresentationModelProcessor<EntityModel<Vacancy>> {

    @Autowired
    private RepositoryEntityLinks links;

    @Override
    public EntityModel<Vacancy> process(EntityModel<Vacancy> model) {
        Vacancy vacancy = model.getContent();
        model.add(linkTo(methodOn(VacancyController.class)
                .publish(vacancy.getId())).withRel("apply"));
        return model;
    }
}
