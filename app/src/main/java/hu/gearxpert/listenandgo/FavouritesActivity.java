package hu.gearxpert.listenandgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FavouritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        ImageView home = (ImageView) findViewById(R.id.home);
        ImageView search = (ImageView) findViewById(R.id.search);
        //ImageView favourites = (ImageView) findViewById(R.id.favourites);
        ImageView chat = (ImageView) findViewById(R.id.chat);
        ImageView shopping = (ImageView) findViewById(R.id.shopping);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(FavouritesActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(FavouritesActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatIntent = new Intent(FavouritesActivity.this, ChatActivity.class);
                startActivity(chatIntent);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoppingIntent = new Intent(FavouritesActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });
    }
}
