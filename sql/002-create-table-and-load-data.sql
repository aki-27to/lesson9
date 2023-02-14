DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  published_year int NOT NULL,
  title VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO movies (title,published_year) VALUES ("アルマゲドン",1998);
INSERT INTO movies (title,published_year) VALUES ("トイ・ストーリー2",2000);