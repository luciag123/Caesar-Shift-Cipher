import java.util.*;
public class CaesarShift
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter ciphertext.");
      String ciphertext = in.next().trim().toUpperCase();
      System.out.println("Possible plaintexts:");
      for(int i = 65; i <= 90; i++)
         exclude(decrypt((char)(i), ciphertext));
   }
   public static String decrypt(char key, String ciphertext)
   {
      String plaintext = key + "- ";
      for(int i = 0; i < ciphertext.length(); i++)
      {
         int shift = (ciphertext.charAt(i)-(int)(key)) + 65;
         if(shift < 65)
            shift = 91 - (65 - shift);
         plaintext += (char)(shift);
      }
      return plaintext;
   }
   public static void exclude(String text)
   {
      boolean possible = false;
      if(isVowel(text.charAt(3)) || isVowel(text.charAt(4)))
         possible = true;
      else if(text.substring(3,5).equals("BL") || text.substring(3,5).equals("BR")
      || text.substring(3,5).equals("CH") || text.substring(3,5).equals("CL") || text.substring(3,5).equals("CR")
      || text.substring(3,5).equals("DR") || text.substring(3,5).equals("FL") || text.substring(3,5).equals("FR")
      || text.substring(3,5).equals("GH") || text.substring(3,5).equals("GL") || text.substring(3,5).equals("GR")
      || text.substring(3,5).equals("PH") || text.substring(3,5).equals("PL") || text.substring(3,5).equals("PR")
      || text.substring(3,5).equals("SC") || text.substring(3,5).equals("SH") || text.substring(3,5).equals("SK")
      || text.substring(3,5).equals("SL") || text.substring(3,5).equals("SM") || text.substring(3,5).equals("SN")
      || text.substring(3,5).equals("SP") || text.substring(3,5).equals("ST") || text.substring(3,5).equals("SW")
      || text.substring(3,5).equals("TH") || text.substring(3,5).equals("TR") || text.substring(3,5).equals("TW")
      || text.substring(3,5).equals("WH") || text.substring(3,5).equals("WR") || text.substring(3,5).equals("CZ"))
         possible = true;
      if(possible)
         System.out.println(text);
   }
   public static boolean isVowel(char c)
   {
      return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y');
   }
}