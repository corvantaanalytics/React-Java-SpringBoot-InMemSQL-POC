DROP TABLE IF EXISTS users;

CREATE TABLE users (
  ID INT NOT NULL AUTO_INCREMENT,
  FIRST_NAME VARCHAR(250) NOT NULL,
  LAST_NAME VARCHAR(250) NOT NULL,
  USERNAME VARCHAR(250) NOT NULL,
  PASSWORD VARCHAR(250) NOT NULL
);

INSERT INTO users (ID, FIRST_NAME, LAST_NAME, USERNAME, PASSWORD) VALUES
  (1, 'first', 'last 1', 'abc1@gmail.com', '$2a$10$fmk2oRSf6bcNMK1DbQe6IOLaaX6Sbeg0caAPHyaeC4pEIwOaexHOS'),
  (2, 'first', 'last 2', 'abc2@gmail.com', '$2a$10$fmk2oRSf6bcNMK1DbQe6IOLaaX6Sbeg0caAPHyaeC4pEIwOaexHOS'),
  (3, 'first', 'last 3', 'abc3@gmail.com', '$2a$10$fmk2oRSf6bcNMK1DbQe6IOLaaX6Sbeg0caAPHyaeC4pEIwOaexHOS'),
  (4, 'javid', 'last 4', 'javidnashraf@gmail.com', '$2a$10$fmk2oRSf6bcNMK1DbQe6IOLaaX6Sbeg0caAPHyaeC4pEIwOaexHOS');
  
  
  
  