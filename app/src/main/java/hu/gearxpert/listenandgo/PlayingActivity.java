package hu.gearxpert.listenandgo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class PlayingActivity extends AppCompatActivity {

    boolean likeActualSong = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        ImageView buyActualSong = (ImageView) findViewById(R.id.buy_actual_song);

        buyActualSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyActualSongIntent = new Intent(PlayingActivity.this, ShoppingActivity.class);
                startActivity(buyActualSongIntent);
            }
        });

        ImageView playActual = (ImageView) findViewById(R.id.play_actual_song);
        final MediaPlayer playActualSong = MediaPlayer.create(this, R.raw.sample_music);
        playActual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playActualSong.start();
            }
        });

        buyActualSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyActualSongIntent = new Intent(PlayingActivity.this, ShoppingActivity.class);
                startActivity(buyActualSongIntent);
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
        Intent i = new Intent(PlayingActivity.this, MainActivity.class);
        startActivity(i);
    }

    private void searchActivity() {
        Intent i = new Intent(PlayingActivity.this, SearchActivity.class);
        startActivity(i);
    }

    private void favouritesActivity() {
        Intent i = new Intent(PlayingActivity.this, FavouritesActivity.class);
        startActivity(i);
    }

    private void chatActivity() {
        Intent i = new Intent(PlayingActivity.this, ChatActivity.class);
        startActivity(i);
    }

    private void shoppingActivity() {
        Intent i = new Intent(PlayingActivity.this, ShoppingActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Changing the Favourite icon
     */

    public void clicked_favourite_actual_song (View view) {
        ImageView favouriteIcon = (ImageView) findViewById(R.id.favourite_icon_to_actual_song);
        if (likeActualSong==false) {
           likeActualSong=true;
            favouriteIcon.setImageResource(R.drawable.ic_favorite_white_48dp);
        } else {
            likeActualSong=false;
            favouriteIcon.setImageResource(R.drawable.ic_favorite_border_white_48dp);
        }

    }

}

