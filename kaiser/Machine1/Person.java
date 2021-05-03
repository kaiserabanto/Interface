package Machine1;

public class Person {
    private int coins;

    public Person(int coins){
        this.coins = coins;
    }

    public void insertCoins(Coinable coinable, int inserted_coins){
        if (coins >= inserted_coins){
            System.out.println(inserted_coins + " coins inserted");
            if (inserted_coins >= coinable.getCost()) {
                coins -= coinable.getCost();
                if(!coinable.insertCoin()){
                    coins += coinable.getCost();
                    System.out.println("Coin refunded");
                }
            }
        }
        System.out.println("Coin count: " + coins);
    }
}

