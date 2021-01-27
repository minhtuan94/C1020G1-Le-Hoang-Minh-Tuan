drop database demo;

CREATE DATABASE demo;

USE demo;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 `name` varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);

insert into users(id, `name`, email, country)
values
(id,'Kien','kien@gmail.com','Nghe An'),
(id,'Cao','cao@gmail.com','Hue'),
(id,'Thinh','thinh@gmail.com','Hoi An'),
(id,'Dung','dung@gmail.com','Nghe An'),
(id,'Phuc','phuc@gmail.com','Da Nang'),
(id,'Luong','luong@gmail.com','Hue'),
(id,'Tung','tung@gmail.com','Da Nang');