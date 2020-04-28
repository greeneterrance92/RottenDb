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
	@JoinColumn(name = "username")
	private String user_name;
	@ManyToOne
	@JoinColumn(name = "movieId")
	private int movie_id;
	public Favorites() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Favorites(int favoritesId, String user_name, int movie_id) {
		super();
		this.favoritesId = favoritesId;
		this.user_name = user_name;
		this.movie_id = movie_id;
	}
	public int getFavoritesId() {
		return favoritesId;
	}
	public void setFavoritesId(int favoritesId) {
		this.favoritesId = favoritesId;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + favoritesId;
		result = prime * result + movie_id;
		result = prime * result + ((user_name == null) ? 0 : user_name.hashCode());
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
		if (movie_id != other.movie_id)
			return false;
		if (user_name == null) {
			if (other.user_name != null)
				return false;
		} else if (!user_name.equals(other.user_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Favorites [favoritesId=" + favoritesId + ", user_name=" + user_name + ", movie_id=" + movie_id + "]";
	}
	
	
}
