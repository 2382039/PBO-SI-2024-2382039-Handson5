import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static String[] todos = new String[3];
    public static Scanner scanner = new Scanner(System.in);

    public static main(String [] args) {
        todos[0] = "Mewarnai";
        todos[1] = "Membaca";
        todos[2] = "Bersepeda";
        showTodoList();
    }

    public static void showTodoList() {
        System.out.println("TODO LIST");
        for (int i = 0;i < todos.length; i++){
            String todo = todos[i];
            if(todo !=null){
                System.out.println(i+1)+"."+ todo);
            }
        }
    }

    public static void addTodoList(String todo){
        //resizeArrayIfFull();
        for (int i=0;i<todos.length;i++){
            if(todos[i]==null) {
                todos[i]=todo;
                break;
            }
        }
    }

    public static void resozeIfFull(){
        //cek whether todos is full
        Boolean isFull = true;
        //isFull=isArrayFull(isFull

        //if full, reaize current arrat to two times bigger
        if(isFull){
            //resizeArrayToTwoTimesBigger();
        }
    }
}

public static Boolean isArrayFull() {
    for (int i = 0; i < todos.length; i++) {
        if (todos[i] == null) {
            return false;
        }
        return true;
    }

    public static void resizeArrayToTwoTimesBigger() {
        String[] temp = todos;

    }
    }

































