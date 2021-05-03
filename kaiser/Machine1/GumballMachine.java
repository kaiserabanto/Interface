package Machine1;

public class GumballMachine implements Coinable, Dispensable{
    int gums = 0;
    int coins_per_gum = 3;

    public GumballMachine(){
        this.gums = 5;
    }

    @Override
    public int getCost() {
        return coins_per_gum;
    }

    @Override
    public boolean insertCoin() {
        if (this.gums > 0) {
            this.dispense();
            return true;
        }
        System.out.println("Return Coin");
        return false;
    }

    @Override
    public void dispense() {
        this.gums--;
        System.out.println("1 Gum dispensed.");
    }

    @Override
    public void reload(int count) {
        this.gums += count;
    }
}

