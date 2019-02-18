# alle navn lagres i en 255 bits variabel for nå, sikkert lurt og spesifisere senere
# legg til restriksjoner senere

CREATE table Director(
	DirectorID integer,
    Name varchar(255),
    
    primary key (DirectorID)
);

CREATE table Movie (
	MovieID integer,
    Title varchar(255),
    ProductionYear integer,
    DirectorID integer,
    
    PRIMARY KEY (MovieID),
    foreign key (DirectorID) references Director(DirectorID)
);

CREATE table Genre (
	GenreID integer,
    Name varchar(255),
    Description varchar(255),
    
    primary key (GenreID)
);

CREATE table GenreInMovie (
	GenreID integer,
	MovieID integer,
   
    PRIMARY KEY (MovieID, GenreID),
    
    FOREIGN KEY (MovieID) references Movie(MovieID)
		on update cascade on delete cascade,
    foreign key (GenreID) references Genre(GenreID)	
		on update cascade on delete cascade
);

CREATE table Actor(
	ActorID integer,
    Name varchar(255),
    BirthYear integer,
    
    primary key (ActorID)
);
    
create table ActorInMovie(
	MovieID integer,
	ActorID integer,
    Role varchar(255),
    
    primary key (MovieID, ActorID),
    foreign key (MovieID) references Movie(MovieID)
		on update cascade on delete cascade,
    foreign key (ActorID) references Actor(ActorID)
		on update cascade on delete cascade
);





