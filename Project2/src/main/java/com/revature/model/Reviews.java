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
	
	@Id
	@GeneratedValue(generator = "reviews_id_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "reviews_id_seq", allocationSize = 1)
	private int reviewId;
	@Column
	private String reviewName;
	@Column
	private String mpaaRating;
	@Column
	private String genre;
	@Column
	private String synopsis;
	@Column
	private String category;
	@Column
	private double runtime; //minutes
	@Column
	private String lengthTime;
	@Column
	private double cinematography;
	@Column
	private double audioScore;
	@Column
	private double story;
	@Column
	private double acting; //can be null
	@Column
	private double overallRating;
	@Column
	private String availability;
	
	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reviews(int reviewId, String reviewName, String mpaaRating, String genre, String synopsis, String category,
			double runtime, String lengthTime, double cinematography, double audioScore, double story, double acting,
			double overallRating, String availability) {
		super();
		this.reviewId = reviewId;
		this.reviewName = reviewName;
		this.mpaaRating = mpaaRating;
		this.genre = genre;
		this.synopsis = synopsis;
		this.category = category;
		this.runtime = runtime;
		this.lengthTime = lengthTime;
		this.cinematography = cinematography;
		this.audioScore = audioScore;
		this.story = story;
		this.acting = acting;
		this.overallRating = overallRating;
		this.availability = availability;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewName() {
		return reviewName;
	}
	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}
	public String getMpaaRating() {
		return mpaaRating;
	}
	public void setMpaaRating(String mpaaRating) {
		this.mpaaRating = mpaaRating;
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
		return lengthTime;
	}
	public void setLengthTime(String lengthTime) {
		this.lengthTime = lengthTime;
	}
	public double getCinematography() {
		return cinematography;
	}
	public void setCinematography(double cinematography) {
		this.cinematography = cinematography;
	}
	public double getAudioScore() {
		return audioScore;
	}
	public void setAudioScore(double audioScore) {
		this.audioScore = audioScore;
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
		return overallRating;
	}
	public void setOverallRating(double overallRating) {
		this.overallRating = overallRating;
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
		temp = Double.doubleToLongBits(audioScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((availability == null) ? 0 : availability.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		temp = Double.doubleToLongBits(cinematography);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((lengthTime == null) ? 0 : lengthTime.hashCode());
		result = prime * result + ((mpaaRating == null) ? 0 : mpaaRating.hashCode());
		temp = Double.doubleToLongBits(overallRating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + reviewId;
		result = prime * result + ((reviewName == null) ? 0 : reviewName.hashCode());
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
		if (Double.doubleToLongBits(audioScore) != Double.doubleToLongBits(other.audioScore))
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
		if (lengthTime == null) {
			if (other.lengthTime != null)
				return false;
		} else if (!lengthTime.equals(other.lengthTime))
			return false;
		if (mpaaRating == null) {
			if (other.mpaaRating != null)
				return false;
		} else if (!mpaaRating.equals(other.mpaaRating))
			return false;
		if (Double.doubleToLongBits(overallRating) != Double.doubleToLongBits(other.overallRating))
			return false;
		if (reviewId != other.reviewId)
			return false;
		if (reviewName == null) {
			if (other.reviewName != null)
				return false;
		} else if (!reviewName.equals(other.reviewName))
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
		return "Reviews [reviewId=" + reviewId + ", reviewName=" + reviewName + ", mpaaRating=" + mpaaRating
				+ ", genre=" + genre + ", synopsis=" + synopsis + ", category=" + category + ", runtime=" + runtime
				+ ", lengthTime=" + lengthTime + ", cinematography=" + cinematography + ", audioScore=" + audioScore
				+ ", story=" + story + ", acting=" + acting + ", overallRating=" + overallRating + ", availability="
				+ availability + "]";
	}
	
	
}
