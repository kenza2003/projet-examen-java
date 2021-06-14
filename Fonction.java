import java.util.ArrayList;
import java.util.List;

public class Fonction implements IFonction{
  
    private static List<Chambre> listChambre=new ArrayList<>();
    private static List<Local> listLocals=new ArrayList<>();
    private static List<Appartement> listAppartements=new ArrayList<>();
    private static List<Reservation> listResvations=new ArrayList<>();
    

    public void ajouReservation(Reservation reservation) {
        // TODO Auto-generated method stub
        listLocals=conca();
        listResvations.add(reservation);
        for(Local l:listLocals){

            if(l!=null){
                if(reservation.getRefLocal().equals(l.getRef())){
                    l.setEtat("RESERVER");
                }
            }
        }


        
    }

    public void ajoutChambre(Chambre loc) {
        // TODO Auto-generated method stub
        listChambre.add(loc);
        
    }
    public void ajoutAppartement(Appartement loc) {
        // TODO Auto-generated method stub
        listAppartements.add(loc);
        
    }

    @Override
    public void listLocalByType(String type) {
        if(type.equals("chambre")){

            for (Chambre i : listChambre){
                if(i!=null){
                    if(i.getType().equals(type)){
    
                        System.out.println(i.afficher());
                    }
                }
                else{
                    System.out.println("la liste vide");
                }
            }
        }else if(type.equals("appartement")){

            for (Appartement i : listAppartements){
                if(i!=null){
                    if(i.getType().equals(type)){
    
                        System.out.println(i.afficher());
                    }
                }
                else{
                    System.out.println("la liste vide");
                }
            }


        }
        
        
    }

    @Override
    public void detailLocal(String ref) {
        // TODO Auto-generated method stub
        listLocals=conca();
        for (Local i : listLocals){
            if(i!=null){
                if(i.getRef().equals(ref)){

                    System.out.println(i.afficher());

                }
            }
           
        }
        
    }
    public int coutReservation(String ref) {
        
        listLocals=conca();
        for (Local i : listLocals){
            if(i!=null){
                if(i.getRef().equals(ref)){

                    return i.getCout();

                }
            }
           
        }
        return 0;
        
    }

    public List<Local> conca(){

        for(Chambre c:listChambre){
            listLocals.add(c);
        }
        for(Appartement app:listAppartements){
            listLocals.add(app);
        }
        return listLocals;
    }

    @Override
    public void listLocalReserveByClient(String nci) {
        for(Reservation res:listResvations){

            if(res!=null){
                if(res.getRefClient().equals(nci)){

                    System.out.println(res.afficher());
                }
            }
        }
        
    }

    
    @Override
    public void cancelReservation(String refReservation) {
        listLocals=conca();
        for(Reservation res:listResvations){

            if(res!=null){
                if(res.getId().equals(refReservation)){
                    res.setEtat("ANNULER");
                    for(Local l:listLocals){
                        if(l!=null){
                            if(res.getRefLocal().equals(l.getRef())){

                                l.setEtat("disponible");
                            }

                        }
                    }

                }
            }
        }
       
        

        
    }

    @Override
    public void listLocalDispo() {
        listLocals=conca();
        for (Local i : listLocals){
            if(i!=null){
                if(i.getEtat().equals("disponible")){

                    System.out.println(i.afficher());

                }
            }
           
        }
        
    }

    @Override
    public void ListLocalByType() {
        // TODO Auto-generated method stub
        
    }
    public void createClient(){
        
    }
    

}