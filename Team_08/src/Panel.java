import Shapes.OvalShape;
import Shapes.RectangleShape;
import Shapes.Shape;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Panel {
    OvalShape ovalShape = new OvalShape();
    RectangleShape rectangleShape = new RectangleShape();
    public Color currentColor = Color.RED;
    public Canvas canvas = new Canvas();
    public int shapeCount = 0;
    public Shape shapeBeingDragged = null;
    public int prevDragX;  // During dragging, these record the x and y coordinates of the
    public int prevDragY;  //    previous position of the mouse.
    public Shape currentShape = null; //will be used when duplicating the image
    public Shape[] shapes = new Shape[500];

    public Canvas makeCanvas() {
        // Creates a canvas, and add mouse listeners to implement dragging.
        // The listeners are given by methods that are defined below.
        Canvas canvas = new Canvas(800,600);
        canvas.setOnMousePressed( this::mousePressed );
        canvas.setOnMouseReleased( this::mouseReleased );
        canvas.setOnMouseDragged( this::mouseDragged );
        canvas.setOnMouseClicked(this::mouseClicked);

        return canvas;
    }

//    public HBox makeToolPanel(Canvas canvas) {
//        // Make a pane containing the buttons that are used to add shapes
//        // and the pop-up menu for selecting the current color.
//
//        FileInputStream input = null;
//        try {
//            input = new FileInputStream("src/image/circle.png");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        Image image = new Image(input);
//        ImageView imageView = new ImageView(image);
//        Button ovalButton = new Button("",imageView);
//        ovalButton.setOnAction( (e) -> addShape( ovalShape,10,100,50,50 ));
//        try {
//            input = new FileInputStream("src/image/rectangle.png");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        image = new Image(input);
//        imageView = new ImageView(image);
//
//        Button rectButton = new Button("",imageView);
//        rectButton.setOnAction( (e) -> addShape( rectangleShape,10,400,75,50 ) );
//        Button roundRectButton = new Button("Add a RoundRect");
//        //roundRectButton.setOnAction( (e) -> addShape( new RoundRectShape() ) );
//        ComboBox<String> combobox = new ComboBox<>();
//        combobox.setEditable(false);
//        Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.CYAN,
//                Color.MAGENTA, Color.YELLOW, Color.BLACK, Color.WHITE };
//        String[] colorNames = { "Red", "Green", "Blue", "Cyan",
//                "Magenta", "Yellow", "Black", "White" };
//        combobox.getItems().addAll(colorNames);
//        combobox.setValue("Red");
//        combobox.setOnAction(
//                e -> currentColor = colors[combobox.getSelectionModel().getSelectedIndex()] );
//        HBox tools = new HBox(5);
//        tools.getChildren().add(ovalButton);
//        tools.getChildren().add(rectButton);
//        tools.getChildren().add(roundRectButton);
//        tools.getChildren().add(combobox);
//        tools.setStyle("-fx-border-width: 3px; -fx-border-color: transparent; -fx-background-color: white");
//        return tools;
//    }

    public void paintCanvas() {

        GraphicsContext g = canvas.getGraphicsContext2D();
        g.setFill(Color.WHITE); // Fill with white background.
        g.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
        for (int i = 0; i < shapeCount; i++) {
            Shape s = shapes[i];
            s.draw(g);
        }
    }
    public void addShape(Shape shape,int left,int top,int width,int height) {

        shape.setColor(currentColor);
        shape.reshape(left,top,width,height);
        shapes[shapeCount] = shape;
        shapeCount++;
        paintCanvas();
    }
    public void mouseDragged(MouseEvent evt) {
        // User has moved the mouse.  Move the dragged shape by the same amount.
        int x = (int)evt.getX();
        int y = (int)evt.getY();
        if (shapeBeingDragged != null) {
            shapeBeingDragged.moveBy(x - prevDragX, y - prevDragY);
            prevDragX = x;
            prevDragY = y;
            paintCanvas();      // redraw canvas to show shape in new position
        }
    }

    public void mouseClicked(MouseEvent evt) {
        // User has clicked the mouse.
        //String str = currentShape.toString();
        if(currentShape.toString().contains("Oval"))
            addShape(new OvalShape(),(int)evt.getX(),(int)evt.getY(),50,50 );
        else if(currentShape.toString().contains("Rect"))
            addShape(new RectangleShape(),(int)evt.getX(),(int)evt.getY(),75,50 );

    }

    public void mouseReleased(MouseEvent evt) {
        // User has released the mouse.  Move the dragged shape, then set
        // shapeBeingDragged to null to indicate that dragging is over.
        shapeBeingDragged = null;
    }
    public void mousePressed(MouseEvent evt) {

        int x = (int)evt.getX();  // x-coordinate of point where mouse was clicked
        int y = (int)evt.getY();  // y-coordinate of point
        for ( int i = shapeCount - 1; i >= 0; i-- ) {  // check shapes from front to back
            Shape s = shapes[i];
            currentShape = shapes[shapeCount - 1];
            if (s.containsPoint(x,y)) {
                shapeBeingDragged = s;
                prevDragX = x;
                prevDragY = y;
                if (evt.isShiftDown()) { // s should be moved on top of all the other shapes
                    for (int j = i; j < shapeCount-1; j++) {
                        // move the shapes following s down in the list
                        shapes[j] = shapes[j+1];
                    }
                    shapes[shapeCount-1] = s;  // put s at the end of the list
                    paintCanvas();  // repaint canvas to show s in front of other shapes
                }
                return;
            }
        }
    }
}
