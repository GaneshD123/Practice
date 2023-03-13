import java.util.*;

public class StringOccurences {
    public static void main(String[] args) {
     //   1 0 1 1 1 0 0

        Integer intAraay[]=new Integer[]{1,0,1,1,1,0,0};

        int occCounter=0;
        int prevNo=0;
        for (int i=0;i<intAraay.length;i++){
            int currentNo=intAraay[i];
            int nextNo=intAraay[i+1];
            if(currentNo==nextNo){
                occCounter++;
            }
        }

    }
}



