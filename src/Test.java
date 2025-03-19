public class Test{
    public static void main(String[] args){
//        SLList L = new SLList(5);
//        L.addFirst(10);
//        System.out.println(L.getFirst());
//        L.addLast(9);
//        L.addLast(19);
//        System.out.println(L.size());

        SLList <String> L = new SLList <String>();
        L.addLast("666");
        L.addLast("777");
        System.out.println(L.getFirst());
        System.out.println(L.size());

        SLList <Integer> L2 = new SLList <Integer>();
        L2.addLast(2);
        L2.addLast(3);
        System.out.println(L2.getFirst());
        System.out.println(L2.size());
    }
}
