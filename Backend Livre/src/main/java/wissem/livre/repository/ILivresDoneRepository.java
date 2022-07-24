package wissem.livre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wissem.livre.domain.UtiliLivreDone;
import wissem.livre.domain.UtiliLivreDoneID;

public interface ILivresDoneRepository extends JpaRepository<UtiliLivreDone, UtiliLivreDoneID> {

	
}
