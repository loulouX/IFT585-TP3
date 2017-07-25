-- DROP TABLE usertable

CREATE TABLE users (
	id		CHAR(6) CONSTRAINT user_pk PRIMARY KEY,
	username	VARCHAR(40),
	password	VARCHAR(40),
	isOnline	BOOLEAN
	
);