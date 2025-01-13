public class employee {
    public static void main(String[] args) {
        int Eid=1;
        String Ename="foo";
        String Eaddress="aaaaaaahahah";
        long Ephone=1234567890L;
        String EDateofBirth="13-02-2025";
        Double Esalary= 10000.00;
        Double EQSalary=Esalary*3;
        Double EHSalary=Esalary*6;


        System.out.println("---------Employee Detials---------");
        System.out.println("Eid: "+Eid);
        System.out.println("Ename: "+Ename);
        System.out.println("Eaddress: "+Eaddress);
        System.out.println("---------Employee salary---------");
        System.out.println("|  QSalary  |         QHsalary |");
        System.out.println("-------------------------------");
        System.out.println("|\t"+EQSalary+"|\t"+EHSalary+"|");


    }
}
