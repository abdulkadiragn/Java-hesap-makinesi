package MO_Hesap_Makinesi;

import java.util.Scanner;

public class Main {
    public static int cikarma(int a,int b){
        return(a - b);
    }
    public static int cikarma(int a,int b,int c){
        return(a - b - c);
    }
    public static int toplama(int a,int b){
        return (a + b);
    }
    public static int toplama(int a,int b,int c){
        return (a + b + c);
    }
    public static double bolme(int a,int b){
        return ((double)a/b);
    }
    public static int carpma(int a, int b){
        return (a*b);
    }
    public static int carpma(int a, int b,int c){
        return (a*b*c);
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        while(true){
            System.out.println("İşlemi rakam olarak seçiniz :\n1-Toplama işlemi\n2-Çıkarma işlemi\n3-Çarpma işlemi\n4-Bölme işlemi\n5-Çıkış");
            String islem = a.nextLine();
            

            if(islem.equals("5")){
                System.out.println("Program sonlandırılıyor..");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Kaç deger toplamak istiyorsunuz ?");
                int sayi = a.nextInt();

                if(sayi == 2){
                   System.out.println("1.Sayı");
                   int sayi1 = a.nextInt();
                   System.out.println("2.Sayı");
                   int sayi2 = a.nextInt();
                   a.nextLine();

                   System.out.println("girdiginiz sayıların toplamları :"+toplama(sayi, sayi2));

                }
                else if(sayi == 3){
                    System.out.println("1.Sayı");
                   int sayi1 = a.nextInt();
                   System.out.println("2.Sayı");
                   int sayi2 = a.nextInt();
                   System.out.println("3.Sayı");
                   int sayi3 = a.nextInt();
                   a.nextLine();

                   System.out.println("girdiginiz sayıların toplamları :"+toplama(sayi, sayi2,sayi3));


                }
                else{
                    System.out.println("2 veya 3 seçeneğinden başka bir seçenek seçtiniz.Lütfen 2 veya 3 sayı toplayacağınızı belirtin");
                }

            }
            else if(islem.equals("2")){
                System.out.println("Kaç deger çıkarmak istiyorsunuz : ");
                int sayi = a.nextInt();

                if(sayi == 2){
                    System.out.println("1.sayı");
                    int sayi1 = a.nextInt();
                    System.out.println("2.sayı");
                    int sayi2 = a.nextInt();
                    a.nextLine();

                    System.out.println("Girdiginiz sayıların farkları : "+cikarma(sayi1, sayi2));

                }
               else if(sayi == 3){
                    System.out.println("1.sayı");
                    int sayi1 = a.nextInt();
                    System.out.println("2.sayı");
                    int sayi2 = a.nextInt();
                    System.out.println("3.sayı");
                    int sayi3 = a.nextInt();
                    a.nextLine();

                    System.out.println("Girdiginiz sayıların farkları : "+cikarma(sayi1, sayi2,sayi3));

                }
               
                else{
                    System.out.println("lütfen 2 veya 3 sayı dışında bir işlem seçmeyiniz.");
                }
                

            }
            else if(islem.equals("3")){
                System.out.println("Kaç değer çarpmak istiyorsunuz");
                int sayi = a.nextInt();

                if(sayi == 2){
                    System.out.println("1.sayı");
                    int sayi1 = a.nextInt();
                    System.out.println("2.sayı");
                    int sayi2 = a.nextInt();
                    a.nextLine();

                    System.out.println("Girdiginiz sayıların carpımları : "+carpma(sayi1, sayi2));
                }
                else if(sayi == 3){
                    System.out.println("1.sayı");
                    int sayi1 = a.nextInt();
                    System.out.println("2.sayı");
                    int sayi2 = a.nextInt();
                    System.out.println("3.sayı");
                    int sayi3 = a.nextInt();
                    a.nextLine();

                    System.out.println("Girdiginiz sayıların carpımları : "+carpma(sayi1, sayi2,sayi3));

                }
                else{
                    System.out.println("lütfen 2 veya 3 deger gireceginizi seçiniz");
                }
            }
            else if(islem.equals("4")){
                System.out.println("Bölünecek 1.sayı");
                int sayi1 = a.nextInt();
                System.out.println("Bölünecek 2.sayı");
                int sayi2 = a.nextInt();

                System.out.println("Girdiginiz sayıların farkları : "+cikarma(sayi1, sayi2));

            }
        else{
                System.out.println("1 ile 5 arasında rakam giriniz..");
            }
            
            }
            
        }

    }

