package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Build;
import android.os.PowerManager;
import android.os.AsyncTask;
import android.content.res.Configuration;
import android.util.Log;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.app.NotificationManager;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;

import java.util.Calendar;
import java.util.List;
import android.text.format.DateFormat;

import javax.net.ssl.HttpsURLConnection;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.sql.Date;
import java.lang.Thread;
import java.sql.Timestamp;

import org.json.JSONObject;  
import org.json.JSONException;  
import org.json.JSONArray;  

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.MediaType;
import okhttp3.RequestBody;

import static com.dieam.reactnativepushnotification.modules.RNPushNotification.LOG_TAG;

public class RNPushNotificationPublisher extends BroadcastReceiver {
    final static String NOTIFICATION_ID = "notificationId";

    @Override
    public void onReceive(final Context context, Intent intent) {

    }

}