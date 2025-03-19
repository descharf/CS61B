import java.util.Arrays;
public class DogLauncher {
    public static void main(String[] args) {
        // declare
        Dog smallDog;
        // instantiation
        new Dog(5);
        // assignment
        smallDog = new Dog(5);
        // all in one
        Dog hugeDog = new Dog(150);

        // array
        Dog[] dogs = new Dog[]{
                new Dog(5),
                new Dog(15),
                new Dog(50)
        };

        int i = 0;
        while (i < 3) {
            dogs[i].makeNoise();
            i++;
        }

        Dog.generalNoise();
//          Dog.makeNoise();

        Dog larger;

        larger = Dog.maxDog(dogs[0], dogs[1]);
        larger.makeNoise();

        larger = dogs[2].maxDog(dogs[1]);
        larger.makeNoise();

        System.out.println(Dog.binomen);

        int x = 0;
        int y;
        y = x;
        x = 2;
        System.out.println("x=" + x);
        System.out.println("y=" + y);

        String a = "abc";
        String b = "bcd";
        b = a;
        a = "c";
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        // array is not one of the primitive type, so use new
        int[] arr = new int[]{6,4,2,14,53};
        System.out.println(Arrays.toString(arr));


    }
}
