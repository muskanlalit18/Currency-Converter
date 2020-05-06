package muskan.myappcompany.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void currencyConverter (View view)
    {
        Log.i("Info", "Button Pressed!");

        EditText editText = (EditText) findViewById(R.id.editText);

        Log.i("Amount in pounds", editText.getText().toString());

        String amountInPounds = editText.getText().toString();

        double amountInPoundsDouble= Double.parseDouble(amountInPounds);

        double amountInDollarsDouble = amountInPoundsDouble * 1.3;

        String amountInDollars = String.format("%.2f", amountInDollarsDouble);

        Toast.makeText(this, "£" + amountInPounds + " is $" + amountInDollars, Toast.LENGTH_LONG).show();


        Log.i("amount in dollars", amountInDollars);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
