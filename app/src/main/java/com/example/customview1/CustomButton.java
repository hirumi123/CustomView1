package com.example.customview1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {

    private int warna1;
    private int warna2;
    private boolean isClicked = false;
    private void init(){
        warna1 = getResources().getColor(R.color.yellow);
        warna2 = getResources().getColor(R.color.teal_700);
        setBackgroundColor(warna1);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked) {
                    setBackgroundColor(warna1);
                    isClicked = false;
                }
                else {
                    setBackgroundColor(warna2);
                    isClicked = true;
                }
            }
        });
    }

    public CustomButton(@NonNull Context context) {
        super(context);
        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
}
