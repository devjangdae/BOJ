# 사용자로부터 분침이 가리키는 분을 입력받음
input_minute = int(input())

# 올바른 시각의 분을 저장할 변수 초기화
correct_minute = 0

# 입력된 분이 30보다 크거나 같은 경우 (즉, 분침이 6시 방향을 넘어선 경우)
if input_minute >= 30:
    # 15분을 추가하여 정상적인 속도로 움직인 15분을 계산
    correct_minute += 15
    # 입력된 분에서 30을 뺀 나머지 분을 계산하여 이를 2/3배 속도로 움직인 시간을 계산
    input_minute -= 30
    correct_minute += input_minute * 1.5
# 입력된 분이 30보다 작은 경우 (즉, 분침이 6시 방향 이전인 경우)
else:
    # 입력된 분을 2배 속도로 움직인 시간으로 계산
    correct_minute = input_minute / 2

# 계산된 올바른 시각의 분을 출력
print(correct_minute)