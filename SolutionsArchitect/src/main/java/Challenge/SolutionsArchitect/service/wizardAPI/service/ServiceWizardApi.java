package Challenge.SolutionsArchitect.service.wizardAPI.service;

import Challenge.SolutionsArchitect.domain.house.House;
import Challenge.SolutionsArchitect.service.wizardAPI.adapter.AdapterWizardAPI;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Service
public class ServiceWizardApi implements AdapterWizardAPI {

   private static ServiceWizardApi instance = null;
   private Retrofit retrofit;
   private static final String urlApi = "https://wizard-world-api.herokuapp.com/";
   public ServiceWizardApi(){
       this.retrofit = new Retrofit.Builder()
               .baseUrl(urlApi)
               .addConverterFactory(GsonConverterFactory.create())
               .build();
   }

   public static ServiceWizardApi getInstance(){
       if(instance == null){
           instance = new ServiceWizardApi();
       }
       return instance;
   }

    @Override
    public List<House> getHousesList() throws IOException {
        WizardService wizardService = this.retrofit.create(WizardService.class);
        Call<List<House>> housesRequest = wizardService.getHousesList();
        Response<List<House>> housesResponse = housesRequest.execute();
        return housesResponse.body();
    }

    @Override
    public House getHouseByID(UUID id) throws IOException {
       WizardService wizardService = this.retrofit.create(WizardService.class);
       Call<House> houseByIdRequest = wizardService.getHouseById(id.toString());
       Response<House> houseByIdResponse = houseByIdRequest.execute();
        return houseByIdResponse.body();
    }
}
