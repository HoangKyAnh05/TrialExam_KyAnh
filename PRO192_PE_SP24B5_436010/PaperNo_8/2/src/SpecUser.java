
public class SpecUser extends User {
    private String address;

    public SpecUser() {
    }

    public SpecUser(String name, int status, String address) {
        super(name, status);
        this.address = address;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + address + ", " + super.getStatus();
    }
    public void setData(){
         this.setName(this.getName() + " " + address);
         
    }  
    public String getValue(){
        return this.getStatus() == 1 ? this.getName() + "admin" : this.getName() + "user";
    }
}
