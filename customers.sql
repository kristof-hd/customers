set names utf8mb4;
set charset utf8mb4;
drop database if exists customers;
create database customers charset utf8mb4;
use customers;

CREATE TABLE customers (
  id int unsigned NOT NULL AUTO_INCREMENT primary key,
  firstname varchar(50) NOT NULL,
  surname varchar(50) NOT NULL
);

INSERT INTO customers(firstname, surname) VALUES
('customer1', 'customer1'),
('customer2', 'customer2')
;

create user if not exists cursist identified by 'cursist';
grant select, update, insert on customers to cursist;