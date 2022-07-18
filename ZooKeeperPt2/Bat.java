package ZooKeeperPt2;

public class Bat extends Mammal {

    public Bat(){
        super(300);
    }

    void fly(){
        System.out.println("The bat takes flight");
        energyLevel -= 50;
        displayEnergy();
    }

    void eatHumans(){
        System.out.println("The bat eats people, gains 25 energy.");
        energyLevel += 25;
        displayEnergy();
    }

    void attackTown(){
        System.out.println("The bat attacks town, loses 100 energy.");
        energyLevel -= 100;
        displayEnergy();
    }
}
