CREATE TABLE financial.tb_transaction
(
    id           UUID         PRIMARY KEY,
    description  VARCHAR(250) NOT NULL,
    type         VARCHAR(40)  NOT NULL,
    method       VARCHAR(40)  NOT NULL,
    account_type VARCHAR(40)  NOT NULL,
    created_at   TIMESTAMP    NOT NULL,
    updated_at   TIMESTAMP    NOT NULL
);