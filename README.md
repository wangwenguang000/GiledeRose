# Tasking

|No	|Given	|When	|Then	|Case|
|---|---|---|---|---|
|1|	sellin和quality值	|创建普通商品	|获得普通商品，其sellin和quality为给定值	|s=10; q=10 ---> O(10, 10)|
|2|	quality>50	|创建普通商品|	得到普通商品，其quality=50	|s=10; q=100 ---> O(10, 50)|
|3|	quality<0	|创建普通商品	|得到普通商品，其quality=0	|s=10; q=-10 ---> O(10, 0)|
|4	|普通商品	|存放n天，n<sellin	|该商品sellin值减小n，quality减小n	|O(10,10); d=5 ----> O(5, 5)|
|5|	普通商品	|存放n天，n>sellin|	该商品sellin=0，quality减小sellin +2(d-sellin)	|O(10,20); d=12 ---> O(0, 6)|
|6|	后台门票	|存放n天，sellin-n >=10	|该后台门票sellin=sellin-n，quality=quality	|B(20, 10); d=5 ---> B(15, 10) B(20, 10); d=10 ---> B(10, 10)|
|7|	后台门票	|存放n天，10>sellin-n>=5|	该后台门票sellin=sellin-n，quality=qualiy+2(10-sellin+n)	|B(20, 10); d=12 ---> B(8, 14) B(20, 10); d=15 ---> B(5, 20)|
|8|	后台门票	|存放n天，5>sellin-n>=0|	该后台门票sellin=sellin-n，quality=qualiy+10+3(5-sellin+n)	|B(20, 10); d=18 ---> B(2, 29) B(20, 10); d=20 ---> B(0, 35)|
|9|	后台门票	|存放n天，n>sellin	|该后台门票sellin=0，quality=0	|B(20, 10); d=21 ---> B(0, 0)|
