package by.dream.client_math;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.HashMap;

public interface Request {
    @FormUrlEncoded
    //@POST("user/edit")
    @POST("/demo0013/")
    Call<Object> performPostCall(@FieldMap HashMap<String, String> postDataParams);
}
