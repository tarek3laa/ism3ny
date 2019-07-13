package com.example.ism3ny.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ism3ny.R;
import com.example.ism3ny.firebase.FireBaseFireStore;
import com.example.ism3ny.firebase.IFireBase;
import com.example.ism3ny.person.User;
import com.firebase.ui.auth.AuthUI;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final int RC_SIGN_IN = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(MainActivity.this, HomeActivity.class));
        //IFireBase fireBase = new FireBaseFireStore(FireBaseFireStore.USER, new User("+20102268183"));
        //fireBase.createNewUser();
        // fireBase.changeName(new User(new Name("Tarek", "Alaa", "Attia"), "Egypt", "+201022268183", new ArrayList<Song>(), new ArrayList<Song>(), new ArrayList<PlayList>()),new Name("alaa","tarek","yomna"));
       // fireBase.createPlayList("new play list2");
       // fireBase.addSongToPlayList("new play list2", "song1");
        //FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();

        // firebaseFirestore.collection(FireBaseFireStore.SONG).document("song1").set(new Song());

    }

    public void createSignInIntent() {
        // [START auth_fui_create_intent]
        // Choose authentication providers
        List<AuthUI.IdpConfig> providers = Arrays.asList(
                new AuthUI.IdpConfig.PhoneBuilder().build());
        // Create and launch sign-in intent
        System.out.println("done");
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .build(),
                RC_SIGN_IN);
        // [END auth_fui_create_intent]

    }
}
