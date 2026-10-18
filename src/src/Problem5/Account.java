package Problem5;
import java.util.ArrayList;
import java.util.List;
public class Account {
    protected String emailAddress;
    protected String name;
    private List<AddressBook> addressBooks;

    public Account(String emailAddress,String name){
        this.emailAddress=emailAddress;
        this.name=name;
        this.addressBooks=new ArrayList<>();
    }

    public String getEmailAddress(){
        return emailAddress;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public List<AddressBook> getAddressBooks(){
        return addressBooks;
    }
    public void addAddressBook(AddressBook book){
          if(book!=null){
              addressBooks.add(book);
          }
    }
    public void printAllContactDomains(){
        System.out.println("emails domain related to all contact existed in "+name+" :\n");
        for(AddressBook ele :addressBooks){
            List<Contact> contacts=ele.getContact();
            for(Contact contact :contacts){
                System.out.println(contact.getEmailDomain()+"\n");
            }
        }
    }
}
