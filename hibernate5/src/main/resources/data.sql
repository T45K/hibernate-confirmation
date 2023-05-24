drop table master;
drop table status;

create table master
(
    seq int not null auto_increment,
    primary key (seq)
);
create table status
(
    seq         int not null auto_increment,
    foreign_key int not null,
    primary key (seq)
);

insert into master(seq)
values (1);

insert into status(seq, foreign_key)
values (1, 1),
       (2, 1);
