package pro.kosenkov.json_reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJsonReaderApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringJsonReaderApplication.class, args);
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

}
