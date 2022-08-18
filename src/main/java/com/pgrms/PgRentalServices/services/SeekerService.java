package com.pgrms.PgRentalServices.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrms.PgRentalServices.Entities.Seeker;
import com.pgrms.PgRentalServices.repositories.SeekerRepository;

@Service
@Transactional
public class SeekerService {

	@Autowired
	private SeekerRepository seekerRepo;

//	get all seeker
	public List<Seeker> listAll() {
		return seekerRepo.findAll();
	}

//	get Seeker by id 
	public Seeker getSeekerById(int id) {
		return seekerRepo.findAll().stream().filter(s -> s.getSeekerId() == id).findFirst().get();
	} 

//	get Seeker by email 
	public Seeker getSeekerByEmail(String email, String pass) {
		return seekerRepo.findAll().stream().filter(s -> s.getSeekerEmail().equals(email)).findFirst().get();
	}

	public void saveSeekerIntoDb(Seeker seeker) {
		seekerRepo.save(seeker);
	}

	public void deleteSeekerById(int id) {
		seekerRepo.deleteById(id);
	}

//	public void saveSeekerIntoDb(String SeekerName, long SeekerMobile, String SeekerEmail, String seekerAddress,
//			String SeekerCity, String SeekerRole, String SeekerPassword, MultipartFile file) {
//		// TODO Auto-generated method stub
//		Seeker seeker = new Seeker();
//		String filename = StringUtils.cleanPath(file.getOriginalFilename());
//		if (filename.contains("..")) {
//			System.out.println("Not a valid file");
//		}
//		try {
//			seeker.setSeekerPhoto(Base64.getEncoder().encodeToString(file.getBytes()));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		seeker.setSeekerName(SeekerName);
//		seeker.setSeekerMobile(SeekerMobile);
//		seeker.setSeekerEmail(SeekerEmail);
//		seeker.setseekerAddress(seekerAddress);
//		seeker.setSeekerCity(SeekerCity);
//		seeker.setSeekerRole(SeekerRole);
//		seeker.setSeekerPassword(SeekerPassword);
//		seekerRepo.save(seeker);
//	}


}
