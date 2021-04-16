package com.example.gamelist.datasource

import com.example.gamelist.model.Jogo

class DataSource {

    companion object{

        fun getGames() : ArrayList<Jogo>{
            var games = ArrayList<Jogo>()

            games.add(Jogo(0,"Valorant", 4.9, "PS4"))
            games.add(Jogo(1, "Need For Speed Underground", 4.6, "PC"))
            games.add(Jogo(2, "Grand Theft Auto SanAndreas", 5.0, "PC"))
            games.add(Jogo(3, "Mario Kart", 3.2, "Nintendo"))
            games.add(Jogo(4, "Crash Nebula", 5.0, "PS2"))
            games.add(Jogo(5, "Pro Evolution Soccer 21", 5.0, "PC"))
            games.add(Jogo(6, "Guitar Hero", 5.0, "PS2"))
            games.add(Jogo(7, "Tetris", 3.7, "PC"))
            games.add(Jogo(8, "Resident Evil 4", 4.3, "PS3"))
            games.add(Jogo(9, "JustDance", 4.8, "Nintendo"))
            games.add(Jogo(10, "Call of Duty", 4.6, "PC"))

            return games

        }

    }

}