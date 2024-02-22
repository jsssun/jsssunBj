import sys
n = int(sys.stdin.readline())
nums = []
for i in range(n):
    nums.append(int(sys.stdin.readline()))
for x in sorted(nums):
    sys.stdout.write(str(x)+'\n')