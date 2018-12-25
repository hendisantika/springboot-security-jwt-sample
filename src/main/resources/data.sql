insert into APP_USER(ID, PASSWORD, USERNAME) values(1, '$2a$10$bnC26zz//2cavYoSCrlHdecWF8tkGfPodlHcYwlACBBwJvcEf0p2G', 'hendisantika@gmail.com'); -- test1234
insert into USER_ROLE(APP_USER_ID, ROLE) values(1, 'ADMIN');
insert into USER_ROLE(APP_USER_ID, ROLE) values(1, 'PREMIUM_MEMBER');