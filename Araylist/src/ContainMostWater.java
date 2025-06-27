import java.util.ArrayList;

public class ContainMostWater {
    // Brute Force Apporche

    // O(n^2) time
    public static int Brutforce(ArrayList<Integer> list){
        int maxwater = 0;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j< list.size(); j++){
                int hight = Math.min(list.get(i),list.get(j));
                int width = j-1;
                int currWater = hight * width;
                maxwater = Math.max(maxwater , currWater);
            }
        }
        return maxwater;
    }

    // linear time
    public static int contianWater(ArrayList<Integer> hight){
        int maxWater = 0;
        int lp = 0;
        int rp = hight.size()-1;

        while (lp < rp){
            // calculate most cantain water
            int hig = Math.min(hight.get(lp),hight.get(lp));
            int width = rp=lp;
            int currwater = hig * width;
            maxWater = Math.max(currwater , maxWater);

            // update
            if(hight.get(lp) < hight.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(Brutforce(list));
    }
}
