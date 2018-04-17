
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.imperium.repository")
@EntityScan(value="br.com.imperium.modelo")
public class ImperiumWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImperiumWebApplication.class, args);
	}

}