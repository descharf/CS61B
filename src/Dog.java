public class Dog {

    public static String binomen = "Canis familiaris";

    public float weightInPounds;

    public Dog(float w){
        weightInPounds = w;
    }

    // with static for general Dog class
    public static void generalNoise() {
        System.out.println("Wa wa wa!");
    }
    // without static for every dog instance
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyip");
        } else if (weightInPounds < 30) {
            System.out.println("Bark!");
        } else {
            System.out.println("wooooooo!");
        }
    }

    public static Dog maxDog(Dog dog1, Dog dog2){
        if (dog1.weightInPounds < dog2.weightInPounds){
            return dog2;
        } else{
            return dog1;
        }
    }

    public Dog maxDog(Dog dog2){
        if (weightInPounds>dog2.weightInPounds){
            return this;
        }else{
            return dog2;
        }
    }





}
