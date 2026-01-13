n, k = map(int, input().split())
Max = n if n > k else k
dp = [[0] * i for i in range(1, Max+1)]

for i in range(Max):
    dp[i][0] = 1
    dp[i][i] = 1

for i in range(2, Max):
    for j in range(1, i):
        dp[i][j] = dp[i-1][j] + dp[i-1][j-1]

print(dp[n-1][k-1])