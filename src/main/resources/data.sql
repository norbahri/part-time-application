-- Insert sample users
-- Password for all users is "password" (encoded with BCrypt)
INSERT INTO users(name, email, password) VALUES
    ('admin','admin@gmail.com','$2a$12$JGriZzgFwZNEeuIzFcocjug9wb0/G0EJ1nco27FZoCvVLmfpfiiWe');

INSERT INTO users(name, email, password) VALUES
    ('John','test@gmail.com','$2a$12$F2QRPx07EsQTswGmyxB4sOw7RLCnIDqux/LWhO5vfegs42OS2LE.C');

INSERT INTO users(name, email, password) VALUES
    ('Alex','abc@gmail.com','$2a$12$aRRjmnRA5MkVg3M.xSc1G.jQkkvfx73WJhIvI.77IMkJyZpTT5dvC');

INSERT INTO users(name, email, password) VALUES
    ('Boss','def@gmail.com','$2a$12$MBeLkc4HGARn/pOnBl1HSugtEBvL5EwRvQ4EzqAykvt4hUogKl/Zy');

-- Insert roles
INSERT INTO roles(name) VALUES ('ROLE_ADMIN');
INSERT INTO roles(name) VALUES ('ROLE_USER');

-- Assign roles to users
-- User 1 (admin@gmail.com) has ADMIN role
INSERT INTO users_roles(role_id, user_id) VALUES (1,1);

-- User 2 (test@gmail.com) has USER role
INSERT INTO users_roles(role_id, user_id) VALUES (2,2);

-- User 3 (abc@gmail.com) has USER role
INSERT INTO users_roles(role_id, user_id) VALUES (2,3);

-- User 4 (def@gmail.com) has both USER and ADMIN roles
INSERT INTO users_roles(role_id, user_id) VALUES (2,4);
INSERT INTO users_roles(role_id, user_id) VALUES (1,4);