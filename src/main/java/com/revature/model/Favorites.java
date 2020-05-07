package com.revature.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name = "Favorites")

public class Favorites {
	
	@Id
	@GeneratedValue(generator = "favorites_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "favorites_id_seq", allocationSize = 1)
	private int favoritesid;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="userId")
	private Users usersid;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="movieId")
	private Movies movieId;
	public Favorites() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Favorites(int favoritesId, Users user, Movies movie) {
		super();
		this.favoritesid = favoritesId;
		this.usersid = user;
		this.movieId = movie;
	}
	public int getFavoritesId() {
		return favoritesid;
	}
	public void setFavoritesId(int favoritesId) {
		this.favoritesid = favoritesId;
	}
	public Users getUser() {
		return usersid;
	}
	public void setUser(Users user) {
		this.usersid = user;
	}
	public Movies getMovie() {
		return movieId;
	}
	public void setMovie(Movies movie) {
		this.movieId = movie;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + favoritesid;
		result = prime * result + ((movieId == null) ? 0 : movieId.hashCode());
		result = prime * result + ((usersid == null) ? 0 : usersid.hashCode());
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
		Favorites other = (Favorites) obj;
		if (favoritesid != other.favoritesid)
			return false;
		if (movieId == null) {
			if (other.movieId != null)
				return false;
		} else if (!movieId.equals(other.movieId))
			return false;
		if (usersid == null) {
			if (other.usersid != null)
				return false;
		} else if (!usersid.equals(other.usersid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Favorites [favoritesId=" + favoritesid + ", user=" + usersid + ", movie=" + movieId + "]";
	}
	
	
}