package net.noureddine.demo_mvc;


import net.noureddine.demo_mvc.entities.Product;
import net.noureddine.demo_mvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMvcApplication.class, args);
    }
    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .name("Computer")
                    .prix(20)
                    .quantite(30)
                    .build());
            productRepository.save(Product.builder()
                    .name("Computer2")
                    .prix(20)
                    .quantite(30)
                    .build());
            productRepository.save(Product.builder()
                    .name("Computer3")
                    .prix(20)
                    .quantite(30)
                    .build());
        };
    }

}
