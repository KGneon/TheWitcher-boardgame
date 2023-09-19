DROP DATABASE my_game_database;
CREATE DATABASE IF NOT EXISTS my_game_database;
USE my_game_database;

-- Create the Character table
CREATE TABLE Character (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    origin VARCHAR(50),
    character_class VARCHAR(50),
    attack_points INT,
    magic_points INT,
    health_points INT,
    dice_roll_points INT,
    image_url VARCHAR(255)
);
-- Create the Enemy table
CREATE TABLE Enemy (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    type VARCHAR(50),
    power INT,
    power_type VARCHAR(50),
    image_url VARCHAR(255)
);
-- Create the Event table
CREATE TABLE Event (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    effect VARCHAR(50),
    effect_power_points INT,
    effect_roll_success_points INT,
    description VARCHAR(255)
    image_url VARCHAR(255)
);
-- Create the Player table
CREATE TABLE Player (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    games_played INT,
    high_score INT
);

-- Insert example records into the Character table
INSERT INTO Character (name, origin, character_class, attack_points, magic_points, health_points, dice_roll_points, image_url)
VALUES
    ('Geralt', 'of Rivia', 'Warrior', 100, 40, 150, 5, 'Geralt_pixabay.jpg'),
    ('Cirilla', 'of Cintra', 'Warmage', 70, 70, 120, 6, 'Ciri_pixabay.jpg'),
    ('Yennefer', 'of Vengerberg', 'Mage', 30, 120, 110, 4, 'Yennefer_pixabay.jpg');

-- Insert example records into the Enemy table
INSERT INTO Enemy (name, type, power, power_type, image_url)
VALUES
    ('Enemy1', 'Goblin', 50, 'Physical', 'monster_pixabay.png'),
    ('Enemy2', 'Dragon', 150, 'Fire', 'monster_pixabay.png'),
    ('Enemy3', 'Zombie', 70, 'Undead', 'monster_pixabay.png');

-- Insert example records into the Event table
INSERT INTO Event (name, effect, effect_power_points, effect_roll_success_points, description, image_url)
VALUES
    ('Wolves', 'ENEMY', 1, 0, 'A', 'monster_pixabay.png'),
    ('Fireball', 'LOWER_HP', 10, 4, 'A', 'monster_pixabay.png'),
    ('Healing Pond', 'GET_HP', 20, 5, 'A', 'monster_pixabay.png'),
    ('MagicTrap', 'LOWER_MP', 5, 3, 'A', 'monster_pixabay.png'),
    ('Event3', 'GET_MP', 5, 2, 'A', 'monster_pixabay.png'),
    ('Get drunk', 'PUSH_BACK', 5, 3, 'A', 'monster_pixabay.png'),
    ('Event2', 'LOSE_TURN', 5, 3, 'A', 'monster_pixabay.png'),
    ('Event4', 'ENEMY', 5, 3, 'A', 'monster_pixabay.png'),
    ('Event1', 'GET_AD', 5, 2, 'A', 'monster_pixabay.png');


-- Insert example records into the Player table
INSERT INTO Player (name, games_played, high_score)
VALUES
    ('Player1', 10, 5000),
    ('Player2', 8, 6000),
    ('Player3', 12, 4500);
