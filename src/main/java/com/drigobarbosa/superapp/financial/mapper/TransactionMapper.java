package com.drigobarbosa.superapp.financial.mapper;

import com.drigobarbosa.superapp.financial.domain.entity.Account;
import com.drigobarbosa.superapp.financial.domain.entity.Category;
import com.drigobarbosa.superapp.financial.domain.entity.Subcategory;
import com.drigobarbosa.superapp.financial.domain.entity.Transaction;
import com.drigobarbosa.superapp.financial.dto.transaction.request.CreateTransactionRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TransactionMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "description", source = "transactionRequest.description")
    @Mapping(target = "type", source = "transactionRequest.type")
    @Mapping(source = "account", target = "account")
    @Mapping(source = "category", target = "category")
    @Mapping(source = "subcategory", target = "subcategory")
    Transaction toEntity(
            CreateTransactionRequest transactionRequest,
            Account account,
            Category category,
            Subcategory subcategory
    );
}
