# task 1c 

insert into Director values (1, "Peyton Reed");
insert into Director values (2, "Tom Shadyac");

insert into movie values (1, "Yes Man", 2008, 1);

insert into actor values (1, "Jim Carrey", 1962);

insert into actorinmovie values(1,1,"Carl");

# task 1d
update actor set Name = "James Eugene Carrey" where ActorID = 1;

# task 1e
delete from director where DirectorID = 2;