package com.drigobarbosa.superapp.financial.domain.entity;

import com.drigobarbosa.superapp.common.entity.AuditableEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Table(name = "tb_category", schema = "financial")
@Data
@EqualsAndHashCode(callSuper = true)
public class Category extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
    @SequenceGenerator(
            name = "category_seq",
            sequenceName = "financial.category_seq",
            allocationSize = 1
    )
    private Long id;

    @Column(length = 100)
    private String name;

    @Column(length = 250)
    private String description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Subcategory> subcategories;

}
