package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 22;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countClosedTiles = SIDE * SIDE;
    private int countFlags;
    private int countMinesOnField;
    private int score;
    private boolean isGameStopped;


    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        super.onMouseLeftClick(x, y);
        if (isGameStopped){
            restart();
        }else {
            openTile(x, y);
        }
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        super.onMouseRightClick(x, y);
        markTile(x, y);
    }

    private void createGame() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.FORESTGREEN);
                setCellValue(x, y, "");
            }
        }
        countFlags = countMinesOnField;
        countMineNeighbors();
    }

    private void countMineNeighbors() {
        for (int y = 0; y < gameField.length; y++) {
            for (int x = 0; x < gameField.length; x++) {
                if (!gameField[y][x].isMine) {
                    List<GameObject> listNeighbors = getNeighbors(gameField[y][x]);
                    for (int i = 0; i < listNeighbors.size(); i++) {
                        if (listNeighbors.get(i).isMine) {
                            gameField[y][x].countMineNeighbors++;
                        }
                    }
                }
            }
        }

    }

    private void openTile(int x, int y) {

        if (gameField[y][x].isOpen){
            countClosedTiles--;
            return;
        }

        //новая проверка на победу и открытие ячейки
        if (!gameField[y][x].isOpen && !gameField[y][x].isMine && !gameField[y][x].isFlag && !isGameStopped){
            gameField[y][x].isOpen = true;
            setCellColor(x, y, Color.DIMGREY);
            countClosedTiles--;
            score += 5;
            setScore(score);
            // проверка на победу
            if (countClosedTiles == countMinesOnField && !isGameStopped){
                win();
                return;
            }
        }
        // проверка на утановление флага и на поражение
        if (gameField[y][x].isFlag || isGameStopped){
            return;
        }
        // проверка на наличие мины
        if (gameField[y][x].isMine) {
            setCellValueEx(x, y, Color.DARKRED, MINE);
            gameOver();
            return;
        }
        // проверка на наличие цифры в ячейки
        if (!gameField[y][x].isMine && gameField[y][x].countMineNeighbors != 0) {
            setCellNumber(x, y, gameField[y][x].countMineNeighbors);
            return;
        }


        // проверка на наличия соседних ячеек не мин
        if (!gameField[y][x].isMine && gameField[y][x].countMineNeighbors == 0) {
            List<GameObject> listNeighbors = getNeighbors(gameField[y][x]);

            for (GameObject listNeighbor : listNeighbors) {
                if (!listNeighbor.isMine && !listNeighbor.isOpen) {
                    openTile(listNeighbor.x, listNeighbor.y);

                    if (!listNeighbor.isMine && listNeighbor.countMineNeighbors == 0) {
                        setCellValue(listNeighbor.x, listNeighbor.y, "");
                    }
                }

            }
        }
    }

    private void markTile(int x, int y){
        if (isGameStopped){
            return;
        }
        if (countFlags == 0 && !gameField[y][x].isFlag){
            return;
        }
        if (gameField[y][x].isOpen){
            return;
        }
        if (!gameField[y][x].isFlag){
            gameField[y][x].isFlag = true;
            countFlags--;
            setCellValue(x, y, FLAG);
            setCellColor(x, y, Color.ORANGERED);
        } else if (gameField[y][x].isFlag){
            gameField[y][x].isFlag = false;
            countFlags++;
            setCellValue(x, y, "");
            setCellColor(x, y, Color.FORESTGREEN);
        }

    }

    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.BLACK,"GAME OVER",Color.WHITE,50);
    }

    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.BLACK,"YOU WIN!",Color.WHITE,50);
    }

    private void restart(){
        isGameStopped = false;
        countClosedTiles = SIDE * SIDE;
        score = 0;
        setScore(score);
        countMinesOnField = 0;
        createGame();
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }
}