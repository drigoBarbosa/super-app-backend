package com.drigobarbosa.superapp.financial.mapper;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.dto.account.request.AccountRequest;
import com.drigobarbosa.superapp.financial.dto.account.response.AccountResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountMapper {

    Account toEntity(
            AccountRequest accountRequest
    );

    AccountResponse toResponse(
            Account account
    );

    Account updateEntity(
            AccountRequest accountRequest,
            @MappingTarget Account account
    );

}
