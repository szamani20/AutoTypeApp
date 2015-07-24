package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main extends Application {
    private static int keyInput[] = new int[1000];
    private static int amount;
    private static Robot robot;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Group group = new Group();
        Scene scene = new Scene(group);

        TextField text = new TextField();
        Label textLabel = new Label("Text: ");
        TextField numberText = new TextField();
        Label numberLabel = new Label("Amount: (positive integer)");
        Button button = new Button("Start");
        Label caution = new Label("You have only 3 seconds to put cursor at the right place");

        text.setLayoutX(370);
        text.setLayoutY(50);
        textLabel.setLayoutX(50);
        textLabel.setLayoutY(50);

        numberText.setLayoutX(370);
        numberText.setLayoutY(100);
        numberLabel.setLayoutX(50);
        numberLabel.setLayoutY(100);

        caution.setLayoutX(50);
        caution.setLayoutY(150);

        button.setLayoutX(50);
        button.setLayoutY(200);

        button.setOnMousePressed(e -> {
            try {
                amount = Integer.parseInt(numberText.getText());
                setKeyInput(text.getText());
                robot = new Robot();

                robot.delay(3000);
                doType(text.getText().length());

            } catch (Exception exception) {

            }
        });

        group.getChildren().addAll(text, textLabel, numberText,
                numberLabel, button, caution);

        stage.setScene(scene);
        stage.setTitle("Auto Type App");
        stage.setWidth(600);
        stage.setHeight(330);
        stage.setResizable(false);
        stage.show();
    }

    private void doType(int length) {
        for (int j = 0; j < amount; ++j)
            for (int i = 0; i <= length; i++) {
                robot.delay(10);
                switch (keyInput[i]) {
                    case KeyEvent.VK_COLON:
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_SEMICOLON);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    case KeyEvent.VK_UNDERSCORE:
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_MINUS);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    case KeyEvent.VK_LEFT_PARENTHESIS:
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_9);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    case KeyEvent.VK_RIGHT_PARENTHESIS:
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_0);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    case KeyEvent.VK_NUMBER_SIGN:
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_3);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    case KeyEvent.VK_AT:
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_2);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    case KeyEvent.VK_EXCLAMATION_MARK:
                        robot.keyPress(KeyEvent.VK_SHIFT);
                        robot.keyPress(KeyEvent.VK_1);
                        robot.keyRelease(KeyEvent.VK_SHIFT);
                        break;

                    default:
                        robot.keyPress(keyInput[i]);
                }
            }
    }

    private void setKeyInput(String text) {
        for (int i=0; i<text.length(); ++i) {
            switch (text.substring(i, i+1)) {
                case "a":
                    keyInput[i] = KeyEvent.VK_A;
                    break;
                case "b":
                    keyInput[i] = KeyEvent.VK_B;
                    break;
                case "c":
                    keyInput[i] = KeyEvent.VK_C;
                    break;
                case "d":
                    keyInput[i] = KeyEvent.VK_D;
                    break;
                case "e":
                    keyInput[i] = KeyEvent.VK_E;
                    break;
                case "f":
                    keyInput[i] = KeyEvent.VK_F;
                    break;
                case "g":
                    keyInput[i] = KeyEvent.VK_G;
                    break;
                case "h":
                    keyInput[i] = KeyEvent.VK_H;
                    break;
                case "i":
                    keyInput[i] = KeyEvent.VK_I;
                    break;
                case "j":
                    keyInput[i] = KeyEvent.VK_J;
                    break;
                case "k":
                    keyInput[i] = KeyEvent.VK_K;
                    break;
                case "l":
                    keyInput[i] = KeyEvent.VK_L;
                    break;
                case "m":
                    keyInput[i] = KeyEvent.VK_M;
                    break;
                case "n":
                    keyInput[i] = KeyEvent.VK_N;
                    break;
                case "o":
                    keyInput[i] = KeyEvent.VK_O;
                    break;
                case "p":
                    keyInput[i] = KeyEvent.VK_P;
                    break;
                case "q":
                    keyInput[i] = KeyEvent.VK_Q;
                    break;
                case "r":
                    keyInput[i] = KeyEvent.VK_R;
                    break;
                case "s":
                    keyInput[i] = KeyEvent.VK_S;
                    break;
                case "t":
                    keyInput[i] = KeyEvent.VK_T;
                    break;
                case "u":
                    keyInput[i] = KeyEvent.VK_U;
                    break;
                case "v":
                    keyInput[i] = KeyEvent.VK_V;
                    break;
                case "w":
                    keyInput[i] = KeyEvent.VK_W;
                    break;
                case "x":
                    keyInput[i] = KeyEvent.VK_X;
                    break;
                case "y":
                    keyInput[i] = KeyEvent.VK_Y;
                    break;
                case "z":
                    keyInput[i] = KeyEvent.VK_Z;
                    break;
                case "A":
                    keyInput[i] = KeyEvent.VK_A;
                    break;
                case "B":
                    keyInput[i] = KeyEvent.VK_B;
                    break;
                case "C":
                    keyInput[i] = KeyEvent.VK_C;
                    break;
                case "D":
                    keyInput[i] = KeyEvent.VK_D;
                    break;
                case "E":
                    keyInput[i] = KeyEvent.VK_E;
                    break;
                case "F":
                    keyInput[i] = KeyEvent.VK_F;
                    break;
                case "G":
                    keyInput[i] = KeyEvent.VK_G;
                    break;
                case "H":
                    keyInput[i] = KeyEvent.VK_H;
                    break;
                case "I":
                    keyInput[i] = KeyEvent.VK_I;
                    break;
                case "J":
                    keyInput[i] = KeyEvent.VK_J;
                    break;
                case "K":
                    keyInput[i] = KeyEvent.VK_K;
                    break;
                case "L":
                    keyInput[i] = KeyEvent.VK_L;
                    break;
                case "M":
                    keyInput[i] = KeyEvent.VK_M;
                    break;
                case "N":
                    keyInput[i] = KeyEvent.VK_N;
                    break;
                case "O":
                    keyInput[i] = KeyEvent.VK_O;
                    break;
                case "P":
                    keyInput[i] = KeyEvent.VK_P;
                    break;
                case "Q":
                    keyInput[i] = KeyEvent.VK_Q;
                    break;
                case "R":
                    keyInput[i] = KeyEvent.VK_R;
                    break;
                case "S":
                    keyInput[i] = KeyEvent.VK_S;
                    break;
                case "T":
                    keyInput[i] = KeyEvent.VK_T;
                    break;
                case "U":
                    keyInput[i] = KeyEvent.VK_U;
                    break;
                case "V":
                    keyInput[i] = KeyEvent.VK_V;
                    break;
                case "W":
                    keyInput[i] = KeyEvent.VK_W;
                    break;
                case "X":
                    keyInput[i] = KeyEvent.VK_X;
                    break;
                case "Y":
                    keyInput[i] = KeyEvent.VK_Y;
                    break;
                case "Z":
                    keyInput[i] = KeyEvent.VK_Z;
                    break;
                case ":":
                    keyInput[i] = KeyEvent.VK_COLON;
                    break;
                case ";":
                    keyInput[i] = KeyEvent.VK_SEMICOLON;
                    break;
                case ",":
                    keyInput[i] = KeyEvent.VK_COMMA;
                    break;
                case "-":
                    keyInput[i] = KeyEvent.VK_MINUS;
                    break;
                case "_":
                    keyInput[i] = KeyEvent.VK_UNDERSCORE;
                    break;
                case "(":
                    keyInput[i] = KeyEvent.VK_LEFT_PARENTHESIS;
                    break;
                case ")":
                    keyInput[i] = KeyEvent.VK_RIGHT_PARENTHESIS;
                    break;
                case "#":
                    keyInput[i] = KeyEvent.VK_NUMBER_SIGN;
                    break;
                case "@":
                    keyInput[i] = KeyEvent.VK_AT;
                    break;
                case "1":
                    keyInput[i] = KeyEvent.VK_1;
                    break;
                case "2":
                    keyInput[i] = KeyEvent.VK_2;
                    break;
                case "3":
                    keyInput[i] = KeyEvent.VK_3;
                    break;
                case "4":
                    keyInput[i] = KeyEvent.VK_4;
                    break;
                case "5":
                    keyInput[i] = KeyEvent.VK_5;
                    break;
                case "6":
                    keyInput[i] = KeyEvent.VK_6;
                    break;
                case "7":
                    keyInput[i] = KeyEvent.VK_7;
                    break;
                case "8":
                    keyInput[i] = KeyEvent.VK_8;
                    break;
                case "9":
                    keyInput[i] = KeyEvent.VK_9;
                    break;
                case "0":
                    keyInput[i] = KeyEvent.VK_0;
                    break;
                case ".":
                    keyInput[i] = KeyEvent.VK_PERIOD;
                    break;
                case "\"":
                    keyInput[i] = KeyEvent.VK_QUOTE;
                    break;
                case "!":
                    keyInput[i] = KeyEvent.VK_EXCLAMATION_MARK;
                    break;
                case " ":
                    keyInput[i] = KeyEvent.VK_SPACE;
            }
        }

        keyInput[text.length()] = KeyEvent.VK_ENTER;
    }
}
