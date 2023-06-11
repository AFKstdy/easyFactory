public class ClientClass{
    public static void main(String[] args) {
        //Factory factory = new BFactory();
        Factory factory = new BFactory();
        Fruit fruit = factory.CreateFruit();
        fruit.eat();
    }
    public String factory(String fruitname){

        return null;
    }
}
