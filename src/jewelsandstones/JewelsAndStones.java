package jewelsandstones;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        int count = 0;

        for(char c: jewels.toCharArray()) {
            jewelSet.add(c);
        }

        for(char c:stones.toCharArray()){
            if(jewelSet.contains(c)){
                count++;
            }
        }

        return count;
    }


    public int numJewelsInStonesBruteForce(String jewels, String stones) {
        int count = 0;
        for (int j = 0; j < jewels.length(); j++) {
            char c = jewels.charAt(j);
            for (int i = 0; i < stones.length(); i++) {
                if (c == stones.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }

        /*public int numJewelsInStones(String jewels, String stones) {

        char[] jewArray = jewels.toCharArray();
        Arrays.sort(jewArray);
        char[] stArray = stones.toCharArray();
        Arrays.sort(stArray);
        int jewInd = 0;
        int stInd = 0;
        int count = 0;
        while(jewInd < jewels.length() && stInd<stones.length()){
            if(jewArray[jewInd] == stArray[stInd]){
                count ++;
                stInd++;
            }else if(jewArray[jewInd] > stArray[stInd]){
                stInd++;
            }else{
                jewInd++;
            }
        }

        return count;
    }*/

}
