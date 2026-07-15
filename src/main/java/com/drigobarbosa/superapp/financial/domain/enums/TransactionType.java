package com.drigobarbosa.superapp.financial.domain.enums;

/**
 * Situação	Tipo
 * Salário	INCOME
 * Mercado	EXPENSE
 * PIX entre contas	TRANSFER
 * Ajuste manual	ADJUSTMENT
 * Estorno	REFUND
 * Aplicação	INVESTMENT
 * Rendimento	YIELD
 * Tarifa bancária	FEE
 */
public enum TransactionType {

    INCOME,
    EXPENSE,
    TRANSFER,
    ADJUSTMENT,
    REFUND,
    INVESTMENT,
    YIELD,
    FEE

}
