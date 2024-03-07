package com.atif.gamingera;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArticlesAdapter adapter;
    List<Article> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        data = getArticlesData();
        adapter = new ArticlesAdapter(this, data);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private List<Article> getArticlesData() {
        List<Article> articles = new ArrayList<>();
        Article article = new Article(
                "Assasins Creed I",
                "This groundbreaking game was released in 2007, introducing players to the secret war between the Assassins and the Templars. Set in the Holy Land during the Third Crusade, players assume the role of Altair Ibn-La'Ahad, a skilled Assassin tasked with eliminating key figures in the Templar order.",
                R.drawable.a1

        );
        articles.add(article);
        article = new Article(
                "Assasins Creed II",
                "Released in 2009, Assassin's Creed II follows the journey of Ezio Auditore da Firenze, a young nobleman seeking vengeance against those who betrayed his family in Renaissance Italy. Players guide Ezio through a richly detailed historical landscape, mastering the art of the Assassin.",
                R.drawable.a2
                );
        articles.add(article);
        article = new Article(
                "Assasins Creed Brotherhood",
                "Released in 2009, Assassin's Creed II follows the journey of Ezio Auditore da Firenze, a young nobleman seeking vengeance against those who betrayed his family in Renaissance Italy. Players guide Ezio through a richly detailed historical landscape, mastering the art of the Assassin.",
                R.drawable.a20
        );
        articles.add(article);
        article = new Article(
                "Assasins Creed IV",
                " Released in 2013, Black Flag shifts the focus to the Golden Age of Piracy in the Caribbean. Players embody Edward Kenway, a pirate and privateer who becomes embroiled in the conflict between Assassins and Templars.",
                R.drawable.a4
        );
        articles.add(article);
        article = new Article(
                "Assasins Creed Rogue",
                " In Rogue, released in 2014, players take on the role of Shay Patrick Cormac, a former Assassin turned Templar during the Seven Years' War.",
                R.drawable.a5
        );
        articles.add(article);
        article = new Article(
                "Assasins Creed Unity",
                " Set during the French Revolution, Unity was released in 2014. Players assume the role of Arno Dorian, an Assassin seeking redemption and revenge amidst the chaos of Paris. ",
                R.drawable.a6
        );
        articles.add(article);
        article = new Article(
                "Assasins Creed Syndicate",
                " Released in 2015, Syndicate is set in Victorian London. Players control siblings Jacob and Evie Frye as they fight against the oppressive Templar influence and build their own gang.  ",
                R.drawable.a7
        );
        articles.add(article);
        article = new Article(
                "Assasins Creed Origins",
                "Released in 2017, Origins takes players to ancient Egypt, where they follow the journey of Bayek of Siwa, one of the first Assassins, as he seeks revenge against those who harmed his family. ",
                R.drawable.a8
        );
        articles.add(article);
        article = new Article(
                "Assasins Creed Odyssey",
                " Set in ancient Greece, Odyssey, released in 2018, allows players to choose between Alexios and Kassandra, mercenaries with ties to the Assassin order, as they navigate the tumultuous world of ancient Greece. ",
                R.drawable.a9
        );
        articles.add(article);
        article = new Article(
                "Assasins Creed Valhalla",
                "Released in 2020, Valhalla transports players to the Viking Age, where they embody Eivor Wolf-Kissed, a Viking raider who becomes entangled in the conflict between the Assassins and Templars in England.",
                R.drawable.a10
        );
        articles.add(article);
        return articles;
    }
}





