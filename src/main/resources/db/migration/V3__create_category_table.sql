CREATE SEQUENCE financial.category_seq
    START WITH 1
    INCREMENT BY 1;

CREATE TABLE financial.tb_category
(
    id          BIGINT DEFAULT NEXT VALUE FOR financial.category_seq PRIMARY KEY,
    name        VARCHAR(100)    NOT NULL,
    description VARCHAR(250)    NOT NULL,
    created_at  TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP
);