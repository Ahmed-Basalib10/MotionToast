package com.e.motiontoast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import www.sanju.motiontoast.MotionToast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) findViewById(R.id.showCustomToastLib);
        button2=(Button) findViewById(R.id.showCustomToastLib1);
        button3=(Button) findViewById(R.id.showCustomToastLib2);
        button4=(Button) findViewById(R.id.showCustomToastLib3);
        button5=(Button) findViewById(R.id.showCustomToastLib4);
    }

    public void showToast(View view) {
        int id =view.getId();
        if(id ==R.id.showCustomToastLib){
           /* MotionToast.Companion.createToast(this,
                    "Hurray success ",
                    "Upload Completed successfully!",
                    MotionToast.TOAST_SUCCESS,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this,R.font.helvetica_regular));*/
            MotionToast.Companion.createColorToast(this,"Success","Upload Completed!",
                    MotionToast.TOAST_SUCCESS,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this,R.font.helvetica_regular));
        }else if(id ==R.id.showCustomToastLib1){
            MotionToast.Companion.createToast(this,
                    "Failed ",
                    "Profile Update Failed!",
                    MotionToast.TOAST_ERROR,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this,R.font.helvetica_regular));

        }else if(id ==R.id.showCustomToastLib2){
            MotionToast.Companion.createToast(this,"Info","This is information toast!",
                    MotionToast.TOAST_INFO,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this,R.font.helvetica_regular));

        }else if(id ==R.id.showCustomToastLib3){
            MotionToast.Companion.createToast(this,"Warning","Please fill all the details!",
                    MotionToast.TOAST_WARNING,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this,R.font.helvetica_regular));

        }else if(id ==R.id.showCustomToastLib4){
           /* MotionToast.Companion.createToast(this,"Delete","Delete all history!",
                    MotionToast.TOAST_DELETE,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this,R.font.helvetica_regular));*/
            MotionToast.Companion.darkToast(this,"Delete","Delete all history!",
                    MotionToast.TOAST_DELETE,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this,R.font.helvetica_regular));

        }
    }
}