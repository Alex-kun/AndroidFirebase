package utad.miapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public Button btnMain;
    private MainActivityEvents events;
    public TextView txtvHolaMundo;

    public LinearLayout vistaUno,vistaDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = new MainActivityEvents(this);

        btnMain =(Button) this.findViewById(R.id.btnmain);
        txtvHolaMundo=(TextView)this.findViewById(R.id.lblMain);
        vistaUno = (LinearLayout) this.findViewById(R.id.vistaUno);
        vistaDos = (LinearLayout) this.findViewById(R.id.vistaDos);

        btnMain.setText(R.string.mi_boton);
        btnMain.setOnClickListener(events);
    }
}
