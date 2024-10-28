// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class main {
   public main() {
   }

   public static void main(String[] var0) {
      new AVLTree();
      Scanner var2 = new Scanner(System.in);
      short var5 = 1;

      while(var5 != 1350) {
         System.out.println("1- inserir valor\n2- mostrar arvore\n5-sair\n");
         int var4 = var2.nextInt();
         switch (var4) {
            case 1:
               int var3 = var2.nextInt();
               System.out.println("ok" + var3);
               break;
            case 2:
               System.out.println("arvore");
               break;
            case 3:
            case 4:
            default:
               System.out.println("erro");
               break;
            case 5:
               var5 = 1350;
               var2.close();
         }
      }

   }
}
