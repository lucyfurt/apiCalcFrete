create table tb_fretes (id int8 generated by default as identity, amount float8, date date, deals int4, visited int4, seller_id int8, primary key (id));
create table tb_users (id int8 generated by default as identity, name varchar(255), primary key (id));
alter table if exists tb_fretes add constraint FKp0nn0oixeiw2fq3jivj6vnsu foreign key (user_id) references tb_users;