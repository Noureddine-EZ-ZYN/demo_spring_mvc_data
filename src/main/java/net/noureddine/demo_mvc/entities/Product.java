package net.noureddine.demo_mvc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Product {
    @Id
    @GeneratedValue
    private Long id;

@NotEmpty
    private String name;
@Min(0)
    private double prix;
@Min(1)
    private double quantite;
}
