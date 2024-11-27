# Мобильное приложение для детектирования кукурузы

Данный проект представляет собой Android-приложение для детектирования кукурузы с использованием моделей **TensorFlow Lite** и YOLO (You Only Look Once). Приложение оптимизировано для работы на мобильных устройствах и поддерживает различные аппаратные ускорители.

## Основные функции

* **Детектирование в реальном времени**: Анализ изображений и видео для определения кукурузы на устройствах Android.
* **Интеграция TensorFlow Lite**: Оптимизированные модели обеспечивают высокую скорость работы и минимальное потребление ресурсов.
* **Квантизация FP16 и INT8**: Уменьшение размера модели и ускорение обработки при сохранении точности.
* **Аппаратное ускорение**: Поддержка CPU, GPU, NNAPI и других ускорителей.

## Начало работы

### Требования

1. Установленный **Android Studio**.
2. Модель TensorFlow Lite в формате `.tflite`, обученная для детектирования кукурузы.

### Шаги для запуска

1. Склонируйте репозиторий:
   ```bash
   git clone https://github.com/Yagiar/Yolo_android.git
2. Откройте проект в Android Studio.
3. Импортируйте свою модель TensorFlow Lite и настройте структуру приложения.
4. Настройте аппаратное ускорение.
5. Соберите и запустите приложение на устройстве.

