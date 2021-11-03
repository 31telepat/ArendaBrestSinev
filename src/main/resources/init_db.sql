create table street
(
    id           int auto_increment
        primary key,
    name         varchar(45)  not null,
    name_of_city varchar(250) not null,
    constraint street_city_name_fk
        foreign key (name_of_city) references city (name)
);