 public class Person {
     // Private field to store the person's name
     private String name;

     // Constructor
        public Person(String name) {
            this.name = name;
        }

//     public Bicycle() {
//         this.color = "white";
//         bikesCreated++;
//     }
//     public Bicycle(int totalGears, int currentGear) {
//         this.totalGears = totalGears;
//         this.currentGear = currentGear;
//         bikesCreated++;
//     }

     // Getter method to retrieve the person's name
     public String getName() {
         return name;
     }

     // Setter method to change the person's name
     public void setName(String name) {
         this.name = name;
     }

     // Method to print a message to the console using the person's name
     public void sayHello() {
         System.out.println("Hello, my name is " + name + ".");
     }

 }




