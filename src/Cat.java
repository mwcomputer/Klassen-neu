public class Cat 
{
    // Property | Attribut | Field
    public String name = "nobody";
    public String furColor;
    public int age;

public Cat(){

}


    public void tellYourAddress(){
        System.out.println("Blick von innen: " + this);
    }

    public void tellYourName() {
        System.out.println(this.name);
    }

    public void changeYourName(String name) {
        this.name = name;
    }
    
}
