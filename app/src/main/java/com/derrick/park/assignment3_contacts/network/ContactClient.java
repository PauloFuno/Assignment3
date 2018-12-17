package com.derrick.park.assignment3_contacts.network;


import com.derrick.park.assignment3_contacts.models.ContactList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ContactClient {
    private static final String ROOT_URL = "https://randomuser.me/api/";

    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static RandomUserService getRandomUserService() {
        return getRetrofitInstance().create(RandomUserService.class);
    }

    public static Call<ContactList> getContacts(int num) {
        Call<ContactList> contacts = getRandomUserService().listContacts(num);
        System.out.println(contacts);
        return contacts;
    }

}
