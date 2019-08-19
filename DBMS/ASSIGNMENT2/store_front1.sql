create database store_front;
show databases;
use store_front;
create table user (
    user_id int not null auto_increment,
    name varchar(100),
    password varchar(15),
    date_of_birth date,
    gender char(1),
    user_type varchar(10),
    email_id varchar(50),
    primary key(user_id)
    );
create table contact_number_of_user(
    user_id int not null,
    contact_number varchar(12),
    foreign key(user_id) references user(user_id)
    );
create table address(
    address_id int not null auto_increment,
    user_id int not null,
    street varchar(20),
    city varchar(20),
    state varchar(20),
    pin_code varchar(6),
    primary key(address_id),
    foreign key(user_id) references user(user_id)
    );
create table category(
    category_id int not null auto_increment,
    category_name varchar(40),
    parent_id int not null default 0,
    primary key(category_id)
    );

create table product(
    product_id int not null auto_increment,
    category_id int not null,
    product_name varchar(50),
    price double,
    description varchar(200),
    stock int not null,
    primary key(product_id),
    foreign key(category_id) references category(category_id)
    );
create table product_image(
    product_id int not null,
    image_url varchar(100),
    foreign key(product_id) references product(product_id)
    );
create table cart(
    product_id int not null,
    user_id int not null,
    quantity int,
    total_price double,
    foreign key(product_id) references product(product_id),
    foreign key(user_id) references user(user_id)
    );
create table orders(
    order_id int not null auto_increment,
    user_id int not null,
    address_id int not null,
    order_date date,
    delivery_date date,
    total_price double,
    primary key(order_id),
    foreign key(address_id) references address(address_id),
    foreign key(user_id) references user(user_id)
    );
create table status(
    order_id int not null,
    product_id int not null,
    status varchar(12) check(status IN ('Shipped', 'Cancelled', 'Returned', 'Not Shipped')),
    foreign key(order_id) references orders(order_id),
    foreign key(product_id) references product(product_id)
    );
create table orderedProducts(
    order_id int not null,
    product_id int not null,
    quantity int not null DEFAULT 0,
    primary key (order_id,product_id),
    foreign key(order_id) references orders(order_id),
    foreign key(product_id) references product(product_id)
    );



show tables;
   
    
