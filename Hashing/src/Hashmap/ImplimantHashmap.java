package Hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplimantHashmap {
    static class Hashmap<K ,V> {
        private class Node {
            K key;
            V value;

            public Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> bukets[];

//        @SuppressWarnings("unchecked");
 
        public Hashmap() {
             this.N= 4;
             this.bukets = new LinkedList[4];
             for(int i=0 ;i<4; i++){
                 this.bukets[i] = new LinkedList<>();
             }
        }
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % bukets.length ;
        }
        private int SearchInLL(K key , int bi){  // bi = buket index means ArrayList index
            LinkedList<Node> ll = bukets[bi];
            int di = 0; // di = data index  means LinkedList index

            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuck[] = bukets;
            bukets = new LinkedList[N*2];
            N=2*N;
            for(int i=0; i<bukets.length; i++){
                bukets[i] = new LinkedList<>();
            }
            // nodes -> add in bucket
            for(int i=0 ;i<oldBuck.length; i++){
                LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key , V value){
            int bi = hashFunction(key);
            int di = SearchInLL(key , bi);

            if(di != -1){
                Node node = bukets[bi].get(di);
                node.value = value;
            }else {
                bukets[bi].add(new Node(key,value));
                n++;
            }
            double lambda = n/N;
            if(lambda > 2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key , bi);

            if(di != -1){
                return true;
            }else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key , bi);

            if(di != -1){
                Node node = bukets[bi].remove(di);
                n--;
                return node.value;
            }else {
                return null;
            }
        }

        public  V get(K key){
            int bi = hashFunction(key);
            int di = SearchInLL(key , bi);

            if(di != -1){
                Node node = bukets[bi].get(di);
                return node.value;
            }else {
                return null;
            }
        }
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<bukets.length; i++){
                LinkedList<Node> ll = bukets[i];
                for(Node node : ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {
        Hashmap<String , Integer> map = new Hashmap<>();
        map.put("heloo",92);
        map.put("hii",23);
        map.put("sudh",23);

        ArrayList<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key);
        }

        System.out.println(map.get("hii"));
        System.out.println(map.remove("sudh"));
        System.out.println(map.get("sudh"));
    }
}
