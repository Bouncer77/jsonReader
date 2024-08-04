package pro.kosenkov.json_reader.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseLroDto{

	@JsonProperty("persons")
	private List<PersonsItem> persons;

	@JsonProperty("lro")
	private Lro lro;

	@JsonProperty("title")
	private String title;

	public List<PersonsItem> getPersons(){
		return persons;
	}

	public Lro getLro(){
		return lro;
	}

	public String getTitle(){
		return title;
	}
}