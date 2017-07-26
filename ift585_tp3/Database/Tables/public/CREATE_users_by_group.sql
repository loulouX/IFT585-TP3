-- DROP TABLE users_by_group;

CREATE TABLE users_by_group(
	id_user		CHAR(6) REFERENCES users (id),
	id_group 	INT REFERENCES groups (id)
);