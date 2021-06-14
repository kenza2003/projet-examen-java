public class Chambre extends Local{
        private int dimension;
        private String type;
        private String etat;
        private int cout;
    
         /* Definition du constructeur*/ 
         int coutC = (tauxLocative * prix) + prix;
        public Chambre( String localisation, int prix, int tauxLocative,int dimension) {
            super(localisation, prix, tauxLocative);
            this.dimension=dimension;
            this.type="chambre";
            this.etat="disponible";
            this.cout=coutC;
            
        }

        /* Definitions des getters*/ 
        public int getDimension()
        {
            return dimension;
        }
        public int getCout()
        {
            return cout;
        }
    
    
    
        /* Definitions des setters*/ 
    
        public void setDimension(int dimension){
                this.dimension = dimension;
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
        return super.afficher()+"\n dimension : "+getDimension()+
        "\n type : "+getType()
        +"\n cout: "+getCout();

    }
}
