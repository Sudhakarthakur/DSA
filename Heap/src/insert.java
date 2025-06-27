import java.util.ArrayList;

public class insert {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);

            int x = arr.size()-1;
            int ParIdx = (x-1)/2;
            //loop
            while (  arr.get(x)< arr.get(ParIdx)){
                //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(ParIdx));
                arr.set(ParIdx,temp);
            }
        }

        // peek Node which are min value
        public int peek(){
            return arr.get(0);
        }

        // create a heapfy methode to maintain heap properties
        // in this heapfy fuction find min value and for find max value we see the sorthepy class
        private void heapfy(int i){
            // find left child Node through parents Node
            int left = 2*i+1;
            // find right child Node through parents Node
            int right = 2*i+2;
            int MinIdx = i;

            if(left<arr.size() && arr.get(MinIdx) > arr.get(left)){
                MinIdx = left;
            }
            if(right< arr.size() && arr.get(MinIdx) > arr.get(right)){
                MinIdx = right;
            }
            if(MinIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(MinIdx));
                arr.set(MinIdx , temp);

                heapfy(MinIdx);
            }
        }

        // remove root node
        public int remove(){
            int data = arr.get(0);

            // Here we write code to delete Node root value

            // here we swap node root to Node Leaf means last Node
            // than we delete last Node
            // Step-1 swap first Node to last Node
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //Step-2 delete Node
            arr.remove(arr.size()-1);

            // Step-3 call heapfy methode
            heapfy(0);
            return data;
        }
        public boolean IsEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.IsEmpty()){
            System.out.println(h.peek()+" ");
            h.remove();
        }

    }
}