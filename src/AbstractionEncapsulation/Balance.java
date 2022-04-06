package AbstractionEncapsulation;


    class BalanceAmount  {
        int balance;
        public void setBalance(int amount)  {
            balance=amount;
        }
        public void incrementBalance()  {
            balance+=10;
        }
        public int getCurrentBalance()  {
            return  balance;
        }
    }
    public class  Balance {
        public static void main(String[] args) {
            BalanceAmount obj= new BalanceAmount();
            obj.setBalance(20);
            obj.incrementBalance();
            System.out.println(obj.getCurrentBalance());
            obj.balance=1000;
            System.out.println(obj.getCurrentBalance());
        }
    }

