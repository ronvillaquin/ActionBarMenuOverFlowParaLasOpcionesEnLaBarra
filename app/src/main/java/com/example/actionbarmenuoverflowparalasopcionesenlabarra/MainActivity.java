package com.example.actionbarmenuoverflowparalasopcionesenlabarra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //para trabajar con el action var o menu overflow creamosun nuevo
    // en la carpeta res clic derecho new y android recurce files
    //colocamos el nombre del archcivo como deseemos pero en miniusculas
    //en resource type colocamos de tipo menu
    //en avalibre qualifer lo dejamos en country code y damos ok

    //en el xml que se creo arrastramos los menu iten al actionbar los que deseemos
    //a os item se les coloca los id
    // ahora volvemos al maiactivty java o el activti java de la pantalla que deseo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo para mostrar o ocultar el menu de tipo boolean y se nombre de un solo modo onCreateOptionsMenu
    public boolean onCreateOptionsMenu(Menu vista){
        //Se colocan dos metodos y la ruta de donde esta el menu que creamos , y el
        // nombre del parametro vista que recibo
        getMenuInflater().inflate(R.menu.menuoverflow, vista);
        //tiene que retornar un valor booleanos para que haga el efecto de ocultarce o no al precionarlo
        return true;
    }

    //metodo para las opciones que estan dentro del menu
    //de igual amnera tiene que llamarce de esta forma nada mas onOptionItemSelected
    public boolean onOptionsItemSelected(MenuItem vista){
        // variable de tipo entero para escuchar el iten que se selecciono
        int id = vista.getItemId();

        //ahora las condicione spara las opciones o iten que precionemos
        if (id == R.id.item1){
            Toast.makeText(this, "Opcion 1", Toast.LENGTH_LONG).show();
        }else
        if (id == R.id.item2){
            Toast.makeText(this, "Opcion 2", Toast.LENGTH_LONG).show();
        }else
        if (id == R.id.item3){
            Toast.makeText(this, "Opcion 3", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(vista);
    }
}
