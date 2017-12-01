package utad.miapp1;

import android.content.Intent;
import android.view.View;

/**
 * Created by bm on 10/11/2017.
 */

public class MainActivityEvents implements View.OnClickListener {

    private MainActivity mainActivity;

    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnmain){
            mainActivity.vistaUno.setVisibility(View.GONE);
            mainActivity.vistaDos.setVisibility(View.VISIBLE);
            //mainActivity.txtvHolaMundo.setText("FELICIDADES POR FIN!!!");
            //mainActivity.btnMain.setVisibility(View.GONE);
            //mainActivity.btnMain.setEnabled(false);

            //Intent intent = new Intent(mainActivity,SecondActivity.class);
            //mainActivity.startActivity(intent);
            //mainActivity.finish();
        }


    }
}
