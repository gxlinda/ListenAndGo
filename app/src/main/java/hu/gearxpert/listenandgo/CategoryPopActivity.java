package hu.gearxpert.listenandgo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CategoryPopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_pop);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        Button playAll = (Button) findViewById(R.id.play_all);
        playAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playAllIntent = new Intent(CategoryPopActivity.this, PlayingActivity.class);
                startActivity(playAllIntent);
            }
        });

        Button shuffleAndPlayAll = (Button) findViewById(R.id.shuffle_all);
        shuffleAndPlayAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shuffleAndPlayAllIntent = new Intent(CategoryPopActivity.this, PlayingActivity.class);
                startActivity(shuffleAndPlayAllIntent);
            }
        });

        ImageView buySong1 = (ImageView) findViewById(R.id.buy_song1);
        buySong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buySong1Intent = new Intent(CategoryPopActivity.this, ShoppingActivity.class);
                startActivity(buySong1Intent);
            }
        });

        final ImageView playSong1 = (ImageView) findViewById(R.id.play_song1);
        playSong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSong1Intent = new Intent(CategoryPopActivity.this, PlayingActivity.class);
                startActivity(playSong1Intent);
            }
        });

        ImageView buySong2 = (ImageView) findViewById(R.id.buy_song2);
        buySong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buySong2Intent = new Intent(CategoryPopActivity.this, ShoppingActivity.class);
                startActivity(buySong2Intent);
            }
        });

        final ImageView playSong2 = (ImageView) findViewById(R.id.play_song2);
        playSong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSong2Intent = new Intent(CategoryPopActivity.this, PlayingActivity.class);
                startActivity(playSong2Intent);
            }
        });

        ImageView buySong3 = (ImageView) findViewById(R.id.buy_song3);
        buySong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buySong3Intent = new Intent(CategoryPopActivity.this, ShoppingActivity.class);
                startActivity(buySong3Intent);
            }
        });

        final ImageView playSong3 = (ImageView) findViewById(R.id.play_song3);
        playSong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSong3Intent = new Intent(CategoryPopActivity.this, PlayingActivity.class);
                startActivity(playSong3Intent);
            }
        });
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
        Intent i = new Intent(CategoryPopActivity.this, MainActivity.class);
        startActivity(i);
    }

    private void searchActivity() {
        Intent i = new Intent(CategoryPopActivity.this, SearchActivity.class);
        startActivity(i);
    }

    private void favouritesActivity() {
        Intent i = new Intent(CategoryPopActivity.this, FavouritesActivity.class);
        startActivity(i);
    }

    private void chatActivity() {
        Intent i = new Intent(CategoryPopActivity.this, ChatActivity.class);
        startActivity(i);
    }

    private void shoppingActivity() {
        Intent i = new Intent(CategoryPopActivity.this, ShoppingActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
