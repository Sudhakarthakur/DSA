package Hashmap;

public class generic {
    static <t>  void gernricElement(t elemet) {
//        System.out.println(elemet.getClass().getName());
        System.out.println(elemet.hashCode());
    }

    public static void main(String[] args) {
        gernricElement(1982);
        gernricElement("hllo");
        gernricElement('h');
        int a = 21;
        System.out.println(args.getClass().getName());
    }
}
