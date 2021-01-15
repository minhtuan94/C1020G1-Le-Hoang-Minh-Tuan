
show index from student;

explain select *
from student
where `name` = 'Long';

create index idx_student_name
on student (`name`);

create view view_student_study_class
as
select s.id, s.`name` name_student, c.id id_class, c.`name` name_class, t.`name` name_type
from student s
	inner join class c on s.class_id = c.id
    inner join type_of_class t on c.type_of_class_id = t.id;
    
drop view view_student_study_class;

select *
from view_student_study_class v
	inner join instructor_teach_class i on v.id_class = i.class_id;
    
create view view_student
as
select id, `name`
from student;

insert into view_student (id, `name`)
values (5, 'Trung');

select *
from view_student;

update student
set `name` = 'Tien C10'
where id = 1;

update view_student
set `name` = 'Tien C1020G1'
where id = 1;

delimiter //
create procedure sp_get_all_student()
begin
	select *
    from student;
end;
// delimiter ;

call sp_get_all_student();

delimiter //
create procedure find_all_student(in p_keyword varchar(20))
begin
	select *
    from student
    where `name` like concat('%', p_keyword, '%');
end;
// delimiter ;

delimiter //
create procedure find_all_student_out(in p_keyword varchar(20), out count_student int)
begin
	set count_student = (
		select count(*)
		from student
		where `name` like concat('%', p_keyword, '%')
	);
end;
// delimiter ;

call find_all_student_out ('on', @a);
select @a;

delimiter //
create procedure find_all_student_inout(inout p_keyword_and_count varchar(20))
begin
	set p_keyword_and_count = (
		select count(*)
		from student
		where `name` like concat('%', p_keyword_and_count, '%')
	);
end;
// delimiter ;

set @b = '';
call find_all_student_inout(@b);
select @b;


