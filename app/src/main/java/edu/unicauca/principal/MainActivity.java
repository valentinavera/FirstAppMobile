package edu.unicauca.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toast tag = Toast.makeText(this,"Ejecutando OnCreate()",Toast.LENGTH_SHORT);
        tag.show();
        TimeToast(tag, 10000);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final Toast tag = Toast.makeText(this,"Ejecutando OnStart()",Toast.LENGTH_SHORT);
        tag.show();
        TimeToast(tag, 10000);
    }

    @Override
    protected void onStop() {
        super.onStop();
        final Toast tag = Toast.makeText(this,"Ejecutando OnStop()",Toast.LENGTH_SHORT);
        tag.show();
        TimeToast(tag, 10000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        final Toast tag = Toast.makeText(this,"Ejecutando OnDestroy()",Toast.LENGTH_SHORT);
        tag.show();
        TimeToast(tag, 10000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        final Toast tag = Toast.makeText(this,"Ejecutando OnPause()",Toast.LENGTH_SHORT);
        tag.show();
        TimeToast(tag, 10000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        final Toast tag = Toast.makeText(this,"Ejecutando OnResume()",Toast.LENGTH_SHORT);
        tag.show();
        TimeToast(tag, 10000);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        final Toast tag = Toast.makeText(this,"Ejecutando OnRestart()",Toast.LENGTH_SHORT);
        tag.show();
        TimeToast(tag, 10000);
    }

    protected void TimeToast(final Toast tag, int time){
        new CountDownTimer(time, time){
            public void onTick(long millisUntilFinished){
                tag.show();
            }
            public void onFinish(){
                tag.show();
            }
        }.start();
    }
}