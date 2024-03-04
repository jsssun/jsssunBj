import sys

N = int(sys.stdin.readline())
card = sorted(list(map(int, sys.stdin.readline().split())))
M = int(sys.stdin.readline())
check = list(map(int, sys.stdin.readline().split()))

for i in check:
    low, high = 0, N-1
    exist = False
    while low <= high:
        mid = (low + high) // 2
        if card[mid] > i:
            high = mid - 1
        elif card[mid] < i:
            low = mid + 1
        else:
            exist = True
            break
    print(1 if exist else 0, end=' ')