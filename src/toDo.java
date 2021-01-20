import java.util.ArrayList;
import java.util.Scanner;

public class toDo {
    public static void main(String[] args) {
        //creates the new ToDoList
        ToDoList todoListItem = new ToDoList();
        int notif=0;
        while(notif==0) {
            System.out.print("\nTO DO LIST\n\n 1.Add an item \n 2.Delete an item \n 3.List the items on todo list \n 4.Exit the program \n Please enter a number:");
            //this will read the user's input once they decide what they want
            Scanner input=new Scanner(System.in);
            int option=input.nextInt(); input.nextLine();
            if(option==1) {
                System.out.println("Enter the item:");
                String item=input.nextLine();
                todoListItem.addOneItem(item);
                System.out.println("1 item added!");
            }
            else if(option==2) {
                todoListItem.listAll();
                System.out.println("Please enter the item number that you want to delete");
                int n=input.nextInt();
                todoListItem.deleteOneItem(n-1);
                System.out.println("The item you selected has been deleted!");
            }
            else if(option==3) {
                todoListItem.listAll();
            }else{notif=1;}
        }
    }
}

// this hold all of the functions in the program, adding, removing and listing the items in the todo list
class ToDoList {
    // for adding an item to the list
    public  void addOneItem(String item) {
        this.todo.add(item);
    }
    // for removing an item from the list
    public void deleteOneItem(int num) {
        this.todo.remove(num);
    }
    // creating an array of items
    ArrayList<String> todo = new ArrayList<String>();
    // listing all items in the todo list
    public void listAll(){
        for (int i = 0; i < this.todo.size(); i++) {
            System.out.println((i+1)+"."+this.todo.get(i));
        }
    }
}