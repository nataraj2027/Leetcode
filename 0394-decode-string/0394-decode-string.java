class Solution {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currString = new StringBuilder();
        int k = 0;

        for(char c : s.toCharArray()){

            if(Character.isDigit(c)){

                k = k * 10 + (c - '0');
            }

            else if(c == '['){

                countStack.push(k);
                stringStack.push(currString);
                currString = new StringBuilder();
                k = 0;
            }

            else if(c == ']'){

                StringBuilder decodedString = stringStack.pop();
                int currentK = countStack.pop();

                for(int i = 0; i < currentK; i++){

                    decodedString.append(currString);
                }
                currString = decodedString;
            }

            else{

                currString.append(c);
            }
        }
        return currString.toString();
    }
}