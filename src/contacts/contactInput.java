package contacts;
import java.util.Scanner;
public class contactInput {
    public void input(){
        Scanner scanner = new Scanner(System.in);
        boolean start = true;
        while(start == true){
            System.out.println("Enter action (add, remove, edit, count, list, exit): ");
            String action = scanner.next();

            switch (action) {
                case "add":
                    System.out.println("Enter the name: ");
                    String name = scanner.next();
                    System.out.println("Enter the surname: ");
                    String surname = scanner.next();
                    System.out.println("Enter the number: ");
                    String number = scanner.next();
                    //если номер неверный
                     //System.out.println("Wrong number format!");

                    System.out.println("The record added.");
                    break;
                case "remove": //удалить
                    System.out.println("No records to remove!");
                    /*
                    1. John Smith, +0 (123) 456-789-ABcd
                    2. Adam Jones, (123) 234 345-456
                    Select a record: > 1
                    The record removed!
                     */
                    break;
                case "edit": //редактировать
                    System.out.println("No records to edit!"); //нет данных для редактирования
                    /*
                    1. John Smith, +0 (123) 456-789-ABcd
                    2. Adam Jones, [no number]
                    Select a record: > 2
                    Select a field (name, surname, number): > number
                    Enter number: > (123) 234 345-456
                    The record updated!
                     */
                    break;
                case "count":
                    System.out.println("The Phone Book has 0 records.");
                    break;
                case "list":
                    //выводит внесенные данные в таком формате:
                    //1. John Smith, +0 (123) 456-789-ABcd
                    //2. Adam Jones, [no number]
                    break;
                case "exit":
                    start = false;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
        }
    }
}

