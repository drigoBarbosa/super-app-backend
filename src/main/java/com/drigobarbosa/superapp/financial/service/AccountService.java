package com.drigobarbosa.superapp.financial.service;

import com.drigobarbosa.superapp.common.exception.BusinessException;
import com.drigobarbosa.superapp.common.exception.NotFoundException;
import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.dto.account.request.AccountRequest;
import com.drigobarbosa.superapp.financial.dto.account.response.AccountResponse;
import com.drigobarbosa.superapp.financial.mapper.AccountMapper;
import com.drigobarbosa.superapp.financial.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountService(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    public AccountResponse createAccount(AccountRequest request) {
        Account account = accountMapper.toEntity(request);
        Account accountSaved = accountRepository.save(account);
        return accountMapper.toResponse(accountSaved);
    }

    public AccountResponse updateAccount(AccountRequest accountRequest) {
        Account account = accountRepository.findById(accountRequest.id())
                .orElseThrow(() -> new NotFoundException("Account not found."));

        account = accountMapper.updateEntity(accountRequest, account);
        Account accountSaved = accountRepository.save(account);
        return accountMapper.toResponse(accountSaved);
    }
}
