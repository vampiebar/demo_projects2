CREATE TABLE public.clients_info (
       id BIGSERIAL NOT NULL
     , client_id VARCHAR(128)
     , client_id_all_info TEXT
     , date_time TIMESTAMP DEFAULT 'now'
);
COMMENT ON COLUMN public.clients_info.client_id IS 'EXAMPLE: TR#00034#1234-1234-1234-1234.C88';

ALTER TABLE public.clients_info
  ADD CONSTRAINT PK_CLIENTS_INFO
      PRIMARY KEY (id);

