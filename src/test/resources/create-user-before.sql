delete from user_role;
delete from usr;

insert into usr(id, active, password, username) values
(1, true, '$2a$08$MBX3jXBGJKCQfeCugSgg1OQTOFR4.64MOKB0TGPpXOIBWXnzJEJRC', '6'),
(2, true, '$2a$08$MBX3jXBGJKCQfeCugSgg1OQTOFR4.64MOKB0TGPpXOIBWXnzJEJRC', 'mike');

insert into user_role(user_id, roles) values
(1, 'USER'), (1, 'ADMIN'),
(2, 'ADMIN');
