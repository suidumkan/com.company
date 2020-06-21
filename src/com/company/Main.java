package com.company;

public class Main {

    public static void main(String[] args) {
	limit(18, 27);
	limit(25, 19);
	limit(20, 21);
	limit(38, 26);
	limit(26, 18);
    }
    public static String limit(int age, int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            System.out.println("можно идти гулять");
        }else {
            return "нельзя гулять";
        }
        if (age < 20 && temp > 0 && temp < 28){
            System.out.println("можно идти гулять");
        }else {
            return "нельзя гулять";
        }
        if (age > 45 && temp > -10 && temp < 25){
            System.out.println("можно идти гулять");
        }else {
            return "нельзя гулять";
        }
        return "оставайтесь дома";
    }
}
