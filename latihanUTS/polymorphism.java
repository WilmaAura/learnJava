package latihanUTS;

public class polymorphism {
    public static void main(String[] args) {
        animal  myAnimal = new animal();
        animal myPig = new pig();
        animal myDog = new dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}

class animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class pig extends animal{
    public void animalSound(){
        System.out.println("The pig says: ngok ngok ngok");
    }
}

class dog extends animal{
    public void animalSound(){
        System.out.println("The dog says: hukk ghukk ghukk");
    }
}