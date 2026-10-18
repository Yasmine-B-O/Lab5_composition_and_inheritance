package Problem5;
import java.util.ArrayList;
import java.util.List;

    public class ContactGroup {

    private String name;
    private List<Contact> contacts;
    private ContactGroup parent;
    private List<ContactGroup>children;

    public ContactGroup(String name){
        this.name=name;
        this.contacts = new ArrayList<>();
        this.children = new ArrayList<>();
    }
    public String getName(){
        return name;
     }

    public void setName(String name) {
        this.name = name;
    }
    public void addContact(Contact c){
      if(c!=null){
          contacts.add(c);
      }
    }
    public String buildGroupReport(){
        StringBuilder sb=new StringBuilder();
        sb.append("=== Groupe: ").append(this.name).append(" ===\n");
        if (contacts.isEmpty()) {
            sb.append("  (Aucun contact dans ce groupe)\n");
        } else {
            for (Contact c : contacts) {
                sb.append("-").append(c.getContactSummary()).append("\n");
            }
        }
        return sb.toString();
    }
}
