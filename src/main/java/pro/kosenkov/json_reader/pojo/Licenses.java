package pro.kosenkov.json_reader.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Licenses{

	@JsonProperty("number")
	private String number;

	@JsonProperty("endDate")
	private String endDate;

	@JsonProperty("type")
	private int type;

	@JsonProperty("startDate")
	private String startDate;

	public String getNumber(){
		return number;
	}

	public String getEndDate(){
		return endDate;
	}

	public int getType(){
		return type;
	}

	public String getStartDate(){
		return startDate;
	}
}