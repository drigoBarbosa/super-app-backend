create table financial.tb_account
(
    id         UUID             PRIMARY KEY,
    name       VARCHAR(255)     NOT NULL,
    balance    DECIMAL(18,2)    NOT NULL,
    type       VARCHAR(30)      NOT NULL,
    active     BOOLEAN          NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP        NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP        NOT NULL DEFAULT CURRENT_TIMESTAMP
);