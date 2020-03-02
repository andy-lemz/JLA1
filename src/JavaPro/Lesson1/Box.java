package JavaPro.Lesson1;

public class Box <T extends Fruit> {
    int amount;
    T fruitType;

    public Box(T fruitType, int amount) {
        this.amount = amount;
        this.fruitType = fruitType;
    }

    public int getAmount() {
        return amount;
    }

    public T getFruitType() {
        return fruitType;
    }

    public double getWeight() {
        return amount * fruitType.getWeight();
    }

    private void setAmount(int amount) {
        this.amount = amount;
    }

    public void tryAdd(T fruit, int addAmount){
        if (this.fruitType.getClass() == fruit.getClass()) {
            this.amount += addAmount;
            System.out.println("В коробку с "+fruitType.getClass().getSimpleName()+" добавлено "+addAmount);
        } else {
            System.out.println("Здесь лежит "+fruitType.getClass().getSimpleName()+", не смешивайте!");
        }
    }

    public boolean compare(Box comparingBox){
        return Math.abs(this.getWeight() - comparingBox.getWeight()) <0.00001;
    }

    public void placeToAnotherBox(Box anotherBox){
        if (this.fruitType.getClass() == anotherBox.getFruitType().getClass()) {
            anotherBox.setAmount(anotherBox.getAmount()+this.amount);
            this.amount = 0;
        } else {
            System.out.println("Там лежит "+anotherBox.getFruitType().getClass().getSimpleName()+", не смешивайте!");
        }
    }
}
