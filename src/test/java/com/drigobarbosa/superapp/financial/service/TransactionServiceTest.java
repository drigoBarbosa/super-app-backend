package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.domain.entity.Category;
import com.drigobarbosa.superapp.financial.domain.entity.Subcategory;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionMethod;
import com.drigobarbosa.superapp.financial.domain.enums.TransactionType;
import com.drigobarbosa.superapp.financial.dto.transaction.request.CreateTransactionRequest;
import com.drigobarbosa.superapp.financial.repository.AccountRepository;
import com.drigobarbosa.superapp.financial.repository.CategoryRepository;
import com.drigobarbosa.superapp.financial.repository.SubcategoryRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
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

        Category category = new Category();
        category.setId(1L);

        Subcategory subcategory = new Subcategory();
        subcategory.setId(1L);

        when(accountRepository.findById(UUID.fromString("77043c82-ba4f-4b47-8356-a3eef1798174")))
                .thenReturn(Optional.of(account));

        TransactionService transactionService = new TransactionService();
        transactionService.createTransaction(transactionRequest);
    }
}
