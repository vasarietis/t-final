public class Expense {
    private int id; //id
    private String date; //datums
    private double amount; //summa
    private String description; //apraksts

    public Expense(String date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public String getDate() { return date; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
}
