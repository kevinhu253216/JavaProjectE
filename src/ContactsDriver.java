import java.util.*;

public class ContactsDriver {

    public static void main(String[] arg) {
    ///    Scanner sc = new Scanner(System.in);
        ContactList cArrayList = new ContactList();
        Contacts bob =new Contacts();
        cArrayList.addContacts(bob);
       // System.out.println(bob.getLastName());
        System.out.println( cArrayList.search("Bob") );
        cArrayList.remove(cArrayList.search("Bob"));


       System.out.println( cArrayList.search("Bob") );
      //  b1.print();
      /*
        String option = sc.next();

        switch (option){
            case "A": {
                cl.addContact();
                break;
            }
            case "P": {
                cl.showAllContact();
                break;
            }
            case "S": {
                System.out.println("Please enter search value: ");
                String value = sc.next();
                if (cl.search(value) != null) {
                    Contacts found = cl.search(value);
                    found.print();//print out the found contact
                    System.out.println("Do you want to delete this contact? Please enter Yes or No. ");
                    String answer = sc.next();
                    if (answer.equals("Yes")) {
                        cl.remove(cl.search(value));//delete the found contact
                    }
                }
                System.out.println("End of operation. The new contacts list is: ");
                cl.showAllContact();
                break;
            }
        }
        */
    }

}
