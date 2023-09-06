import java.util.*;
public class grade {
    public static void main (String args[]) {
        int sub_marks,total_marks;   
        float per;                                          // grade students
        Scanner obj = new Scanner(System.in);     
        System.out.println("enter the student marks "); 
        sub_marks=obj.nextInt();
        System.out.println("enter the total subject of marks "); 
        total_marks=obj.nextInt();
        per=(sub_marks*100)/total_marks;
        if(per>80 && per<=90)
        {
            System.out.println("grade A");
        }
        else if(per>70 && per<=80)
        {
            System.out.println("grade B");
        }
        else if(per>60 && per<=70)
        {
            System.out.println("grade C");
        }
        else if(per>50 && per<=60)
        {
            System.out.println("grade D");
        }
        else if(per>0 && per<=50)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Invalid Choice");
        }
    obj.close();
}
}

