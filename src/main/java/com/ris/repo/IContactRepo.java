/**
 * 
 */
package com.ris.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ris.model.Contact;

/**
 * @author Rishu
 *
 */
@Repository
public interface IContactRepo extends JpaRepository<Contact, Integer> {

}
