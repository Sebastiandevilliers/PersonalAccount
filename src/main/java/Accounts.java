import java.util.*;

    public class Accounts implements Transactions {

        private String accountName;
        private String transactionName;
        private Double amount;
        //private List ref = new ArrayList<>();

        public Accounts(String accountName, String transactionName, Double amount){
            this.accountName = accountName;
            this.transactionName = transactionName;
            this.amount = amount;
        }

//	public void setRef(String accountName, String transactionName, Double amount){
//		this.accountName = accountName;
//		this.transactionName = transactionName;
//		this.amount = amount;
//	}

//	public List getRef(){
//		return ref;
//	}

        public String getAccountName(){
            return accountName;
        }

        public String getTransactionName(){
            return transactionName;
        }

        public Double getAmount(){
            return amount;
        }

        public void setAccountName(String name){
            this.accountName = name;
        }

        public void setTransactionName(String name){
            this.transactionName = name;
        }

        public void setAmount(Double amount){
            this.amount = amount;
        }

        public void addAmount(Double amount, String name){
            amount = getAmount();
            name = getTransactionName();
            System.out.println(amount + " Added" + "Transaction Name: " + name );
        }
        public String toString(){
            return this.getAccountName() + " " +this.getTransactionName() + " " + this.getAmount();
        }




    }


