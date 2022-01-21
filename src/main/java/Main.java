import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static List<Accounts> ref = new ArrayList<>();

    public  static void Main(String[] args){

            Accounts one = new Accounts("Vitality", "none", 0.00);
            //	one.setRef();
            List<Accounts> refto = new ArrayList<>();



            //Switch Statement for the menu
            boolean flag = false;
            while(!flag){
                System.out.println(mainMenu());
                int selection = scanner.nextInt();


                switch(selection){
                    case 1:
                        AddAccount();
                        break;

                    case 2:
                        listAccount();
                        break;

                    case 3:

                        break;

                    case 4:
                        flag = true;
                        break;


                }
            }

        }


        //Methods

        public static String  mainMenu(){

            System.out.println("Welcome to the main meny");
            System.out.println("1.-- Add new Account");
            System.out.println("2.-- List Accounts ");
            System.out.println("3.-- Select Account");
            System.out.println("4.-- Exit");
            return " ";
        }

        public static String subMenu(){

            System.out.println("1.-- List Transcations");
            System.out.println("2.-- Add Amount ");
            System.out.println("3.-- Remove amount");
            System.out.println("4.-- Back");

            return " ";
        }
        public static void AddAccount(){
            System.out.println("Please enter Account Name");
            String name = scanner.next();
            System.out.println("Please enter Transaction ID");
            String id = scanner.next();
            System.out.println("Please initial amount");
            Double first = scanner.nextDouble();
            ref.add(new Accounts(name,id,first));
            System.out.println(name +" " + id + " "  +  first + " Added");
            System.out.println(" ");
        }

        public static void listAccount(){
            if(ref.isEmpty()){
                System.out.println("No Entries in list");
                System.out.println(" ");
            }else{
                List<Accounts>allList = ref.stream()
                        .collect(Collectors.toList());
                allList.forEach(accounts -> System.out.println(ref));
            }
        }





    }


