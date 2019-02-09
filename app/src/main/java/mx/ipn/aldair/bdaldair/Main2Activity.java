package mx.ipn.aldair.bdaldair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String data;
    TextView aver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        aver=(TextView)findViewById(R.id.datos);
        Bundle recibi= new Bundle();
        recibi=this.getIntent().getExtras();
        data= recibi.getString("nombre");
        aver.setText("NOMBRE: " + data);
    }

}
