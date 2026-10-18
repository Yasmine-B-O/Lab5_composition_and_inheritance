package Problem5;

public class Test {
    public static void main(String[] args){
        Contact c1=new Contact("ali@gmail.com", "123456", "Ali", "Email");
        Contact c2=new Contact("Adam@yahoo.fr", "654321", "Adam", "Téléphone");
        Contact c3=new Contact("Asmae@hotmail.com", "000000", "Asmae", "Fax");

        AddressBook book1=new AddressBook("Carnet Personnel");
        book1.addContact(c1);
        book1.addContact(c2);

        ContactGroup group1=new ContactGroup("Amis");
        group1.addContact(c1);
        group1.addContact(c3);

        book1.addGroup(group1);

        Account myAccount=new Account("mon.email@exemple.com", "Jean Valjean");
        myAccount.addAddressBook(book1);

        myAccount.printAllContactDomains();
        System.out.println(book1.getSummary());

        Contact found = book1.findByEmail("Adam@yahoo.fr");
        if (found != null) {
            System.out.println("Trouvé:"+found.getContactSummary());
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
