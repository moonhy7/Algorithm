
#그리디 1번 - 함수 형태로 풀이
"""
list = [500, 100, 50, 10]
def money(N) :
    count = 0
    for i in range(4) : 
        count += (N // list[i])
        N %= list[i]
    return(count)
    
money(5670)
"""

#그리디 1번 - 입출력 형태로 풀이
"""
N = int(input())
list = [500, 100, 50, 10, 5, 1]
count = 0
for i in range(4) : 
    count += (N // list[i])
    N %= list[i]
print(count)
"""


"""백준 거스름돈 문제 풀이"""
N = 1000 - int(input())
list = [500, 100, 50, 10, 5, 1]
count = 0
for i in range(6) : 
    count += (N // list[i])
    N %= list[i]
print(count)

