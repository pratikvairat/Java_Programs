/********************************************************************************************
 Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way.
*******************************************************************************************/
import java.util.Scanner;
interface Vehicle
{
    void GearChange (int Gear);
    void SpeedUp (int Speed);
    void ApplyBreak ();
}
class Bike implements Vehicle{
    int currentGear=0;
    int currentSpeed=0;
    
    public void GearChange(int Gear){
        if(Gear>=7){
            System.out.println("Gear Out of Range");
        }else{
            currentGear=Gear;
            System.out.println("Gear succussfully chage to "+currentGear);
        }
    }
    public void SpeedUp(int Speed){
        if(Speed>=120){
            System.out.println("You are acrossing Speed limit");
        }else{
            currentSpeed=Speed;
            System.out.println("Now speed is "+currentSpeed);
        }
    }
    public void ApplyBreak(){
        if(currentSpeed!=0){
            currentSpeed=0;
            System.out.println("Breaks Applied");
        }
    }
}
class Bicycle implements Vehicle{
    int currentGear=0;
    int currentSpeed=0;
    
    public void GearChange(int Gear){
        if(Gear>=4){
            System.out.println("Gear Out of Range");
        }else{
            currentGear=Gear;
            System.out.println("Gear succussfully chage to "+currentGear);
        }
    }
    public void SpeedUp(int Speed){
        if(Speed>=60){
            System.out.println("You cannot pedal on this speed"+currentSpeed);
        }else{
            currentSpeed=Speed;
            System.out.println("Now speed is "+Speed);
        }
    }
    public void ApplyBreak(){
        if(currentSpeed!=0){
            currentSpeed=0;
            System.out.println("Breaks Applied");
        }
    }
}
class Car implements Vehicle{
    int currentGear=0;
    int currentSpeed=0;
    
    public void GearChange(int Gear){
        if(Gear>=10){
            System.out.println("Gear Out of Range");
        }else{
            currentGear=Gear;
            System.out.println("Gear succussfully chage to "+currentGear);
        }
    }
    public void SpeedUp(int Speed){
        if(Speed>=240){
            System.out.println("You are acrossing Speed limit");
        }else{
            currentSpeed=Speed;
            System.out.println("Now speed is "+currentSpeed);
        }
    }
    public void ApplyBreak(){
        if(currentSpeed!=0){
            currentSpeed=0;
            System.out.println("Breaks Applied");
        }
    }
}
public class Travel{
    public static void main(String []args){
        Scanner Sc=new Scanner(System.in);
        int Ch;
        String op;
        System.out.println("CHOOSE VEHICLE TO DRIVE TODAY\n1.Bike\n2.Bicycle\n3.Car\n");
        Ch=Sc.nextInt();
        do{ 
            switch(Ch){
            case 1:
                Bike Hero=new Bike();
                System.out.println("Choose action to perform \n1.Change Gear \n2.Speed Up \n3.Apply Break");
                int a=Sc.nextInt();
                if(a==1){
                    System.out.println("Enter Gear to change");
                    int Gear=Sc.nextInt();
                    Hero.GearChange(Gear);
                }else if(a==2){
                    System.out.println("Enter Speed to Change");
                    int Speed=Sc.nextInt();
                    Hero.SpeedUp(Speed);
                }else if(a==3){
                    Hero.ApplyBreak();
                }else{
                    System.out.println("Action Not Listed in above");
                }
                break;
            case 2:
                Bicycle Ranger=new Bicycle();
                System.out.println("Choose action to perform \n1.Change Gear \n2.Speed Up \n3.Apply Break");
                int b=Sc.nextInt();
                if(b==1){
                    System.out.println("Enter Gear to change");
                    int Gear=Sc.nextInt();
                    Ranger.GearChange(Gear);
                }else if(b==2){
                    System.out.println("Enter Speed to change");
                    int Speed=Sc.nextInt();
                    Ranger.SpeedUp(Speed);
                }else if(b==3){
                    Ranger.ApplyBreak();
                }else{
                    System.out.println("Action Not Listed in above");
                }
                break;
            case 3:
                Bike Maruti=new Bike();
                System.out.println("Choose action to perform \n1.Change Gear \n2.Speed Up \n3.Apply Break");
                int c=Sc.nextInt();
                if(c==1){
                    System.out.println("Enter Gear to change");
                    int Gear=Sc.nextInt();
                    Maruti.GearChange(Gear);
                }else if(c==2){
                    System.out.println("Enter Speed to change");
                    int Speed=Sc.nextInt();
                    Maruti.SpeedUp(Speed);
                }else if(c==3){
                    Maruti.ApplyBreak();
                }else{
                    System.out.println("Action Not Listed in above");
                }
                break;
            default :
                System.out.println("Invalid Vehicle choice");
            }
            System.out.println("Do You Want to Run vehicle?[y/n]");
            op=Sc.next();
        }while(op!="y");
    }
}

