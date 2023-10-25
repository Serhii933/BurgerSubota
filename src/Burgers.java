public class Burgers {
    public static void main(String[] args){
        System.out.println("Перший бургер:");
        Burger normalBurger = new Burger("булочка", "м'ясо", "сир", "зелень", "майонез");
        System.out.println("Дієтичний бургер");
        Burger dietBurger = new Burger("звичайна булочка", "м'ясо", "сир", "зелень");
        System.out.println("Бургер з подвійною порцією м'яса:");
        Burger doubleMeatBurger = new Burger("булочка", "м'ясо", " сир", "зелень", true);

    }
}
