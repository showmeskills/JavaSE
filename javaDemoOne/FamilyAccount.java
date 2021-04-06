class FamilyAccount {

    public static void main(String[] args) {
        // set up a switch;
        boolean isFlag = false;
        int balance = 10000;
        String details = "Received/Payment\tAccounts balance\tReceived/Payment balance\tInstruction\n";
        while (isFlag) {
            System.out.println("---------Family Account App------------\n");
            System.out.println("          1 Received/Payment Details");
            System.out.println("          2 Registered Received Income");
            System.out.println("          3 Registered Payment");
            System.out.println("          4 Exist\n");
            System.out.print("            Selected(1-4):");
            char selection = Utility.readMenuSelection();
            switch (selection) {
            case '1':
                System.out.println("---------当前收支明细记录------------\n");
                System.out.println(details);
                System.out.println("-----------------------------------\n");
                break;
            case '2':
                System.out.print("add receivable income:");
                int addMoney = Utility.readNumber();
                System.out.print("details of receivable income:");
                String addInfo = Utility.readString();
                // 处理balance
                balance += addMoney;
                // 处理details 变量
                details += ("Received/Payment\t" + balance + "\t\t" + addMoney + "\t\t" + addInfo + "\n");
                System.out.println("---------Completed-----------\n");
                break;
            case '3':
                System.out.print("Payable Amount:");
                int minusMoney = Utility.readNumber();
                System.out.print("Details of Payable Income:");
                String minusInfo = Utility.readString();
                // 处理balance
                if (balance >= minusMoney) {
                    balance -= minusMoney;
                    // 处理details 变量
                    details += ("Payment\t" + balance + "\t\t" + minusMoney + "\t\t" + minusInfo + "\n");
                } else {
                    System.out.println("Payment is exceed yourbalance");
                }
                System.out.println("---------Completed-----------\n");
                break;
            case '4':
                System.out.println("Confirm to exit (Y/N):");
                char isExit = Utility.readConfirmSelection();
                if (isExit == 'Y') {
                    isFlag = false;
                }
            }
        }
    }
}
