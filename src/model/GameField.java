package model;

import model.tile.Tile;
import model.tile.position.IllegalPositionException;
import model.tile.position.PositionInGameField;

/**
 * Created by Thomas on 26.11.2014.
 */
public class GameField
{
    public final static int SIZE = 3;
    private Tile[][] field = new Tile[SIZE][SIZE];

    public GameField() throws IllegalPositionException
    {
        initializeField();
    }

    private void initializeField() throws IllegalPositionException
    {
        for(int y = 0; y < SIZE; y++)
        {
            for(int x = 0; x < SIZE; x++)
            {
                if(isPositionInvalid(x, y))
                {
                    throw new IllegalPositionException("The Position [" + x + ", " + y + "] ia not valid!");
                }
                PositionInGameField position = new PositionInGameField(x, y);
                field[x][y] = new Tile(" ", position);
            }
        }
    }

    private boolean isPositionInvalid(int x, int y)
    {
        return checkIfValueIsOutOfRange(x) && checkIfValueIsOutOfRange(y);
    }

    private boolean checkIfValueIsOutOfRange(int value)
    {
        return value < 0 || value >= SIZE;
    }
}
