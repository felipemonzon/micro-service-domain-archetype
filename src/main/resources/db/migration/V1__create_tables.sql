-- archetype.roles_seq definition

CREATE TABLE IF NOT EXISTS `roles_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO roles_seq (next_val)
VALUES(1);

-- archetype.roles definition

CREATE TABLE IF NOT EXISTS roles (
	id BIGINT auto_increment NOT NULL,
	name varchar(100) NOT NULL,
	value varchar(100) NOT NULL,
	status bool NULL DEFAULT true,
	created_user varchar(250) NOT NULL,
	created_date datetime NOT NULL,
	last_modified_user varchar(255) NOT NULL,
	last_modified_date datetime NOT NULL,
	CONSTRAINT role_PK PRIMARY KEY (id),
	CONSTRAINT role_UN UNIQUE KEY (name,value)
);

INSERT INTO roles (name, value, status, created_user, created_date, last_modified_user, last_modified_date)
VALUES ('ROLE_ADMIN', 'ADMIN', 1, 'ADMIN', NOW(), 'ADMIN', NOW()),
('ROLE_CUSTOMER', 'Cliente', 1, 'ADMIN', NOW(), 'ADMIN', NOW());

-- archetype.users_seq definition

CREATE TABLE IF NOT EXISTS `users_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO users_seq (next_val)
VALUES(1);

-- archetype.users definition

CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint NOT NULL,
  `created_user` varchar(255) NOT NULL,
  `created_date` datetime NOT NULL,
  `last_modified_user` varchar(255) NOT NULL,
  `last_modified_date` datetime NOT NULL,
  `cellphone` varchar(255) NOT NULL,
  `email_address` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `genre` varchar(20) DEFAULT NULL,
  `last_name` varchar(100) NOT NULL,
  `password` varchar(200) NOT NULL,
  `username` varchar(20) NOT NULL,
  `id_user` VARCHAR(20) NOT NULL,
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_r43af9ap4edm43mmtq01oddj6` (`username`),
  UNIQUE KEY `UK_sx468g52bpetvlad2j9y0lptc` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO users
(id, id_user, created_user, created_date, last_modified_user, last_modified_date, cellphone, email_address, first_name, genre, last_name, password, username, status)
VALUES(1, 'USU324htgd243yt567jh', 'ADMIN', NOW(), 'ADMIN', NOW(), '6671568899', 'felipemonzon2705@gmail.com', 'Felipe', 'MALE', 'Monzon', '$2a$10$K9UyV7Eiwoi8Udv/9R5kROuDvz/K6ZVLJzzESW2lVe7B.FfXRg0hK', 'felipemonzon2705', 'ACTIVE');

-- archetype.user_roles definition

CREATE TABLE IF NOT EXISTS `user_roles` (
  `id_user` bigint NOT NULL,
  `id_role` bigint NOT NULL,
  PRIMARY KEY (`id_user`,`id_role`),
  KEY `FK1v995xldvmr6w96c5feofx1gf` (`id_role`),
  CONSTRAINT `role_FK` FOREIGN KEY (`id_role`) REFERENCES `roles` (`id`),
  CONSTRAINT `user_role_FK` FOREIGN KEY (`id_user`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO user_roles(id_user, id_role)
VALUES(1, 1);