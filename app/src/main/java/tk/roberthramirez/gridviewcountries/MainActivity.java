package tk.roberthramirez.gridviewcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private Country[] paises;
    private GridView gvCountries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountryParser countryParser = new CountryParser(this);
        countryParser.parse();
        paises = countryParser.getCountries();
        CountryAdapter countryAdapter = new CountryAdapter(this, paises);

        gvCountries= (GridView)findViewById(R.id.gvCountries);
        gvCountries.setAdapter(countryAdapter);

    }
}
