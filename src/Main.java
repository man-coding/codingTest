import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        moveAnimal(new Human());



    }
    public static void moveAnimal(Animal animal){
        animal.move();
    }

}

class Animal{
    public Animal() {
    }

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    public Human() {
    }
    public void move(){
        System.out.println("두 발로 걷습니다.");
    }
}