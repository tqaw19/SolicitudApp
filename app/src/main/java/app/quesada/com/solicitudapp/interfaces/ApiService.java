package app.quesada.com.solicitudapp.interfaces;

import java.util.List;

import app.quesada.com.solicitudapp.models.Solicitud;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    String API_BASE_URL = "http://192.168.1.96:8088";

    @GET("/solicitudes")
    Call<List<Solicitud>> getSolicitudes();
}
