use phoebe;
create table node(
	id int primary key auto_increment,
	parent_id int not null default -1,
	node_name varchar(127) not null default '',
	expression_collection_id int not null default -1,
	real_id varchar(255) null default '',
	is_active tinyint not null default 1,
	is_leaf tinyint not null default 1,
	is_valid tinyint not null default 1
);

create table tree(
	id int primary key auto_increment,
	first_node_id int not null,
	version int not null,
	is_active tinyint not null default 1,
	is_valid tinyint not null default 1
);

create table expression(
	id int primary key auto_increment,
	operation int not null default 0,
	dictionary_id int not null default 0,
	param_value_list varchar(255) not null default ''
);

create table expression_collection(
	id int primary key auto_increment,
	expression_text text
);

create table param_value(
	id int primary key auto_increment,
	dictionary_id  int not null default 0,
	param_name varchar(63) not null,
	param_value varchar(63) not null
);

create table dictionary(
	id int primary key auto_increment,
	dictionary_name varchar(63) not null,
	value varchar(63) not null
);


create table tree_snapshot(
	id int primary key auto_increment,
	tree_id int not null default 0,
	tree_json_string longtext,
	version int not null default 0
);