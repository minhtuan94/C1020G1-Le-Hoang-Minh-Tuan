drop database furama_resort_management;

create database furama_resort_management;

use furama_resort_management;

CREATE TABLE vitri (
    id_vitri INT PRIMARY KEY,
    ten_vitri VARCHAR(45)
);

CREATE TABLE trinhdo (
    id_trinhdo INT PRIMARY KEY,
    trinhdo VARCHAR(45)
);

CREATE TABLE bophan (
    id_bophan INT PRIMARY KEY,
    ten_bophan VARCHAR(45)
);

CREATE TABLE nhanvien (
    id_nhanvien INT PRIMARY KEY,
    ho_ten VARCHAR(45),
    id_vitri INT,
    id_trinhdo INT,
    id_bophan INT,
    ngaysinh DATE,
    socmnd VARCHAR(45),
    luong VARCHAR(45),
    sodienthoai VARCHAR(45),
    email VARCHAR(45),
    diachi VARCHAR(45),
    FOREIGN KEY (id_vitri)
        REFERENCES vitri (id_vitri),
    FOREIGN KEY (id_bophan)
        REFERENCES bophan (id_bophan),
    FOREIGN KEY (id_trinhdo)
        REFERENCES trinhdo (id_trinhdo)
);

CREATE TABLE loaikhach (
    id_loaikhach INT PRIMARY KEY,
    ten_loaikhach VARCHAR(45)
);

CREATE TABLE khachhang (
    id_khachhang INT PRIMARY KEY,
    id_loaikhach INT,
    hoten VARCHAR(45),
    ngaysinh DATE,
    socmnd VARCHAR(45),
    sodienthoai VARCHAR(45),
    email VARCHAR(45),
    dia_chi VARCHAR(45),
    FOREIGN KEY (id_loaikhach)
        REFERENCES loaikhach (id_loaikhach)
);

CREATE TABLE kieuthue (
    id_kieuthue INT PRIMARY KEY,
    tenkieuthue VARCHAR(45),
    gia INT
);

CREATE TABLE loaidichvu (
    id_loaidichvu INT PRIMARY KEY,
    tenloaidichvu VARCHAR(45)
);

CREATE TABLE dichvu (
    id_dichvu INT PRIMARY KEY,
    tendichvu VARCHAR(45),
    dientich INT,
    sotang INT,
    songuoitoida VARCHAR(45),
    chiphithue VARCHAR(45),
    id_kieuthue INT,
    id_loaidichvu INT,
    trangthai VARCHAR(45),
    FOREIGN KEY (id_kieuthue)
        REFERENCES kieuthue (id_kieuthue),
    FOREIGN KEY (id_loaidichvu)
        REFERENCES loaidichvu (id_loaidichvu)
);

CREATE TABLE hopdong (
    id_hopdong INT PRIMARY KEY,
    id_nhanvien INT,
    id_khachhang INT,
    id_dichvu INT,
    ngaylamhopdong DATE,
    ngayketthuc DATE,
    tiendatcoc INT,
    tongtien INT,
    FOREIGN KEY (id_nhanvien)
        REFERENCES nhanvien (id_nhanvien),
    FOREIGN KEY (id_khachhang)
        REFERENCES khachhang (id_khachhang),
    FOREIGN KEY (id_dichvu)
        REFERENCES dichvu (id_dichvu)
);

CREATE TABLE dichvudikem (
    id_dichvudikem INT PRIMARY KEY,
    tendichvudikem VARCHAR(45),
    gia INT,
    donvi INT,
    trangthaikhadung VARCHAR(45)
);

CREATE TABLE hopdongchitiet (
    id_hodongchitiet INT PRIMARY KEY,
    id_hopdong INT,
    id_dichvudikem INT,
    soluong INT,
    FOREIGN KEY (id_hopdong)
        REFERENCES hopdong (id_hopdong),
    FOREIGN KEY (id_dichvudikem)
        REFERENCES dichvudikem (id_dichvudikem)
);



-- alter table nhanvien
-- add constraint fk_vitri_nhanvien foreign key (id_vitri) references vitri(id_vitri)ON DELETE CASCADE ON UPDATE CASCADE,
-- add constraint fk_bophan_nhanvien foreign key(id_bophan) references bophan(id_bophan)ON DELETE CASCADE ON UPDATE CASCADE,
-- add constraint fk_trinhdo_nhanvien foreign key (id_trinhdo) references trinhdo(id_trinhdo)ON DELETE CASCADE ON UPDATE CASCADE;

-- alter table khachhang
-- add constraint fk_loaikhach_khachhang foreign key (id_loaikhach) references loaikhach(id_loaikhach) ON DELETE CASCADE ON UPDATE CASCADE;

-- alter table hopdong
-- add constraint fk_nhanvien_hopdong foreign key (id_nhanvien) references nhanvien(id_nhanvien) ON DELETE CASCADE ON UPDATE CASCADE,
-- add constraint fk_khachhang_hopdong foreign key (id_khachhang) references khachhang(id_khachhang) ON DELETE CASCADE ON UPDATE CASCADE,
-- add constraint fk_dichvu_hopdong foreign key (id_dichvu) references dichvu(id_dichvu) ON DELETE CASCADE ON UPDATE CASCADE;

-- alter table hopdongchitiet
-- add constraint fk_hopdong_hopdongchitiet foreign key (id_hopdong) references hopdong(id_hopdong) ON DELETE CASCADE ON UPDATE CASCADE,
-- add constraint fk_dichvudikem_hopdongchitiet foreign key (id_dichvudikem) references dichvudikem(id_dichvudikem) ON DELETE CASCADE ON UPDATE CASCADE;

-- alter table dichvu
-- add constraint fk_kieuthue_dichvu foreign key (id_kieuthue) references kieuthue(id_kieuthue) ON DELETE CASCADE ON UPDATE CASCADE,
-- add constraint fk_loaidichvu_dichvu foreign key (id_loaidichvu) references loaidichvu(id_loaidichvu) ON DELETE CASCADE ON UPDATE CASCADE;