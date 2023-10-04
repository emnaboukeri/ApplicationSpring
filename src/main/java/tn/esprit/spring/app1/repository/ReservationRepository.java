package tn.esprit.spring.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.app1.entity.Etudiant;

public interface ReservationRepository extends JpaRepository<Etudiant,Long> {
}
