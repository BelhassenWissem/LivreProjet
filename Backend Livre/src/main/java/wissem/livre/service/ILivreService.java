package wissem.livre.service;

import java.util.Set;

import wissem.livre.domain.Livre;

import java.util.Optional;

public interface ILivreService {

	
	Set<Livre> getAllBooks();
	Set<Livre> getBooksNameContain(String pattern);	
	boolean saveBook(Livre livre);
	boolean deleteBook(Livre livre);
	Optional<Livre>  findByIsbn(String isbn);
	Livre updateBook(Livre livre);
	Long countLivre();
	Long countUsers();
	Long countChallenges();


}
