package com.pvt;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
 
public class BusList extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        // storing string resources into Array
        String[] buslist = getResources().getStringArray(R.array.BusList);
 
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_bus_list, R.id.label, buslist));
 
        ListView lv = getListView();
 
        // listening to single list item on click
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
 
              // selected item
              String product = ((TextView) view).getText().toString();
 

              if(position == 0) {
            	  Intent i = new Intent(getApplicationContext(), BusDetails.class);
                  startActivity(i);
                  }
              
              else if(position == 1)
              {
            	  Intent i = new Intent(getApplicationContext(), BusDetails.class);
                  startActivity(i);
              }
             
              
               
          }
        });
    }
}