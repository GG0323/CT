class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int[] x = {0, 1, -1}, y = {1, 0, -1};
        int xc = 0, yc = 0, curr = 0, value = 1;
        
        while(true){
            arr[yc][xc] = value++;
            int ty = yc + y[curr], tx = xc + x[curr];
            if(ty == n || tx == n || ty == -1 || tx == -1 || arr[ty][tx] != 0){
                curr = (curr + 1) % 3;
                ty = yc + y[curr];
                tx = xc + x[curr];
                
                if(ty == n || tx == n || ty == -1 || tx == -1 || arr[ty][tx] != 0) break;
            }
            yc = ty; xc = tx;
        }

        int[] answer = new int[value - 1];
        for(int i = 0, index = 0; i < n; i++){
            for(int j = 0; j <= i; j++)
                answer[index++] = arr[i][j];
        }
        return answer;
    }
}