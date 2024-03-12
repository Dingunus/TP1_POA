package src.SRP;

public class DrawRectangle{

    
    public static void draw(Paint paint, Rectangle r){
        paint.setColor(r.getLineColor());
        paint.setLineWidth(r.getLineWidth());
        //coin en haut à gauche jusqu'à en haut à droite
        paint.drawLine(r.getCenter().getX()-(r.getWidth()/2),
                r.getCenter().getY()-(r.getHeight()/2),
                r.getCenter().getX()+(r.getWidth()/2),
                r.getCenter().getY()-(r.getHeight()/2)
        );
        //coin en bas à gauche jusqu'à en bas à droite
        paint.drawLine(r.getCenter().getX()-(r.getWidth()/2),
                r.getCenter().getY()+(r.getHeight()/2),
                r.getCenter().getX()+(r.getWidth()/2),
                r.getCenter().getY()+(r.getHeight()/2)
        );
        //coin en bas à droite jusqu'à en haut à droite
        paint.drawLine(r.getCenter().getX()+(r.getWidth()/2),
                r.getCenter().getY()+(r.getHeight()/2),
                r.getCenter().getX()+(r.getWidth()/2),
                r.getCenter().getY()-(r.getHeight()/2)
        );
        //coin en haut à gauche jusqu'à en bas à gauche
        paint.drawLine(r.getCenter().getX()-(r.getWidth()/2),
                r.getCenter().getY()-(r.getHeight()/2),
                r.getCenter().getX()-(r.getWidth()/2),
                r.getCenter().getY()+(r.getHeight()/2)
        );

    }

}
