create database defines_the_primary_key_and_the_foreign_key;

use defines_the_primary_key_and_the_foreign_key;
drop database defines_the_primary_key_and_the_foreign_key;
create table customers (
	customer_number int primary key,
    full_name varchar(45),
    address varchar(45),
    email varchar(45),
    phone varchar(45)
    );
    
create table accounts (
account_number int primary key,
account_type varchar(45),
`date` date,
balance varchar(45),
customer_number int,
foreign key (customer_number) references customers(customer_number)
);

create table transactions (
tran_number int auto_increment primary key,
account_number int,
`date` date,
amount varchar(45),
descriptions varchar(45),
foreign key (account_number) references accounts(account_number)
);

-- xác định khóa chính

-- Trong bảng customers

-- Mỗi khách hàng chỉ có duy nhất một mã, do đó trường mã khách hàng thường được sử dụng để phân biệt giữa các khách hàng với nhau.
-- Tên khách hàng có thể có nhiều khách hàng trùng tên, địa chỉ có nhiều thông tin hỗn tạp (số nhà, thành phố …)
-- Email là duy nhất tuy nhiên thì một khách hàng có thể cung cấp nhiều địa chỉ mail khác nhau.
-- Số điện thoại là duy nhất tuy nhiên thì một khách hàng có thể cung cấp nhiều số điện thoại khác nhau.
-- Vậy để phân biệt giữa các khách hàng với nhau chúng ta nên sử dụng trường mã khách hàng. Do đó mã khách hàng sẽ được chọn làm 
-- khóa chính của bảng khách hàng.

-- Trong bảng accounts

-- Mỗi số tài khoản là duy nhất và số tài khoản này dùng để phân biệt giữa các tài khoản khác nhau.
-- Kiểu tài khoản có nhiều loại như vip, thường, doanh nghiệp.
-- Ngày mở gồm nhiều thông tin như ngày, tháng, năm
-- Số dư là giá trị có thể bị thay đổi.
-- Vậy để phân biệt giữa các tài khoản với nhau chúng ta nên sử dụng trường mã tài khoản. Do đó mã tài khoản sẽ được chọn làm
--  khóa chính của bảng tài khoản.

-- Trong bảng transactions

-- Mỗi mã giao dịch là duy nhất và số giao dịch này dùng để phân biệt giữa các giao dịch khác.
-- Số Tiền có thể bị thay đổi
-- Thời gian gồm nhiều thông tin ngày, tháng, năm
-- Mô tả gồm nhiều thông tin.
-- Vậy để phân biệt giữa các giao dịch với nhau chúng ta nên sử dụng trường mã giao dịch. Do đó mã giao dịch sẽ được chọn làm 
-- khóa chính của bảng giao dịch. 

-- Bước 2: Xác định khóa ngoại tạo liên kết giữa các bảng. 

-- Mỗi khách hàng có 1 tài khoản ngân hàng. Mối quan hệ giữa hai bảng customers – accounts ( 1 : 1 ). Với kiểu kết hợp này, 
-- chuyển khóa chuyển khóa chính của bên liên kết 1 sang làm khóa ngoại của bên liên kết còn lại. 
-- Trong trường hợp này bảng acccounts sẽ có thêm trường customer_number trường này sẽ là trường khóa ngoại để liên kết giữa 2 bảng 
-- accounts và customers.

-- Mỗi tài khoản có thể thực hiện nhiều giao dịch. Mối quan hệ giữa hai bảng accounts – transactions ( 1: N ). 
-- Với kiểu kết hợp này, chuyển khóa chuyển khóa chính của bên liên kết 1 sang làm khóa ngoại của bên liên kết nhiều. 
-- Tức là bảng transactions sẽ có thêm trường account_number trường này sẽ là trường khóa ngoại để liên kết giữa 2 bảng 
-- transactions và accounts.