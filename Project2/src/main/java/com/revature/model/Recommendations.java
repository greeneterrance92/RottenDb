package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name="Recommendations")
public class Recommendations {
	
	@Id
	@GeneratedValue(generator = "recommendations_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "recommendations_id_seq", allocationSize = 1)
	private int recommendid;
	@ManyToOne
	@JoinColumn(name = "movieId")
	private int movie_id;
	@Column
	private String sender;
	@Column
	private String receiver;
	public Recommendations() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recommendations(int recommendid, int movie_id, String sender, String receiver) {
		super();
		this.recommendid = recommendid;
		this.movie_id = movie_id;
		this.sender = sender;
		this.receiver = receiver;
	}
	public int getRecommendid() {
		return recommendid;
	}
	public void setRecommendid(int recommendid) {
		this.recommendid = recommendid;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + movie_id;
		result = prime * result + ((receiver == null) ? 0 : receiver.hashCode());
		result = prime * result + recommendid;
		result = prime * result + ((sender == null) ? 0 : sender.hashCode());
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
		Recommendations other = (Recommendations) obj;
		if (movie_id != other.movie_id)
			return false;
		if (receiver == null) {
			if (other.receiver != null)
				return false;
		} else if (!receiver.equals(other.receiver))
			return false;
		if (recommendid != other.recommendid)
			return false;
		if (sender == null) {
			if (other.sender != null)
				return false;
		} else if (!sender.equals(other.sender))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Recommendations [recommendid=" + recommendid + ", movie_id=" + movie_id + ", sender=" + sender
				+ ", receiver=" + receiver + "]";
	} 
	
	
	
}
