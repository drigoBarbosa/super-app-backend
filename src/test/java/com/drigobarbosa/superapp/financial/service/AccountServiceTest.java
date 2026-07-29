package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.dto.account.request.AccountRequest;
import com.drigobarbosa.superapp.financial.dto.account.response.AccountResponse;
import com.drigobarbosa.superapp.financial.mapper.AccountMapper;
import com.drigobarbosa.superapp.financial.repository.AccountRepository;
import com.drigobarbosa.superapp.financial.support.factory.AccountFactory;
import com.drigobarbosa.superapp.financial.support.factory.AccountRequestFactory;
import com.drigobarbosa.superapp.financial.support.factory.AccountResponseFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
        AccountRequest accountRequest = AccountRequestFactory.cashInHand();
        AccountResponse accountResponse = AccountResponseFactory.cashInHand();
        Account account = AccountFactory.cashInHand();

        when(accountRepository.save(any(Account.class)))
                .thenReturn(account);
        when(accountMapper.toEntity(accountRequest))
                .thenReturn(account);
        when(accountMapper.toResponse(account))
                .thenReturn(accountResponse);

        // ACT
        AccountResponse result = accountService.createAccount(accountRequest);

        // Assert
        verify(accountMapper).toEntity(accountRequest);
        verify(accountRepository).save(account);
        verify(accountMapper).toResponse(account);
        assertEquals(accountResponse, result);
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
