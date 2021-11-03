public class Person {

    private String fullName;
    private int age;

    public Person(){

    }

    public Person (String fullName, int age){

        this.fullName = fullName;
        this.age = age;
    }

    public void talk1(){
        System.out.println("Ничего!");
    }

    public void talk2(){

        System.out.println("Привет я " + fullName + " и мне " + age + " лет");
    }



    public static void main(String args[]){


        Person Ilya = new Person();
        Ilya.talk1();

        Person Ilya1 = new Person ("Илья", 28);
        Ilya1.talk2();


    }
};


















