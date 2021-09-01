import java.util.Scanner;
public class TugasArray2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Var
        byte DataHandphone;

        //Input User
        System.out.println("Isi data jumlah Handphone =");
        DataHandphone = input.nextByte();

        String[] Handphone = new String[DataHandphone];

        //Input Data
        for (int i = 0; i < Handphone.length; i++) {
            System.out.println("Data Handphone ke "+i+ ":");
            Handphone[i] = input.next();

        }
        //Print
        System.out.println("======HASIL DATA=======");
        for (int i = 0; i < Handphone.length; i++) {
            System.out.println("Handphone Ke "+i+":"+Handphone[i]);
        }
    }
}
