create database furama_resort_management;

use furama_resort_management;

create table vitri (
id_vitri int primary key,
ten_vitri varchar(45)
);

create table trinhdo (
id_trinhdo int primary key,
trinhdo varchar(45)
);

create table bophan (
id_bophan int primary key,
ten_bophan varchar(45)
);

create table nhanvien (
id_nhanvien int primary key,
ho_ten varchar(45),
id_vitri int,
id_trinhdo int,
id_bophan int,
ngaysinh date,
socmnd varchar(45),
luong varchar(45),
sodienthoai varchar(45),
email varchar(45),
diachi varchar(45),
foreign key (id_vitri) references vitri(id_vitri),
foreign key(id_bophan) references bophan(id_bophan),
foreign key (id_trinhdo) references trinhdo(id_trinhdo)
);

create table hopdong (
id_hopdong int primary key,
id_nhanvien int,
id_khachhang int,
id_dichvu int,
ngaylamhopdong date,
ngayketthuc date,
tiendatcoc int,
tongtien int,
foreign key (id_nhanvien) references nhanvien(id_nhanvien),
foreign key (id_khachhang) references khachhang(id_khachhang),
foreign key (id_dichvu) references dichvu(id_dichvu)
);

create table khachhang (
id_khachhang int primary key,
id_loaikhach int,
hoten varchar(45),
ngaysinh date,
socmnd varchar(45),
sodienthoai varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key (id_loaikhach) references loaikhach(id_loaikhach)
);

create table loaikhach (
id_loaikhach int primary key,
ten_loaikhach varchar(45)
);

create table hopdongchitiet (
id_hodongchitiet int,
id_hopdong int,
id_dichvudikem int,
soluong int
);

create table dichvudikem (
id_dichvudikem int,
tendichvudikem varchar(45),
gia int,
donvi int,
trangthaikhadung varchar(45)
);

create table dichvu (
id_dichvu int,
tendichvu varchar(45),
dientich int,
sotang int,
songuoitoida varchar(45),
chiphithue varchar(45),
id_kieuthue varchar(45),
id_loaidichvu int,
trangthai varchar(45)
);

create table kieuthue (
id_kieuthue int,
tenkieuthue varchar(45),
gia int
);

create table loaidichvu (
id_loaidichvu int,
tenloaidichvu varchar(45)
);