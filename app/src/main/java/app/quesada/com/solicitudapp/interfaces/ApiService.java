package app.quesada.com.solicitudapp.interfaces;

import java.util.List;

import app.quesada.com.solicitudapp.models.ResponseMessage;
import app.quesada.com.solicitudapp.models.Solicitud;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    String API_BASE_URL = "http://192.168.1.96:8088";

    @GET("/solicitudes")
    Call<List<Solicitud>> getSolicitudes();

    @FormUrlEncoded
    @POST("/solicitudes")
    Call<ResponseMessage> createSolicitud(@Field("tipo") String tipo,
                                         @Field("correo") String correo,
                                         @Field("motivo") String motivo);

    @Multipart
    @POST("/solicitudes")
    Call<ResponseMessage> createSolicitudWithImage(
            @Part("tipo") RequestBody tipo,
            @Part("correo") RequestBody correo,
            @Part("motivo") RequestBody motivo,
            @Part MultipartBody.Part captura
    );

}
