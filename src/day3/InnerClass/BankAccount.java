package day3.InnerClass;

public class BankAccount {
    private double saldo;

    public BankAccount(double saldo){
        this.saldo = saldo;
    }

    public class Transaction{
        private double total;

        public Transaction(double total){
            this.total = total;
        }

        public void hitungTotal(){
            saldo += total;
            System.out.println("Transaksi sukses, Saldo saat ini : " + saldo);
        }
    }

    public static void main(String[] args) {
        // Masukin saldo dengan nilai awal serebu
        BankAccount account = new BankAccount(1000);
        // Bikin objek transaksi dari innerClass dan lakukan transaksi gope
        BankAccount.Transaction transaction = account.new Transaction(500);
        // Panggil method
        transaction.hitungTotal();
    }
}

// public bisa diakses
// static dalemnya gabisa diubah
// class cuma bisa diakses dalam package itu