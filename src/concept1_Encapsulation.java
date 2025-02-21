
public class concept1_Encapsulation
{
    private String Name = "Amruta";
    private String Surname ="Solanke";

    public static void main(String[] args)
    {

        concept1_Encapsulation driver = new concept1_Encapsulation();
       //String newname="Pankaj";
      // driver.Name = "pankaj"; // no access to name as it is private to resolve this use get/set methods of encapsulation
        driver.setName("Pankaj");
       System.out.println(""+ driver.Name);
       System.out.println(""+driver.getsurname());



    }

    void setName(String menu)
    {
      this.Name = menu;

    }
   String getsurname()
    {
        String nemu ="";
        nemu=Surname;
        return nemu;


    }
}

