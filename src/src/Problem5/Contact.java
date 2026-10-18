package Problem5;

public class Contact {
    protected String emailAddress;
    protected String faxNumber;
    protected String name;
    protected String primaryContactMethod;

    public Contact(String email,String faxNumber,String name, String primaryContactMethod ){
        this.emailAddress=email;
        this.faxNumber=faxNumber;
        this.name=name;
        this.primaryContactMethod=primaryContactMethod;
    }

    public String getEmailAddress(){
        return emailAddress;
    }
    public String getFaxNumber(){
        return faxNumber;
    }
    public String getName(){
        return name;
    }

    public String getPrimaryContactMethod(){
        return primaryContactMethod;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void setFaxNumber(String faxNumber){
        this.faxNumber = faxNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrimaryContactMethod(String primaryContactMethod){
        this.primaryContactMethod = primaryContactMethod;
    }
    public String getContactSummary(){
        return "Name : "+name+" ,faxNumber : "+faxNumber+" and the emailAddress : "+emailAddress;
    }
    public String getEmailDomain() {
        if (emailAddress != null && emailAddress.contains("@")) {
            return emailAddress.substring(emailAddress.indexOf("@")+1);
        }
        return "No Domain";
    }
}
