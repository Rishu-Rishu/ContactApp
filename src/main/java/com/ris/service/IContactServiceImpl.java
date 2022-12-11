/**
 * 
 */
package com.ris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ris.model.Contact;
import com.ris.repo.IContactRepo;

/**
 * @author Agarw
 *
 */
@Service
public class IContactServiceImpl implements IContactService {

	@Autowired
	private IContactRepo repo;
	
	@Override
	public List<Contact> getAllContacts() {
		return  repo.findAll();
	}
	

	@Override
	public String registerContact(Contact contact) {
		String phNo= repo.save(contact).getPhNo();
		return "Conatct is Saved with phone Number:" + phNo;
	}
	
	@Override
	public Contact getContactById(Integer id) {
		Contact cont = repo.getById(id);
		return cont;
	}
	
	@Override
	public String updateContact(Contact contact) {
		String phNo= repo.save(contact).getPhNo();
		return "Conatct is Updated with phone Number:" + phNo;
	}
	
	@Override
	public String deleteContact(Integer id) {
		String phNo = repo.getById(id).getPhNo();
		repo.deleteById(id);
		return "Contact is Removed Having Contact Num:" +  phNo;
	}
}
