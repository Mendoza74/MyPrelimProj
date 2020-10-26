
/**
 *
 * coded by: Mendoza Joel James BSIT - 2101
 */
package PrelimProject;

import java.util.Scanner;

public class PrelimProj {
    
    static int choose;
    static char yn;
    static void Menu(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("***************  Program Activities Week 1-5 ****************\n");
        System.out.println("*    Type (1) > Activity 1                                 *");
        System.out.println("*    Type (2) > Activity 2                                 *");
        System.out.println("*    Type (3) > Activity 3                                 *");
        System.out.println("*    Type (4) > Activity 4                                 *");
        System.out.println("*    Type (5) > Activity 5                                 *");
        System.out.println("*    Type (6) > Activity 6                                 *");
        System.out.println("*    Type (7) > Activity 7                                 *");
        System.out.println("*    Type (8) > Exit                                       *\n*");
        System.out.print("*    Choose: ");
        choose = s.nextInt();
        
        switch(choose){
            
            case 1:  Activity1();  break;
            
                
            case 2:  Activity2();  break;
                
                
            case 3:  Activity3();  break;
                
               
            case 4:  Activity4();  break;
                
                
            case 5:  Activity5();  break;
                
                
            case 6:  Activity6();  break;
                
                
            case 7:  Activity7();  break;
                
                
            case 8:  System.exit(0); break;
                
                
            default:  System.out.println("Invalid Input");
            
        }
    
    }
    
    static void Activity1(){
        
        Scanner s = new Scanner(System.in);
        String name, age, school, year, course, section;
        System.out.println("*****************  Activity 1 *****************\n");
        System.out.println("******************  Student  ******************\n");
        
        System.out.print("*   Enter Name: ");
        name = s.nextLine();

        System.out.print("*   Enter Age: ");
        age = s.nextLine();

        System.out.print("*   Enter School:");
        school = s.nextLine();

        System.out.print("*   Enter Year: ");
        year = s.nextLine();

        System.out.print("*   Enter Course: ");
        course = s.nextLine();

        System.out.print("*   Enter Section: ");
        section = s.nextLine();

        System.out.println("\n*****************  Student Info  *****************\n*");
        System.out.println("*  Name         :   "+name);
        System.out.println("*  Age          :   "+age);
        System.out.println("*  School       :   "+school);
        System.out.println("*  Year         :   "+year);
        System.out.println("*  Course       :   "+course);
        System.out.println("*  Section      :   "+section);
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to continue? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Menu();
        }
        else if(yn=='n' || yn=='N'){
            System.exit(0);
        }
        else{ System.out.println("Invalid Input ka po Sir please try again po Sir");}
        }while(yn!= 'y' || yn!='Y' || yn!='n' || yn!='N');
    }
    
    static void Activity2(){
        Scanner s = new Scanner(System.in);
        System.out.println("******************  Activity 2  *******************");
        System.out.println("******************  Data Types  *******************");
        System.out.println("*  Type [1] > One                                 *");
        System.out.println("*  Type [2] > Two                                 *");
        System.out.println("*  Type [3] > Three                               *");
        System.out.println("*  Type [4] > Back                                *\n*");
        System.out.print("*  Choose: ");
        choose = s.nextInt();
        
        switch(choose){
            
            case 1: ZeroOne(); break;
        
            
            case 2: ZeroTwo(); break;
        
            
            case 3: ZeroThree(); break;
       
            
            case 4: Menu(); break;
       
            
            default: System.out.println("Invalid Input ka po Sir"); Activity2(); break;
            
        }
        
    }
    static void ZeroOne(){
        Scanner s = new Scanner(System.in);
        System.out.println("****************************************************");
        Square();
        int radius = 5;
        Circle(radius);
        int n = 15;
        Arrow(n);
        int d = 6;
        Diamond(d);
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn =='Y'){
            Activity2();
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!= 'y' || yn!='Y' || yn!='n' || yn!='N');
        }
    static void Square()
   {
     int h=10, w=20, i, j;
     for(i=1; i<=h; i++)
     {
       for(j=1; j<=w; j++)
       {
         if(i==1 || i==h || j==1 || j==w)
         {
           System.out.print("*");
         }
         else
         {
           System.out.print(" ");
         }
       }
       System.out.print("\n");
     }
   }
   static void Circle(int radius)
   {
     double dist;
     
     for(int i = 0; i<=2 * radius; i++)
     {
       for(int j=0; j<=2*radius; j++)
       {
         dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
         if(dist > radius - 0.3 && dist < radius + 0.3)
         System.out.print("*");
         else
         System.out.print("  ");
       }
       System.out.print("\n");
     }
   }
   static void Arrow(int n) 
{ 
    int c1 = (n - 1) / 2; 
  
    int c2 = 3 * n / 2 - 1; 
  
    for (int i = 0; i < n; i++)  
    { 
        for (int j = 0; j < n; j++)  
        { 
            if (j - i == c1 ||  
                i + j == c2 || i == c1)  
            { 
                System.out.print("*"); 
            } 
            else 
            { 
                System.out.print(" "); 
            } 
        }
        System.out.print("\n"); 
    } 
} 
  
    static void string(int n)  
    { 
    for (int i = n; i > 0; i--)  
    { 
        System.out.print(" "); 
    } 
    }
    
    static void Diamond(int d) 
    { 
        int i, j, space, k = 0; 
     
        for (i = 1; i <= d; i++) { 
     
            for (j = 1; j <= d - i; j++) { 
                System.out.print(" "); 
            } 
            while (k != (2 * i - 1)) { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
                k++; 
            } 
            k = 0; 
            System.out.println(); 
        } 
        d--; 
        
        for (i = d; i >= 1; i--) { 
      
            for (j = 0; j <= d - i; j++) { 
                System.out.print(" "); 
            } 
     
            k = 0; 
            while (k != (2 * i - 1)) { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                else
                    System.out.print(" "); 
                k++; 
            } 
            System.out.println(); 
        } 
    } 
    
    static void ZeroTwo(){
        Scanner s = new Scanner(System.in);
        // variables
    int shirtID = 0;
    String description = "-description required-";
    char colorCode = 'U';
    double price = 0.0;
    int quantityInStock = 0;
     
     // Output
    System.out.println("****************************************************");
    System.out.println("Shirt ID: "+ description);
    System.out.println("Shirt description: "+ description);
    System.out.println("Color Code: "+ colorCode);
    System.out.println("Shirt price: "+ price);
    System.out.println("Quantity in Stock: "+ quantityInStock);
    System.out.println("****************************************************");
    do{
    System.out.print("Do you want to Choose again? [y/n]: ");
    yn = s.next().charAt(0);
    if(yn=='y' || yn =='Y'){
            Activity2();
    }
    else if(yn=='n' || yn=='N'){
            Menu();
    }
    else{ System.out.println("Invalid Input ka po Sir Please try again lang po.");}
    }while(yn!= 'y' || yn!='Y' || yn!='n' || yn!='N');
    }
    
    static void ZeroThree(){
        Scanner s = new Scanner(System.in);
        int StyleNo = 037;
        String Brand = "Lacoste";
        char colorCode = 'W';
        int shoeSize = 37;
        double shoePrice = 5999.00;
        System.out.println("****************************************************");
        System.out.println("*   Style No  : "+StyleNo);
        System.out.println("*   Brand     : "+Brand);
        System.out.println("*   Color Code: "+colorCode);
        System.out.println("*   Shoe Size : "+shoeSize);
        System.out.println("*   shoePrice : "+shoePrice);
        System.out.println("****************************************************");
        do{
        System.out.println("Do you want to Choose again? [y/n]:");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity2();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');
    }
    
    static void Activity3(){
        Scanner s = new Scanner(System.in);
        System.out.println("*******************  Activity 3  *******************");
        System.out.println("*******************  Variables  ********************");
        System.out.println("*   Type [1] > _One                                *");
        System.out.println("*   Type [2] > _Two                                *");
        System.out.println("*   Type [3] > _Three                              *");
        System.out.println("*   Type [4] > back                                *\n*");
        System.out.print("*   choose: ");
        choose = s.nextInt();
        switch(choose){
            
            case 1: _One(); break;
            
       
            case 2: _Two(); break;
        
            
            case 3: _Three(); break;
        
            
            case 4: Menu(); break;
            
       
            default: System.out.println("Invalid Input ka po Sir"); Activity3();
        }
    }
    static void _One(){
        Scanner s = new Scanner(System.in);
        final char UP = 'U';
        byte initialLevel = 12;
        short location = 13250;
        int score = 3500100;
        boolean newGame = true;
        System.out.println("****************************************************");
        System.out.println("Level   : "+initialLevel);
        System.out.println("UP      : "+UP);
        System.out.println("Score   : "+score);
        System.out.println("Location: "+location);
        System.out.println("New game: "+newGame);
        System.out.println("****************************************************");
        do{
        System.out.println("Do you want to Choose again? [y/n]:");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity3();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again lang po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    static void _Two(){
        Scanner s = new Scanner(System.in);
        int length = 11;
        int width = 15;
        int area = length * width;
        System.out.println("****************************************************");
        System.out.println("Floor space of the room in square feet: "+area);
        System.out.println("****************************************************");
        do{
        System.out.println("Do you want to Choose again? [y/n]:");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity3();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again lang po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    static void _Three(){
        Scanner s = new Scanner(System.in);
        int km;
        double miles;
        System.out.println("****************************************************");
        System.out.print("Enter the distance in km:");
        km = s.nextInt();

        miles = 0.62137 * km;
        System.out.println(km+" km is equivalent to: "+miles+" miles");
        System.out.println("****************************************************");
        do{
        System.out.println("Do you want to Choose again? [y/n]:");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity3();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    
    static void Activity4(){
        Scanner s = new Scanner(System.in);
        System.out.println("*******************  Activity 4  *******************");
        System.out.println("************* Expression and Operators *************");
        System.out.println("*   Type [1] > 00_One                              *");
        System.out.println("*   Type [2] > 00_Two                              *");
        System.out.println("*   Type [3] > 00_Thre                             *");
        System.out.println("*   Type [4] > back                                *\n*");
        System.out.print("*   choose:");
        choose = s.nextInt();
        
        switch(choose){
            
            case 1: OZeroOne(); break;
       
            
            case 2: OZeroTwo(); break;
       
            
            case 3: OZeroThree(); break;
        
            
            case 4: Menu(); break;
            
            
            default: System.out.println("Invalid Input ka po Sir"); Activity4(); break;
        }
    }

    static void OZeroOne(){
        Scanner s = new Scanner(System.in);
        String name1;
        String name2;
        System.out.println("****************************************************");
        System.out.print("Please enter your name: ");
        name1 = s.nextLine();
        System.out.print("Please enter your friends name:");
        name2 = s.nextLine();

        System.out.print("" +name1+ " and " +name2+ " are friends\n");
        System.out.println("****************************************************");
        
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity4();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    static void OZeroTwo(){
        Scanner s = new Scanner(System.in);
        int fNumber, sNumber;
        int sum;
        int diff;
        int prdct;
        int quot;
        System.out.println("****************************************************");
        System.out.print("* Enter first number: ");
        fNumber = s.nextInt();

        System.out.print("* Enter second number: ");
        sNumber = s.nextInt();

        sum = fNumber + sNumber;
        diff = fNumber - sNumber;
        prdct = fNumber * sNumber;
        quot = fNumber / sNumber;
        System.out.println("****************************************************");
        System.out.println("*   Sum          : "+ sum);
        System.out.println("*   Difference   : "+ diff);
        System.out.println("*   Product      : "+ prdct);
        System.out.println("*   Quotient     : "+ quot);
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity4();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    static void OZeroThree(){
        Scanner s = new Scanner(System.in);
        int fnum, snum;
        int quot;
        int remdr;
        System.out.println("****************************************************");
        System.out.print("*   Enter first number: ");
        fnum = s.nextInt();

        System.out.print("*   Enter second number: ");
        snum = s.nextInt();

        quot = fnum / snum;
        remdr = fnum % snum;
        System.out.println("****************************************************");
        System.out.println("*   The quotient is  : "+ quot);
        System.out.println("*   The remainder is : "+ remdr);
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity4();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    
    static void Activity5(){
        Scanner s = new Scanner(System.in);
        System.out.println("******************  Activity 5  ********************");
        System.out.println("*********** Control Structures Part 1 **************");
        System.out.println("*   Type [1] > If Structure                        *");
        System.out.println("*   Type [2] > If Else Structure                   *");
        System.out.println("*   Type [3] > Switch Structure                    *");
        System.out.println("*   Type [4] > back                                *");
        System.out.print("*   choose: ");
        choose = s.nextInt();
        switch(choose){
            
            case 1: If_Structure(); break;
        
            
            case 2: IfElse_Structure(); break;
      
            
            case 3: Switch_Structure(); break;
       
            
            case 4: Menu(); break;
            
            
            default: System.out.println("Invalid Input"); break;
        }
    }
    static void If_Structure(){
        Scanner s = new Scanner(System.in);
        System.out.println("****************************************************");
        for ( int number = 1; number <= 50; number++ ){
        System.out.print(number);
        if ( (number % 3) == 0 ) 
        {
            System.out.print(" foo");
        }
        if ( (number % 5) == 0 ) 
        {
            System.out.print(" biz");
        }
        if ( (number % 7) == 0 ) 
        {
            System.out.print(" baz");
        }
        System.out.println();
        }
        System.out.println("\n****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity5();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');
    }
    static void IfElse_Structure(){
        Scanner s = new Scanner(System.in);
        double rph = 35;
        double hours = 40;
        double mltp = 1.5;
        double Ex_hours = 27;
        double totalpay = 0.0;
        
        if(hours <= Ex_hours)
        {
            totalpay = hours + rph / mltp;
        }
        else
        {
            totalpay = Ex_hours + rph / mltp;
        }
        System.out.println("****************************************************");
        System.out.println("Rate per hour: "+ rph);
        System.out.println("Extra hours worked: "+ hours);
        System.out.println("Total pay: "+ totalpay);
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity5();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again lang po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    static void Switch_Structure(){
        Scanner s = new Scanner(System.in);
        int rph = 35;
        int hours = 40;
        int mltp = 1;
        int Ex_hours = 15;
        int totalpay = 0;
        
        switch(hours)
        {
            case 1:
                totalpay = hours + rph / mltp;
                break;
            default:
                totalpay = Ex_hours + rph / mltp;
                break;
        }
        System.out.println("****************************************************");
        System.out.println("Rate per hour: "+ rph);
        System.out.println("Extra hours worked: "+ hours);
        System.out.println("Total pay: "+ totalpay);
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity5();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');
    }
    
    static void Activity6(){
        Scanner s = new Scanner(System.in);
        System.out.println("******************  Activity 6  ********************");
        System.out.println("*********** Control Structures Part 2 **************");
        System.out.println("*   Type [1] > For Loop                            *");
        System.out.println("*   Type [2] > While Loop                          *");
        System.out.println("*   Type [3] > Do While Loop                       *");
        System.out.println("*   Type [4] > Branching Statements                *");
        System.out.println("*   Type [5] > back                                *\n*");
        System.out.print("*   choose: ");
        choose = s.nextInt();
        switch(choose){
            
            case 1: ForLoop(); break;
       
            
            case 2: WhileLoop(); break;
        
            
            case 3: DoWhileLoop(); break;
        
            
            case 4: BranchingStatements(); break;
        
            
            case 5: Menu(); break;
            
            
            default: System.out.println("Invalid Input"); Activity6();
        }
        
    }
    static void ForLoop(){
        Scanner s = new Scanner(System.in);
        int year = 2100;
        System.out.println("****************************************************");
        for(int i = 1900; i <= year; i++)
        {
          if((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)))
          {
            System.out.println("Year "+i+" is a leap year");
          }
          else
          {
            System.out.println("Year "+i+" is not a leap year");
          }
        }
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]:");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity6();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    static void WhileLoop(){
        Scanner s = new Scanner(System.in);
        int year = 2100;
        int i = 1900;
        System.out.println("****************************************************");
        while(i < year){
        i++;
          if((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))){
            System.out.println("Year "+i+" is a leap year");
          }
          else{
            System.out.println("Year "+i+" is not a leap year");
          }
          
        }
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]:");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity6();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again lang po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    static void DoWhileLoop(){
        Scanner s = new Scanner(System.in);
        int year = 2101;
        int i = 1900;
          System.out.println("****************************************************");
          do{
            if((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))){
              System.out.println("Year "+i+" is a leap year");
            }
            else{
              System.out.println("Year "+i+" is not a leap year");
            }
            i++;
          }while(i < year);
          System.out.println("****************************************************");
            do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity6();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    static void BranchingStatements(){
        Scanner s = new Scanner(System.in);
         int limit = 50;
        System.out.println("****************************************************");
        for(int i = 1; i <= limit; i++)
        {
          if(i % 2 == 0)
          {
            System.out.println(i+" is even number");
          }
          else
          {
            System.out.println(i+" is odd number");
          }
          
        }
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity6();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');
    }
    static void Activity7(){
        Scanner s = new Scanner(System.in);
        System.out.println("*******************  Activity 7 ********************");
        System.out.println("******************** Java[Lab8] ********************");
        System.out.println("*   Type [1] > Array                               *");
        System.out.println("*   Type [2] > Demo Array                          *");
        System.out.println("*   Type [3] > back                                *\n*");
        System.out.print("*   Choose: ");
        choose =s.nextInt();
        
        switch(choose){
            
            case 1: Array(); break;
       
   
            case 2: DemoArray(); break;
        
            
            case 3: Menu(); break;
            
            
            default: System.out.println("Invalid Input ka po Sir"); break;
            
                    
        }
    }
    static void Array(){
        Scanner s = new Scanner(System.in);
        double empBasicPay[] = {4000, 5000, 12000, 6000,7500};
        double empHousingAllow[] = new double[5];
        int i;
        for(i=0; i<5; i++)
        {
            empHousingAllow[i] = 0.2 * empBasicPay[i];
        }
        System.out.println("****************************************************");
        System.out.println("Employee Basic and House Rental Allowance");
        for(i=0; i<5; i++) {
            System.out.println(empBasicPay[i] + " " +empHousingAllow[i]);
        }
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity7();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    static void DemoArray(){
        Scanner s = new Scanner(System.in);
        
        int matrix[][] = {{0,1,1,0},
                         {0,1,1,1}}; 
        int matrix2[][] ={{1,0,1,0},
                         {1,0,0,1}};
        int matrix3[][] ={{0,0,1,0},
                         {0,0,1,1}};
        int matrix4[][] ={{0,1,1,0},
                         {1,1,0,0}};
        int matrix5[][] ={{1,1,1,0},
                         {0,1,0,1}};
        int[][] array1 = new int[2][2];
                array1[0][0]=2; array1[0][1]=4; array1[1][0]=6; array1[1][1]=8;
        int[][] array2 = new int[2][2];
                array2[0][0]=1;
                array2[0][1]=3;
                array2[1][0]=5;
                array2[1][1]=7;
        int i,j;
        System.out.println("****************************************************");
        System.out.println("Two Dimensional Array");
        for(i=0; i < array1.length; i++){
            for(j=0; j < array1.length; j++){
                for(i=0; i < array2.length; i++){
                    for(j=0; j < array2.length; j++){
                        System.out.println(array1[i][j]+" "+array2[i][j]);
                    }
                }
            }
        }
        System.out.println("****************************************************");
        System.out.println("\nMultidimensional Array Matrix");
        for(i=0; i < matrix.length; i++){
            for(j=0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        for(i=0; i < matrix2.length; i++){
            for(j=0; j < matrix2[i].length; j++){
                System.out.print(matrix2[i][j]+"  ");
            }
            System.out.println();
        }
        for(i=0; i < matrix3.length; i++){
            for(j=0; j < matrix3[i].length; j++){
                System.out.print(matrix3[i][j]+"  ");
            }
            System.out.println();
        }
        for(i=0; i < matrix4.length; i++){
            for(j=0; j < matrix4[i].length; j++){
                System.out.print(matrix4[i][j]+"  ");
            }
            System.out.println();
        }
        for(i=0; i < matrix5.length; i++){
            for(j=0; j < matrix5[i].length; j++){
                System.out.print(matrix5[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("****************************************************");
        do{
        System.out.print("Do you want to Choose again? [y/n]: ");
        yn = s.next().charAt(0);
        if(yn=='y' || yn=='Y'){
            Activity7();          
        }
        else if(yn=='n' || yn=='N'){
            Menu();
        }
        else{ System.out.println("Invalid Input ka po Sir Please try again po.");}
        }while(yn!='y' || yn!='Y' || yn!='n' || yn!= 'N');

    }
    public static void main(String[] args){ 
        Menu();
    }    
    
 
}
