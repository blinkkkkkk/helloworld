package com.tfl.billing;

import com.tfl.external.Customer;
import com.tfl.external.CustomerDatabase;

import java.util.List;
import java.util.UUID;

public class CustomerDatabaseAdapter implements CustomerDatabaseIF{
    private static CustomerDatabase customerDatabase = CustomerDatabase.getInstance();
    private static CustomerDatabaseAdapter instance = new CustomerDatabaseAdapter();

    @Override
    public boolean isRegisteredId(UUID cardId) {
        return customerDatabase.isRegisteredId(cardId);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerDatabase.getCustomers();
    }

    public static CustomerDatabaseAdapter getInstance() {
        return instance;
    }

}
