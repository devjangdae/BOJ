import sys
input = sys.stdin.readline

# 입력
for _ in range(int(input())):
    cnt = 0
    a = input().replace(" ", "").rstrip()
    for i in a:
        cnt += ord(i)-64
    if cnt == 100:
        print("PERFECT LIFE")
    else:
        print(cnt)