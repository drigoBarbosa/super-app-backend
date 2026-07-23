package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.common.exception.BusinessException;
import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.domain.entity.Category;
import com.drigobarbosa.superapp.financial.domain.entity.Subcategory;
import com.drigobarbosa.superapp.financial.domain.entity.Transaction;
import com.drigobarbosa.superapp.financial.dto.transaction.request.CreateTransactionRequest;
import com.drigobarbosa.superapp.financial.dto.transaction.response.CreateTransactionResponse;
import com.drigobarbosa.superapp.financial.mapper.TransactionMapper;
import com.drigobarbosa.superapp.financial.repository.AccountRepository;
import com.drigobarbosa.superapp.financial.repository.CategoryRepository;
import com.drigobarbosa.superapp.financial.repository.SubcategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TransactionService {

    private final AccountRepository accountRepository;
    private final CategoryRepository categoryRepository;
    private final SubcategoryRepository subcategoryRepository;
    private final TransactionMapper transactionMapper;

    public TransactionService(AccountRepository accountRepository, CategoryRepository categoryRepository, SubcategoryRepository subcategoryRepository,  TransactionMapper transactionMapper) {
        this.accountRepository = accountRepository;
        this.categoryRepository = categoryRepository;
        this.subcategoryRepository = subcategoryRepository;
        this.transactionMapper = transactionMapper;
    }

    public CreateTransactionResponse createTransaction(CreateTransactionRequest request) {
        Transaction transaction = new Transaction();

        try {
            Account account = accountRepository.findById(request.accountId())
                    .orElseThrow(() -> new BusinessException("Account not found."));
            Category category = categoryRepository.findById(request.categoryId())
                    .orElseThrow(()  -> new BusinessException("Category not found."));
            Subcategory subcategory = subcategoryRepository.findById(request.subcategoryId())
                    .orElseThrow(() -> new BusinessException("Subcategory not found."));

            transaction = transactionMapper.toEntity(request, account, category, subcategory);

            System.out.println(transaction);

        } catch (Exception e) {
            log.error("Erro ao tentar criar uma transação.", e);
        }
        return null;
    }

}
