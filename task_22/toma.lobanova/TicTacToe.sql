create database tictactoe;

USE tictactoe;

SHOW tables;

CREATE TABLE players(
id int NOT NULL PRIMARY KEY auto_increment,
name varchar(25),
surname varchar(25),
nick varchar(25));

INSERT into players (name, surname, nick)
VALUES ("Ivan", "Ivanov", "Lord of the Rings"),
	   ("Vasiliy", "Vasilyev", "TicTacToe Killer"),
	   ("Pyotr", "Petrov", "Lord Voldemort"),
	   ("Olga", "Semyonova", "Bounty Eater"),
	   ("Catherine", "Mihnyova", "Miss Pancake"),
	   ("Oleg", "Pupkin", "Smarty"),
	   ("Nikolay", "Shumakov", "Curious");
	   
CREATE TABLE games(
id int NOT NULL PRIMARY KEY auto_increment,
first_player varchar(25),
second_player varchar(25),
first_move_maker varchar(25),
winner varchar(25),
moves int NOT NULL);

ALTER TABLE players modify nick varchar(25) NOT NULL;
ALTER TABLE players modify id int;
ALTER TABLE players DROP PRIMARY KEY;
ALTER TABLE players ADD PRIMARY KEY (nick);

ALTER TABLE games
ADD CONSTRAINT fk_first_player
FOREIGN KEY (first_player)
REFERENCES  players(nick);

ALTER TABLE games
ADD CONSTRAINT fk_second_player
FOREIGN KEY (second_player)
REFERENCES players(nick);

ALTER TABLE games
ADD CONSTRAINT fk_first_move_maker
FOREIGN KEY (first_move_maker)
REFERENCES  players(nick);

ALTER TABLE games
ADD CONSTRAINT fk_winner
FOREIGN KEY (winner)
REFERENCES players(nick);

SHOW CREATE TABLE games;

ALTER TABLE players ADD player_type varchar(10);
UPDATE players SET player_type="human";

SELECT MAX(id) from players;

INSERT into players
VALUES (8, "computer_player", "computer_player", "AI", "computer");

ALTER TABLE players DROP id;

ALTER TABLE players  ADD UNIQUE (nick);

INSERT INTO players
VALUES ("Ivan", "Petrov", "Miss Pancake", "human");

ALTER TABLE players MODIFY nick varchar(25);
ALTER TABLE players DROP PRIMARY KEY;

ALTER TABLE players MODIFY COLUMN id INT FIRST;

DROP TABLE games;

CREATE TABLE games(
id int NOT NULL PRIMARY KEY auto_increment,
first_player_id int NOT NULL,
FOREIGN KEY (first_player_id)
REFERENCES  players(id),
second_player_id int NOT NULL,
FOREIGN KEY (second_player_id)
REFERENCES  players(id),
first_move_maker_id int NOT NULL,
FOREIGN KEY (first_move_maker_id)
REFERENCES  players(id),
winner_id int NOT NULL,
FOREIGN KEY (winner_id)
REFERENCES  players(id),
moves int NOT NULL);

ALTER TABLE games MODIFY winner_id int;

INSERT into games (first_player_id, second_player_id, first_move_maker_id, winner_id, moves)
VALUES (2, 1, 1, 1, 5);

INSERT into games (first_player_id, second_player_id, first_move_maker_id, moves)
VALUES (3, 1, 3, 5);

UPDATE games SET moves = 9 WHERE id = 2;

INSERT into games (first_player_id, second_player_id, first_move_maker_id, moves)
VALUES (5, 3, 3, 9);

INSERT into games (first_player_id, second_player_id, first_move_maker_id, winner_id, moves)
VALUES (8, 1, 8, 8, 7);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, moves)
VALUES (7, 3, 3, 9);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, moves)
VALUES (5, 7, 5, 9);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, moves)
VALUES (2, 1, 1, 9);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, moves)
VALUES (7, 8, 7, 9);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, winner_id, moves)
VALUES (5, 3, 3, 3, 5);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, winner_id, moves)
VALUES (8, 1, 1, 8, 6);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, winner_id, moves)
VALUES (2, 4, 2, 2, 9);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, winner_id, moves)
VALUES (5, 6, 6, 5, 6);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, moves)
VALUES (5, 3, 5, 9);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, moves)
VALUES (4, 3, 3, 9);
INSERT into games (first_player_id, second_player_id, first_move_maker_id, winner_id, moves)
VALUES (7, 1, 7, 7, 7);

SELECT pf.nick AS "first player", ps.nick "second player", pt.nick "first move", IFNULL(pw.nick, "draw") "winner", g.moves FROM games AS g
INNER JOIN players AS pf ON g.first_player_id = pf.id
INNER JOIN players AS ps ON g.second_player_id = ps.id
INNER JOIN players AS pt ON g.first_move_maker_id = pt.id
LEFT JOIN players AS pw ON g.winner_id = pw.id;


