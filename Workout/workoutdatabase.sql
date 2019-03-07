# Treningsdagbok

drop table performsexercise;
drop table inexercisegroup;
drop table exercisegroups;
drop table workout;
drop table person;
drop table exercise;
drop table equipment;



CREATE TABLE Person(
	PersonID integer,
    Name varchar(255),
    
    primary key (PersonID)
);

CREATE table Workout(
	WorkoutID integer,
    Date DATETIME, # lagring av dato/tidspunkt
    Length integer, # feks lengde i minutt
    Exercises varchar(255),
    PersonalScore integer,
    Performance integer,
    Note varchar(1000),
    
    CONSTRAINT PersonalScore CHECK (PersonalScore BETWEEN 1 AND 10),
	CONSTRAINT Performance CHECK (Performance BETWEEN 1 AND 10),
    
    primary key(WorkoutID)
);

CREATE table Equipment(
	EquipmentID integer,
    Equipmentname varchar(255) unique,
    Description varchar(255),
    
    primary key(EquipmentID)
);

CREATE table Exercise(
	ExerciseID integer,
    Name varchar(255),
    EquipmentID integer, # Om equipmentID og Ename er null, betyr dette at øvelsen ikke trenger et apparat
    Equipmentname varchar(255),
    Kilo integer, 
    Sets integer,
    
    primary key(ExerciseID),
    foreign key(EquipmentID) references Equipment(EquipmentID),
    foreign key(Equipmentname) references Equipment(Equipmentname)
);


CREATE table PerformsExercise(
	WorkoutID integer,
    ExerciseID integer,
    
    primary key(WorkoutID, ExerciseID),
    foreign key (WorkoutID) references Workout(WorkoutID),
	foreign key (ExerciseID) references Exercise(ExerciseID)
);

CREATE table ExerciseGroups(
	Name varchar(255),
    primary key(name)
);

CREATE table InExerciseGroup(
	ExerciseID integer,
    Name varchar(255),
    
    primary key(ExerciseID, Name),
    foreign key (ExerciseID) references Exercise(ExerciseID),
    foreign key (Name) references ExerciseGroups(Name)
);