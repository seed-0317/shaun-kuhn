

public class Person {

    private int age;



    public Person(int initialAge) {

        this.age = initialAge;

        if (age < 0) {

            age = 0;

            System.out.println("Age is not valid, setting age to 0");

        }

    }

    public void amIOld(int age) {



        if (this.age < 14){

            System.out.println("You are young..");

        }

        else if (this.age > 12 && this.age < 19){

            System.out.println("You are a teenager..");

        }

        else System.out.println("You are old..");

    }

        ​

    public void yearPasses(int age) {

        this.age = age + 1;

    }


}

        
                {

