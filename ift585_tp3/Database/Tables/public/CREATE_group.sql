-- DROP TABLE groups;

CREATE TABLE groups(
	id			INT PRIMARY KEy,
	group_name	VARCHAR(60),
	admin_id	CHAR(6) REFERENCES users (id)  
);