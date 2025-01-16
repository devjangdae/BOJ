N, M = map(int, input().split())
schoolClass = [list(input()) for _ in range(N)]
zipClass = list(map(list, zip(*schoolClass)))	# 2차원 배열 행과 열 바꾸기

result = 0
for i in range(len(zipClass)):
    if zipClass[i].count("X") == N:
        result = i + 1
        break

if result > 0:
    print(result)
else:
    print("ESCAPE FAILED")