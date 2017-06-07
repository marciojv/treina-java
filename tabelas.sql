CREATE TABLE `livrejava`.`user` (
  `id` INT NOT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `livrejava`.`Aluno` (
  `matricula` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `idade` INT NULL,
  PRIMARY KEY (`matricula`)
);

