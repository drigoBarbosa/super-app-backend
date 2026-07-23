package com.drigobarbosa.superapp.financial.domain.entity;

import com.drigobarbosa.superapp.common.entity.AuditableEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_subcategory", schema = "financial")
@Data
@EqualsAndHashCode(callSuper = false)
public class Subcategory extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subcategory_seq")
    @SequenceGenerator(
            name = "subcategory_seq",
            sequenceName = "financial.subcategory_seq",
            allocationSize = 1
    )
    private Long id;

    @Column(length = 100)
    private String name;

    @Column(length = 250)
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
