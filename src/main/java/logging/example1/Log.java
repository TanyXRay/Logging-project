package logging.example1;

import java.util.logging.*;

public class Log {
    public static void main(String[] args) {
        /*
        Создание лога
         */
        Logger logger = Logger.getLogger(Log.class.getName());//создание лога(импорт пакета logging)
        logger.setLevel(Level.WARNING);//установка уровня лога

        ConsoleHandler consoleHandler = new ConsoleHandler();//вывод лога в консоль
        logger.addHandler(consoleHandler);//добавляем в лог

        /*
        Формат вывода лога:
         */

        SimpleFormatter simpleFormatter = new SimpleFormatter();//1.обычный естественный язык
        consoleHandler.setFormatter(simpleFormatter);//присваиваем ConsoleHandler

        XMLFormatter xmlFormatter = new XMLFormatter();//2. XML-формат
        consoleHandler.setFormatter(xmlFormatter);//присваиваем ConsoleHandler

          /*
           Вывод сообщений:
          */

        logger.log(Level.INFO, "Message for information");//1. при помощи метода log, можно передать исключение

        logger.info("Message for information");//2. при помощи конкретного уровня, нельзя передать исключение
    }
}