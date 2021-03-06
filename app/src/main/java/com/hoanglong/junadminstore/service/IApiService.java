package com.hoanglong.junadminstore.service;

import com.hoanglong.junadminstore.data.model.category.PhoneCategory;
import com.hoanglong.junadminstore.data.model.comment.Comment;
import com.hoanglong.junadminstore.data.model.comment.CommentUpload;
import com.hoanglong.junadminstore.data.model.home.Home;
import com.hoanglong.junadminstore.data.model.order.Order;
import com.hoanglong.junadminstore.data.model.order.OrderUpload;
import com.hoanglong.junadminstore.data.model.order.StatusUpload;
import com.hoanglong.junadminstore.data.model.phone_product.ItemPhoneProduct;
import com.hoanglong.junadminstore.data.model.phone_product.PhoneProduct;
import com.hoanglong.junadminstore.data.model.search.KeySearch;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface IApiService {
    @GET("/getPhoneProduct")
    Call<PhoneProduct> getAllPhone();

    @GET("/getHome")
    Call<Home> getHome();

    @GET("/getPhoneWithType/{type}")
    Call<PhoneProduct> getPhoneWithType(@Path("type") String type);

    @GET("/getPhoneProduct/{title}")
    Call<PhoneProduct> getPhoneWithTitle(@Path("title") String title);

    @GET("/getPhoneCategory/{typeCategory}")
    Call<PhoneProduct> getItemWithCategory(@Path("typeCategory") String typeCategory);

    @GET("getCategory/{typeCategory}")
    Call<PhoneCategory> getTypeCategory(@Path("typeCategory") String typeCategory);

    @POST("/createProduct")
    Call<ItemPhoneProduct> uploadNewProduct(@Body ItemPhoneProduct itemPhoneProduct);

    @GET("/getOrder")
    Call<OrderUpload> getAllOrder();

    @PUT("/updateOrder/{idOrder}")
    Call<Order> updateStatusOrder(@Path("idOrder") String idOrder, @Body StatusUpload statusUpload);

    @GET("/getOrderByStatus/{statusOrder}")
    Call<OrderUpload> getDelivery(@Path("statusOrder") String statusOrder);

    @POST("/searchItems")
    Call<PhoneProduct> getSearch(@Body KeySearch keySearch);

    @GET("/getComment/{idProduct}")
    Call<CommentUpload> getComment(@Path("idProduct") String idProduct);

    @GET("/deleteComment/{idComment}")
    Call<Comment> deleteComment(@Path("idComment") String idProduct);

    @GET("/deleteProduct/{idProduct}")
    Call<ItemPhoneProduct> deleteProduct(@Path("idProduct") String idProduct);
}