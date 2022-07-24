package wissem.livre.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import wissem.livre.domain.DefisLecture;

public interface IDefisLecturesRepository extends JpaRepository<DefisLecture,Integer> {

	Optional<DefisLecture> findByNbreTotalLivre(int nbre);
}
