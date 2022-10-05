import java.util.*;
class Employ{
    String hasEmpName;
    int EmpId;
    Double MobileNo;
    String EmailId;
    String Address;
    int PostAt;
    Double basePay;
   
}
class Post extends Employ{
    Post(String hasEmpName,int EmpId,Double MobileNo,String EmailId,String Address,int PostAt){
        this.hasEmpName=hasEmpName;
        this.EmpId=EmpId;
        this.MobileNo=MobileNo;
        this.EmailId=EmailId;
        this.Address=Address;
        this.PostAt=PostAt;
        
    }
    void salaryCal(){
        Double DA,Pf,HRA;
        switch(PostAt){
            case 1:
               this.basePay=25000.0;
                
                DA=basePay*0.97;
                Pf=basePay*0.12;
                HRA=basePay*0.10;
                System.out.println("Employ Name : "+hasEmpName);
                System.out.println("Employ Id   : "+EmailId);
                System.out.println("Basic Pay   :Rs. "+basePay);
                System.out.println("DA          :Rs. "+DA);
                System.out.println("PF Deduction:Rs. "+Pf);
                System.out.println("HRA         :Rs. "+HRA);
                System.out.println("Gross Salary:Rs. "+(basePay+DA-Pf-HRA));
                break;
            case 2:
                this.basePay=30000.0;
                DA=basePay*0.97;
                Pf=basePay*0.12;
                HRA=basePay*0.10;
                System.out.println("Employ Name : "+hasEmpName);
                System.out.println("Employ Id   : "+EmailId);
                System.out.println("Basic Pay   :Rs. "+basePay);
                System.out.println("DA          :Rs. "+DA);
                System.out.println("PF Deduction:Rs. "+Pf);
                System.out.println("HRA         :Rs. "+HRA);
                System.out.println("Gross Salary:Rs. "+(basePay+DA-Pf-HRA));
                break;
            case 3:
                this.basePay=35000.0;
                DA=basePay*0.97;
                Pf=basePay*0.12;
                HRA=basePay*0.10;
                System.out.println("Employ Name : "+hasEmpName);
                System.out.println("Employ Id   : "+EmailId);
                System.out.println("Basic Pay   :Rs. "+basePay);
                System.out.println("DA          :Rs. "+DA);
                System.out.println("PF Deduction:Rs. "+Pf);
                System.out.println("HRA         :Rs. "+HRA);
                System.out.println("Gross Salary:Rs. "+(basePay+DA-Pf-HRA));
                break;
            default:
                System.out.println("Invalid Post");
        }
       
    }
}
class Main{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employ name: ");
        String name=sc.next();
        System.out.println("Enter Emplpoy Id: ");
        int EmpId=sc.nextInt();
        System.out.println("Enter Employ MobileNo: ");
        Double MobileNo=sc.nextDouble();
       // System.out.println("Enter basic Pay: ");
        //Double basePay=sc.nextDouble();
        System.out.println("Enter Employ EmailId: ");
        String EmailId=sc.nextLine();
        System.out.println("Enter Employ Address: ");
        String Address=sc.nextLine();
        System.out.println("Emter Post to Generate salary sleap:\n1.Programmer\n2.Devoloper\n3.Project Manger\n");
        int n=sc.nextInt();
        Post Pratik=new Post(name,EmpId,MobileNo,EmailId,Address,n);
        Pratik.salaryCal();
    }
}
