drop schema if exists t_account;
create database t_account;
use t_account;
-- 登录信息表
drop table if exists t_account.login_info;
create table login_info
(
    id             bigint primary key not null auto_increment,
    login_account  varchar(32)        not null comment '登陆账号',
    login_name     varchar(32)        not null comment '登录名',
    login_password char(16)           not null comment '登录密码',
    phone          varchar(16) comment '电话号码',
    email          varchar(64) comment '邮箱',
    create_time    datetime,
    update_time    datetime,
    status         char(1)            not null comment '是否有效：0：用户注销，1:使用中，X：违规封禁，Z：系统自动清除'
);
-- 用户信息表
drop table if exists t_account.user_info;
create table t_account.user_info
(
    id                bigint primary key not null,
    login_account     bigint comment '登录账号',
    login_name        bigint comment '登录名',
    true_name         varchar(64) comment '真实姓名',
    nick_name         varchar(32) comment '昵称',
    birthday          datetime comment '出生年月',
    sex               char(1)            not null comment '性别',
    id_card           varchar(32) comment '身份证号码',
    country           varchar(64) comment '国籍',
    one_level_address varchar(64) comment '州、省、邦等',
    city              varchar(64) comment '城市',
    county            varchar(64) comment '县区（限制使用）',
    certification     char(1)            not null comment '是否实名认证',
    create_time       datetime,
    update_time       datetime,
    status            char(1)            not null comment '是否有效：0：用户注销，1:使用中，X：违规封禁，Z：系统自动清除'
);

-- 角色表
drop table if exists t_account.role_info;
create table t_account.role_info
(
    id        bigint primary key not null,
    role_name char(16)           not null comment '角色名:administrator',
    status    char(1)            not null comment '是否有效：0：用户注销，1:使用中，X：违规封禁，Z：系统自动清除'
);
-- 用户&角色表
drop table if exists t_account.user_role;
create table t_account.user_role
(
    id      bigint primary key not null,
    user_id bigint             not null,
    role_id bigint             not null,
    status  char(1)            not null comment '是否有效：0：用户注销，1:使用中，X：违规封禁，Z：系统自动清除'
);
-- 权限表
drop table if exists t_account.role_authority;
create table t_account.role_authority
(
    id             bigint primary key not null,
    role_id        bigint             not null,
    authority_code varchar(16)        not null comment '权限码',
    authority_name char(16)           not null comment '权限名',
    status         char(1)            not null comment '是否有效：0：用户注销，1:使用中，X：违规封禁，Z：系统自动清除'
);
-- 收货地址表
drop table if exists t_account.delivery_address;
create table delivery_address
(
    id             bigint primary key not null,
    user_id        bigint             not null comment '用户id',
    location       varchar(64) comment '城市',
    detail_address varchar(64) comment '详细地址',
    receiver       varchar(64) comment '收货人',
    phone          varchar(16) comment '电话号码',
    tag            char(1) comment '标签：家：0，公司：1，临时：X',
    default_place  char(1) comment '是否为默认收货地址',
    create_time    datetime,
    update_time    datetime,
    status         char(1)            not null comment '是否有效：0：用户删除，1:使用中'
);
-- 优惠券表
drop table if exists t_account.coupon;
create table coupon
(
    id               bigint primary key not null,
    user_id          bigint             not null comment '用户id',
    discount_type    char(1)            not null comment '打折方式',
    discount_amount  decimal(10, 2) comment '打折金额',
    discount_percent int(2) comment '打折比例',
    start_price      int                not null comment '满减起始价格',
    begin_date       datetime           not null comment '开始使用期限',
    end_date         datetime           not null comment '截止使用期限',
    status           char(1)            not null comment '状态：0：失效，1：有效，2：永久有效'
);
