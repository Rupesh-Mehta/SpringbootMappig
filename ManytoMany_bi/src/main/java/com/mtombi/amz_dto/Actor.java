package com.mtombi.amz_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String aname;
	private long amno;
	private int age;
//	private List<String> arole;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name="aid"),inverseJoinColumns = @JoinColumn(name="mid"))
	private List<Movie> movies;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "actor")
	private List<Manyrole> manyroles;

	public List<Manyrole> getManyroles() {
		return manyroles;
	}

	public void setManyroles(List<Manyrole> manyroles) {
		this.manyroles = manyroles;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public long getAmno() {
		return amno;
	}

	public void setAmno(long amno) {
		this.amno = amno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public List<String> getArole() {
//		return arole;
//	}
//
//	public void setArole(List<String> arole) {
//		this.arole = arole;
//	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

}
