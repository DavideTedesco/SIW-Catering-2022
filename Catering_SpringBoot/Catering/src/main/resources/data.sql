/*============ENTITY TABLES=============*/

/*Users*/
/*insert into users(id, nome, cognome ) values('200','admin','admin');*/
/*insert into users(id, nome, cognome ) values('200','user','user');*/

/*Credentials (le password sono: "password". Esse sono realizzate tramite il metodo encode della classe BCryptPasswordEncoder)*/
/*insert into credentials(id, password, role, username, user_id ) values('150', '$2a$10$H90gDy3sDjHh64GqNIimseg0wifDVWpLpDednMiqWAUSae5SLwvzO' ,'ADMIN','admin', '200');*/
/*insert into credentials(id, password, role, username, user_id ) values('150', '$2a$10$H90gDy3sDjHh64GqNIimseg0wifDVWpLpDednMiqWAUSae5SLwvzO' ,'USER','user', '300');*/

/*Chef*/
/*insert into chef(id, cognome, nazionalita, nome) values('100', 'Shapi', 'Giapponese', 'Sughi');*/
/*insert into chef(id, cognome, nazionalita, nome) values('200', 'Potato', 'Inglese', 'John');*/
/*insert into chef(id, cognome, nazionalita, nome) values('300', 'Ratatouille', 'Francese', 'Jean Jacques');*/
/*insert into chef(id, cognome, nazionalita, nome) values('400', 'Pi a din', 'Marocchina', 'Ahmed');*/
/*insert into chef(id, cognome, nazionalita, nome) values('500', 'Tortilla', 'Spagnola', 'Fernando');*/

/*Buffet*/
insert into buffet(id, categoria, descrizione, nome, chef_id) values('23', 'carnivoro','Gran buffet di carne', 'Grand viande', '300');
insert into buffet(id, categoria, descrizione, nome, chef_id) values('42', 'vegano','Gran buffet di verdure', 'OK', '16');
insert into buffet(id, categoria, descrizione, nome, chef_id) values('52', 'onnivoro','Gran buffet variegato', 'Mix', '20');

/*Piatto*/
/*insert into piatto(id, descrizione, nome) values('300', 'la migliore bistecca che potrai mai mangiare', 'Bistecca ai ferri');*/

/*Ingrediente*/
/*
insert into ingrediente(id, nome, origine, descrizione) values('100', 'Scottona', 'Toscana', 'la miglior carne di vacca');
insert into ingrediente(id, nome, origine, descrizione) values('110', 'Sale', 'Ceccano', 'Sale della fronte di Antonio Mattone');
insert into ingrediente(id, nome, origine, descrizione) values('120', 'Pepe', 'Roma', 'pepe del tizio dei té');
*/
/*============JOIN TABLES=============*/

/*chef_buffets*/

/*buffet_piatti*/

/*piatto_ingredienti*/
/*
insert into piatto_ingredienti(piatto_id, ingredienti_id) values('300', '100');
insert into piatto_ingredienti(piatto_id, ingredienti_id) values('300', '110');
insert into piatto_ingredienti(piatto_id, ingredienti_id) values('300', '120');
*/
