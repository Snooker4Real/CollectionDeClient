package com.hb.designPattern.singleton;

//La classe est final, car un singleton n'est pas censé avoir d'héritier
public final class Singleton {
    //Attribut qui stock l'instance qui sera créé par le Singleton
    private static Singleton instance = null;

    //La présence d'un constructeur privé supprime le constructerur public par défaut
    //De plus, seul le singleton peut s'instancier lui même
    private Singleton(){

    }
    /*
    * Méthode permettant de renvoyer une instance de la classe Singleton
    *  @return Retourne l'instance de singleton.
    * */
    public final static Singleton getInstance()
    {
        if (Singleton.instance == null){
            /* Le mot-clé synchronized sur ce bloc empêche toute
            * instanciation multiple même par différents "threads".
            * Il est TRES important
            * */
            synchronized (Singleton.class){
                if(Singleton.instance == null){
                    Singleton.instance = new Singleton();
                }
            }
        }
        return Singleton.instance;
    }

    public void afficherSingleton()
    {
        System.out.println("Un singleton");
    }

}
