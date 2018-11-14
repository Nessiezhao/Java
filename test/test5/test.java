class TapeDeck{
    boolean canRecord = false;
    void playTape(){
        System.out.println("tape playing");
    }
    void recordTape(){
        System.out.println("tape recording");
    }
}

class DVDPlayer{
    boolean canRecord = false;
    void recordDVD(){
        System.out.println("DVD recording");
    }
    void playDVD(){
        System.out.println("DVD playing");
    }
}

class DrumKit{
    boolean toHat = true;
    boolean snare = true;
    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
    void playSnare(){
        System.out.println("bang bang ba-bang");
    }
}

class Dog{
    String name;
    public void bark(){
        System.out.println(name + "says Ruff!");
    }
}
public class test{
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
        //DrumKit d = new DrumKit();
        //d.snare = true;
        //if(d.snare == true){
        //    d.playSnare();
        //}

        //d.playTopHat();
        //DVDPlayer d = new DVDPlayer();

        //d.canRecord = true;
        //d.playDVD();
        //if(d.canRecord == true){
        //    d.recordDVD();
        //}
        //TapeDeck t = new TapeDeck();
        //t.canRecord = true;
        //t.playTape();
        //if(t.canRecord == true){
        //    t.recordTape();
        //}
    }
}
