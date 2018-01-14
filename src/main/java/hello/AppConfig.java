package hello;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EntityScan("entity")
@EnableJpaRepositories(basePackages = "repository")
@ComponentScan(basePackages = "business")
public class AppConfig {
}
