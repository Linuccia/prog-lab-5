package DataClasses;

import java.time.LocalDateTime;

public class Product implements Comparable<Product> {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer price; //Поле не может быть null, Значение поля должно быть больше 0
    private String partNumber; //Длина строки не должна быть больше 85, Длина строки должна быть не меньше 15, Строка не может быть пустой, Поле не может быть null
    private Long manufactureCost; //Поле не может быть null
    private UnitOfMeasure unitOfMeasure; //Поле не может быть null
    private Person owner; //Поле может быть null

    public Product(Integer id, String name, Coordinates coordinates, Integer price, String partNumber, Long manufactureCost, UnitOfMeasure unitOfMeasure, Person owner){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = LocalDateTime.now();
        this.price = price;
        this.partNumber = partNumber;
        this.manufactureCost = manufactureCost;
        this.unitOfMeasure = unitOfMeasure;
        this.owner = owner;
    }
    public Integer getId(){return  id;}
    public String getName(){return  name;}
    public Coordinates getCoordinates(){return  coordinates;}
    public LocalDateTime getCreationDate(){return creationDate;}
    public Integer getPrice(){return  price;}
    public String getPartNumber(){return  partNumber;}
    public Long getManufactureCost(){return  manufactureCost;}
    public UnitOfMeasure getUnitOfMeasure(){return  unitOfMeasure;}
    public Person getOwner(){return  owner;}

    public void setCreationDate() { this.creationDate = LocalDateTime.now();}

    @Override
    public int compareTo(Product p) {
        return price - p.getPrice();
    }
}