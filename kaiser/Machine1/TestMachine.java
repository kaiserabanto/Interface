package Machine1;

public class TestMachine {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine();
        Person p = new Person(7);

        p.insertCoins(machine, 5);
        p.insertCoins(machine, 5);
        p.insertCoins(machine, 5);
        p.insertCoins(machine, 5);
    }
}