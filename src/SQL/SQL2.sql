-- delete from NOTES;
-- -- delete from users_messages;
-- delete from MESSAGES;
-- delete from USERS;

DROP TABLE NOTES;
-- DROP TABLE users_messages;
DROP TABLE MESSAGES;
DROP TABLE USERS;


CREATE TABLE USERS ( id SERIAL PRIMARY KEY NOT NULL,
                     nickname VARCHAR UNIQUE NOT NULL,
                     first_name varchar NOT NULL,
                     last_name VARCHAR NOT NULL,
                     email VARCHAR UNIQUE NOT NULL,
                     password varchar NOT NULL
                     );

CREATE TABLE MESSAGES (id serial PRIMARY KEY,
                       user_Id int8 default NULL,
                       FOREIGN KEY(user_Id) REFERENCES USERS (id),
                       title varchar(50) default NULL,
                       message varchar(400) default NULL,
                       creation_Date timestamp default NULL,
                       send_To_Id int8 default NULL,
                       FOREIGN KEY (send_To_Id) REFERENCES USERS (id));

/*create table users_messages (user_id bigint not null,
                             message_id bigint not null,
                             primary key (user_id,message_id),
                             foreign key (message_id) references messages(id),
                             foreign key (user_id) references users (id)
                             );*/

CREATE TABLE NOTES ( Id serial PRIMARY KEY
                    ,user_Id int8 default NULL,
                     FOREIGN KEY(user_Id) REFERENCES USERS (id),
                     title varchar(50) default NULL,
                     text varchar(1000) default NULL,
                     creation_Date timestamp default NULL);

INSERT INTO USERS (nickname, first_name, last_name, password, email)
VALUES ('testUser' , 'testUser','testUser','testUser','testUser@org.com');

INSERT INTO USERS (nickname, first_name, last_name, password, email)
VALUES ('sendToTestUser' , 'sendToTestUser','sendToTestUser','sendToTestUser','sendToTestUser@org.com');

INSERT INTO NOTES (user_Id, title, text, creation_Date)
VALUES ('1','test Title', 'test text', '05-05-1998 00:00:00');


INSERT INTO MESSAGES (user_Id, title, message, creation_Date, send_To_Id)
VALUES ('1','test Title', 'test message text', '05-05-1998 00:00:00','2');
INSERT INTO MESSAGES (user_Id, title, message, creation_Date, send_To_Id)
VALUES ('2','title 2', 'message 2', '05-05-1998 00:00:00','1');
INSERT INTO MESSAGES (user_Id, title, message, creation_Date, send_To_Id)
VALUES ('1','title 3', 'message 3', '05-05-1998 00:00:00','2');


SELECT * FROM USERS;




