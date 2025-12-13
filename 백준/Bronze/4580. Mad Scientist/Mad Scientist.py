while True:
    line = list(map(int, input().split()))
    if line[0] == 0:
        break
    n = line[0]
    li = line[1:]
    res = []
    now = 1
    for el in li:
        for _ in range(el - len(res)):
            res.append(now)
        now += 1

    print(*res)