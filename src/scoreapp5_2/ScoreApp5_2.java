/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreapp5_2;

import java.util.Scanner;

/**
 *
 * @author keepa
 */
public class ScoreApp5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LiveScoreBean source = new LiveScoreBean();
       Subscriber sub1 = new Subscriber();
       Subscriber sub2 = new Subscriber();
       source.addPropertyChangeListener(sub1);
       source.addPropertyChangeListener(sub2);
       Scanner sc = new Scanner(System.in);
       while(true){
       System.out.print("Enter Score  :");
       
       String Str = sc.nextLine();
       if(!Str.equals("")){source.setscoreline(Str);}
       else{break;}
    }
    
}
}
