for _ in range(int(input())):
    res = set()
    idx = 1
    total, oil, food = map(int, input().split())

    while True:
        oil_mile = oil * idx
        food_mile = food * idx

        if oil_mile > total and food_mile > total:
            break

        if oil_mile < total:
            res.add(oil_mile)
        if food_mile < total:
            res.add(food_mile)

        idx += 1

    print(total, oil, food)
    print(len(res))