public class Cat extends Animal implements Info{
    public String catsName;
    public Cat(String catsName){
        this.catsName = catsName;
    }
    @Override
    public void showName() {
        System.out.println("The cat's name is "+this.catsName);
    }
}
