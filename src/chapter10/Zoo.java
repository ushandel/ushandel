package chapter10;

public class Zoo {

    public static void main(String[] args){

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal shasa = new Dog();
        shasa.makeSound();
        shasa = new Cat();
        shasa.makeSound();
        ((Cat) shasa).scratch();
        //feed(rocky);

        //sasha.makeSound();
        //feed(sasha);

        //sasha = new Cat();
        //sasha.makeSound();
        //((Cat) sasha).scratch();
        //feed(sasha);
    }

  /*  public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("here's your dog food");
        }

        else if(animal instanceof Cat){
            System.out.println("here's your cat food");
        }
    }

   */
}