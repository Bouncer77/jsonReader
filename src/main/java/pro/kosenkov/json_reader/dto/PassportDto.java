package pro.kosenkov.json_reader.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
public class PassportDto {

    String fio;

    String number;

    String birthdate;

    int type;

    String registrationAddress;
}
