public class AmountException extends Exception {
    Double remainingAmout;

    public AmountException(String message, Double amount) {
        super(message);
        this.remainingAmout = amount;
    }

    public String amouns(Double remainingAmout){
        Account account = new Account();
        System.out.println("������� �� �����:" +  (account.getAmount() - remainingAmout));
        return "������� �� �����: " + (account.getAmount() - remainingAmout);
    }
    }

