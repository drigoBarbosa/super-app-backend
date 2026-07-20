CREATE TABLE financial.tb_transaction
(
    id             UUID          PRIMARY KEY,
    description    VARCHAR(250)  NOT NULL,
    amount         DECIMAL(18,2) NOT NULL,
    account_id     UUID          NOT NULL,
    category_id    BIGINT        NOT NULL,
    subcategory_id BIGINT,
    type           VARCHAR(40)   NOT NULL,
    method         VARCHAR(40)   NOT NULL,
    created_at     TIMESTAMP     NOT NULL,
    updated_at     TIMESTAMP     NOT NULL,

    CONSTRAINT fk_transaction_account
        FOREIGN KEY (account_id)
        REFERENCES financial.tb_account(id),

    CONSTRAINT fk_transaction_category
        FOREIGN KEY (category_id)
        REFERENCES financial.tb_category(id),

    CONSTRAINT fk_transaction_subcategory
        FOREIGN KEY (subcategory_id)
        REFERENCES financial.tb_subcategory(id)
);