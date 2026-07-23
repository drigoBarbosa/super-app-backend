package com.drigobarbosa.superapp.financial.domain.enums;

/**
 * Representa o tipo de uma conta financeira utilizada para registrar
 * movimentações e controlar saldos dentro do sistema.
 *
 * <p>Cada tipo de conta possui uma finalidade específica e pode representar
 * contas bancárias, dinheiro físico, cartões, investimentos ou outras formas
 * de armazenamento e movimentação de recursos financeiros.</p>
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
 *       <td><b>CHECKING</b></td>
 *       <td>Conta corrente utilizada para movimentações do dia a dia.</td>
 *       <td>Conta corrente do Banco do Brasil, Nubank, Itaú</td>
 *     </tr>
 *     <tr>
 *       <td><b>SAVINGS</b></td>
 *       <td>Conta destinada à reserva de dinheiro com rendimento.</td>
 *       <td>Poupança da Caixa, Banco do Brasil</td>
 *     </tr>
 *     <tr>
 *       <td><b>CASH</b></td>
 *       <td>Dinheiro físico disponível em espécie.</td>
 *       <td>Carteira, caixa da empresa</td>
 *     </tr>
 *     <tr>
 *       <td><b>CREDIT_CARD</b></td>
 *       <td>Conta que representa um cartão de crédito para controle de faturas e limite.</td>
 *       <td>Cartão Nubank, Visa, Mastercard</td>
 *     </tr>
 *     <tr>
 *       <td><b>INVESTMENT</b></td>
 *       <td>Conta destinada a aplicações financeiras e investimentos.</td>
 *       <td>CDB, Tesouro Direto, ações, fundos imobiliários</td>
 *     </tr>
 *     <tr>
 *       <td><b>DIGITAL_WALLET</b></td>
 *       <td>Carteira digital utilizada para armazenar e movimentar saldo eletrônico.</td>
 *       <td>Mercado Pago, PicPay, PayPal</td>
 *     </tr>
 *     <tr>
 *       <td><b>LOAN</b></td>
 *       <td>Conta utilizada para controlar empréstimos ou financiamentos.</td>
 *       <td>Empréstimo pessoal, financiamento de veículo</td>
 *     </tr>
 *     <tr>
 *       <td><b>OTHER</b></td>
 *       <td>Outros tipos de contas que não se enquadram nas categorias anteriores.</td>
 *       <td>Caixinhas, cofres, contas personalizadas</td>
 *     </tr>
 *   </tbody>
 * </table>
 *
 * <p><b>Observação:</b> O tipo da conta auxilia na organização financeira,
 * na definição do comportamento das movimentações e na geração de relatórios,
 * não limitando as operações que podem ser realizadas sobre ela, salvo regras
 * específicas da aplicação.</p>
 */
public enum AccountType {

    CHECKING,
    SAVINGS,
    CASH,
    CREDIT_CARD,
    INVESTMENT,
    DIGITAL_WALLET,
    LOAN,
    OTHER

}
