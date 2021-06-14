public interface IFonction {
   

    //lister les locaux par type
    public void listLocalByType(String type);

    //voir les details d'un local
    public void detailLocal(String ref);

    //lister les locaux reservé par un client
    public void listLocalReserveByClient(String nci);

    

    //annuler une reservation
    public void cancelReservation(String refReservation);

    //lister les locaux disponible
    public void listLocalDispo();

    //ajouter un lister les locaux par type
    public void ListLocalByType();

}
