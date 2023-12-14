class BankAccount {
    private double amount; //Остаток на счете

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств на счете", amount);
        }
        amount =amount- sum;
    }
}