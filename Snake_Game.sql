drop database snake_game_db;
create database snake_game_db;
use snake_game_db;
show tables;
show databases;

create table body_parts (id bigint not null, x_coor integer not null, y_coor integer not null, body_part_id bigint, primary key (id));
create table boundary (id bigint not null, height integer not null, width integer not null, primary key (id));
create table food (id bigint not null, x_coor integer not null, y_coor integer not null, primary key (id));
create table game (id bigint not null, boundary_id bigint, food_id bigint, snake_id bigint, primary key (id));
create table hibernate_sequences (sequence_name varchar(255) not null, next_val bigint, primary key (sequence_name));
insert into hibernate_sequences(sequence_name, next_val) values ('default',0);
create table snake (id bigint not null, direction varchar(255), primary key (id));


select * from body_parts;
select * from boundary;
select * from food;
select * from game;
select * from snake;



















create table body_part (id bigint not null, x_coor integer not null, y_coor integer not null, body_part_id bigint, primary key (id));
create table boundary (id bigint not null, height integer not null, width integer not null, primary key (id));
create table food (id bigint not null, x_coor integer not null, y_coor integer not null, primary key (id));
create table game (id bigint not null, boundary_id bigint, food_id bigint, snake_id bigint, primary key (id));
create table hibernate_sequences (sequence_name varchar(255) not null, next_val bigint, primary key (sequence_name));
insert into hibernate_sequences(sequence_name, next_val) values ('default',0);

create table snake (id bigint not null, direction varchar(255), primary key (id));
