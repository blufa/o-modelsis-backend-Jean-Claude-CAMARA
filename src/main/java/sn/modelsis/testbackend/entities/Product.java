package sn.modelsis.testbackend.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @CreatedDate
    private Date dateCreated;

    @Column(name = "producttype", unique = true, nullable = false)
    @ManyToOne
    private ProductType productType;
}
