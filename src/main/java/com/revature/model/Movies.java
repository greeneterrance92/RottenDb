package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name="Movies")

public class Movies {
	
	@Id
	@GeneratedValue(generator = "movies_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "movies_id_seq", allocationSize = 1)
	private int movieid;
	
	@Column
	private String moviename;
	
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movies(int movieId, String movieName) {
		super();
		this.movieid = movieId;
		this.moviename = movieName;
	}
	public int getMovieId() {
		return movieid;
	}
	public void setMovieId(int movieId) {
		this.movieid = movieId;
	}
	public String getMovieName() {
		return moviename;
	}
	public void setMovieName(String movieName) {
		this.moviename = movieName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + movieid;
		result = prime * result + ((moviename == null) ? 0 : moviename.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies other = (Movies) obj;
		if (movieid != other.movieid)
			return false;
		if (moviename == null) {
			if (other.moviename != null)
				return false;
		} else if (!moviename.equals(other.moviename))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Movies [movieId=" + movieid + ", movieName=" + moviename + "]";
	}
	
	
}
