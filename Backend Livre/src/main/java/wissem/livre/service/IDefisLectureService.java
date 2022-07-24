package wissem.livre.service;

import java.util.List;
import java.util.Optional;

import wissem.livre.domain.DefisLecture;

public interface IDefisLectureService {

	List<DefisLecture> getAllDefisLecture();
	
	boolean saveDefis(DefisLecture defis);
	boolean addChallengeToUser(int nbBook, String email);
	List<DefisLecture> getAllUserChallenges(String email);
	boolean deleteChallengeFromUser(int nbBook, String email);
	boolean deleteDefis(DefisLecture defis);
	Optional<DefisLecture> findById(int id);

}
