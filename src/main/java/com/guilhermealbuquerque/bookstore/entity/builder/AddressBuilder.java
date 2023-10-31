package com.guilhermealbuquerque.bookstore.entity.builder;

import com.guilhermealbuquerque.bookstore.entity.AddressEntity;

public class AddressBuilder {
    private AddressEntity address;
    
    private AddressBuilder(){
        address = new AddressEntity();
    }
    
    private static AddressBuilder b(){
        return new AddressBuilder();
    }
}
