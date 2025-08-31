class LargestOddDigit {
    public String largestOddNum(String num){

        String res = "";

        for(int i = 0; i < num.length(); i++){

            if((num.charAt(i) - '0') % 2 != 0){
                
                res = num.substring(0 , i + 1);
            }
        }
        return res;
    }
}
