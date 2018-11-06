package com.example.evelasco.fotos;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class AnimacionFotogramas  extends Activity implements View.OnClickListener{
    AnimationDrawable animation;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ImageView image= findViewById(R.id.imagen);
        image.setVisibility(ImageView.VISIBLE);
        image.setBackgroundResource(R.drawable.fotogramas_animados);
        animation=(AnimationDrawable)image.getBackground();
        Button boton=(Button) findViewById(R.id.buttonC);
        boton.setOnClickListener((View.OnClickListener) this);
        Button boton2= findViewById(R.id.buttonD);
        boton2.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View view) {
       if(view.getId()==R.id.buttonC) animation.start();
       else
           animation.stop();

    }
}
