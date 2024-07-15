public class Animal {
    public static void main(String[] args) {
        new Animal("lion",3);
    }
    public Animal(){
        System.out.println("Empty Constructor");
    }
    public Animal(String a){
        System.out.println("Constructor With String Parameter");
    }
    public Animal(String a,int b){
        System.out.println("Constructor With String and int Parameter");
    }

}




