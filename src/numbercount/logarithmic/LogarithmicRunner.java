package numbercount.logarithmic;

public class LogarithmicRunner {
    public static void main(String args[]){
        int count = (int) (1 + Math.floor(Math.log10(123)));
        System.out.println(count);
    }
}
