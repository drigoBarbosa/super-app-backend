package com.drigobarbosa.superapp.financial.support.factory;

import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import com.drigobarbosa.superapp.financial.dto.account.request.AccountRequest;

import java.math.BigDecimal;

public class AccountRequestFactory {

    public static AccountRequest cashInHand() {
        return AccountRequest
                .builder()
                .name("Dinheiro em Mãos")
                .type(AccountType.CASH)
                .balance(BigDecimal.ZERO)
                .build();
    }

}
