public abstract class Local implements IAffiche{

    protected String localisation;
    private final int FORMAT = 4;
    private static int nombreRef;
    protected int prix;
    protected String ref;
    protected int tauxLocative;
    protected String type;
    protected String etat;
    protected int cout;
    
    //getters
    public String getLocalisation() {
        return localisation;
    }
    public int getCout() {
        return cout;
    }
    public void setCout(int cout) {
        this.cout = cout;
    }
    public int getPrix() {
        return prix;
    }
    public String getRef() {
        return ref;
    }
    public int getTauxLocative() {
        return tauxLocative;
    }
    public String getType() {
        return type;
    }
    public String getEtat() {
        return this.etat;
    }

    

    //setters
    public void setEtat(String etat) {
        this.etat = etat;
    }
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }
    public void setRef(String ref) {
        this.ref = ref;
    }
    public void setTauxLocative(int tauxLocative) {
        this.tauxLocative = tauxLocative;
    }
    public void setType(String type) {
        this.type = type;
    }

    private String generateRef(){
        String nombreZero = "";
        String nombreDeRefString = String.valueOf(++nombreRef);
        for(int i=1; i<=(FORMAT - nombreDeRefString.length()); i++)
        {
            nombreZero += "0";
        }
        return "REF"+nombreZero + nombreDeRefString;

    }
     //les constructeurs
     public Local( String localisation, int prix, int tauxLocative){
        ref = generateRef();
        this.localisation=localisation;
        this.prix=prix;
        this.tauxLocative=tauxLocative;
    }
    
    @Override
    public String afficher(){
        return "\n Reference: "+getRef()+
        "\n localisation: "+getLocalisation()+
        "\n prix: "+getPrix()+"\n taux :"+getTauxLocative()
        +"\n etat :"+getEtat();

    }

    
    /**/
}
