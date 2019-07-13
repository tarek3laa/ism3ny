package com.example.ism3ny.firebase;

import android.net.Uri;

import com.example.ism3ny.person.Name;
import com.example.ism3ny.person.Person;

public interface IFireBase {
    void createNewUser();

    void changeName(Name newName);

    void uploadImage(Uri imageUri);

    void createPlayList(String name);

    void addSongToPlayList(String playListName, String songId);

    void changePlayListName(String currentName, String newName);

    void deletePlayList(String name);

    void addSongToFavorite(String songId);

    void changeProfileImage(String imageUri);

}
