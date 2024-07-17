package Challenge.SolutionsArchitect.service.wizardAPI.service;

import Challenge.SolutionsArchitect.domain.house.House;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface WizardService {

    @GET("houses")
    Call<List<House>> getHousesList();

    @GET("houses/{id}")
    Call<House> getHouseById(@Path("id") String id);
}
