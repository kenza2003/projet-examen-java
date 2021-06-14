
public class Appartement  extends Local {
    private int nbrPiece;
    private String type;
    private String etat;
    private int cout;
    int coutApp = ((tauxLocative * prix) + prix)*nbrPiece;

    

     /* Definition du constructeur*/ 
    

    public Appartement(int nbrPiece, String localisation, int prix, int tauxLocative) {
        super(localisation, prix, tauxLocative);
        this.nbrPiece=nbrPiece;
        this.type="appartement";
        this.etat="disponible";
        this.cout=coutApp;

    }

    /* Definitions des getters*/ 
    public int getNbrPiece()
    {
        return nbrPiece;
    }
    public int getCout()
    {
        return cout;
    }

    /* Definitions des setters*/ 

    public void setNbrPiece(int nbrPiece){

        if(nbrPiece > 0 )
        {
            this.nbrPiece = nbrPiece;
        }
    
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEtat() {
        return this.etat;
    }

    public void setEtat(String etat) {
        this.type = etat;
    }

    @Override
    public String afficher(){
        //
        return super.afficher()+"\n nombre de pièce : "+getNbrPiece()+
        "\n type : "+getType();

    }
    
}
