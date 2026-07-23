package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.domain.entity.Category;
import com.drigobarbosa.superapp.financial.domain.entity.Subcategory;
import com.drigobarbosa.superapp.financial.domain.enums.AccountType;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionMethod;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionType;
import com.drigobarbosa.superapp.financial.dto.transaction.request.CreateTransactionRequest;
import com.drigobarbosa.superapp.financial.mapper.TransactionMapper;
import com.drigobarbosa.superapp.financial.repository.AccountRepository;
import com.drigobarbosa.superapp.financial.repository.CategoryRepository;
import com.drigobarbosa.superapp.financial.repository.SubcategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TransactionServiceTest {

    @Mock
    AccountRepository accountRepository;

    @Mock
    CategoryRepository categoryRepository;

    @Mock
    SubcategoryRepository subcategoryRepository;

    @Mock
    TransactionMapper transactionMapper;

    @InjectMocks
    TransactionService transactionService;

    @Test
    void shouldCreateTransaction() {

        CreateTransactionRequest transactionRequest = new CreateTransactionRequest(
                "Testando a criação de uma nova transação!",
                new BigDecimal("100"),
                LocalDate.of(2026, 7, 22),
                UUID.fromString("77043c82-ba4f-4b47-8356-a3eef1798174"),
                1L,
                1L,
                TransactionType.INCOME,
                TransactionMethod.PIX
        );

        Account account = new Account();
        account.setId(UUID.fromString("77043c82-ba4f-4b47-8356-a3eef1798174"));
        account.setName("PRIMEIRA CARTEIRA");
        account.setType(AccountType.CASH);
        account.setBalance(new BigDecimal("0"));

        Subcategory subcategory = new Subcategory();
        subcategory.setId(1L);
        subcategory.setName("Uber");
        subcategory.setDescription("Valor gasto com Uber moto e carro");

        Category category = new Category();
        category.setId(1L);
        category.setName("Transporte");
        category.setDescription("Dedicado a valores dedicados a transporte.");

        when(accountRepository.findById(UUID.fromString("77043c82-ba4f-4b47-8356-a3eef1798174")))
                .thenReturn(Optional.of(account));

        when(categoryRepository.findById(1L))
                .thenReturn(Optional.of(category));

        when(subcategoryRepository.findById(1L))
                .thenReturn(Optional.of(subcategory));

        transactionService.createTransaction(transactionRequest);
    }
}
