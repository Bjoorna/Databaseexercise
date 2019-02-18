# alle navn lagres i en 255 bits variabel for nå, sikkert lurt og spesifisere senere

CREATE table Movie (
	MovieID integer,
    Title varchar(255),
    ProductionYear integer,
    
    PRIMARY KEY (MovieID)
);

CREATE table Genre (
	GenreID integer,
    Name varchar(255),
    Description varchar(255)
    
    primary key (GenreID)
);

CREATE table Director(
	DirectorID integer,
    Name varchar(255)
    
    primary key (DirectorID)
);

CREATE table Actor(
	ActorID integer,
    Name varchar(255),
    BirthYear integer
);
    
CREATE table GenreInMovie (

	MovieID integer,
    GenreID integer,
    
    PRIMARY KEY (MovieID, GenreID),
    
    FOREIGN KEY (MovieID) references Movie(MovieID),
    foreign key (GenreID) references Genre(GenreID)
);

create table ActorInMovie(
	ActorID integer,
    MovieID integer,
    Role varchar(255),
    
    
    primary key (MovieID, ActorID),
    foreign key (MovieID) references Movie(MovieID),
    foreign key (ActorID) references Actor(ActorID)
);
