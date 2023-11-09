drop table login_info if exists;
create table login_info(
    id char(64) not null primary key ,
    login_name varchar(40) not null,
    password varchar(25),
    phone_number varchar(20),
    mail varchar(40),
);