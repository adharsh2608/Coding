# Write your MySQL query statement below
SELECT Person.firstName, person.LastName, Address.city, Address.state
FROM Person
LEFT JOIN Address
ON Person.personId= Address.personId