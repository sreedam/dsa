package numbercount.iterative;

public class IterativeRunner {

    public static  void main (String args[]){
        int num = 123;
        int count =0;
        while(num!=0){
            num = num/10;
            ++count;
        }

        System.out.println("Counting number "+count);
    }
}
