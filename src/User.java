public class User {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(20000.0);
        while(account.withDraw(6000.0))
          try {
            account.withDraw(2000.0);
        } catch (Exception e) {
          System.out.println("Вы сняли:" + account.withDraw(2000.0) + " сом");
        }try {
          account.withDraw(2000.0);
         }catch (Exception r){
            System.out.println(account.getAmount());
        }
          }
}


