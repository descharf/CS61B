public class IntList {

    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }
    // size using recursion
    public static int size(IntList l){
        if(l.rest == null){
            return 1;
        } else {
            return 1 + size(l.rest);
        }
    }

//    public int size(){
//        if(rest == null){
//            return 1;
//        } else{
//            return 1 + rest.size();
//        }
//    }
    // size using iteration
    public int size(){
        int totalSize = 0;
        IntList p = this;
        while(p != null){
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    // get the i'th item of the list
    // using recursion
    public int get(int i){
        if(i==1){
            return first;
        }else{
            return rest.get(i-1);
        }
    }
    // get using iteration
//    public int get(int i){
//        IntList p = this;
//        while(i>1){
//            p = p.rest;
//            i -= 1;
//        }
//        return p.first;
//    }
    public static void main(String[] args){
        IntList l = new IntList(1, null);
        l = new IntList(2, l);
        l = new IntList(3, l);
        System.out.println(IntList.size(l));
        System.out.println(l.size());
        System.out.println(l);
        System.out.println(l.rest);
        System.out.println(l.rest.rest);
        System.out.println(l.rest.rest.rest);

        System.out.println(l.get(3));

    }

}
