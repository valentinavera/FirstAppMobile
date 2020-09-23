package edu.unicauca.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toast tag = Toast.makeText(this,"Ejecutando OnCreate()",Toast.LENGTH_SHORT);
        tag.show();
        TimeToast(tag, 10000);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
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