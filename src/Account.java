public class Account {
    private Double amount = 0.0;
    public Double getAmount() {
        return amount;
    }

    public void deposit(Double som) {
        if (amount > 0.0 | amount == 0.0) {
            System.out.println("�� ������� ���� ��: " + (amount + som) + " ���");
        }
    }
    boolean withDraw(Double som){
        if (getAmount() > som | getAmount() == som) {
            System.out.println("�� �����: " + som + " ��� " + "������� �� �����:" + (amount - som + " ���"));
        }if (amount>som){
            String AmountException = "�� ����� ����� �� ���������� �����!!!";
            System.out.println(AmountException + "��� ����: " + amount + "���");
        }return false;
    }
}


