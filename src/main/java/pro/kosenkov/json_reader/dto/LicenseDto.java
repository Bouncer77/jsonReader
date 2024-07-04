package pro.kosenkov.json_reader.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
public class LicenseDto {

    String number;

    int type;

    String startDate;

    String endDate;
}
