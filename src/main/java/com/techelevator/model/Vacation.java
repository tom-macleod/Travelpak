package com.techelevator.model;

public class Vacation {

	private int vacationId;
	private String location;
	private String country;
	private String description;
	private int duration;
	private int price;
	private boolean accommodation;
	
	
	public int getVacationId() {
		return vacationId;
	}

	public void setVacationId(int vacationId) {
		this.vacationId = vacationId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAccommodation() {
		return accommodation;
	}

	public void setAccommodation(boolean accommodation) {
		this.accommodation = accommodation;
	}
	
}
