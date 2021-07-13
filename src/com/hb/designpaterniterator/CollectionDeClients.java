package com.hb.designpaterniterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDeClients implements Iterator<Clients>, Iterable<Clients> {

    private List<Clients> clients = new ArrayList<>();
    private int offset = 0;

    @Override
    public Iterator<Clients> iterator() {
        offset = 0;
        return clients.iterator();
    }

    @Override
    public boolean hasNext() {
        //test conditionnelle si offset correspond au dernier
        return offset<clients.size();
    }

    @Override
    public Clients next(){
        return clients.get(offset++);
    }

    public void add(Clients client){
        clients.add(client);
    }


}
