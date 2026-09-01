class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> ball = new Stack<>();
        for(int i =0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int first = ball.pop();
                int sec = ball.peek();

                ball.push(first);
                ball.push(first+sec);
            }else if(operations[i].equals("D")){
            int temp2 = (ball.peek())*2;
            ball.push(temp2);
            }else if(operations[i].equals("C")){
                ball.pop();
            }else{
                ball.push(Integer.parseInt(operations[i]));
            }
        }
        int sum =0;
        for(int x : ball){
         sum += x;

        }
        return sum;
        
    }
}