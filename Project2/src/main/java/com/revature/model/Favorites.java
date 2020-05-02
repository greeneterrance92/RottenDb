package com.revature.model;

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
	private int favoritesId;
	@ManyToOne
	private Users user;
	@ManyToOne
	private Movies movie;
	public Favorites() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Favorites(int favoritesId, Users user, Movies movie) {
		super();
		this.favoritesId = favoritesId;
		this.user = user;
		this.movie = movie;
	}
	public int getFavoritesId() {
		return favoritesId;
	}
	public void setFavoritesId(int favoritesId) {
		this.favoritesId = favoritesId;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Movies getMovie() {
		return movie;
	}
	public void setMovie(Movies movie) {
		this.movie = movie;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + favoritesId;
		result = prime * result + ((movie == null) ? 0 : movie.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		if (favoritesId != other.favoritesId)
			return false;
		if (movie == null) {
			if (other.movie != null)
				return false;
		} else if (!movie.equals(other.movie))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Favorites [favoritesId=" + favoritesId + ", user=" + user + ", movie=" + movie + "]";
	}
	
	
}