-- public.company definition
-- Drop table
-- DROP TABLE public.company;
CREATE TABLE public.company (
    id varchar(191) NOT NULL,
    "name" varchar(30) NOT NULL,
    brand_name varchar(30) NOT NULL,
    logo_url varchar(100) NOT NULL,
    slogan varchar(100) NULL,
    address varchar(191) NOT NULL,
    phone varchar(15) NOT NULL,
    email varchar(50) NOT NULL,
    active int4 NOT NULL DEFAULT 1,
    created_by varchar(191) NULL,
    update_by varchar(191) NULL,
    created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT company_pkey PRIMARY KEY (id)
);

-- public.currency definition
-- Drop table
-- DROP TABLE public.currency;
CREATE TABLE public.currency (
    id bigserial NOT NULL,
    code varchar(191) NOT NULL,
    "name" varchar(191) NOT NULL,
    symbol varchar(191) NOT NULL,
    created_at timestamp NULL,
    updated_at timestamp NULL,
    CONSTRAINT currency_pkey PRIMARY KEY (id)
);

-- public.customer definition
-- Drop table
-- DROP TABLE public.customer;
CREATE TABLE public.customer (
    id varchar(191) NOT NULL,
    "name" varchar(191) NOT NULL,
    code varchar(191) NOT NULL,
    group_id varchar(191) NULL,
    email varchar(191) NULL,
    phone varchar(20) NULL,
    address_id varchar(200) NULL,
    bod timestamp NULL,
    active int4 NOT NULL DEFAULT 1,
    created_by varchar(191) NULL,
    updated_by varchar(191) NULL,
    created_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT customer_code_unique UNIQUE (code),
    CONSTRAINT customer_pkey PRIMARY KEY (id)
);

-- public.customer_group definition
-- Drop table
-- DROP TABLE public.customer_group;
CREATE TABLE public.customer_group (
    id varchar(191) NOT NULL,
    "name" varchar(100) NOT NULL,
    description varchar(191) NULL,
    active int4 NOT NULL DEFAULT 1,
    created_by varchar(191) NULL,
    updated_by varchar(191) NULL,
    created_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT customer_group_name_unique UNIQUE (name),
    CONSTRAINT customer_group_pkey PRIMARY KEY (id)
);

-- public.order_detail definition
-- Drop table
-- DROP TABLE public.order_detail;
CREATE TABLE public.order_detail (
    id varchar(191) NOT NULL,
    order_id varchar(191) NOT NULL,
    product_id varchar(191) NOT NULL,
    quantity int4 NOT NULL,
    amount float8 NOT NULL,
    active int4 NOT NULL DEFAULT 1,
    created_by varchar(191) NULL,
    updated_by varchar(191) NULL,
    created_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT order_detail_pkey PRIMARY KEY (id)
);

-- public.orders definition
-- Drop table
-- DROP TABLE public.orders;
CREATE TABLE public.orders (
    id varchar(191) NOT NULL,
    customer_id varchar(191) NOT NULL,
    money_total float8 NULL,
    money_discount float8 NULL,
    payment_method_id varchar(191) NULL,
    active int4 NOT NULL DEFAULT 1,
    created_by varchar(191) NULL,
    updated_by varchar(191) NULL,
    created_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT orders_pkey PRIMARY KEY (id)
);

-- public.product definition
-- Drop table
-- DROP TABLE public.product;
CREATE TABLE public.product (
    id varchar(191) NOT NULL,
    "name" varchar(191) NOT NULL,
    code varchar(191) NOT NULL,
    category_id varchar(191) NOT NULL,
    cost_price float8 NOT NULL DEFAULT '0' :: double precision,
    sale_price float8 NOT NULL DEFAULT '0' :: double precision,
    promo_price float8 NOT NULL DEFAULT '0' :: double precision,
    image varchar(191) NULL,
    description varchar(2000) NULL,
    unit_id varchar(191) NULL,
    in_stock int4 NOT NULL DEFAULT 1,
    max_in_stock int4 NOT NULL DEFAULT 10,
    min_in_stock int4 NOT NULL DEFAULT 1,
    active int4 NOT NULL DEFAULT 1,
    created_by varchar(191) NULL,
    updated_by varchar(191) NULL,
    created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    created_date timestamp NULL,
    updated_date timestamp NULL,
    product_unit_id varchar(70) NULL,
    CONSTRAINT product_code_unique UNIQUE (code),
    CONSTRAINT product_name_unique UNIQUE (name),
    CONSTRAINT product_pkey PRIMARY KEY (id)
);

-- public.product_category definition
-- Drop table
-- DROP TABLE public.product_category;
CREATE TABLE public.product_category (
    id varchar(191) NOT NULL,
    "name" varchar(191) NOT NULL,
    short_name varchar(191) NULL,
    description varchar(300) NULL,
    active int4 NOT NULL DEFAULT 1,
    created_by varchar(191) NULL,
    updated_by varchar(191) NULL,
    created_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    created_date timestamp NULL,
    updated_date timestamp NULL,
    CONSTRAINT product_category_name_unique UNIQUE (name),
    CONSTRAINT product_category_pkey PRIMARY KEY (id)
);

-- public."role" definition
-- Drop table
-- DROP TABLE public."role";
CREATE TABLE public."role" (
    id varchar(191) NOT NULL,
    "name" varchar(191) NOT NULL,
    active int4 NOT NULL DEFAULT 1,
    created_by varchar(191) NULL,
    updated_by varchar(191) NULL,
    created_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT role_name_unique UNIQUE (name),
    CONSTRAINT role_pkey PRIMARY KEY (id)
);

-- public.sessions definition
-- Drop table
-- DROP TABLE public.sessions;
CREATE TABLE public.sessions (
    id varchar(191) NOT NULL,
    user_id int8 NULL,
    ip_address varchar(45) NULL,
    user_agent text NULL,
    payload text NOT NULL,
    last_activity int4 NOT NULL,
    CONSTRAINT sessions_id_unique UNIQUE (id)
);

-- public.users definition
-- Drop table
-- DROP TABLE public.users;
CREATE TABLE public.users (
    id varchar(191) NOT NULL,
    username varchar(100) NOT NULL,
    "password" varchar(191) NOT NULL,
    email varchar(100) NULL,
    email_verified_at timestamp NULL,
    role_id varchar(191) NULL,
    remember_token varchar(100) NULL,
    active int4 NOT NULL DEFAULT 1,
    created_by varchar(64) NULL,
    updated_by varchar(64) NULL,
    created_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT users_pkey PRIMARY KEY (id),
    CONSTRAINT users_username_unique UNIQUE (username)
);