def solution(num_list):
    answer = []

    last = num_list[-1]
    second_last = num_list[-2]

    if last > second_last:
        answer = last - second_last  # 마지막 원소에서 그 전 원소를 뺌
    else:
        answer = last * 2  # 마지막 원소를 두 배함

    return num_list + [answer] 