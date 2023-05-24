truncate table master;
truncate table status;

insert into master(seq)
values (1);

insert into status(seq, foreign_key)
values (1, 1),
       (2, 1);
