package ma.solide.solide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "ma.solide.solide.entities")
@EnableJpaRepositories(basePackages = "ma.solide.solide")
public class SpringboothibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboothibernateApplication.class, args);
	}

}
