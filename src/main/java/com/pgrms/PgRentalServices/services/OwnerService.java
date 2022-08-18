package com.pgrms.PgRentalServices.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgrms.PgRentalServices.Entities.LoginDetails;
import com.pgrms.PgRentalServices.Entities.Owner;
import com.pgrms.PgRentalServices.repositories.OwnerRepository;

@Service
@Transactional
public class OwnerService {

	@Autowired
	private OwnerRepository ownerRepo;

//	get all owner
	public List<Owner> listAll() {
		return ownerRepo.findAll();
	}

//	get Owner by id 
	public Owner getOwnerById(int id) {
		return ownerRepo.findAll().stream().filter(s -> s.getOwnerId() == id).findFirst().get();
	}

//	get Owner by email 
	public Owner getOwnerByCredential(LoginDetails loginDetails) throws Exception {
		Owner owner = ownerRepo.findAll().stream().filter(s -> s.getOwnerEmail().equals(loginDetails.getEmail())).findFirst().get();
		if (owner == null)
			throw new Exception("User with this email not available");
		else if (!owner.getOwnerPassword().equals(loginDetails.getPassword()))
			throw new Exception("Your password is wrong");
		else
			return owner;
	}

	public void saveOwnerIntoDb(Owner owner) throws Exception {
		for (Owner on : listAll()) {
			if(on.getOwnerEmail().equals(owner.getOwnerEmail())) throw new Exception("You already have an account with this email");
		}
		ownerRepo.save(owner);
	}

	public void deleteOwnerById(int id) {
		ownerRepo.deleteById(id);
	}

//	public void saveOwnerIntoDb(String OwnerName, long OwnerMobile, String OwnerEmail, String ownerAddress,
//			String OwnerCity, String OwnerRole, String OwnerPassword, MultipartFile file) {
//		// TODO Auto-generated method stub
//		Owner owner = new Owner();
//		String filename = StringUtils.cleanPath(file.getOriginalFilename());
//		if (filename.contains("..")) {
//			System.out.println("Not a valid file");
//		}
//		try {
//			owner.setOwnerPhoto(Base64.getEncoder().encodeToString(file.getBytes()));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		owner.setOwnerName(OwnerName);
//		owner.setOwnerMobile(OwnerMobile);
//		owner.setOwnerEmail(OwnerEmail);
//		owner.setownerAddress(ownerAddress);
//		owner.setOwnerCity(OwnerCity);
//		owner.setOwnerRole(OwnerRole);
//		owner.setOwnerPassword(OwnerPassword);
//		ownerRepo.save(owner);
//	}

}
