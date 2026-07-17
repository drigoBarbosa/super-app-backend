package com.drigobarbosa.superapp.financial.domain.enums;

/**
 * Representa o tipo de uma transação financeira.
 *
 * <p>Esses tipos definem o comportamento da movimentação no sistema,
 * incluindo impacto no saldo, fluxo de caixa e relatórios.</p>
 *
 * <h3>Tipos disponíveis</h3>
 * <table border="1" cellpadding="5" cellspacing="0">
 *   <thead>
 *     <tr>
 *       <th>Tipo</th>
 *       <th>Descrição</th>
 *       <th>Exemplos</th>
 *     </tr>
 *   </thead>
 *   <tbody>
 *     <tr>
 *       <td><b>INCOME</b></td>
 *       <td>Entrada de valor</td>
 *       <td>Salário, vendas, recebimentos</td>
 *     </tr>
 *     <tr>
 *       <td><b>EXPENSE</b></td>
 *       <td>Saída de valor</td>
 *       <td>Compras, contas, despesas operacionais</td>
 *     </tr>
 *     <tr>
 *       <td><b>TRANSFER</b></td>
 *       <td>Transferência entre contas internas</td>
 *       <td>PIX entre contas, TED interna</td>
 *     </tr>
 *     <tr>
 *       <td><b>INVESTMENT</b></td>
 *       <td>Aplicação de recursos</td>
 *       <td>Compra de ativos, aporte em investimentos</td>
 *     </tr>
 *     <tr>
 *       <td><b>YIELD</b></td>
 *       <td>Rendimento de investimento</td>
 *       <td>Juros, dividendos</td>
 *     </tr>
 *   </tbody>
 * </table>
 *
 * <p><b>Observação:</b> Transferências não impactam o resultado financeiro,
 * apenas a movimentação entre contas.</p>
 */
public enum TransactionType {

    /**
     * Entrada de valor no sistema.
     */
    INCOME,

    /**
     * Saída de valor do sistema.
     */
    EXPENSE,

    /**
     * Transferência entre contas internas.
     */
    TRANSFER,

    /**
     * Aplicação de recursos em investimentos.
     */
    INVESTMENT,

    /**
     * Rendimento proveniente de investimentos.
     */
    YIELD

}
