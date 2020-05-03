package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table
public class Scream {

	@Id
	@GeneratedValue(generator="scream_id_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="scream_id_seq", allocationSize = 1)
	@Column
	private int id;
	@Column
	private String sound;
	
	public Scream() {
		
	}
	
	public Scream(int id, String sound) {
		super();
		this.id = id;
		this.sound = sound;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((sound == null) ? 0 : sound.hashCode());
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
		Scream other = (Scream) obj;
		if (id != other.id)
			return false;
		if (sound == null) {
			if (other.sound != null)
				return false;
		} else if (!sound.equals(other.sound))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Scream [id=" + id + ", sound=" + sound + "]";
	}
	
	
	
}
