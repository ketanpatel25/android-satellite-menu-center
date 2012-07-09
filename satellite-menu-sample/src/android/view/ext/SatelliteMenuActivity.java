package android.view.ext;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ext.SatelliteMenu.SateliteClickedListener;

public class SatelliteMenuActivity extends Activity {
	SatelliteMenu menu,menu1,menu2,menu3,menu4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
         menu = (SatelliteMenu) findViewById(R.id.menu);

        
        List<SatelliteMenuItem> items = new ArrayList<SatelliteMenuItem>();
        items.add(new SatelliteMenuItem(4, R.drawable.ic_1));
        items.add(new SatelliteMenuItem(4, R.drawable.ic_3));
        items.add(new SatelliteMenuItem(4, R.drawable.ic_4));
        items.add(new SatelliteMenuItem(3, R.drawable.ic_5));
        items.add(new SatelliteMenuItem(2, R.drawable.ic_6));
        items.add(new SatelliteMenuItem(1, R.drawable.ic_2));
       // items.add(new SatelliteMenuItem(5, R.drawable.sat_item));
        menu.addItems(items);

        
        
        menu.setOnItemClickedListener(new SateliteClickedListener() {
			
			public void eventOccured(int id) {
				Log.i("sat", "Clicked on " + id);
			}
		});
    }
}