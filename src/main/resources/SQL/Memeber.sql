CREATE TABLE MEMBERS(
                        user_id varchar(20) not null,
                        name varchar(100) not null,
                        pwd varchar(100) not null,
                        birthday varchar(100) not null,
                        email varchar(100) null,
                        gender boolean null,
                        address varchar(1024) null,
                        createTime long null,
                        updateTime long null,
                        primary key(user_id)
);
