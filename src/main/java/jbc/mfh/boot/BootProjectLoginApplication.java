package jbc.mfh.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class BootProjectLoginApplication  extends SpringBootServletInitializer {
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(BootProjectLoginApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(BootProjectLoginApplication.class, args);
	}
}
