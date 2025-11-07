package in.Sidshinde.foddiesapi.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.Sidshinde.foddiesapi.io.FoodResponse;
import in.Sidshinde.foddiesapi.io.foodRequest;

public interface FoodService {
     String uploadFile(MultipartFile file);

     FoodResponse addFood(foodRequest request, MultipartFile file);

     List<FoodResponse> readFoods();

     FoodResponse readFood(String id);

     boolean deleteFile(String filename);

     void deleteFood(String id);





}
