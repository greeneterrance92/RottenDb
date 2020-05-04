package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name = "Reviews")

public class Reviews {
	//had to rearrange fields to match order in database
	@Id
	@GeneratedValue(generator = "reviews_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "reviews_id_seq", allocationSize = 1)
	private int reviewid;
	@Column
	private double acting; //can be null
	@Column
	private double audioscore;
	@Column
	private String availability;
	@Column
	private String category;
	@Column
	private double cinematography;
	@Column
	private String genre;
	@Column
	private String lengthtime;
	@Column
	private String mpaarating;
	@Column
	private double overallrating;
	@Column
	private String reviewname;
	@Column
	private double runtime; //minutes
	@Column
	private double story;
	@Column
	private String synopsis;
	
	
	public Reviews(int reviewid, double acting, double audioscore, String availability, String category,
			double cinematography, String genre, String lengthtime, String mpaarating, double overallrating,
			String reviewname, double runtime, double story, String synopsis) {
		super();
		this.reviewid = reviewid;
		this.acting = acting;
		this.audioscore = audioscore;
		this.availability = availability;
		this.category = category;
		this.cinematography = cinematography;
		this.genre = genre;
		this.lengthtime = lengthtime;
		this.mpaarating = mpaarating;
		this.overallrating = overallrating;
		this.reviewname = reviewname;
		this.runtime = runtime;
		this.story = story;
		this.synopsis = synopsis;
	}
	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getReviewId() {
		return reviewid;
	}
	public void setReviewId(int reviewId) {
		this.reviewid = reviewId;
	}
	public String getReviewName() {
		return reviewname;
	}
	public void setReviewName(String reviewName) {
		this.reviewname = reviewName;
	}
	public String getMpaaRating() {
		return mpaarating;
	}
	public void setMpaaRating(String mpaaRating) {
		this.mpaarating = mpaaRating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getRuntime() {
		return runtime;
	}
	public void setRuntime(double runtime) {
		this.runtime = runtime;
	}
	public String getLengthTime() {
		return lengthtime;
	}
	public void setLengthTime(String lengthTime) {
		this.lengthtime = lengthTime;
	}
	public double getCinematography() {
		return cinematography;
	}
	public void setCinematography(double cinematography) {
		this.cinematography = cinematography;
	}
	public double getAudioScore() {
		return audioscore;
	}
	public void setAudioScore(double audioScore) {
		this.audioscore = audioScore;
	}
	public double getStory() {
		return story;
	}
	public void setStory(double story) {
		this.story = story;
	}
	public double getActing() {
		return acting;
	}
	public void setActing(double acting) {
		this.acting = acting;
	}
	public double getOverallRating() {
		return overallrating;
	}
	public void setOverallRating(double overallRating) {
		this.overallrating = overallRating;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(acting);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(audioscore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((availability == null) ? 0 : availability.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		temp = Double.doubleToLongBits(cinematography);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((lengthtime == null) ? 0 : lengthtime.hashCode());
		result = prime * result + ((mpaarating == null) ? 0 : mpaarating.hashCode());
		temp = Double.doubleToLongBits(overallrating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + reviewid;
		result = prime * result + ((reviewname == null) ? 0 : reviewname.hashCode());
		temp = Double.doubleToLongBits(runtime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(story);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((synopsis == null) ? 0 : synopsis.hashCode());
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
		Reviews other = (Reviews) obj;
		if (Double.doubleToLongBits(acting) != Double.doubleToLongBits(other.acting))
			return false;
		if (Double.doubleToLongBits(audioscore) != Double.doubleToLongBits(other.audioscore))
			return false;
		if (availability == null) {
			if (other.availability != null)
				return false;
		} else if (!availability.equals(other.availability))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (Double.doubleToLongBits(cinematography) != Double.doubleToLongBits(other.cinematography))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (lengthtime == null) {
			if (other.lengthtime != null)
				return false;
		} else if (!lengthtime.equals(other.lengthtime))
			return false;
		if (mpaarating == null) {
			if (other.mpaarating != null)
				return false;
		} else if (!mpaarating.equals(other.mpaarating))
			return false;
		if (Double.doubleToLongBits(overallrating) != Double.doubleToLongBits(other.overallrating))
			return false;
		if (reviewid != other.reviewid)
			return false;
		if (reviewname == null) {
			if (other.reviewname != null)
				return false;
		} else if (!reviewname.equals(other.reviewname))
			return false;
		if (Double.doubleToLongBits(runtime) != Double.doubleToLongBits(other.runtime))
			return false;
		if (Double.doubleToLongBits(story) != Double.doubleToLongBits(other.story))
			return false;
		if (synopsis == null) {
			if (other.synopsis != null)
				return false;
		} else if (!synopsis.equals(other.synopsis))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Reviews [reviewid=" + reviewid + ", acting=" + acting + ", audioscore=" + audioscore + ", availability="
				+ availability + ", category=" + category + ", cinematography=" + cinematography + ", genre=" + genre
				+ ", lengthtime=" + lengthtime + ", mpaarating=" + mpaarating + ", overallrating=" + overallrating
				+ ", reviewname=" + reviewname + ", runtime=" + runtime + ", story=" + story + ", synopsis=" + synopsis
				+ "]";
	}
	
}
