public class PersonTest {
    public static void main(String[] args) {
        Person myPerson = new Person("timothy");
        System.out.println(myPerson.getName());
        myPerson.setName("steve");
        System.out.println(myPerson.getName());
        myPerson.sayHello();



    }


}
