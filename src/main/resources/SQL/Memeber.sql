CREATE TABLE MEMBERS(
                        userId varchar(20) not null,
                        name varchar(100) not null,
                        password varchar(100) not null,
                        birthday varchar(100) not null,
                        email varchar(100) null,
                        address varchar(1024) null,
                        createTime long not null,
                        updateTime long not null,
                        primary key(userid)
);
