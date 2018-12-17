package com.derrick.park.assignment3_contacts.network;

import com.derrick.park.assignment3_contacts.models.ContactList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RandomUserService {
    @GET("?nat=ca")
    Call<ContactList> listContacts(@Query("results") int num);
}
