package kk.ljq.hhh.retrofit2.data.model.remote;

import kk.ljq.hhh.retrofit2.data.model.SOAnswersResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Elhadedy on 4/9/2017.
 */


public interface SOService {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Observable<SOAnswersResponse> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Observable<SOAnswersResponse> getAnswers(@Query("tagged") String tags);
}