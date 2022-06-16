import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> mobilePhone= new ArrayList<>();

    public void addContact(String name, String phoneNumber){
        if(findContact(name) < 0){
            Contacts contact = new Contacts(name,phoneNumber);
            mobilePhone.add(contact);
        }else{
            System.out.println("The specified contact already exists.");
        }
    }

    public void printContacts(){
        for(int i = 0; i < mobilePhone.size();i++)
            System.out.println((i+1)+". "+ mobilePhone.get(i).getName()+" "+ mobilePhone.get(i).getPhoneNumber());
    }

    public void modifyContact(String oldContact,String newName,String newPhoneNumber){
        int position = findContact(oldContact);
        if(position >= 0){
            int newNamePosition = findContact(newName);
            System.out.println(newNamePosition);
            if(newNamePosition < 0){
                mobilePhone.set(position,Contacts.createContact(newName,newPhoneNumber));
            }else{
                System.out.println("Cannot update contact with name that already exist. ");
            }
        }else{
            System.out.println("The specified contact doesn't exist");
        }
    }

    public void removeContact(String name){
        int position = findContact(name);
        if(position >= 0){
            mobilePhone.remove(position);
            System.out.println("Successfully removed contact.");
        }else{
            System.out.println("the specified contact doesn't exists.");
        }
    }

    private int findContact(Contacts contact){
        return mobilePhone.indexOf(contact);
    }

    private int findContact(String name){
        for(int i = 0;i < mobilePhone.size();i++){
            Contacts contact = mobilePhone.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(String name){
        int position = findContact(name);
        System.out.println(position);
        if(position >= 0){
            return "Name: "+mobilePhone.get(position).getName()+" Phone number: "+mobilePhone.get(position).getPhoneNumber()+" at "+position+" position";
        }
        System.out.println("Contact not found");
        return  null;
    }
}
