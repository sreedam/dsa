package numbercount.recursive;

public class RecursiveRunner {

    public static void main(String args[]){
        int count = numbercount(123);

        System.out.println("Number Count "+count);

    }

    public static int numbercount(int num){
        if(num==0)
            return 0;
        else{
            return 1+ numbercount(num/10);
        }
    }
}
