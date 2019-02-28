import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com"})
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class AnimalSpringBootApplication
{
    public static void main(String[] args) {

        SpringApplication.run(AnimalSpringBootApplication.class, args);
    }
}
