create database tao_khoa_chinh;

drop database tao_khoa_chinh;
use tao_khoa_chinh;

CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(40),
    `password` VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE roles(
   role_id INT AUTO_INCREMENT,
   role_name VARCHAR(50),
   PRIMARY KEY(role_id)
);

-- cú pháp định nghĩa khóa chính tổ hợp
CREATE TABLE userroles(
   user_id INT NOT NULL,
   role_id INT NOT NULL,
   PRIMARY KEY(user_id,role_id),
   FOREIGN KEY(user_id) REFERENCES users(user_id),
   FOREIGN KEY(role_id) REFERENCES roles(role_id)
);
-- Trong ví dụ này, khoá chính của bảng userroles được tạo thành dựa trên 2 cột là user_id và role_id.

-- tạo khóa chính khi thay đổi bảng
ALTER TABLE table_name
    ADD PRIMARY KEY(primary_key_column),
    ADD FOREIGN KEY(role_id) REFERENCES roles(role_id)
    -- Trong đó, table_name là tên của bảng đã tồn tại, primary_key_column là tên của cột muốn tạo khoá chính.
    
--     ADD CONSTRAINT fk_user_user_role FOREIGN KEY (username) REFERENCES user(username) ON DELETE CASCADE ON UPDATE CASCADE