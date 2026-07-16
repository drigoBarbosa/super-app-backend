package com.drigobarbosa.superapp.financial.domain.entity;

import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import com.drigobarbosa.superapp.financial.domain.enums.PaymentMethod;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_transaction", schema = "financial")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String description;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentMethod method;
}
