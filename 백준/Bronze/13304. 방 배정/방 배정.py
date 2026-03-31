from math import ceil

n, k = map(int, input().split())
students = [0] * 5

for _ in range(n):
    s, y = map(int, input().split())

    if y == 1 or y == 2:
        students[0] += 1
    elif s == 0 and (y == 3 or y == 4):
        students[1] += 1
    elif s == 1 and (y == 3 or y == 4):
        students[2] += 1
    elif s == 0 and (y == 5 or y == 6):
        students[3] += 1
    else:
        students[4] += 1

res = sum([ceil(student / k) for student in students])
print(res)