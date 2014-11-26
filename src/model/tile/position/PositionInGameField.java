package model.tile.position;

/**
 * Created by Thomas on 26.11.2014.
 */
public class PositionInGameField
{
    private int x;
    private int y;

    public PositionInGameField(int x, int y)
    {
        setValueOfX(x);
        setValueOfY(y);
    }

    private void setValueOfX(int x)
    {
        this.x = x;
    }

    private void setValueOfY(int y)
    {
        this.y = y;
    }
}
