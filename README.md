# Программа для рисования
----------------
**Описание**: В ходе данной работы была разработана программа для рисования фигур на поле, путём выбора цвета фигуры, цвета и размера обводки клика по полю.
- Технологический стек: Java
- Статус: 1.7.2.
- По сравнению с другими подобными продуктами, данная разработка отличается понятным кодом и удобным интерфейсом.
**Скриншот рабочего окна приложения:**
----------------------------------------
 ![image](https://github.com/GoodieCore/java_lab_shape_prototype/blob/master/Prototype_img_1.JPG)
 



 **Разбор части кода на примере абстрактного класса Shape**
```
abstract public class Shape implements Cloneable{
    protected Color color;
    public Shape(Color color){
        this.color = color;
    }
    public void setColor (Color color){
        this.color = color;
    }

    public abstract void draw(GraphicsContext gc, double x, double y, Color color, int strokeWidth, Color strokeColor);

    public abstract void setXY(double x, double y);

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
```
------------------------

## Архитектура
Диаграмма классов:

 ![image](https://github.com/GoodieCore/java_lab_shape_prototype/blob/master/Prototype_img_2.JPG)


## Завсимости
Для работы данного приложежния необходимы JavaFX и JDK 21.

## Установка
Не требуется. Достаточно запустить проект через любую доступную среду разработки JAVA.

##  Конфигурация
Не требуется


## Применение
В приложении можно рисовать на поле путём выбора определённых критериев:
- Выбрать фигуру
- Выбрать цвет фигуры
- Выбрать толщину обводки
- Выбрать цвет обводки


## Проверка ПО
Не предусмотрена

## Проблемы
Фигуре нельзя задавать размер фигур

## Получение справочной информации
По всем вопрсам можно обратиться в [ВК](https://vk.com/iayiwer) разработчика  

## Приглашение к сотрудничеству 
В дальнейшем предполагается доработка кода, чтобы можно было задавать размеры фигуры

## Источники и справочники
- [Прототип?](https://sites.google.com/view/study-pattern/%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F/%D0%B7%D0%B0%D0%B4%D0%B0%D1%87%D0%B8/task-6-%D0%BF%D1%80%D0%BE%D1%82%D0%BE%D1%82%D0%B8%D0%BF)
- [Prototype Design Pattern](https://javadevcentral.com/prototype-design-pattern)
