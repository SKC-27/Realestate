package com.example.meroghar.Interfaces;

import com.example.meroghar.Models.Wishlist;
import com.example.meroghar.ServerResponse.IdResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface wishlist {
     //to post user wishlist property
     @POST("/wishlists")
     Call<IdResponse> postWishlist(@Header("Authorization") String token, @Body Wishlist wishlist);

    //to get user specific wishlist property
     @GET("/wishlists/{id}")
     Call<IdResponse> getWishlist();

     //to delete user specific wishlist property
     @DELETE("/wishlists/{id}")
     Call<IdResponse> deleteWishlist(@Header("Authorization") String token,@Path("id") String id);
}
