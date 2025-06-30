person = int(input())
schedule = [
    [int(d) for d in list(input().replace(".", "0").replace("Y", "1"))]
    for _ in range(person)
]

vec = list(map(sum, zip(*schedule)))
result = [str(i + 1) for i, x in enumerate(vec) if x == (max(vec))]
print(",".join(result))