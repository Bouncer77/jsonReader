package pro.kosenkov.json_reader.controller.v1;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.kosenkov.json_reader.dto.LroInfo;
import pro.kosenkov.json_reader.pojo.ResponseLroDto;

import java.io.File;
import java.io.IOException;

@RequestMapping("api/v1/info")
@RestController
@RequiredArgsConstructor
public class InfoController {

    @GetMapping(value = "/lro")
    public ResponseLroDto getInfo(String lroId) {

        ObjectMapper mapper = new ObjectMapper();

        // игнорировать неизвестные поля, иначе было бы выброшено исключение UnrecognizedPropertyException
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


        File file = new File("src/main/resources/json/" + lroId + ".json");

        if (!file.exists()) {
            System.out.println(file.getAbsolutePath());
            throw new RuntimeException("Файл не найден!");
        }

        ResponseLroDto lroInfo = null;
        try {
            lroInfo = mapper.readValue(file, ResponseLroDto.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lroInfo;
    }
}
