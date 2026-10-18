package Problem5;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    protected String name;
    private List<Contact> contacts;
    private List<ContactGroup> groups;

    public AddressBook(String name, List<Contact> contacts,List<ContactGroup> groups ){
        this.name=name;
        this.groups=groups;
        this.contacts=contacts;
    }
    public AddressBook(String name){
        this.name=name;
        this.contacts=new ArrayList<>();
        this.groups = new ArrayList<>();
    }
    public List<Contact> getContact(){
        return contacts;
    }
    public List<ContactGroup> getContacts(){
        return groups;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void addContact(Contact c){
        if(c!=null){
            contacts.add(c);
        }

    }
    public void addGroup(ContactGroup c){
        if(c!=null){
            groups.add(c);
        }

    }
    public String getSummary(){
        StringBuilder sb=new StringBuilder();
        sb.append("=== AddressBook: ").append(this.name).append(" ===\n");
        if (contacts.isEmpty()) {
            sb.append("  (No contact in this AddressBook )\n");
        } else {
            for (Contact c : contacts) {
                sb.append("-").append(c.getContactSummary()).append("\n");
            }
        }
        return sb.toString();
    }
    public Contact findByEmail(String email){
        for(Contact ele : contacts){
            if(ele.getEmailAddress().equals(email)){
                return ele;
            }
        }
        return null;
    }

}
