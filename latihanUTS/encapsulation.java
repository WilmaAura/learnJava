package latihanUTS;
/* This action is tomake sure that "sensitive" data is hidden from users.
    - declare class attributes as private
    - provide public get and set methods to access and update the value of private attributes
*/
public class encapsulation {
    private String name; //Private = restricted access

    //Getter
    public String getName(){
        return name;
    }
    //Setter
    public void setName(String newName){
        this.name = newName;
    }
}


