package com.drigobarbosa.superapp.financial.support.factory;

import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import com.drigobarbosa.superapp.financial.dto.account.request.CreateAccountRequest;

import java.math.BigDecimal;

public class CreateAccountRequestFactory {

    public static CreateAccountRequest cashInHand() {
        return CreateAccountRequest
                .builder()
                .name("Dinheiro em Mãos")
                .type(AccountType.CASH)
                .balance(BigDecimal.ZERO)
                .build();
    }

}
