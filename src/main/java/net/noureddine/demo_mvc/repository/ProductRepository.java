package net.noureddine.demo_mvc.repository;

import net.noureddine.demo_mvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
