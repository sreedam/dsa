package analysis.of.program;

import java.util.*;

public class NaturalNumSum {
    public static void main(String args[]){

        Map<Integer,String> h = new LinkedHashMap<>();

        h.put(1,"s");
        h.put(2,"h");

        for( Map.Entry<Integer,String> hh :h.entrySet()){
            System.out.println(hh.getKey());
        }

        List<String> strs = new ArrayList<>();
        strs.add("Sreedam");
        strs.add("Hembram");
        System.out.println(Arrays.toString(strs.toArray()));


        int[] nums= new int[10];
        nums[0]=1;
        nums[1]=2;
        System.out.println(Arrays.stream(nums).max().getAsInt());

    }


}
