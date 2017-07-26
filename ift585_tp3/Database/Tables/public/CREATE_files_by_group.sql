-- DROP TABLE files_by_group;

CREATE TABLE files_by_group(
	id_group 	INT REFERENCES groups (id),
	id_files 	INT REFERENCES files (id)
);