# task 2
#a
select * from movie;

#b
select name from actor where birthyear > 1960;

#c
select name from actor where (birthyear between 1980 and 1989) order by name;

#d
select role, title from movie inner join actorinmovie on (movie.movieid = actorinmovie.movieid) where actorid in (select actorid from actor where name ="Morgan Freeman");

#e uferdig
# select distinct title from movie inner join director on (movie.directorid = director.directorid) where 

#f
select count(*) from actor where (lower(name) like 'c%');

#g
select genre.name, count(movie.title) from genre join 