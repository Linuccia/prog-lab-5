package DataClasses;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Double weight; //Поле не может быть null, Значение поля должно быть больше 0
    private Color eyeColor; //Поле не может быть null
    private Country nationality; //Поле не может быть null

    public Person(String name, Double weight, Color eyeColor, Country nationality){
        this.name = name;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
    }

    public String getName(){return name;}
    public Double getWeight(){return weight;}
    public Color getEyeColor(){return eyeColor;}
    public Country getNationality(){return nationality;}
    
}
