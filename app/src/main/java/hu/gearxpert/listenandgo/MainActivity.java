package hu.gearxpert.listenandgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        ImageView cPop = (ImageView) findViewById(R.id.category_pop);
//        final TextView description = (TextView) findViewById(R.id.description);


        cPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cPopIntent = new Intent(MainActivity.this, CategoryPopActivity.class);
                startActivity(cPopIntent);
            }
        });

//        description.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(description.getContext(), R.string.text_description_mainA, Toast.LENGTH_LONG).show();
//            }
//        });

    }

    /**
     * On selecting toolbar icons
     * */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case R.id.home:
                homeActivity();
                return true;
            case R.id.search:
                searchActivity();
                return true;
            case R.id.favourites:
                favouritesActivity();
                return true;
            case R.id.chat:
                chatActivity();
                return true;
            case R.id.shopping:
                shoppingActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Launching new activity from menu
     * */
    private void homeActivity() {
        Intent i = new Intent(MainActivity.this, MainActivity.class);
        startActivity(i);
    }

    private void searchActivity() {
        Intent i = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(i);
    }

    private void favouritesActivity() {
        Intent i = new Intent(MainActivity.this, FavouritesActivity.class);
        startActivity(i);
    }

    private void chatActivity() {
        Intent i = new Intent(MainActivity.this, ChatActivity.class);
        startActivity(i);
    }

    private void shoppingActivity() {
        Intent i = new Intent(MainActivity.this, ShoppingActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
