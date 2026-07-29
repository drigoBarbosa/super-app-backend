package com.drigobarbosa.superapp.financial.dto.account.response;

import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
public record AccountResponse(
        UUID id,
        String name,
        AccountType type,
        BigDecimal balance,
        boolean active
) {};
