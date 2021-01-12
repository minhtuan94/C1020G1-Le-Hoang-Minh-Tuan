use furama_resort_management;
-- task2: Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select * from nhanvien where (ho_ten like 'H%'  or ho_ten like'T%' or ho_ten like 'K%') and length(ho_ten) < 16 ;
-- task3: Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khachhang where dia_chi in('Quang Tri','Da Nang') and (curdate()-ngaysinh>(18*30*365) and curdate()-ngaysinh<(50*30*365));
-- task 4: Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần
--  đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select khachhang.hoten, count(hopdong.id_hopdong) as solandatphong from khachhang inner join hopdong on khachhang.id_khachhang=hopdong.id_khachhang
inner join loaikhach on khachhang.id_loaikhach=loaikhach.id_loaikhach where loaikhach.ten_loaikhach="Diamond"
group by khachhang.id_khachhang order by solandatphong;

-- task5: 
-- Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các
--  Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select khachhang.id_khachhang, khachhang.hoten,loaikhach.ten_loaikhach,hopdong.id_hopdong,hopdong.ngaylamhopdong,hopdong.ngayketthuc,
dichvu.tendichvu, sum(dichvu.chiphithue+hopdongchitiet.soluong*dichvudikem.gia) as tongtien from khachhang
left join loaikhach on khachhang.id_loaikhach = loaikhach.id_loaikhach
left join hopdong on khachhang.id_khachhang=hopdong.id_khachhang
left join dichvu on hopdong.id_dichvu=dichvu.id_dichvu
left join hopdongchitiet on hopdong.id_hopdong=hopdongchitiet.id_hopdong
left join dichvudikem on hopdongchitiet.id_dichvudikem=dichvudikem.id_dichvudikem
group by hopdong.id_hopdong;

-- task 6: 
-- Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, 
-- TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select dichvu.id_dichvu,dichvu.tendichvu,dichvu.dientich,dichvu.chiphithue,loaidichvu.tenloaidichvu from dichvu
inner join loaidichvu on dichvu.id_loaidichvu=loaidichvu.id_loaidichvu
where not exists(select hopdong.id_hopdong from hopdong	where (hopdong.ngaylamhopdong between "2019-01-01" and "2019-03-31") and hopdong.id_dichvu=dichvu.id_dichvu);
-- task7:
-- Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ 
-- đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
select dichvu.id_dichvu, dichvu.tendichvu,dichvu.dientich,dichvu.songuoitoida,dichvu.chiphithue,loaidichvu.tenloaidichvu from dichvu
inner join loaidichvu on dichvu.id_loaidichvu=loaidichvu.id_loaidichvu
where exists(select hopdong.id_hopdong from hopdong where year(hopdong.ngaylamhopdong)='2018' and hopdong.id_dichvu=dichvu.id_dichvu)
and not exists(select hopdong.id_hopdong from hopdong where year(hopdong.ngaylamhopdong)='2019' and hopdong.id_dichvu=dichvu.id_dichvu);
-- task8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
select distinct khachhang.hoten from khachhang;
-- cách 2
select khachhang.hoten from khachhang group by khachhang.hoten;
-- cách 3
select khachhang.hoten from khachhang union select khachhang.hoten from khachhang;