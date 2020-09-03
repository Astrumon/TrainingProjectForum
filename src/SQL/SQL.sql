DROP TABLE NOTES;
DROP TABLE MESSAGES;
DROP TABLE USERS;

CREATE TABLE USERS ( id SERIAL PRIMARY KEY NOT NULL,
                     nickname VARCHAR UNIQUE NOT NULL,
                     name varchar NOT NULL,
                     surname VARCHAR NOT NULL,
                     email VARCHAR UNIQUE NOT NULL,
                     password varchar NOT NULL,
                     role varchar NOT NULL
);

CREATE TABLE MESSAGES (messageId serial PRIMARY KEY,userId integer,
                       FOREIGN KEY(userId) REFERENCES USERS (id),
                       title varchar(50),
                       message varchar(400),
                       date timestamp,
                       sendToId int,
                       FOREIGN KEY (sendToId) REFERENCES USERS (ID));

CREATE TABLE NOTES ( noteId serial PRIMARY KEY ,userId integer,
                     FOREIGN KEY(userId) REFERENCES USERS (id),
                     title varchar(50),
                     text varchar(1000),
                     creationDate timestamp);

INSERT INTO USERS (nickName, name, surname, password, email,role)
VALUES ('testUser' , 'testUser','testUser','testUser','testUser@org.com','testRole');

INSERT INTO USERS (nickName, name, surname, password, email,role)
VALUES ('sendToTestUser' , 'sendToTestUser','sendToTestUser','sendToTestUser','sendToTestUser@org.com','testRole');

INSERT INTO NOTES (userId, title, text, creationDate)
VALUES ('1','test Title', 'test text', '05-05-1998 00:00:00');


INSERT INTO MESSAGES (userId, title, message, date, sendToId)
VALUES ('1','test Title', 'test message text', '05-05-1998 00:00:00','2');


SELECT * FROM USERS;




