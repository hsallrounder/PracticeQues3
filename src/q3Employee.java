import java.util.Scanner;

public class q3Employee {
    int salary;
    int nohours;

    int getInfo(int salary,int nohours){
        this.salary = salary;
        this.nohours = nohours;
        return salary;
    }

    int AddSal(int salary){
        if(salary<500){
            salary += 10;
        }
        return salary;
    }
     int AddWork(int salary,int nohours){
        if(nohours>6){
            salary += 5;
        }
        return salary;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q3Employee info = new q3Employee();
        System.out.println(info.AddWork(info.AddSal(info.getInfo(sc.nextInt(),sc.nextInt())),info.nohours));
    }
}
