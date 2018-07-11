
package com.reactlibrary;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNActorSdkLibModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNActorSdkLibModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNActorSdkLib";
  }



  @ReactMethod
  public void startMessenger(){
    Log.d(RNActorSdkLibModule.class.getName(), "Metodo do modulo !!!!!");
  }

  @ReactMethod
  public void sendMessage(String message, Callback callback){

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    callback.invoke("Mensagem enviada com sucesso!");

  }

}