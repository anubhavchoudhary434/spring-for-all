package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
		
	private String firstName;
	private String lastName;
	
	// add field for drop down
	private String country;
	
	//add field if u donot want to give options in html
	private LinkedHashMap<String, String> countryOptions;
	
	// add field for radiobutton
	private String favoriteLanguage;
	
	// add field for checkboxes(can select multiple options)
	private String[] operatingSystems;
	
	public Student() 
	{
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("US", "USA");
		countryOptions.put("IN", "India");
		countryOptions.put("RUS", "Russia");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	

	
	
}
