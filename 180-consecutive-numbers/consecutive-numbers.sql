SELECT DISTINCT l1.NUM AS ConsecutiveNums
FROM Logs l1
JOIN Logs l2 on l1.id=l2.id-1
JOIN Logs l3 on l2.id=l3.id-1
WHERE l1.Num=l2.Num
and l2.NUM=l3.NUM