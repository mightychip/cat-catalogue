package ca.purpleowl.examples.boot.cat.catalogue.rest.repository;

import ca.purpleowl.examples.boot.cat.catalogue.jpa.model.Cat;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CatRestRepository extends PagingAndSortingRepository<Cat, Long> {
}
