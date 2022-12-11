/**
 * 
 */
package com.ris.service;

import java.util.List;

import com.ris.model.Contact;

/**
 * @author Rishu
 *
 */
public interface IContactService {

	public List<Contact> getAllContacts();
	
	public String registerContact(Contact contact);
	
	public Contact getContactById(Integer id);
	
	public String updateContact(Contact contact);
	
	public String deleteContact(Integer id);
	
}
