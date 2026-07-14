CREATE TABLE financial.tb_subcategory
(
    id          UUID PRIMARY KEY,
    name        VARCHAR(100) NOT NULL,
    category_id UUID         NOT NULL,

    CONSTRAINT fk_subcategory_category
        FOREIGN KEY (category_id)
        REFERENCES financial.tb_category(id)
);