select * from "Test".player p;

select p2.playerid, p2.playername from "Test".player p2 
where p2.teamid = 101;

-- Select (from, where, group by, having, order by)

select teamid, "position", avg(age) as Avg_age, count(playerid) as players 
from "Test".player
group by teamid, "position" 
having count(playerid) > 1
order by avg(age) desc;

-- Joins (inner, outer (left, right, full)), cross join

select p.playerid, p.playername, t.teamname, t.home from "Test".player p
join "Test".team t 
on t.teamid = p.teamid;

select p.playerid, p.playername, t.teamname, t.home from "Test".player p
left join "Test".team t 
on t.teamid = p.teamid;

select p.playerid, p.playername, t.teamname, t.home from "Test".player p
right join "Test".team t 
on t.teamid = p.teamid;

select p.playerid, p.playername, t.teamname, t.home from "Test".player p
full join "Test".team t 
on t.teamid = p.teamid;

select p.playerid, p.playername, t.teamname, t.home from "Test".player p
cross join "Test".team t 


-- Set Operations (Union, Unio All, Intersect, Minus)
select p.playerid, p.playername, p."position", p.teamid from "Test".player p 
where p.teamid = 101
union 
select p.playerid, p.playername, p."position", p.teamid from "Test".player p
where p."position" = 'Defender';


select p.playerid, p.playername, p."position", p.teamid from "Test".player p 
where p.teamid = 101
union all
select p.playerid, p.playername, p."position", p.teamid from "Test".player p
where p."position" = 'Defender';


select p.playerid, p.playername, p."position", p.teamid from "Test".player p 
where p.teamid = 101
intersect 
select p.playerid, p.playername, p."position", p.teamid from "Test".player p
where p."position" = 'Defender';

--select p.playerid, p.playername, p."position", p.teamid from "Test".player p 
--where p.teamid = 101
--minus
--select p.playerid, p.playername, p."position", p.teamid from "Test".player p
--where p."position" = 'Defender';



-- try writing insert, update and delete queries manually in the sql editor of Dbweaver and get used tp that syntax...
insert into "Test".player (playerid, playername, teamid)
values(12, 'William knot', 102, 25, 'Defender'),
      (13, 'Josue Martin', 101, 20, 'Midfielder');
     

-- delete from tablename, deletes all the rows
delete from "Test".player 
where playerid = 5;


update "Test".player 
set teamid = 102
where playername = 'Timothy Folk';

