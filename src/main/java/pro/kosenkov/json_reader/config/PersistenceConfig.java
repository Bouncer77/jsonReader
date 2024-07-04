package pro.kosenkov.json_reader.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "pro.kosenkov.json_reader.repository")
public class PersistenceConfig {
}
