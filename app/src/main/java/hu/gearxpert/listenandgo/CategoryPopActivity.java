package hu.gearxpert.listenandgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CategoryPopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_pop);

        ImageView home = (ImageView) findViewById(R.id.home);
        ImageView search = (ImageView) findViewById(R.id.search);
        ImageView favourites = (ImageView) findViewById(R.id.favourites);
        ImageView chat = (ImageView) findViewById(R.id.chat);
        ImageView shopping = (ImageView) findViewById(R.id.shopping);
        final TextView description = (TextView) findViewById(R.id.description);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(CategoryPopActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(CategoryPopActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        favourites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favouritesIntent = new Intent(CategoryPopActivity.this, FavouritesActivity.class);
                startActivity(favouritesIntent);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatIntent = new Intent(CategoryPopActivity.this, ChatActivity.class);
                startActivity(chatIntent);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoppingIntent = new Intent(CategoryPopActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
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
