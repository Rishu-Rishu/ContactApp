/**
 * 
 */
package com.ris.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ris.model.Contact;
import com.ris.service.IContactService;

/**
 * @author Rishu
 *
 */
@Controller
public class ContactController {

	@Autowired
	private IContactService service;
	
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/report")
	public String showContactReport(Map<String,Object> map) {
		List<Contact> list = service.getAllContacts();
		System.out.println(list);
		map.put("contactList", list);
		return "contact_report";
	}
	
	@GetMapping("/add")
	public String showAddContactForm(@ModelAttribute("contact") Contact contact) {
		
		return "register_contact";
	}
	
	@PostMapping("/add")
	public String addContact(Map<String,Object> map, @ModelAttribute("contact") Contact contact) {
		String result = service.registerContact(contact);
		List<Contact> list = service.getAllContacts();
		
		map.put("contactList", list);
		map.put("resultMsg", result);
		return "contact_report";
	}
	
	@GetMapping("/edit")
	public String showEditContactForm(@RequestParam("no") int no, @ModelAttribute("contact") Contact contact) {
		
		Contact cont = service.getContactById(no);
		BeanUtils.copyProperties(cont, contact);
		System.out.println("I am here:"+cont);
		return "contact_edit";
		
	}
	
	@PostMapping("/edit")
	public String saveUpdatedForm(Map<String,Object> map, @ModelAttribute("contact") Contact contact) {
		String result = service.updateContact(contact);
		List<Contact> list = service.getAllContacts();
		
		map.put("contactList", list);
		map.put("resultMsg", result);
		return "contact_report";
		
	}
	
	@GetMapping("/delete")
	public String removeContact(@RequestParam("no") int no,Map<String,Object> map) {
		String result = service.deleteContact(no);
		List<Contact> list= service.getAllContacts();
		map.put("contactList", list);
		map.put("resultMsg", result);
		return "contact_report";
	}
	
}
