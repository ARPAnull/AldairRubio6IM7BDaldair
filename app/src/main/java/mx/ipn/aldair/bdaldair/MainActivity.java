package mx.ipn.aldair.bdaldair;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{

    EditText nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText)findViewById(R.id.nombre);
    }

    public void guardaBD2(View v){
        Intent envia= new Intent(this,Main2Activity.class);
        Bundle data= new Bundle();
        data.putString("nombre",nombre.getText().toString().trim());
        envia.putExtras(data);
        startActivity(envia);
        finish();
    }

}
