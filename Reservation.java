import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation implements IAffiche {
    private final int FORMAT = 4;
    private static int nombreRef;
    private final LocalDate date=LocalDate.now();
    private int dure;
    private int cout;
    private String etat;
    private String id;
    private String refClient;
    private String refLocal;
    Fonction service = new Fonction();
    


    public Reservation(String nci, String refL, int dure) {
        id=generateId();
        this.refClient=nci;
        this.refLocal=refL;
        this.dure= dure;
        this.etat="EN COURS";
        this.cout=service.coutReservation(refL)*dure;
    }

    public String generateId(){

        String nombreZero = "";
        String nombreDeRefString = String.valueOf(++nombreRef);
        for(int i=1; i<=(FORMAT - nombreDeRefString.length()); i++)
        {
            nombreZero += "0";
        }
        return "RES"+nombreZero + nombreDeRefString;

    }
    /*get et set*/
    public LocalDate getDate() {
        return date;
    }
    public String getRefLocal() {
        return refLocal;
    }
    public void setRefLocal(String refLocal) {
        this.refLocal = refLocal;
    }
    public String getRefClient() {
        return refClient;
    }
    public void setRefClient(String refClient) {
        this.refClient = refClient;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEtat() {
        return etat;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }
    public int getDure() {
        return dure;
    }
    private int getCout() {
        return cout;
    }
    public void setDure(int dure) {
        this.dure = dure;
    }

    @Override
    public String afficher() {
        // TODO Auto-generated method stub
        return "\n Reference Reservation: "+getId()+
        "\n Date de reservations: "+getDate()+
        "\n Dure de reservations: "+getDure()
        +"\n Cout :"+getCout()
        +"\n etat :"+getEtat()
        +"\n nci client :"+getRefClient()
        +"\n refernce Local:\n"+getRefLocal();
    }

    
    

    
}
