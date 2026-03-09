package net.noureddine.demo_mvc.repository;

import net.noureddine.demo_mvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface ProductRepository extends JpaRepository<Product,Long> {
   Page<Product> findByNameContains(String keyword, Pageable pageable);

}
