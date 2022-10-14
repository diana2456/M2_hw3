public class Account {
    private Double amount = 0.0;
    public Double getAmount() {
        return amount;
    }

    public void deposit(Double som) {
        if (amount > 0.0 | amount == 0.0) {
            System.out.println("Вы полнили счет на: " + (amount + som) + " сом");
        }
    }
    boolean withDraw(Double som){
        if (getAmount() > som | getAmount() == som) {
            System.out.println("Вы сняли: " + som + " сом " + "Остаток на счету:" + (amount - som + " сом"));
        }if (amount>som){
            String AmountException = "На вашем счету не достаточно денег!!!";
            System.out.println(AmountException + "Ваш счет: " + amount + "сом");
        }return false;
    }
}


