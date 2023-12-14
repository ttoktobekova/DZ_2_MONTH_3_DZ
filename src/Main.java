public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);


        while (true) {
            try {
                account.withDraw(6000);
                System.out.println("Снято 6000 сом. Остаток: " + account.getAmount() + " сом");
            } catch (LimitException el) {
                System.out.println("Исключение: " + el.getMessage() +
                        ". Снимаем доступную сумму: " + el.getRemainingAmount() + " сом");
                break;
            }

        }

    }
    
}




