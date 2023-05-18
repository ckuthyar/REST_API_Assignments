create database railways;
use railways ;
create table trains(train_number int not null auto_increment key, train_name varchar(100));
create table stations(station_id bigint not null auto_increment primary key, station_code varchar(4), station_name varchar(100));
create table routes(route_id bigint not null auto_increment primary key, route_name varchar(100));
create table timings(timing_id bigint not null auto_increment primary key, train_number int, route_id bigint, station_id bigint, arrival_time varchar(10), departure_time varchar(10),
foreign key(train_number) references trains(train_number),
foreign key(route_id)references routes(route_id),
foreign key(station_id)references stations(station_id));
insert into trains(train_number,train_name)values
(22221,"NZM Rajdhani Exp"),
(12951,"Mumbai Rajdhani Exp"),
(12953,"Aug Kr Raj Exp"),
(12909,"NZM Garib Rath"),
(12431,"TVC NZM Rajdhani");
insert into stations(station_code,station_name)values
("CSMT","Chatrapathi Shivaji Terminal"),
("KYN","Kalyan"),
("NK","Nasik"),
("JN","Jalgaon"),
("BPL","Bhopal"),
("VGLJ","Jhansi"),
("GL","Gwalior"),
("AGC","Agra Cantt"),
("NZM","Nizamuddin");
insert into routes(route_name)values("Mumbai CST-Nizamuddin");
insert into routes(route_name)values("Nizamuddin-Mumbai CST");
create table route_station(route_station_id bigint not null auto_increment primary key, route_id bigint, station_id bigint, foreign key(route_id)references routes(route_id), foreign key(station_id)references stations(station_id));
insert into route_station(route_id,station_id)values
(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),
(2,9),(2,8),(2,7),(2,6),(2,5),(2,4),(2,3),(2,2),(2,1);
insert into timings(train_number,route_id,station_id,arrival_time,departure_time)values
(22221,1,1,"","16:00"),
(22221,1,2,"16:43","16:45"),
(22221,1,3,"18:18","18:20"),
(22221,1,4,"20:48","20:50"),
(22221,1,5,"01:55","02:00"),
(22221,1,6,"05:06","05:11"),
(22221,1,7,"06:09","06:11"),
(22221,1,8,"07:03","07:08"),
(22221,1,9,"09:55","");
select * from trains;
select * from stations;
select * from routes;
select * from timings;
select * from timings where station_id=2;
select station_name,train_number,arrival_time,departure_time from timings inner join stations where
timings.station_id=stations.station_id and
station_code="KYN";


