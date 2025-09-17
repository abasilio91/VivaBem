package utils;

import java.util.Scanner;

public class Menus {
    public static Scanner sc = new Scanner(System.in);
    public static Integer menu_opcoes(String conteudo_menu){
        System.out.println(conteudo_menu);
        return sc.nextInt();
    }
}