CREATE SCHEMA db01 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE SCHEMA db02 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE SCHEMA db03 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE db01;
CREATE TABLE dept (
    dept_no BIGINT auto_increment PRIMARY KEY,
    dept_name VARCHAR ( 60 ) NULL,
    db_source VARCHAR ( 60 ) NULL
) COMMENT '部门表';
INSERT INTO dept (dept_name, db_source) VALUES ('开发部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('人事部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('运维部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('财务部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('市场部', DATABASE ());

USE db02;
CREATE TABLE dept (
    dept_no BIGINT auto_increment PRIMARY KEY,
    dept_name VARCHAR ( 60 ) NULL,
    db_source VARCHAR ( 60 ) NULL
) COMMENT '部门表';
INSERT INTO dept (dept_name, db_source) VALUES ('开发部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('人事部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('运维部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('财务部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('市场部', DATABASE ());

USE db03;
CREATE TABLE dept (
    dept_no BIGINT auto_increment PRIMARY KEY,
    dept_name VARCHAR ( 60 ) NULL,
    db_source VARCHAR ( 60 ) NULL
) COMMENT '部门表';
INSERT INTO dept (dept_name, db_source) VALUES ('开发部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('人事部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('运维部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('财务部', DATABASE ());
INSERT INTO dept (dept_name, db_source) VALUES ('市场部', DATABASE ());