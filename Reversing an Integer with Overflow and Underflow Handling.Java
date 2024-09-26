class Solution {
    public int reverse(int x) {
       
        int sum=0;
     
        while(x!=0){
            int reminder=x%10;
              if(sum>Integer.MAX_VALUE/10 || (sum==Integer.MAX_VALUE/10 && reminder>7)){
            return 0;
        }
        if(sum<Integer.MIN_VALUE/10 || (sum==Integer.MIN_VALUE/10 && reminder<-8)){
            return 0;
        }
            sum=sum*10+reminder;
            x=x/10;
        }
      return sum;
    }
    public static void main(String[]args){
        Solution solution=new Solution();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input: x= ");
        int input=scanner.nextInt();
        int result=solution.reverse(input);
          System.out.print("Output: "+result);
      }
}
