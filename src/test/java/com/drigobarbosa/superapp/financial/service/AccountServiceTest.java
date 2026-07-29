package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import com.drigobarbosa.superapp.financial.dto.account.request.AccountRequest;
import com.drigobarbosa.superapp.financial.dto.account.response.AccountResponse;
import com.drigobarbosa.superapp.financial.mapper.AccountMapper;
import com.drigobarbosa.superapp.financial.repository.AccountRepository;
import com.drigobarbosa.superapp.financial.support.factory.AccountFactory;
import com.drigobarbosa.superapp.financial.support.factory.AccountRequestFactory;
import com.drigobarbosa.superapp.financial.support.factory.AccountResponseFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertAll;
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

    @Captor
    ArgumentCaptor<Account> accountCaptor;

    @InjectMocks
    private AccountService accountService;

    private static final UUID ACCOUNT_ID =
            UUID.fromString("550e8400-e29b-41d4-a716-446655440000");

    @Test
    void shouldCreateAccountCashInHand() {
        // Arrange
        AccountRequest accountRequest = AccountRequestFactory.cashInHand().build();
        AccountResponse accountResponse = AccountResponseFactory.cashInHand().build();
        Account account = AccountFactory.cashInHand().build();

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
    void shouldUpdateAccountCashInHandForDigitalWallet() {
        AccountRequest accountRequest = AccountRequestFactory
                .cashInHand()
                .id(ACCOUNT_ID)
                .name("Mudando nome")
                .type(AccountType.DIGITAL_WALLET)
                .balance(BigDecimal.valueOf(100L))
                .build();

        AccountResponse accountResponse = AccountResponseFactory
                .cashInHand()
                .id(ACCOUNT_ID)
                .name("Mudando nome")
                .type(AccountType.DIGITAL_WALLET)
                .balance(BigDecimal.valueOf(100L))
                .build();

        Account account = Account.builder()
                .id(ACCOUNT_ID)
                .name("Dinheiro em Mãos")
                .type(AccountType.CASH)
                .balance(BigDecimal.ZERO)
                .active(true)
                .build();

        when(accountRepository.findById(accountRequest.id())).thenReturn(Optional.of(account));
        when(accountRepository.save(any(Account.class))).thenReturn(account);
        when(accountMapper.toResponse(account)).thenReturn(accountResponse);

        AccountResponse result = accountService.updateAccount(accountRequest);

        verify(accountRepository)
                .findById(account.getId());
        verify(accountMapper)
                .updateEntity(accountRequest, account);
        verify(accountMapper)
                .toResponse(account);
        verify(accountRepository)
                .save(accountCaptor.capture());

        assertEquals(accountResponse, result);

        Account saved = accountCaptor.getValue();
        assertAll(
                () -> assertEquals(
                        "Mudando nome",
                        saved.getName()
                ),
                () -> assertEquals(
                        AccountType.DIGITAL_WALLET,
                        saved.getType()
                ),
                () -> assertEquals(
                        BigDecimal.valueOf(100),
                        saved.getBalance()
                )

        );
    }

    @Test
    void getAccount() {

    }

    @Test
    void deleteAccount() {
    }
}
