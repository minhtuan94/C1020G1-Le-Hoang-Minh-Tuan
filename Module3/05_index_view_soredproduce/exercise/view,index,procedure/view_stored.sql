drop database if exists e1_index;

create database e1_index;

use e1_index;

create table products (
id int primary key,
productcode varchar(45),
productname varchar(45),
productprice double,
productamount varchar(45),
productdesciption varchar(45),
productstatus varchar(45)
);
-- tạo unique index
CREATE UNIQUE INDEX product_code
ON products (productcode);
-- tạo composite index
CREATE INDEX composite_index
 ON products (productname, productprice);
-- tạo view
create view product_info as 
select productcode, productname, productprice, productstatus 
from products;
-- chỉnh sửa view
create or replace view product_info as
select productcode, productname, productprice
from products;
-- xóa view
drop view product_info;
-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //

CREATE PROCEDURE findAllProducts()

BEGIN

  SELECT * FROM products;

END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE addNewProducts(
idproduct int, productcode varchar(55),
productname varchar(55),
productprice varchar(55),
productamount int,
productdescription varchar(500),
productstatus varchar(100))

BEGIN

	insert into products values
    (idproduct, productCode, productName,productPrice, productAmount, productDescription, productStatus);

END //

DELIMITER ;