package wissem.livre.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import wissem.livre.domain.Utilisateur;

public interface IUtilisateursRepository extends JpaRepository<Utilisateur, Integer> {
	
	Optional<List<Utilisateur>> findByUsername(String username);
	Optional<Utilisateur> findByEmail(String email);
	Optional<Utilisateur> findByEmailAndPassword(String email,String password);
	boolean existsByEmail(String email);
	Optional<Utilisateur> findByPassword(String passw);


}
