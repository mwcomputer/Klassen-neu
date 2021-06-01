import java.util.jar.Attributes.Name;

public class Cat 
{
    // Property | Attribut | Field
    public String name;
    public String furColor;
    public int age;

    public Cat(String name,String furcolor,int age){
    this.name =name;
    this.furColor = furcolor;
    this.age = age;
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
