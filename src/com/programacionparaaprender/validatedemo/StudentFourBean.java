package com.programacionparaaprender.validatedemo;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

//import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Named;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;


@ManagedBean
@Named
@SessionScoped
public class StudentFourBean implements Serializable {
	   /**
		 * 
		 */
		private String language;
		private String firstName;
		private String lastName;
		private String email;
		private String country;
		private List<String> countryOptions;
		private List<String> languageOptions;
		private List<String> languageFavorites;
		private int freePasses;
		private int postalCode;
		private String phoneNumber;
		private String courseCode;
		
		public StudentFourBean() {
			// TODO Auto-generated constructor stub
		}
		
		@PostConstruct
	    public void init() {
			phoneNumber = "";
			firstName = "";
			lastName = "";
			country = "";
			countryOptions = new LinkedList<String>();
			countryOptions.add("Brazil");
			countryOptions.add("France");
			countryOptions.add("Germany");
			countryOptions.add("India");
			countryOptions.add("Turkey");
			countryOptions.add("United Kingdom");
			countryOptions.add("United Stated");
			countryOptions.add("Peru");
			countryOptions.add("Venezuela");
			
			languageFavorites = new LinkedList<String>();
			languageOptions = new LinkedList<String>();
			languageOptions.add("Python");
			languageOptions.add("Java");
			languageOptions.add("C");
			languageOptions.add("C++");
			languageOptions.add("Visual Basic .Net");
			languageOptions.add("C#");
			languageOptions.add("PHP");
			languageOptions.add("Ruby");
			languageOptions.add("Javascript");
			languageOptions.add("Typescript");
	    }
		
		public void validateTheCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException{
			if(value == null) {
				return;
			}
			String data = value.toString();
			//Course code must start with LUV ...
			if(!data.startsWith("LUV")) {
				FacesMessage message = new FacesMessage("Course code must start with LUV");
				throw new ValidatorException(message);
			}
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

		public List<String> getCountryOptions() {
			return countryOptions;
		}

		public void setCountryOptions(List<String> countryOptions) {
			this.countryOptions = countryOptions;
		}

		public List<String> getLanguageOptions() {
			return languageOptions;
		}

		public void setLanguageOptions(List<String> languageOptions) {
			this.languageOptions = languageOptions;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public List<String> getLanguageFavorites() {
			return languageFavorites;
		}

		public void setLanguageFavorites(List<String> languageFavorites) {
			this.languageFavorites = languageFavorites;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getFreePasses() {
			return freePasses;
		}

		public void setFreePasses(int freePasses) {
			this.freePasses = freePasses;
		}

		public int getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(int postalCode) {
			this.postalCode = postalCode;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getCourseCode() {
			return courseCode;
		}

		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}
		
		
}
