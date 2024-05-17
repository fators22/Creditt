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
}
