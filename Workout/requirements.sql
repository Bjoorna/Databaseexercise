
# requirement 1
insert into equipment values (1, "Power Rack", "For squat, benchpress, press, etc");
insert into equipment values (2, "Bench", "For bench press, dumbells, etc"); 
select * from equipment;


insert into exercise(exerciseid, name, sets) values (1, "Pushups", 3);
insert into exercise(exerciseid, name, kilo, sets) values (2, "Squat", 100, 3);
update exercise set EquipmentID = 2 where exerciseid = 2;
select * from exercise;

insert into workout(workoutid, date, length, personalscore, performance) values (2, "2019-02-11 11:11:11", 60, 20, 8);
select * from workout;



