package d2.src;
import java.util.ArrayList;




public class BankAccount {
    
    public static void main(String[] args){
        private String accName;
            public String getAccName() {
            return accName;
        }

        private static String accNumber = "randnum1";


        private float accBal;
            public float getAccBal() {
            return this.accBal;
        }
            public void setAccBal(float newaccBal) {
            this.accBal = newaccBal;
        }
        

        private List<String> transactionList = new List<>();
        
        private boolean isClosed;

        private String dateOpen = "1 Jan 1900";

        
        private String dateClose;

            public void setdateClose(String dateClose) {
            if (isClosed = true) {
            dateClose = "Closed before today";
            }
            else {
                dateClose = "Not closed yet";
            }
        }

        

        public void deposit(float depositamount) {
            float newaccBal = newaccBal + depositamount;
            List transactionList.add("Deposit $" + depositamount + "at Exampledate, Exampletime");
        }

    
}
}
    



