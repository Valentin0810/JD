package lesson5;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
            String inputValue = scanner.nextLine();
            if(isPalindrome(inputValue)){
        System.out.println("Введенная строка - палиндром.");}
        else {System.out.println("Введенная строка - не палиндром.");}
    }

    public static boolean isPalindrome(String value) {
        value = value.replaceAll("\\W","");
        StringBuilder strBuilder = new StringBuilder(value);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();
        return value.equalsIgnoreCase(invertedText) ;
}}