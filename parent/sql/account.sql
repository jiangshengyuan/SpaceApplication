create database t_account;
-- 登录信息表
drop table if exists t_account.login;
create table login
(
    id             bigint primary key not null,
    login_name     varchar(32)        not null comment '登录名',
    login_password char(16)           not null comment '登录密码',
    phone          varchar(16) comment '电话号码',
    email          varchar(64) comment '邮箱',
    create_time    datetime,
    update_time    datetime,
    status         char(1)            not null comment '是否有效'
);
-- 用户表
drop table if exists t_account.user;
create table t_account.user
(
    id                bigint primary key not null,
    login_id          bigint comment '登录表id',
    login_name        bigint comment '登录表id',
    true_name         varchar(64) comment '真实姓名',
    nick_name         varchar(32) comment '昵称',
    birthday          datetime comment '生日',
    sex               char(1)            not null comment '性别',
    country           varchar(64) comment '国籍',
    one_level_address varchar(64) comment '州、省、邦等',
    city              varchar(32) comment '城市',
    create_time       datetime,
    update_time       datetime,
    status            char(1)            not null comment '是否有效'
);
-- 角色表
drop table if exists t_account.role;
create table t_account.role
(
    id        bigint primary key not null,
    role_name char(16)           not null comment '角色名:administrator',
    status    char(1)            not null comment '是否有效'
);
-- 用户&角色表
drop table if exists t_account.user_role;
create table t_account.user_role
(
    user_id bigint primary key not null,
    role_id bigint             not null,
    status  char(1)            not null comment '是否有效'
);
-- 权限表
drop table if exists t_account.role_authority;
create table t_account.role_authority
(
    id             bigint primary key not null,
    role_id        bigint             not null,
    authority_name char(16)           not null comment '权限名',
    status         char(1)            not null comment '是否有效'
);
-- 收货地址表
drop table if exists t_account.delivery_address;
create table delivery_address
(
    id             bigint primary key not null,
    user_id        bigint             not null comment '用户id',
    location       varchar(64) comment '区域',
    detail_address varchar(64) comment '详细地址',
    receiver       varchar(64) comment '收货人',
    phone          varchar(16) comment '电话号码',
    tag            char(1) comment '标签',
    default_place  char(1) comment '是否为默认收货地址',
    create_time    datetime,
    update_time    datetime,
    status         char(1)            not null comment '是否有效'
);
-- 优惠券表
drop table if exists t_account.coupon;
create table coupon
(
    id               bigint primary key not null,
    user_id          bigint             not null comment '持有者id',
    discount_type    char(1)            not null comment '打折方式',
    discount_amount  int comment '打折金额',
    discount_percent int(3) comment '打折比例',
    start_price      int                not null comment '满减起始价格',
    end_date         datetime           not null comment '使用期限',
    status           char(1)            not null comment '状态：0：失效，1：有效，2：永久有效'
);
