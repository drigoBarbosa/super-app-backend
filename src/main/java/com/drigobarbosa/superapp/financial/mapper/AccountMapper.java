package com.drigobarbosa.superapp.financial.mapper;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.dto.account.request.CreateAccountRequest;
import com.drigobarbosa.superapp.financial.dto.account.response.CreateAccountResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AccountMapper {

    Account toEntity(
            CreateAccountRequest createAccountRequest
    );

    CreateAccountResponse toResponse(
            Account account
    );

}
