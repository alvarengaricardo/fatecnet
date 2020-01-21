package br.com.fatec.fatecnet.service;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyAndroidFCMIIDService";

    @Override
    public void onTokenRefresh() {
        //Get token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        //Log token
        Log.d(TAG, "Refreshed token: " + refreshedToken);
    }
}