drop database if exists qyy;
create database if not exists qyy;
use qyy;

create table query(
	id int auto_increment,
	timeout int default 5 comment "sql执行的超时时间",
	resultType tinyint default 1 comment "结果类型",
	content text comment "sql内容",
	gmtCreate timestamp default current_timestamp comment "创建时间",
	gmtUpdate timestamp default current_timestamp comment "修改时间",
	primary key id(`id`)
)engine=innodb default charset=utf8;

create table push(
	id int auto_increment,
	queryId int not null comment "查询ID",
	pushType tinyint default 1 comment "推送类型",
	gmtCreate timestamp default current_timestamp comment "创建时间",
	gmtUpdate timestamp default current_timestamp comment "修改时间",
	primary key id(`id`)
)engine=innodb default charset=utf8;

create table apply(
	id int auto_increment,
	applyType tinyint default 1 comment "申请类型",
	applyId int not null comment "申请ID",
	applyStatus tinyint default 0 comment "申请状态",
	gmtCreate timestamp default current_timestamp comment "创建时间",
	gmtUpdate timestamp default current_timestamp comment "修改时间",
	primary key id(`id`)
)engine=innodb default charset=utf8;

create table push_log(
	id int auto_increment,
	pushId int not null comment "推送ID",
	applyStatus tinyint default 0 comment "推送状态",
	gmtCreate timestamp default current_timestamp comment "创建时间",
	primary key id(`id`)
)engine=innodb default charset=utf8;