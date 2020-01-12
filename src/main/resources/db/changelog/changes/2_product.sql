create table product(
    id int auto_increment primary key ,
    product_category_id int,
    name varchar(500),
    description varchar(100),
    image varchar(200),
    status int,
    user_id int,
    foreign key (product_category_id) references product_category(id),
    foreign key (user_id) references user(id)
);
