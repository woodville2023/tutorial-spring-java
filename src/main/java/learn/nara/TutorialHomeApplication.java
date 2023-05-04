package learn.nara;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@ComponentScan(basePackages = "learn.nara")
@SpringBootApplication
public class TutorialHomeApplication {
	private static final Logger logger = LoggerFactory.getLogger(TutorialHomeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TutorialHomeApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {

				logger.info("addCorsMappings DemoApplication ");
				registry.addMapping("/**")
					.allowedOrigins(
						"http://localhost:4500",   //rest calls allowed from localhost:4500
						"http://127.0.0.1:3000",  //rest calls allowed from 127.0.0.1:3000
						"http://localhost:63342")  //rest calls allowed from 127.0.0.1:63342
					//.allowedOrigins(corsOrigins)
					.allowedHeaders("*")
					//.allowedHeaders("origin", "content-type", "accept", "authorization", "hp_auth_token")
					//.exposedHeaders("header1", "header2")
					.allowedMethods("OPTION","GET", "POST", "PUT", "DELETE")
				;

				logger.info("registry :{}",registry);
			}
		};
	}
	
	@Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
		CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
		loggingFilter.setIncludeClientInfo(true);
		loggingFilter.setIncludeQueryString(true);
		loggingFilter.setIncludePayload(true);
		loggingFilter.setMaxPayloadLength(64000);
		return loggingFilter;
	}

}
