package ca.purpleowl.examples.boot.cat.catalogue.jpa.model;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@Entity
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private LocalDate dateOfBirth;
    private String sex;

    @ManyToOne
    @JoinColumn(name = "breed_id") //these can't be nullable because the REST Repositories are weird about relationships
    @RestResource(path = "breed", rel = "breeds")
    private Breed breed;
}
