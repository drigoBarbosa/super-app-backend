CREATE TABLE financial.tb_transaction
(
    id             UUID          PRIMARY KEY,
    description    VARCHAR(250)  NOT NULL,
    amount         DECIMAL(18,2) NOT NULL,
    dt_transaction DATE          NOT NULL,
    type           VARCHAR(40)   NOT NULL,
    method         VARCHAR(40)   NOT NULL,
    fk_account     UUID          NOT NULL,
    fk_category    BIGINT        NOT NULL,
    fk_subcategory BIGINT,
    created_at     TIMESTAMP     NOT NULL,
    updated_at     TIMESTAMP     NOT NULL,

    CONSTRAINT fk_transaction_account
        FOREIGN KEY (fk_account)
        REFERENCES financial.tb_account(id),

    CONSTRAINT fk_transaction_category
        FOREIGN KEY (fk_category)
        REFERENCES financial.tb_category(id),

    CONSTRAINT fk_transaction_subcategory
        FOREIGN KEY (fk_subcategory)
        REFERENCES financial.tb_subcategory(id)
);