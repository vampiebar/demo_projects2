CREATE TABLE public.registered_users (
       id BIGSERIAL NOT NULL
     , reg_id VARCHAR(64) NOT NULL
     , user_name VARCHAR(2048) NOT NULL
     , user_pass VARCHAR(2048) NOT NULL
     , title VARCHAR(2048)
     , company_person_name VARCHAR(2048)
     , phone1 VARCHAR(30)
     , phone2 VARCHAR(30)
     , district VARCHAR(100)
     , city VARCHAR(100)
     , state VARCHAR(100)
     , counrty VARCHAR(50) DEFAULT 'TURKIYE'
     , address1 TEXT
     , address2 TEXT
     , zipcode VARCHAR(12)
     , date_time TIMESTAMP
     , update_date_time TIMESTAMP
     , mac_id VARCHAR(30)
     , wan_ip VARCHAR(30)
     , lan_ip VARCHAR(30)
     , install_type INT4
     , last_access_date_time TIMESTAMP
     , prg_version VARCHAR(10)
     , reseller VARCHAR(20)
     , reseller_type INT4
     , sold_date TIMESTAMP
     , install_date TIMESTAMP
     , bill_no VARCHAR(20)
     , license_client_count INT4
     , license_gui_count INT4
     , disk_serial_id VARCHAR(75)
     , sale_type INT4
     , licence_client_days INT4 DEFAULT 15
     , licence_gui_days INT4 DEFAULT 15
);
COMMENT ON COLUMN public.registered_users.reg_id IS 'EXAMPLE: TR#00034#1234-1234-1234-1234';
COMMENT ON COLUMN public.registered_users.user_name IS 'MAIL';
COMMENT ON COLUMN public.registered_users.sale_type IS 'CC - credit card, PAY - PAYPAL, CASH';

ALTER TABLE public.registered_users
  ADD CONSTRAINT PK_REGISTERED_USERS
      PRIMARY KEY (id);

ALTER TABLE public.registered_users
  ADD CONSTRAINT UQ_registered_users_reg_id
      UNIQUE (reg_id);

ALTER TABLE public.registered_users
  ADD CONSTRAINT UQ_registered_users_reg_id_user_name
      UNIQUE (reg_id, user_name);

