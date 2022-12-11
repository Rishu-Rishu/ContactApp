/**
 * 
 */
package com.ris.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Rishu
 *
 */
@Entity
@Table(name="contact")
@Data
public class Contact implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length=20)
	private String name;
	
	@Column(length=20)
	private String email;
	
	@Column(length=20)
	private String phNo;
}
