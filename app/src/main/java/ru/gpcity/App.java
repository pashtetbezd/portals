package ru.gpcity;

import android.app.Application;

import com.yandex.metrica.YandexMetrica;

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        // Инициализация AppMetrica SDK
        YandexMetrica.activate(getApplicationContext(), getString(R.string.analitics_token));
        // Отслеживание активности пользователей
        YandexMetrica.enableActivityAutoTracking(this);
    }
}
