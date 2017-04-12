package kk.ljq.hhh.retrofit2;

import kk.ljq.hhh.retrofit2.data.model.remote.RetrofitClient;
import kk.ljq.hhh.retrofit2.data.model.remote.SOService;

/**
 * Created by Elhadedy on 4/9/2017.
 */

public class ApiUtils {

    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}