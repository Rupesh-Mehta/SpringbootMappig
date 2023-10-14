package com.mtombi.amz_dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Manylanguages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String mlanguages;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Movie movie;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMlanguages() {
		return mlanguages;
	}

	public void setMlanguages(String mlanguages) {
		this.mlanguages = mlanguages;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	

}
