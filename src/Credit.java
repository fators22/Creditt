public class Credit {
    public static int findDigits(long num){
        int count =0;
        while( num>0){

            int digit=(int)num%10;
            count++;
            num=num/10;

        }

        return count;
    }

      public static int getDigit(long num, int index){
        int result =0;
        while( num>0){

            int digit=(int)num%10;
            count++;
            if(count==index){
                return digit;
            }
            num=num/10;

        }

        return result;
    }
}
