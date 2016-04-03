package io.github.smartsteves.undercast.setting.gui;/**
 * Created by jun26 on 2016-03-29.
 */

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.HashSet;
import java.util.Observer;
import java.util.Set;

public class SettingGuiMain extends Application {
    private static final Set<Observer> observerSet = new HashSet<Observer>();

    public static void main(String[] args) {
        launch(args);
    }

    public static void registerObserver(Observer observer) {
        observerSet.add(observer);
    }

    private static void notifyObserver() {
        for (Observer observer : observerSet) {
            observer.observe();
        }
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
