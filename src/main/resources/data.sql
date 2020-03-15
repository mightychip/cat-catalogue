-- noinspection SqlResolveForFile
-- noinspection SqlNoDataSourceInspectionForFile

-- this is just some basic data used to inflate our model... Spring will automagically recognize this.
INSERT INTO breed (id, name) values (1, 'short hair');
INSERT INTO breed (id, name) values (2, 'sphinx');
INSERT INTO breed (id, name) values (3, 'maine coon');

INSERT INTO cat (name, breed_id, date_of_birth, sex) values ( 'Fred', 1, '2000-01-01', 'male' );
INSERT INTO cat (name, breed_id, date_of_birth, sex) values ( 'Frank', 2, '2010-01-01', 'female' );
INSERT INTO cat (name, breed_id, date_of_birth, sex) values ( 'Fred', 3, '2000-01-01', 'male' );