package tn.esprit.spring.app1.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.spring.app1.entity.Bloc;

public interface BlocsRepository extends CrudRepository<Bloc,Long> {
}
