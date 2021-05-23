/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollproject;

import static java.lang.System.out;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class Payrollproject{
    
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
    for(int i=0;i<47;i++)
     {
         System.out.print("-");
     }  
    System.out.print("\n");
    System.out.println("\t\tPayroll System");
     for(int i=0;i<47;i++)
     {
         System.out.print("-");
     }  System.out.println("\n");
        System.out.println("\t Welcome to our Payroll System");
     System.out.print("\nEnter Employee ID       :");
        String id = s.nextLine();
       try 
        { 
            Integer.parseInt(id); 
        }  
        catch (NumberFormatException e)  
        { 
            System.out.println("Invalid Employee ID"); 
        } 
     System.out.print("Enter Employee Name     :");
     String n = s.nextLine();
     n=toUpperCase(n);
     System.out.print("Enter no of working days:");
    int wd =s.nextInt();
    System.out.print("No.of Over Time hours   :");
    int ott=s.nextInt();
        System.out.println("\n");
    System.out.println("Departments");
     System.out.println("1.Purchase\n2.Store\n3.Production\n4.Quality\n5.Packaging");
      System.out.println("\n");
     System.out.print("Choose Employee Department:");
     int d= s.nextInt();
     int base_amount;
     int ot ;
     int hra;  
     int netpay1=0,netpay2=0,netpay3=0,netpay4=0,netpay5=0;
     int grosspay1=0,grosspay2=0,grosspay3=0,grosspay4=0,grosspay5=0;
     int ESI1=0,ESI2=0,ESI3=0,ESI4=0,ESI5=0;
     int PF1=0,PF2=0,PF5=0,PF3=0,PF4=0;
     int hra1=0,hra2=0,hra5=0,hra3=0,hra4=0;
     int basic1=0,basic2=0,basic5=0,basic3=0,basic4=0;
     if(d==1){
          base_amount=550;
          ot=100;
          hra1=2000;
          basic1=base_amount*wd+ott*ot;
           netpay1 = basic1+hra1;
           PF1=(12*base_amount)/100;
           ESI1=(int) ((0.75*base_amount)/100);
           if(wd>31&&ott>5)
                grosspay1=0;
           else
           grosspay1 = (int) (netpay1-PF1-ESI1);
        }        
     if(d==2){
         base_amount=400;
         ot=100;
         hra2=2000;
         basic2=base_amount*wd+ott*ot;
         netpay2 = basic2+hra2;
          PF2=(12*base_amount)/100;
          ESI2=(int) ((0.75*base_amount)/100);
          if(wd>31&&ott>5)
              grosspay2=0;
          else
          grosspay2=(int) (netpay2-PF2-ESI2);
        }    
     if(d==3){
         base_amount=800;
         ot=150;
         hra3=5000;
         basic3=base_amount*wd+ott*ot;
         netpay3 = basic3+hra3;
          PF3=(12*base_amount)/100;
          ESI3=(int) ((0.75*base_amount)/100);
          if(wd>31&&ott>5)
          grosspay3=0;
          else
          grosspay3=(int) (netpay3-PF3-ESI3);
        }   
     if(d==4){
         base_amount=600;
         ot=100;
         hra4=3000;
         basic4=base_amount*wd+ott*ot;
         netpay4 = basic4+hra4;
         PF4=(12*base_amount)/100;
          ESI4=(int) ((0.75*base_amount)/100);
         if(wd>31&&ott>5)
         grosspay4=0;
         else
          grosspay4=(int) (netpay4-PF4-ESI4);
        }   
     if(d==5){
         base_amount=550;
         ot=100;
         hra5=2000;
         basic5=base_amount*wd+ott*ot;
         netpay5 = basic5+hra5;
          PF5=(12*base_amount)/100;
          ESI5=(int) ((0.75*base_amount)/100);
         if(wd>31&&ott>5)
             grosspay5=0;
          else
          grosspay5=(int) (netpay5-PF5-ESI5);
        }   
        System.out.println("\n");
    for(int i=0;i<47;i++)
     {
         System.out.print("-");
     }  
    System.out.print("\n");
    System.out.println("\t\tPAYROLL SUMMARY");
     for(int i=0;i<47;i++)
     {
         System.out.print("-");
     }  
        System.out.println("\n");
        System.out.println("\t\tEmployeeID  :"+id);
        System.out.println("\t\tEmployeeName:"+n);
        System.out.println("\t\tWorkingDays :"+wd);
        System.out.println("\t\tOvertime    :"+ott);
        for(int i=0;i<47;i++)
     {
         System.out.print("-");
     }  System.out.print("\n"); 
    
    for(int i=0;i<47;i++)
     {
         System.out.print("-");
     } System.out.print("\n"); 
    if(d==1){
          System.out.println("\t\tNetpay   :"+netpay1);
          System.out.println("\t\tBasicpay :"+basic1);
          System.out.println("\t\tHRA      :"+hra1);
          for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     } System.out.print("\n"); 
          System.out.println("Deductions");
           for(int i=0;i<47;i++)
     {
         System.out.print("-");   
     }  
        System.out.print("\n");   
          System.out.println("\t\tESI      :"+ESI1);
          System.out.println("\t\tPF       :"+PF1);
           for(int i=0;i<47;i++)
     {
         System.out.print("-");
     }  
           System.out.print("\n");
           System.out.println("\t\tGrossPay :"+grosspay1);
         for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     } 
         System.out.print("\n");
        }        
     if(d==2){
        System.out.println("\t\tNetpay   :"+netpay2);
        System.out.println("\t\tBasicpay :"+basic2);
        System.out.println("\t\tHRA      :"+hra2);
          for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }  
          System.out.print("\n");
          System.out.println("Deductions");
           for(int i=0;i<47;i++)
     {
         System.out.print("-");
        
     }  
            System.out.print("\n");
          System.out.println("\t\tESI      :"+ESI2);
          System.out.println("\t\tPF       :"+PF2);
           for(int i=0;i<47;i++)
     {
         System.out.print("-");
        
     }   System.out.print("\n");
          System.out.println("\t\tGrossPay :"+grosspay2);
         for(int i=0;i<47;i++)
     {
         System.out.print("-");
        } System.out.println("\n");
         
        }    
     if(d==3){
         System.out.println("\t\tNetpay   :"+netpay3);
         System.out.println("\t\tBasicpay :"+basic3);
         System.out.println("\t\tHRA      :"+hra3);
         for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }  System.out.print("\n");
          System.out.println("Deductions");
           for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }  System.out.print("\n");
          System.out.println("\t\tESI      :"+ESI3);
          System.out.println("\t\tPF       :"+PF3);
           for(int i=0;i<47;i++)
     {
         System.out.print("-");
        
     }   System.out.print("\n");
          System.out.println("\t\tGrossPay :"+grosspay3);
         for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }    System.out.print("\n");
        }   
     if(d==4){
         System.out.println("\t\tNetpay   :"+netpay4);
         System.out.println("\t\tBasicpay :"+basic4);
         System.out.println("\t\tHRA      :"+hra4);
          for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }  System.out.print("\n");
          System.out.println("Deductions");
           for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }  System.out.print("\n");
          System.out.println("\t\tESI      :"+ESI4);
          System.out.println("\t\tPF       :"+PF4);
           for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }  System.out.print("\n");
          System.out.println("\t\tGrossPay :"+grosspay4);
         for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }    System.out.print("\n");
        }   
     if(d==5){
        System.out.println("\t\tNetpay   :"+netpay5);
        System.out.println("\t\tBasicpay :"+basic5);
        System.out.println("\t\tHRA      :"+hra5);
          for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }  System.out.print("\n");
          System.out.println("Deductions");
           for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }  System.out.print("\n");
          System.out.println("\t\tESI      :"+ESI5);
          System.out.println("\t\tPF       :"+PF5);
           for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }  System.out.print("\n");
          System.out.println("\t\tGrossPay :"+grosspay5);
         for(int i=0;i<47;i++)
     {
         System.out.print("-");
         
     }    System.out.print("\n");
        }   
        System.out.println("Note:If your Grosspay is zero,then\n\t1.Check your No.of working Days\n\t2.Check your Over time");
        System.out.println("\n");
        System.out.println("   Thanking for using our Payroll System");
    }
    }
           
            
            
            
    

