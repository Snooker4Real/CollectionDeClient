package com.hb.designpaterniterator;

import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {

        CollectionDeClients collectionDeClient = new CollectionDeClients();

        collectionDeClient.add(new Clients(1, "Nicolas"));
        collectionDeClient.add(new Clients(2, "Jonathan"));
        collectionDeClient.add(new Clients(3, "Fabien"));

        for (Iterator it = collectionDeClient.iterator(); collectionDeClient.hasNext();){
            Clients client = collectionDeClient.next();
            System.out.println(client);
        }
    }
}
