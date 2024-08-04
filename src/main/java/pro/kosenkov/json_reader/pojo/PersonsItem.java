package pro.kosenkov.json_reader.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PersonsItem{

	@JsonProperty("licenses")
	private List<LicensesItem> licenses;

	@JsonProperty("passport")
	private Passport passport;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("login")
	private String login;

	public List<LicensesItem> getLicenses(){
		return licenses;
	}

	public Passport getPassport(){
		return passport;
	}

	public String getPhone(){
		return phone;
	}

	public String getLogin(){
		return login;
	}
}