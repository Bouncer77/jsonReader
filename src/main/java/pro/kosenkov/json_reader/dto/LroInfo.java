package pro.kosenkov.json_reader.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
public class LroInfo {

    String title;

    LroDto lro;

    List<PersonDto> persons;
}
