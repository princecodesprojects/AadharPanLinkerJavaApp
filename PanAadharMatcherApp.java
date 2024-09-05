package project1;

import java.util.Scanner;

public class PanAadharMatcherApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AadharService adarService=new AadharService();
        PanService panService=new PanService();

        System.out.println("Enter the Aadhaar Number:");
        String aadhaarNumber=sc.nextLine();

        Aadhar aadhaar=adarService.getAadhaarByNumber(aadhaarNumber);
        Pan pan=panService.getPanByAadhaarNumber(aadhaarNumber);

        if(aadhaar!=null && pan!=null)
        {
            System.out.println("Aadhaar Details = "+aadhaar);
            System.out.println("Pan Details = "+pan);
        }
        else {
            System.out.println("No Match Found.....");
        }
    }
}
