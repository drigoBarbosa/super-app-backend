package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import com.drigobarbosa.superapp.financial.dto.account.request.CreateAccountRequest;
import com.drigobarbosa.superapp.financial.dto.account.response.CreateAccountResponse;
import com.drigobarbosa.superapp.financial.dto.transaction.response.CreateTransactionResponse;
import com.drigobarbosa.superapp.financial.mapper.AccountMapper;
import com.drigobarbosa.superapp.financial.repository.AccountRepository;
import com.drigobarbosa.superapp.financial.support.factory.AccountFactory;
import com.drigobarbosa.superapp.financial.support.factory.CreateAccountRequestFactory;
import com.drigobarbosa.superapp.financial.support.factory.CreateAccountResponseFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @Mock
    private AccountMapper accountMapper;

    @InjectMocks
    AccountService accountService;

    @Test
    void shouldCreateAccountCashInHand() {
        // Arrange
        CreateAccountRequest request = CreateAccountRequestFactory.cashInHand();
        CreateAccountResponse response = CreateAccountResponseFactory.cashInHand();
        Account account = AccountFactory.cashInHand();

        when(accountRepository.save(any(Account.class)))
                .thenReturn(account);
        when(accountMapper.toEntity(request))
                .thenReturn(account);
        when(accountMapper.toResponse(account))
                .thenReturn(response);

        // ACT
        CreateAccountResponse result = accountService.createAccount(request);

        // Assert
        verify(accountMapper).toEntity(request);
        verify(accountRepository).save(account);
        verify(accountMapper).toResponse(account);
        assertEquals(response, result);
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
