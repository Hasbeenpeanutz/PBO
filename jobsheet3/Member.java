public class Member {
    String id;
    String name;
    int borrowingLimit;
    int loanAmmount;

    public Member(String id, String name, int borrowingLimit) {
        this.id = id;
        this.name = name;
        this.borrowingLimit = borrowingLimit;
    }

    public String getName() {
        return this.name;
    }

    public int getLimitLoan() {
        return this.borrowingLimit;
    }

    public int getLoanAmount() {
        return this.loanAmmount;
    }

    public void borrow(int amount) {
        if (this.loanAmmount + amount > this.borrowingLimit) {
            System.out.println("Sorry, the loan amount exceeds the borrowing limit.");
        } else {
            this.loanAmmount += amount;
        }
    }

    public void installment(int amount) {
        int minimumInstallment = this.loanAmmount / 10;
        if (amount < minimumInstallment) {
            System.out.println("Sorry, the installment amount is less than the minimum installment.");
        } else {
            this.loanAmmount -= amount;
        }
    }

}
