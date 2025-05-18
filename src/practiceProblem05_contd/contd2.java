package practiceProblem05_contd;

public class contd2 {

    static class Dog {
        private String name;
        private int age;
        private String breed;

        public Dog(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }


        public void bark() {
            System.out.println(name + " is barking ghew ghew");
        }


        public void spin() {
            System.out.println(name + " is spinning in a circle!");
        }


        public void run() {
            System.out.println(name + " is running fast");
        }


        public void displayInfo() {
            System.out.println("Dog's Name: " + name);
            System.out.println("Age: " + age + " years");
            System.out.println("Breed: " + breed);
        }
    }


    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        myDog.displayInfo();
        myDog.bark();
        myDog.spin();
        myDog.run();
    }
}

