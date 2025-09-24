public class main{ 
    public static void main(String[] args) {
        cat myCat = new cat();
        myCat.makeSound();
        myCat.eat();
        myCat.sleep();
        myCat.hunt();
        myCat.flee();

        System.out.println("");
        coyote myCoyote = new coyote();
        myCoyote.makeSound();
        myCoyote.eat();
        myCoyote.sleep();
        myCoyote.hunt();

        System.out.println("");
        mouse myMouse = new mouse();
        myMouse.makeSound();
        myMouse.eat();
        myMouse.sleep();
        myMouse.flee();
    }
}