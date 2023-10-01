import okhttp3.*;

import java.io.IOException;

public class APICallSample {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();


        String json = "{\"courseCodeAndTitleProps\":{\"courseCode\":\"STA257H1\",\"courseTitle\":\"ProbabilityandStatisticsI\",\"courseSectionCode\":\"F\",\"searchCourseDescription\":false},\"departmentProps\":[],\"campuses\":[],\"sessions\":[\"20239\",\"20241\",\"20239-20241\"],\"requirementProps\":[],\"instructor\":\"\",\"courseLevels\":[],\"deliveryModes\":[],\"dayPreferences\":[],\"timePreferences\":[],\"divisions\":[\"ARTSC\"],\"creditWeights\":[],\"page\":1,\"pageSize\":20,\"direction\":\"asc\"}";

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json"), json);
        Request request = new Request.Builder()
                .url("https://api.easi.utoronto.ca/ttb/getPageableCourses")
                .post(body)
                .build();

        try {

            Response response = client.newCall(request).execute();

            System.out.println(response);

            // Do something with the response.
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
