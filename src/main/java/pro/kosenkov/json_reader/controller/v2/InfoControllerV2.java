package pro.kosenkov.json_reader.controller.v2;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.kosenkov.json_reader.dto.LroInfo;

import java.io.IOException;

@RequestMapping("api/v2/info")
@RestController
@RequiredArgsConstructor
public class InfoControllerV2 {

    private final ObjectMapper mapper;

    private final ResourcePatternResolver resolver;



    @GetMapping
    public LroInfo getInfo(String lroIdRequest) {

        String path = "classpath:json/" + lroIdRequest + ".json";

        if (!resolver.getResource(path).exists()) {
            throw new RuntimeException("Файл: " + path + " не найден");
        }

        try {
            return mapper.readValue(resolver.getResource(path).getInputStream(), LroInfo.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
