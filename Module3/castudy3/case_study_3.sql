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

-- 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select temp.month, count(month(hopdong.ngaylamhopdong))as sokhachhangdangki, sum(hopdong.tongtien) as tong_tien from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp
left join hopdong on month(hopdong.ngaylamhopdong)=temp.month
where year(hopdong.ngaylamhopdong)='2020' or month(hopdong.ngaylamhopdong) is null
group by temp.month;

-- 10.Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).
select hopdong.id_hopdong, hopdong.ngaylamhopdong,hopdong.ngayketthuc,hopdong.tiendatcoc,count(hopdongchitiet.id_dichvudikem) as soluongdichvudikem
from hopdong inner join hopdongchitiet on hopdong.id_hopdong=hopdongchitiet.id_hopdong group by hopdong.id_hopdong;
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và 
-- có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select dichvudikem.tendichvudikem,dichvudikem.gia,dichvudikem.donvi from hopdong
inner join hopdongchitiet on hopdong.id_hopdong=hopdongchitiet.id_hopdong
inner join dichvudikem on hopdongchitiet.id_dichvudikem=dichvudikem.id_dichvudikem
inner join khachhang on khachhang.id_khachhang=hopdong.id_khachhang
inner join loaikhach on khachhang.id_loaikhach=loaikhach.id_loaikhach
where loaikhach.ten_loaikhach='Diamond' and khachhang.dia_chi in ('Quang Tri','Da Nang');
-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select hopdong.id_hopdong, hopdong.tongtien,hopdong.tiendatcoc,nhanvien.ho_ten,khachhang.hoten,khachhang.sodienthoai,dichvu.tendichvu,
count(hopdongchitiet.id_dichvudikem) as solansudung from hopdong
inner join nhanvien on hopdong.id_nhanvien= nhanvien.id_nhanvien
inner join khachhang on hopdong.id_khachhang = khachhang.id_khachhang
inner join dichvu on dichvu.id_dichvu=hopdong.id_dichvu
inner join hopdongchitiet on hopdong.id_hopdong=hopdongchitiet.id_hopdong
where not exists(select hopdong.id_hopdong where hopdong.ngaylamhopdong between '2019-01-01' and '2019-06-31')
and exists (select hopdong.id_hopdong where hopdong.ngaylamhopdong between '2019-09-01' and '2019-12-31');
-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
create temporary table temp
select dichvudikem.tendichvudikem as ten_dich_vu_di_kem,count(hopdongchitiet.id_dichvudikem) as solansudung from hopdongchitiet
inner join dichvudikem on dichvudikem.id_dichvudikem=hopdongchitiet.id_dichvudikem
group by dichvudikem.tendichvudikem;
select * from temp;

create temporary table temp1
select max(temp.solansudung) as maxsolansudung from temp;
select * from temp1;

select temp.ten_dich_vu_di_kem,temp.solansudung from temp inner join temp1 on temp.solansudung=temp1.maxsolansudung;
drop temporary table temp;
drop temporary table temp1;

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
select hopdong.id_hopdong,loaidichvu.tenloaidichvu,dichvudikem.tendichvudikem,count(hopdongchitiet.id_dichvudikem) as solansudung
from hopdong inner join dichvu on dichvu.id_dichvu=hopdong.id_dichvu
inner join loaidichvu on loaidichvu.id_loaidichvu=dichvu.id_loaidichvu
inner join hopdongchitiet on hopdongchitiet.id_hopdong = hopdong.id_hopdong
inner join dichvudikem on dichvudikem.id_dichvudikem= hopdongchitiet.id_dichvudikem
group by(dichvudikem.tendichvudikem) having solansudung=1;
-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được 
-- tối đa 3 hợp đồng từ năm 2018 đến 2019.
select nhanvien.id_nhanvien,nhanvien.ho_ten,nhanvien.sodienthoai,nhanvien.diachi,trinhdo.trinhdo,bophan.ten_bophan,count(hopdong.id_nhanvien) as solantaohopdong
from nhanvien inner join trinhdo on trinhdo.id_trinhdo=nhanvien.id_trinhdo
inner join bophan on bophan.id_bophan= nhanvien.id_bophan
inner join hopdong on hopdong.id_nhanvien=nhanvien.id_nhanvien
where hopdong.ngaylamhopdong between '2018-01-01' and '2019-12-31'
group by nhanvien.ho_ten
having solantaohopdong<4;