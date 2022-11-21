package demo.springdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdatarestApplication implements CommandLineRunner {

	@Autowired
	HomeRepository homeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatarestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		homeRepository.save(new Home("Joe"));
		homeRepository.save(new Home("Jack"));
	}
}
