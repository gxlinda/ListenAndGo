package hu.gearxpert.listenandgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageView home = (ImageView) findViewById(R.id.home);
        ImageView search = (ImageView) findViewById(R.id.search);
        ImageView favourites = (ImageView) findViewById(R.id.favourites);
        ImageView chat = (ImageView) findViewById(R.id.chat);
        ImageView shopping = (ImageView) findViewById(R.id.shopping);
        ImageView cPop = (ImageView) findViewById(R.id.category_pop);
        final TextView description = (TextView) findViewById(R.id.description);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favouritesIntent = new Intent(MainActivity.this, FavouritesActivity.class);
                startActivity(favouritesIntent);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatIntent = new Intent(MainActivity.this, ChatActivity.class);
                startActivity(chatIntent);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });

        cPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cPopIntent = new Intent(MainActivity.this, CategoryPopActivity.class);
                startActivity(cPopIntent);
            }
        });

        description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(description.getContext(), R.string.text_description_mainA, Toast.LENGTH_LONG).show();
            }
        });




    }
}
