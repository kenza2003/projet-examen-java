import java.util.Scanner; 
public class Menu {

    public static Scanner scanner = new Scanner(System.in);
    static String nci;
    static String refL;

    public static void main(String args[])
    {
        Fonction service = new Fonction();
        int choix;
        do
        {
            choix = menu();
            switch(choix)
            {
            case 1:
                //ajouter un local
                
                int typeLocalInt;
                do{
                    System.out.println("Quel type de local : "
                            + "\n 1- chambre" 
                            + "\n 2- appartement");
                            typeLocalInt = Integer.parseInt(scanner.nextLine());

                } while (typeLocalInt != 2 && typeLocalInt != 1);
                Chambre local;
                Appartement app;
                if(typeLocalInt == 1 )
                // on ajoute un chambre
                {
                    System.out.print("localité : ");
                    String localisation = scanner.nextLine();
                    System.out.print("le prix que vous souhaitez : ");
                  //  int prixSt = Integer.parseInt(scanner.nextLine());
                    int prix = Integer.parseInt(scanner.nextLine());
                    System.out.print("taux : ");
                    int tauxLocative = Integer.parseInt(scanner.nextLine());
                    System.out.print("dimension : ");
                    int dimension = Integer.parseInt(scanner.nextLine()) ;

                //creer local :creation de la chambre
                 local= new Chambre(localisation, prix, tauxLocative,dimension);
               // service.ajoutLocal(local);
               service.ajoutChambre(local);
                }else
                // on ajoute un appartement
                {
                    System.out.print("Entrer le nombre de pièce : ");
                    int nbrPiece = Integer.parseInt(scanner.nextLine());
                    System.out.print("localité : ");
                    String localisation = scanner.nextLine();
                    System.out.print("le prix que vous souhaitez : ");
                    //  int prixSt = Integer.parseInt(scanner.nextLine());
                      int prix = Integer.parseInt(scanner.nextLine());
                    System.out.print("taux : ");
                    int tauxLocative = Integer.parseInt(scanner.nextLine());

                //creer local :creation de la chambre
                    app=new Appartement(nbrPiece, localisation, prix, tauxLocative);
                    service.ajoutAppartement(app);
                }

             
            break;
            case 2:
            // lister les locaux par type
            int c;
            do{
                System.out.println("Quel type de local : "
                        + "\n 1- chambre" 
                        + "\n 2- appartement");
                     c = Integer.parseInt(scanner.nextLine());

            } while (c != 2 && c != 1);
            
            if(c == 1 ){
                service.listLocalByType("chambre");}
            if(c == 2){
                service.listLocalByType("appartement"); 
            }
            if(c == 0){
                System.out.println("0"); 
            }
            break;
            case 3:
            System.out.print("Entrer votre nci : ");
            nci = scanner.nextLine();
            System.out.print("\n Voici vos reservations : ");
            service.listLocalReserveByClient(nci);
            break; 
            case 4:
            System.out.print("Entrez reference  : ");
            String  ref = scanner.nextLine();
            service.detailLocal(ref);
 
            break;
            case 5:
                //faire reservation
                System.out.print("Entrer votre nci : ");
                 nci = scanner.nextLine();
                System.out.print("entrez la referrence du local: ");
                refL = scanner.nextLine();
                System.out.print("la durée du sejour : ");
                int dure = Integer.parseInt(scanner.nextLine());
                Reservation res = new Reservation(nci, refL, dure);
                service.ajouReservation(res);
                System.out.print( res.afficher());
            break;
            case 6:
            System.out.print("entrez la referrence du local: ");
             refL= scanner.nextLine();
             service.cancelReservation(refL);
             choix=3;

            break;
            case 7:
            service.listLocalDispo();
            choix=20;
            break;
            }
            
        } while (choix != 7);
    }

    public static int menu()
    {
        int choix;
        System.out.println
        ("Menu"
        + "\n 1-ajouter local"  
        + "\n 2-Lister local par type"
        + "\n 3-Lister locaux reservés par client"
        + "\n 4-voir detail d'un local"
        + "\n 5-faire reservation"
        + "\n 6-annuler reservation"
        + "\n 7-lister locaux disponible"
        + "\n 8-Quitter");
        System.out.print("Faites votre choix : ");
        choix = Integer.parseInt(scanner.nextLine());
        return choix;
    }
}
