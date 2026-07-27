package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.dto.account.request.AccountRequest;
import com.drigobarbosa.superapp.financial.repository.AccountRepository;
import com.drigobarbosa.superapp.financial.support.factory.AccountFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    AccountService accountService;

    @Test
    void shouldCreateAccountCashInHand() {
        AccountRequest request = new AccountRequest();

        Account account = AccountFactory
                .cashInHand()
                .build();

        when(accountRepository.save(any(Account.class)))
                .thenReturn(account);

        account = accountService.createAccount(account);


    }

    @Test
    void updateAccount() {
    }

    @Test
    void getAccount() {

    }

    @Test
    void deleteAccount() {
    }
}
