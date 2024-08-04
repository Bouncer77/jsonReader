package pro.kosenkov.json_reader.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passport{

	@JsonProperty("number")
	private String number;

	@JsonProperty("birthdate")
	private String birthdate;

	@JsonProperty("registrationAddress")
	private String registrationAddress;

	@JsonProperty("type")
	private int type;

	@JsonProperty("fio")
	private String fio;

	public String getNumber(){
		return number;
	}

	public String getBirthdate(){
		return birthdate;
	}

	public String getRegistrationAddress(){
		return registrationAddress;
	}

	public int getType(){
		return type;
	}

	public String getFio(){
		return fio;
	}
}