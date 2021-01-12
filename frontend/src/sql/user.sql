CREATE TABLE `user` (
  `id` int NOT NULL auto_increment,
  `priv_id` int NOT NULL,
  `note_id` int NOT NULL,
  `book_id` int NOT NULL,
  `exce_id` int NOT NULL,
  PRIMARY KEY (`id`)
)