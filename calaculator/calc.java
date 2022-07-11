import java.util.Scanner;// class to let user enter an input.
import java.io.IOException;// class to clear the screan.
public class calc
{ //this method is used to clear the screen 
 public static void clrscr()
    { try 
      { if (System.getProperty("os.name").contains("Windows"))
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
         else
      Runtime.getRuntime().exec("clear");
  } catch (IOException | InterruptedException ex) {} }
  
public static void main(String[] args)
    
{  
    boolean rety = true;//declear varible from boolean type
while(rety)//use while to make loop for calculater.
{Scanner in = new Scanner(System.in);// declear an object for scanner class.
System.out.println("        ********** Calculator  *********");//print calaulatuor menu.
System.out.println(" ");
System.out.println("Creat by :");
System.out.println("Waad Samkari");

System.out.println(" ");
 
System.out.println("                  *****  menu  *****     "); 
System.out.println(" ");
System.out.println("Choose an operation number to continue: "); 
System.out.println("  "); 
System.out.println("             *******    *******     *******  ");
System.out.println("             *  *  *    *  +  *     *  /  *  ");
System.out.println("             *  1  *    *  2  *     *  3  *  ");
System.out.println("             *******    *******     *******  ");
System.out.println(" ");
System.out.println("             *******    *******     *******  ");
System.out.println("             *  -  *    *  %  *     * pow *  ");
System.out.println("             *  4  *    *  5  *     *  6  *  ");
System.out.println("             *******    *******     *******  ");
System.out.println(" ");
System.out.println("                 ********    ********      ");
System.out.println("                 *  √  *     * Exit *      ");
System.out.println("                 *  7   *    *  8   *      ");
System.out.println("                 ********    ********      ");
System.out.println(" ");

int Chosen =in.nextInt();//declear varible accept value from user.
if (Chosen>0 && Chosen <=8)//range of if statment.(big condetion contain small if statments).
{
    if (Chosen==1)//first opreation

  { clrscr();//to clear screan and show the opration.
    System.out.println(" ");
    System.out.println("** Multiplication **");
    System.out.println(" ");
    System.out.println("Enter Operand 1:");
    double firstOperand =in.nextDouble();//methoud accept value from user 
    System.out.println("Enter Operand 2:");
    double secondOperand=in.nextDouble();
    System.out.print("THE RESULT =  ");
    System.out.println(firstOperand*secondOperand);}//to print the arthimatical opreation.
    else
    if (Chosen==2)//second opreation 
  { clrscr();
    System.out.println(" ");
    System.out.println("** Addition **");
    System.out.println(" ");
    System.out.println("Enter Operand 1:");
    double   firstOperand =in.nextDouble();
    System.out.println("Enter Operand 2:");
    double secondOperand=in.nextDouble();
    System.out.print("THE RESULT =  ");
    System.out.println(firstOperand+secondOperand);}
    else
    if (Chosen==3)//thired opration
  { clrscr();
    System.out.println(" ");  
    System.out.println("** Division **");
    System.out.println(" ");
    System.out.println("Enter Operand 1:");
    double  firstOperand =in.nextDouble();
    System.out.println("Enter Operand 2:");
    double secondOperand=in.nextDouble();
    System.out.print("THE RESULT =  ");
    System.out.println(firstOperand/secondOperand);}
    else
    if (Chosen==4)//fourth opration.
  { clrscr();
    System.out.println(" "); 
    System.out.println("** Subtraction **");
    System.out.println(" ");
    System.out.println("Enter Operand 1:");
    double  firstOperand =in.nextDouble();
    System.out.println("Enter Operand 2:");
    double secondOperand=in.nextDouble();
    System.out.print("THE RESULT =  ");
    System.out.println(firstOperand-secondOperand);}
    else
    if (Chosen==5)//fifth opration.
  { clrscr();
    System.out.println(" ");  
    System.out.println("** Modul **");
    System.out.println(" ");
    System.out.println("Enter Operand 1:");
    double  firstOperand =in.nextDouble();
    System.out.println("Enter Operand 2:");
    double secondOperand=in.nextDouble();
    System.out.print("THE RESULT =  ");
    System.out.println(firstOperand%secondOperand);}
    else
    if (Chosen==6)//sixth opration.
  { clrscr();
    System.out.println(" ");  
    System.out.println("** Power **");
    System.out.println(" ");
    System.out.println("Enter base number:");
    double  firstOperand =in.nextDouble();
    System.out.println("Enter power number:");
    double secondOperand=in.nextDouble();
    System.out.print("THE RESULT =  ");
    System.out.println(Math.pow(firstOperand,secondOperand)); }
    else
    if (Chosen==7)//seventh opration.
  { clrscr();
    System.out.println(" ");
    System.out.println("** Square Root **");
    System.out.println(" ");
    System.out.println("Enter Operand:");
    double  firstOperand =in.nextDouble();
    System.out.print("THE RESULT =  ");
    System.out.println(Math.sqrt(firstOperand)); }
    else     
    if (Chosen==8)//to exit programe.
{ System.out.println("*** GOOD BAY ***");
  rety=false;}//oppiset the varible to end the programe.
 
if (rety)// to enable user to clear screan and choose anouther opration.
{ System.out.println("Press any key to clear the screen!");
    {String key=in.next();
    clrscr();
    rety=true; } }
}

else //error massege to user if input is out of range 
{System.out.println("Invalid Option Chosen! press any key to continue and Try again with a value in range(1-8)");
int T=in.nextInt();
 clrscr();}
}
 }
}
 
 

 
