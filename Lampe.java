import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Lampe
{
    // Attribute
    int zustand;       // Zustand der Lampe
                       // 0 steht für aus, 1 steht für an                 
 
    // Konstruktor    
    Lampe()
    {
        zustand = 0;  // Am Anfang ist die Lampe aus
    }

    //Methoden
    void schalten()
    {
        zustand = 1;
    }


    void zeichnen(GraphicsContext gc)
    {
        // Jede Lampe hat einen schwarzen Rand
        gc.setStroke(Color.BLACK);
        gc.strokeOval(50,50,50,50);
        
        // Wenn die Lampe aus ist
        if(zustand == 0)
        {
            gc.setFill(Color.DARKGRAY);  
            gc.fillOval(50,50,50,50); 
        }
        // Wenn die Lampe an ist
        if(zustand == 1)
        {
            gc.setFill(Color.YELLOW);  
            gc.fillOval(50,50,50,50); 
        }
    }

}
