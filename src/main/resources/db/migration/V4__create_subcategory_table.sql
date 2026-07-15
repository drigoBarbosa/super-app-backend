CREATE SEQUENCE financial.subcategory_seq
    START WITH 1
    INCREMENT BY 1;

CREATE TABLE financial.tb_subcategory
(
    id          BIGINT DEFAULT NEXT VALUE FOR financial.subcategory_seq PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    description VARCHAR(250) NOT NULL,
    category_id BIGINT         NOT NULL,
    created_at  TIMESTAMP    NOT NULL,
    updated_at  TIMESTAMP    NOT NULL,

    CONSTRAINT fk_subcategory_category
        FOREIGN KEY (category_id)
        REFERENCES financial.tb_category(id)
);