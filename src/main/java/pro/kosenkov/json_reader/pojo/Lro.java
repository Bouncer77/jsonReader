package pro.kosenkov.json_reader.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lro{

	@JsonProperty("year")
	private int year;

	@JsonProperty("name")
	private String name;

	@JsonProperty("region")
	private String region;

	public int getYear(){
		return year;
	}

	public String getName(){
		return name;
	}

	public String getRegion(){
		return region;
	}
}