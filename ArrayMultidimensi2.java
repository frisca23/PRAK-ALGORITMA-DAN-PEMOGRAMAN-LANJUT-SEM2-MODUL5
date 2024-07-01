public class ArrayMultidimensi2
{
   public static void main( String []args)
     {
      String entry[][][] = {{{"vianslezer", "100411052", "Surabaya"}, {"Echa", "100411025", "Jakarta"}, {"Masayu", "100411024", "Malang"},
                             {"Bayu", "100411026", "Padang"}, {"Dhani", "100411027", "Riau"}, {"Ija", "100411028", "Bandung"},
                             {"Galang", "100411029", "Yogyakarta"}, {"Leri", "100411030", "Bojonegoro"}}};
       for (int i = 0; i < entry[0].length; i++) {
	       System.out.println("Nama   : " + entry[0][i][0]);
	       System.out.println("Nim    : " + entry[0][i][1]);
	       System.out.println("Alamat : " + entry[0][i][2]);
	       System.out.println("-------------------------");
	   }
     }
}