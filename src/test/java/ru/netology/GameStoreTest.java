package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    @Test
    public void AddSomeGames() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Казаки: Снова война", "Стратегии");
        assertTrue(store.containsGame(game));
        assertTrue(store.containsGame(game2));

    }

    @Test
    public void NoSuchGame() {

        GameStore store = new GameStore();
        GameStore store2 = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store2.publishGame("Казаки: Снова война", "Стратегии");
        assertFalse(store.containsGame(game2));
    }

    @Test
    public void NoMostPlayerFind() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        store.addPlayTime("Igor", 2);
        String actual = store.getMostPlayer();
        String expected = "Igor";
        assertEquals(expected, actual);
    }

    @Test
    public void MostPlayerFind() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        store.addPlayTime("Igor", 4);
        store.addPlayTime("Anton", 2);
        store.addPlayTime("Igor", 3);
        String actual = store.getMostPlayer();
        String expected = "Igor";
        assertEquals(expected, actual);
    }

    @Test
    public void MostPlayerFind2() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        store.addPlayTime("Igor", 4);
        store.addPlayTime("Anton", 5);
        store.addPlayTime("Igor", 3);
        store.addPlayTime("Anton", 15);
        String actual = store.getMostPlayer();
        String expected = "Anton";
        assertEquals(expected, actual);
    }

    @Test
    public void SumTimeFind() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        store.addPlayTime("Igor", 3);
        store.addPlayTime("Anton", 4);
        store.addPlayTime("Igor", 2);
        int actual = store.getSumPlayedTime();
        int expected = 9;
        assertEquals(expected, actual);
    }

}
