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
            productRepository.save(Product.builder().name("Computer1").prix(20).quantite(30).build());
            productRepository.save(Product.builder().name("Computer2").prix(25).quantite(40).build());
            productRepository.save(Product.builder().name("Computer3").prix(30).quantite(50).build());
            productRepository.save(Product.builder().name("Computer4").prix(35).quantite(60).build());
            productRepository.save(Product.builder().name("Computer5").prix(40).quantite(70).build());
            productRepository.save(Product.builder().name("Computer6").prix(45).quantite(80).build());
            productRepository.save(Product.builder().name("Computer7").prix(50).quantite(90).build());
            productRepository.save(Product.builder().name("Computer8").prix(55).quantite(100).build());
            productRepository.save(Product.builder().name("Computer9").prix(60).quantite(110).build());
            productRepository.save(Product.builder().name("Computer10").prix(65).quantite(120).build());
            productRepository.save(Product.builder().name("Computer11").prix(70).quantite(130).build());
            productRepository.save(Product.builder().name("Computer12").prix(75).quantite(140).build());
            productRepository.save(Product.builder().name("Computer13").prix(80).quantite(150).build());
            productRepository.save(Product.builder().name("Computer14").prix(85).quantite(160).build());
            productRepository.save(Product.builder().name("Computer15").prix(90).quantite(170).build());
            productRepository.save(Product.builder().name("Computer16").prix(95).quantite(180).build());
            productRepository.save(Product.builder().name("Computer17").prix(100).quantite(190).build());
            productRepository.save(Product.builder().name("Computer18").prix(105).quantite(200).build());
            productRepository.save(Product.builder().name("Computer19").prix(110).quantite(210).build());
            productRepository.save(Product.builder().name("Computer20").prix(115).quantite(220).build());
        };
    }

}
