// import static org.junit.jupiter.api.Assertions.assertEquals;232cgyhde

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  { //Nie rozumiem czemu nie  dziala
      Scanner scanner = new Scanner(System.in);
       System.out.print("PODAJ 5 Liczb:")
      int NajmniejszaLiczba = scanner.nextInt();
         for (int  i = 0; i < 5; i++) 
    {
    System.out.print("Podaj liczbę " + (i + 1) + ": ");
    int Liczba = scanner.nextInt();
      if (Liczba < NajmniejszaLiczba) 
      {   
              NajmniejszaLiczba= Liczba;
          }
      }
    System.out.println("najmniejsza liczba");
  }  
} 