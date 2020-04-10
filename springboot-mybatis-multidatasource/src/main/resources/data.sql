DROP TABLE IF EXISTS user;

CREATE TABLE user (
  user_id INT AUTO_INCREMENT  PRIMARY KEY,
  user_name VARCHAR(250) NOT NULL,
  pass_word VARCHAR(250) NOT NULL
);

INSERT INTO user (user_id, user_name, pass_word) VALUES
  ('1', '1', 1),
  ('2', '2', '2');

