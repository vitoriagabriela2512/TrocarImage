package br.ulbra.trocarimage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;


public class MainActivity extends AppCompatActivity {
    ImageView imgfoto;
    Button btfoto1, btfoto2;
    TextView txFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imgfoto = findViewById(R.id.imgFoto1);
        txFoto = findViewById(R.id.txtFt1);
        btfoto1 = findViewById(R.id.btnFt1);
        btfoto2 = findViewById(R.id.btnFt2);
        btfoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgfoto.setImageResource(R.drawable.foto1);
                txFoto.setText("Foto 1");
            }
        });

        btfoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgfoto.setImageResource(R.drawable.foto2);
                txFoto.setText("Foto 2");
            }
        });

    }
}