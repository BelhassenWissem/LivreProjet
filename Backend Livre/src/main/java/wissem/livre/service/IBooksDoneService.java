package wissem.livre.service;

import java.util.List;

import wissem.livre.domain.Livre;
import wissem.livre.domain.UtiliLivreDone;
import wissem.livre.domain.Utilisateur;

public interface IBooksDoneService {

	boolean addBookDoneToUser(Livre livre,Utilisateur utilisateur,int rate);
	List<UtiliLivreDone> getAlluserDoneBooks(String email);
	boolean removeBookDoneFromUser(Livre bookToRemove,Utilisateur user);
}
