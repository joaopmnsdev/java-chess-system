package org.example.chess;

import org.example.boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialLongUID = 1L;

    public ChessException(String message) {
        super(message);
    }
}
