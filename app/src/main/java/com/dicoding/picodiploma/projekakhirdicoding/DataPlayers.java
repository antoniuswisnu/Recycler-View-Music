package com.dicoding.picodiploma.projekakhirdicoding;

import java.util.ArrayList;

class DataPlayers {
    private static String[] playerNames = {
            "Eduardo Mendy",
            "Thiago Silva",
            "Andrea Christensen",
            "Antonio Rudiger",
            "Jorginho",
            "Kante",
            "Reece James",
            "Ben Chilwell",
            "Mason Mount",
            "Hakim Ziyech",
            "Lukaku"
    };

    private static String[] playerDeskripsi = {
            "Goalkeeper - Senegal",
            "Center Back - Brazil",
            "Wing Back - Denmark",
            "Wing Back - Germany",
            "Defensive Midfielder - Italy",
            "Midfielder - France",
            "Right Full Back - England",
            "Left Full Back - England",
            "Left Winger Forward - England",
            "Right Winger Forward - Maroko",
            "Center Forward - Belgium"
    };

    private static int[] playerImages = {
            R.drawable.mendy,
            R.drawable.thiago,
            R.drawable.christensen,
            R.drawable.rudiger,
            R.drawable.jorginho,
            R.drawable.kante,
            R.drawable.reece,
            R.drawable.chilwell,
            R.drawable.mount,
            R.drawable.ziyech,
            R.drawable.lukaku
    };

    static ArrayList<Players> getListData(){
        ArrayList<Players> list = new ArrayList<>();
        for (int position = 0; position < playerNames.length; position++) {
            Players player = new Players();
            player.setName(playerNames[position]);
            player.setDeskripsi(playerDeskripsi[position]);
            player.setPhoto(playerImages[position]);
            list.add(player);
        }
        return list;
    }


}
