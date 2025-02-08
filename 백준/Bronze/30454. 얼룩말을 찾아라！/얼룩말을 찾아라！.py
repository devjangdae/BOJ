N, L = map(int, input().split())
result = []

for _ in range(N):
    zebra = input() + "0"	# 쉽게 풀기 위한 "0" 추가
    tmp1 = []
    tmp2 = ""
    for i in range(L + 1):
        if zebra[i] == "1":	# 털이 검정색이면
            tmp2 += "1"
        elif len(tmp2) > 0:		# tmp2가 빈문자열이 아니라면
            tmp1.append(tmp2)	 	# tmp1에 검은 털 무늬 append
            tmp2 = ""			# tmp2는 빈문자열로 초기화

    result.append(len(tmp1))

print(max(result), result.count(max(result)))