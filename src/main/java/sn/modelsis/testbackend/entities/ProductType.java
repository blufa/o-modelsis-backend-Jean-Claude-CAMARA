package sn.modelsis.testbackend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "product_type")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productype_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "productType")
    @JoinColumn(name = "product_id")
    private List<Product> products;

}
