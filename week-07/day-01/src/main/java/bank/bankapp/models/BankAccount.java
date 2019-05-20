package bank.bankapp.models;

public class BankAccount {
    private int id;
    private String name;
    private double balance;
    private String animalType;
    private boolean isKing = false;
    private String morality;


    public BankAccount(int id, String name, double balance, String animalType, String morality) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.morality = morality;
    }

    public BankAccount(int id, String name, double balance, String animalType, String morality, boolean isKing) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.morality = morality;
    }

    public BankAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public String getKing() {
        String str = "";

        if (isKing) {
            str = "king";
        }

        return str;
    }

    public String getMorality() {
        return morality;
    }

    public void setMorality(String morality) {
        this.morality = morality;
    }

    public void increment() {
        balance++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
