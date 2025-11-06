package ua.edu.ucu.apps.lab8.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Flower {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        String flowertype;
        String flowercolor;
        double price;
        boolean availible;
}
