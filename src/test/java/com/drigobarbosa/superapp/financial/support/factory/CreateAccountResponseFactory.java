package com.drigobarbosa.superapp.financial.support.factory;

import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import com.drigobarbosa.superapp.financial.dto.account.response.CreateAccountResponse;

import java.math.BigDecimal;

public class CreateAccountResponseFactory {

    public static CreateAccountResponse cashInHand() {
        return CreateAccountResponse
                .builder()
                .name("Dinheiro em Mãos")
                .type(AccountType.CASH)
                .balance(BigDecimal.ZERO)
                .active(true)
                .build();
    }

}
