use furama_resort_management;

insert into kieuthue
values
(1, 'Nam', 11000000),(2, 'Thang', 1000000),(3, 'Ngay', 450000),(4, 'Gio', 100000);

insert into loaidichvu
values
(1, 'Villa'),(2, 'House'),(3, 'Room');

insert into loaikhach
values
(1, 'Diamond'), (2, 'Platinium' ), (3, 'Gold'),(4, 'Silver'), (5,'Member');

insert into dichvudikem
values
(1,'massage',300000,1,'ok'), (2,'karaoke', 120000,1,'ok'), (3,'food',50000,1,'ok'),(4, 'water', 20000,1,'ok'),( 5, 'Rent Car', 1200000, 1, 'ok');

insert into trinhdo
values
(1,'Trung Cap'),(2,'Cao Dang'),(3,'Dai Hoc'),(4,'Sau dai hoc');

insert into vitri
values
(1,'Le Tan'), (2, 'Phuc Vu'), ( 3, ' Chuyen vien'), ( 4, ' Giam sat'),(5,'Quan Ly'), (6, 'Giam doc');

insert into bophan
values
(1,'Sale-Marketing'),(2,'Hanh chinh'),(3,'Phuc vu'),(4,'Quan ly');

insert into khachhang
values
(1,1,'Kiên','1995/11/16','232132322', '092312312','kien@gmail.com','Da Nang'),
(2,5,'Phúc','1997/08/09','232132322', '092312312','phuc@gmail.com','Quang Tri'),
(3,2,'Thịnh','1998/03/13','232132322', '092312312','thinh@gmail.com','Quang Nam'),
(4,3,'Cao','1997/11/20','232132322', '092312312','cao@gmail.com','Quang Nam'),
(5,4,'Thanh','1995/04/29','232132322', '092312312','thanh@gmail.com','Hai Phong'),
(6,5,'Phước','2000/07/06','232132322', '092312312','phuoc@gmail.com','Quang Binh'),
(7,1,'Sơn','1997/12/06','232132322', '092312312','son@gmail.com','Quang Tri'),
(8,1,'Phin','2011/12/06','232132322', '092312312','phin@gmail.com','Quang Tri'),
(9,1,'Lượng','2007/12/06','232132322', '092312312','luong@gmail.com','Quang Tri');

-- insert into KhachHang
-- values
-- (10,1,'Hu','2011/12/06','232132322', '092312312','phuc@gmail.com','Quang Tri'),
-- (11,1,'Nhung','2007/12/06','232132322', '092312312','phuc@gmail.com','Quang Tri');

-- delete from KhachHang where idKhachHang = 11;

insert into nhanvien
values
(1,'Phuc', 6 , 3, 2, '1986/09/30', '1232132323', '50000000', '091231212','phuc@gmail.com','Da Nang'),
(2,'Thinh', 3 , 3, 2, '1986/09/30', '1232132323', '3000000', '091231212','thinh@gmail.com','Quang Tri'),
(3,'Kien', 2 , 2, 2, '1986/09/30', '1232132323', '700000', '091231212','kien@gmail.com','Quang Binh'),
(4,'Thanh', 1 , 1, 2, '1986/09/30', '1232132323', '700000', '091231212','thanh@gmail.com','Quang Binh'),
(5,'Phuc', 5 , 2, 2, '1986/09/30', '1232132323', '800000', '091231212','phuc@gmail.com','Da Nang'),
(6,'Cao', 4 , 1, 2, '1986/09/30', '1232132323', '1000000', '091231212','cao@gmail.com','Quang Nam'),
(7,'Phuc', 5 , 2, 2, '1986/09/30', '1232132323', '18000000', '091231212','phuc@gmail.com','Quang Tri'),
(8,'Phuc', 3 , 1, 2, '1986/09/30', '1232132323', '5000000', '091231212','phuc@gmail.com','Da Nang'),
(9,'Tuan', 1, 4, 2, '1986/09/30', '1232132323', '6000000', '091231212','tuan@gmail.com','Quang Nam'),
(10,'Son', 2 , 4, 2, '1986/09/30', '1232132323', '7500000', '091231212','son@gmail.com','Da Nang'),
(11,'Phuc', 2 , 2, 2, '1986/09/30', '1232132323', '9500000', '091231212','phuc@gmail.com','Quang Tri'),
(12,'Phuoc', 2 , 3, 2, '1986/09/30', '1232132323', '12000000', '091231212','phuoc@gmail.com','Da Nang'),
(13,'Han', 1 , 1, 2, '1986/09/30', '1232132323', '5000000', '091231212','han@gmail.com','Quang Nam'),
(14,'Thanh', 2 , 2, 2, '1986/09/30', '1232132323', '5000000', '091231212','thanh@gmail.com','Quang Nam');

-- update Nhanvien set hoTen = 'Tran Quang Hoa' where idNhanVien = 6;

insert into dichvu
values
(1, 'Villa', 250, 3, '14', '5000000', 1 , 1, 'ok'),
(2, 'House', 180, 4, '15', '2000000', 2 , 2,'ok'),
(3, 'Room', 60, 1, '5', '1000000', 4 , 3,'ok'),
(4, 'Room', 60, 1, '5', '1000000', 3 , 3,'ok');

insert into hopdong
values
(1, 5 , 4, 2 , '2020/12/03', '2021/04/03', 10000000, 123123121),
(2, 6 , 3, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(3, 7 , 1, 1 , '2020/02/03', '2021/02/03', 10000000, 123123121),
(4, 5 , 7, 2 , '2015/12/03', '2015/04/03', 10000000, 123123121),
(5, 6 , 7, 3 , '2011/09/03', '2012/08/03', 10000000, 123123121),
(6, 6 , 8, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(7, 6 , 9, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(8, 6 , 1, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(9, 6 , 9, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(10 ,7 , 8, 1 , '2020/02/03', '2021/02/03', 10000000, 123123121),
(11, 5 , 7, 2 , '2020/12/03', '2021/04/03', 10000000, 123123121),
(12, 6 , 7, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121),
(13, 6 , 8, 3 , '2020/09/03', '2021/08/03', 10000000, 123123121);
INSERT INTO `furama_resort_management`.`hopdong` (`id_hopdong`, `ngaylamhopdong`) VALUES ('14', '2021-07-08');
INSERT INTO `furama_resort_management`.`hopdong` (`id_hopdong`, `ngaylamhopdong`) VALUES ('15', '2021-03-04');


insert into hopdongchitiet
values
(1, 2, 5, 5),
(2, 3, 4, 7),
(3, 1, 1, 9),
(4, 1, 1, 9),
(5, 1, 2, 9),
(6, 1, 3, 9),
(7, 1, 1, 9),
(8, 1, 3, 11),
(9, 1, 2, 11);