package com.drigobarbosa.superapp.financial.domain.entity;

import com.drigobarbosa.superapp.common.entity.AuditableEntity;
import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Auditable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_account", schema = "financial")
@Data
@EqualsAndHashCode(callSuper = true)
public class Account extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountType type;

    @Column(nullable = false)
    private BigDecimal balance;

    @Column(nullable = false)
    private boolean active;


}
