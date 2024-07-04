package pro.kosenkov.json_reader.controller.v2;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.ResourcePatternResolver;
import pro.kosenkov.json_reader.dto.LroInfo;

// @RequestMapping("api/v2/info")
// @RestController
@RequiredArgsConstructor
public class InfoControllerV2 {

    private final ObjectMapper mapper;

    private final ResourcePatternResolver resolver;

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        // игнорировать неизвестные поля, иначе было бы выброшено исключение UnrecognizedPropertyException
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper;
    }

    public LroInfo getInfo(String lroIdRequest) {
        return null;
    }

}
