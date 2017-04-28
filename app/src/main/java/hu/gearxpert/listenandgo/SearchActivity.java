package hu.gearxpert.listenandgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageView home = (ImageView) findViewById(R.id.home);
        //ImageView search = (ImageView) findViewById(R.id.search);
        ImageView favourites = (ImageView) findViewById(R.id.favourites);
        ImageView chat = (ImageView) findViewById(R.id.chat);
        ImageView shopping = (ImageView) findViewById(R.id.shopping);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favouritesIntent = new Intent(SearchActivity.this, FavouritesActivity.class);
                startActivity(favouritesIntent);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatIntent = new Intent(SearchActivity.this, ChatActivity.class);
                startActivity(chatIntent);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoppingIntent = new Intent(SearchActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });
    }
}
