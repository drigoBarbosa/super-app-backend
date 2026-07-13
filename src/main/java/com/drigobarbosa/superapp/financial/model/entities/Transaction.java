package com.drigobarbosa.superapp.financial.model.entities;

import com.drigobarbosa.superapp.financial.model.enums.AccountType;
import com.drigobarbosa.superapp.financial.model.enums.PaymentMethod;
import com.drigobarbosa.superapp.financial.model.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_transaction", schema = "financial")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @Enumerated(EnumType.STRING)
    private PaymentMethod method;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private LocalDateTime lastUpdate;

}
