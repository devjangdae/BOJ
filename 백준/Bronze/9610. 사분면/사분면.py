import sys
N = int(sys.stdin.readline())
arr = [0, 0, 0, 0, 0] # 1, 2, 3, 4사분면 + 축 개수
for _ in range(N):
    X, Y = map(int, sys.stdin.readline().split())

    if X == 0 or Y == 0: # 축에 존재하는 경우
        arr[4] += 1

    if X > 0 and Y > 0: # 1사분면
        arr[0] += 1
    elif X < 0 and Y > 0: # 2사분면
        arr[1] += 1
    elif X < 0 and Y < 0: # 3사분면
        arr[2] += 1
    elif X > 0 and Y < 0: # 4사분면
        arr[3] += 1
for i in range(4):
    print(f'Q{i+1}: {arr[i]}')
print(f'AXIS: {arr[4]}')