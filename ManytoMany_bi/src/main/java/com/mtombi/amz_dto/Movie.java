package com.mtombi.amz_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	private String nmovie;
	private String mrdate;
//	private List<String> mlanguages;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "movies")
	 private List<Actor> actors;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "movie")
	private List<Manylanguages> manylanguages;
	
	

	public List<Manylanguages> getManylanguages() {
		return manylanguages;
	}

	public void setManylanguages(List<Manylanguages> manylanguages) {
		this.manylanguages = manylanguages;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getNmovie() {
		return nmovie;
	}

	public void setNmovie(String nmovie) {
		this.nmovie = nmovie;
	}

	public String getMrdate() {
		return mrdate;
	}

	public void setMrdate(String mrdate) {
		this.mrdate = mrdate;
	}

//	public List<String> getMlanguages() {
//		return mlanguages;
//	}
//
//	public void setMlanguages(List<String> mlanguages) {
//		this.mlanguages = mlanguages;
//	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	
	
	
	

}
