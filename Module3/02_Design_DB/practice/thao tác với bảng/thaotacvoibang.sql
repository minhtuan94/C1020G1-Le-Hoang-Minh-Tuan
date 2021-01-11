
create database thao_tac_bang;

use thao_tac_bang;

CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);

-- xóa bảng
drop table contacts;

drop table suppliers;

-- chỉnh sửa bảng, đang tồn tại
ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id,
  ADD first_name varchar(35) NULL
    AFTER last_name;
    
-- chỉnh sửa mô tả của một cột
ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;
  
  -- xóa một cột trong bảng
  ALTER TABLE contacts
  DROP COLUMN contact_type;
  
  -- thay đổi tên contact_type thành ctype
  ALTER TABLE contacts
  CHANGE COLUMN contact_type ctype
    varchar(20) NOT NULL;
    
    -- đổi tên bảng
ALTER TABLE contacts
  RENAME TO people;