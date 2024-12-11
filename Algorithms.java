import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        
        f = new File("words.txt");
        int twoletters = twoletters();
        int big = largestword();
        int tied = tied();
        int counter = palindrome();
        System.out.println(twoletters);
        System.out.println(big);
        System.out.println("amount of biggest words:" + tied);
        System.out.println(counter);
    }


public static int twoletters() throws FileNotFoundException{
    s = new Scanner(f);
    int twoletters = 0;
    while (s.hasNext()) {
        String car = s.nextLine();
        if (car.length()==2)
            twoletters++;
    }
    return twoletters;
}

public static int largestword() throws FileNotFoundException{
    s = new Scanner(f);
    int big = 0;
    while (s.hasNext()) {
        String car2 = s.nextLine();
        if(car2.length()>big) big = car2.length(); 
    }
    return big;
}

public static int tied() throws FileNotFoundException{
    s = new Scanner(f);
    int biggest = 0;
    while (s.hasNext()) {
        String car = s.nextLine();
        if (car.length()==14)
            biggest++;
        }
    return biggest;
}

public static int palindrome() throws FileNotFoundException{
   s = new Scanner(f);
   int Counter = 0;
   while (s.hasNext()) {
    String car = s.nextLine();
    String back = "";
    for(int x = car.length(); x>=1; x--)
    {
       back = back + car.substring(x-1, x);
    }
            
        if(car.equals(back)) 
        {
            Counter++;
        }
    }
    return Counter;



}
}
