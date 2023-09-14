package com.tech;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Actors")
public class actor {

	@Id
	@GeneratedValue
	@Column(name="A_id")
	private int id;
	
	@Column
	private String name;
	
	@ManyToMany(mappedBy = "movie", cascade = { CascadeType.ALL })
	private Set<movie> movie = new HashSet<movie>();


}
