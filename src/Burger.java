public class Burger {
    String bread;
    String meat;
     String cheese;
     String greens;
     String mayonnaise;

    public Burger(String bread, String meat, String cheese, String greens, String mayonnaise) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        displayIngredients();
    }

    public Burger(String bread, String meat, String cheese, String greens) {
        this(bread, meat, cheese, greens, "без майонезу");
    }

    public Burger(String bread, String meat, String cheese, String greens, boolean doubleMeat) {
        this(bread, doubleMeat ? "подвійне м'ясо" : meat, cheese, greens, "з майонезом");
    }

    private void displayIngredients() {
        System.out.println("Склад бургера:");
        System.out.println("Булочка: " + bread);
        System.out.println("М'ясо: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Зелень: " + greens);
        System.out.println("Майонез: " + mayonnaise);
        System.out.println("------------");
    }
}
