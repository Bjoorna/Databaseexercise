# alle navn lagres i en 255 bits variabel for nå, sikkert lurt og spesifisere senere
# legg til restriksjoner senere

# OK
CREATE table Movie (
	MovieID integer,
    Title varchar(255),
    ProductionYear integer,
    DirectorID integer,
    
    PRIMARY KEY (MovieID),
    foreign key (DirectorID) references Director(DirectorID)
);

CREATE table GenreInMovie (

	MovieID integer,
    GenreID integer,
    
    PRIMARY KEY (MovieID, GenreID),
    
    FOREIGN KEY (MovieID) references Movie(MovieID)
		on update cascade on delete cascade,
    foreign key (GenreID) references Genre(GenreID)	
		on update cascade on delete cascade
);

CREATE table Genre (
	GenreID integer,
    Name varchar(255),
    Description varchar(255),
    
    primary key (GenreID)
);



CREATE table Actor(
	ActorID integer,
    Name varchar(255),
    BirthYear integer,
    
    primary key (ActorID)
);
    
create table ActorInMovie(
	ActorID integer,
    MovieID integer,
    Role varchar(255),
    
    primary key (MovieID, ActorID),
    foreign key (MovieID) references Movie(MovieID)
		on update cascade on delete cascade,
    foreign key (ActorID) references Actor(ActorID)
		on update cascade on delete cascade
);

CREATE table Director(
	DirectorID integer,
    Name varchar(255),
    
    primary key (DirectorID)
);



