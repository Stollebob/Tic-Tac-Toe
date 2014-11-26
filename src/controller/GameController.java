package controller;

import model.GameField;
import model.tile.position.IllegalPositionException;

/**
 * Created by Thomas on 26.11.2014.
 */
public class GameController
{
    private GameField field;

    public GameController()
    {
        try
        {
            field = new GameField();
        }
        catch (IllegalPositionException e)
        {
            e.printStackTrace();
        }
    }
}
