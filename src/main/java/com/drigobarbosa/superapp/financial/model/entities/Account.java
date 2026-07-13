package com.drigobarbosa.superapp.financial.model.entities;

import com.drigobarbosa.superapp.financial.model.enums.AccountType;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_account", schema = "financial")
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private AccountType type;

    private BigDecimal balance;

    private boolean active;

    private LocalDateTime lastUpdate;

}
