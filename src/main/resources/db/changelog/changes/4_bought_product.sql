
create table bought_product(
    id int auto_increment primary key ,
    product_id int,
    user_id int,
    bought_on datetime ,
    foreign key (product_id) references product(id),
    foreign key (user_id) references user(id)
);
