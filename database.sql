create database if not exists query_yourself;

use query_yourself;

create table query(
	id int auto_increment,
	timeout int default 5 comment "sql执行的超时时间",
	result_type tinyint default 1 comment "结果类型",
	gmt_create timestamp default current_timestamp comment "创建时间",
	gmt_update timestamp default current_timestamp comment "修改时间",
	primary key id(`id`)
)engine=innodb default charset=utf8;

create table push(
	id int auto_increment,
	query_id int not null comment "查询ID",
	push_type tinyint default 1 comment "推送类型",
	gmt_create timestamp default current_timestamp comment "创建时间",
	gmt_update timestamp default current_timestamp comment "修改时间",
	primary key id(`id`)
)engine=innodb default charset=utf8;

create table apply(
	id int auto_increment,
	apply_type tinyint default 1 comment "申请类型",
	apply_id int not null comment "申请ID",
	apply_status tinyint default 0 comment "申请状态",
	gmt_create timestamp default current_timestamp comment "创建时间",
	gmt_update timestamp default current_timestamp comment "修改时间",
	primary key id(`id`)
)engine=innodb default charset=utf8;

create table push_log(
	id int auto_increment,
	push_id int not null comment "推送ID",
	apply_status tinyint default 0 comment "推送状态",
	gmt_create timestamp default current_timestamp comment "创建时间",
	primary key id(`id`)
)engine=innodb default charset=utf8;