public class SLList <pineapple>{

    public class IntNode {

        public pineapple item;
        public IntNode next;

        public IntNode(pineapple i, IntNode n){
            item = i;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    /* sentinel is a placeholder at left of 'first',
    Making sure the SLList has never null on the first position
    otherwise we have Error e.g. while call addLast() method */

    SLList(){
        sentinel = new IntNode(null, null);
        size = 0;
    }

    SLList(pineapple f){
        sentinel = new IntNode(null, new IntNode(f, null));
        size = 1;
    }

    public void addFirst(pineapple x){
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public pineapple getFirst(){
        return sentinel.next.item;
    }

    public void addLast(pineapple x){
        IntNode p = sentinel;
        while (p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }

    public int size(){
//        return size(first);

//        It's nuch faster when we keep track on size variable,
//        compared to calculate it every time
        return size;
    }

    /*  SLlist is not recursive, we can't direct write size()
        so we need a helper method:
        Return the size of list starting from IntNode p */
    private int size(IntNode p){
        if (p.next == null){
            return 1;
        }
        return 1 + size(p.next);
    }

}