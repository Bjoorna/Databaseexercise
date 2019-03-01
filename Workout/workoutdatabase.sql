# Treningsdagbok
# WIP
drop table person;
drop table workout;
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
    Length integer,
    Exercises varchar(255),
    PersonalScore integer,
    Performance integer,
    
    CONSTRAINT PersonalScore CHECK (PersonalScore BETWEEN 1 AND 10),
	CONSTRAINT Performance CHECK (Performance BETWEEN 1 AND 10),
    
    primary key(WorkoutID)
);

CREATE table Exercise(
	ExerciseID integer,
    Name varchar(255),
    # Under, litt usikker på hvordan det skal representeres
    EquipmentID integer,
    Ename varchar(255),
    Kilo integer,
    Sets integer,
    Description varchar(255),
    
    primary key(ExerciseID)
);

CREATE table Equipment(
	EquipmentID integer,
    Name varchar(255),
    Description varchar(255),
    
    primary key(EquipmentID)
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