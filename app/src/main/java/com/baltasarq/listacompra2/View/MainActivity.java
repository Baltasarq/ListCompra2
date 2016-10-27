package com.baltasarq.listacompra2.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.baltasarq.listacompra2.Core.Item;
import com.baltasarq.listacompra2.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvLista = (ListView) this.findViewById( R.id.lvLista );
        Button btInserta = (Button) this.findViewById( R.id.btInserta );

        // Lista
        this.items = new ArrayList<>();
        this.adaptadorItems = new ArrayAdapter<Item>(
                this,
                android.R.layout.simple_selectable_list_item,
                this.items );
        lvLista.setAdapter( this.adaptadorItems );

        // Inserta
        btInserta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void updateStatus()
    {
        TextView edNum = (TextView) this.findViewById( R.id.edNum );

        edNum.setText( this.adaptadorItems.getCount() );
    }

    private ArrayAdapter<Item> adaptadorItems;
    private ArrayList<Item> items;
}
