package model.tile;

import model.tile.position.PositionInGameField;

/**
 * Created by Thomas on 26.11.2014.
 */
public class Tile
{
    private String graphikalRepresentation;
    private PositionInGameField position;

    public Tile(String graphikalRepresentation, PositionInGameField position)
    {
        if(!graphikalRepresentation.equals("x") && !graphikalRepresentation.equals("o") && !graphikalRepresentation.equals(" "))
        {
            throw new IllegalArgumentException("The graphikal representation is not valid! Value: " + graphikalRepresentation);
        }
        this.graphikalRepresentation = graphikalRepresentation;
        this.position = position;
    }
}
