package com.tech;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Movies")
public class movie {

	@Id
	@GeneratedValue
	@Column(name="M_id")
	private int id;
	
	@Column(name="M_name")
	private String Mname;
	


}
