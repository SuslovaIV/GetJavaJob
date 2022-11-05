public class Dog extends Animal implements Info,bark{
    public String dogsName;
    public Dog(String dogsName){
        this.dogsName = dogsName;
    }
    @Override
    public void eat(){
        System.out.println(this.dogsName+" is eating");
    }
    public void showName() {
        System.out.println("The dog's name is "+this.dogsName);
    }

    @Override
    public void barking() {
        System.out.println("gav-gav!");
    }
}
